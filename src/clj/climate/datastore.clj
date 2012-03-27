(ns climate.datastore
  (:use cascalog.api
        [cascalog.io :only (get-bytes)]
        [clojure.string :only (join)]
        [climate.testing :only (dev-path)])
  (:require [cascalog.workflow :as w])
  (:import [climate WholeFile]
           [cascading.tuple Fields]))

(defn whole-file
  "Custom scheme for dealing with entire files."
  [field-names]
  (WholeFile. (w/fields field-names)))

(defn hfs-wholefile
  "Subquery to return distinct files in the supplied directory. Files
  will be returned as 2-tuples, formatted as `<filename, file>` The
  filename is a text object, while the entire, unchopped file is
  encoded as a Hadoop `BytesWritable` object."
  [path & opts]
  (let [scheme (-> (:outfields (apply array-map opts) Fields/ALL)
                   (whole-file))]
    (apply hfs-tap scheme path opts)))

(def binary-rain-tap
  (hfs-wholefile (dev-path "precl_mon_v1.0.lnx.2000.gri0.5m.gz")))

(defn rain-tap-example []
  (?<- (stdout)
       [?path ?count]
       (binary-rain-tap ?path ?bytes-writable)
       (get-bytes ?bytes-writable :> ?bytes)
       (count ?bytes :> ?count)))

;; ## Playground datasets
;;
;; ##  Moving Average stock data -- yahoo_stock:
;;
;; The following tap produces stock price data from Yahoo!

(def stock-tap
  (hfs-delimited (dev-path "yahoo_stock_AA_32_mini.csv")
                 :delimiter ","
                 :outfields ["?exchange" "?stock-sym" "?date" "?open"
                             "?high" "?low" "?close" "?volume" "?adj"]
                 :classes [String String String Float Float Float Float Integer Float]
                 :skip-header? true))

;; ## Log Data
;;
;; The following tap produces Apache log data.

(def log-regex
  #"^(\S+) (\S+) (\S+) \[([\w:/]+\s[+\-]\d{4})\] \"(.+?)\" (\S+) (\S+) \"([^\"]*)\" \"([^\"]*)\"")

(defn parse-log-str
  [log-str]
  (rest (re-find log-regex log-str)))

(def small-log-tap
  (let [src (hfs-textline (dev-path "logdata/access_log_1"))
        log-fields ["?remote-addr" "?remote-logname" "?user" "?time"
                    "?request" "?status" "?bytes_string"
                    "?referrer" "?browser"]]
    (<- log-fields
        (src ?line)
        (parse-log-str ?line :>> log-fields)
        (:distinct false))))

;; ## Timeseries dataset

(def timeseries-src
  (into [] (for [region ["IDN" "IND" "BRA" "USA"]
                 period (range 20)
                 :let [val (rand)]]
             [region period val])))
