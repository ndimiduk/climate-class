/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package climate.schema;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FireTuple implements org.apache.thrift.TBase<FireTuple, FireTuple._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FireTuple");

  private static final org.apache.thrift.protocol.TField TEMP330_FIELD_DESC = new org.apache.thrift.protocol.TField("temp330", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField CONF50_FIELD_DESC = new org.apache.thrift.protocol.TField("conf50", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField BOTH_PREDS_FIELD_DESC = new org.apache.thrift.protocol.TField("bothPreds", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("count", org.apache.thrift.protocol.TType.I32, (short)4);

  public int temp330;
  public int conf50;
  public int bothPreds;
  public int count;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TEMP330((short)1, "temp330"),
    CONF50((short)2, "conf50"),
    BOTH_PREDS((short)3, "bothPreds"),
    COUNT((short)4, "count");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TEMP330
          return TEMP330;
        case 2: // CONF50
          return CONF50;
        case 3: // BOTH_PREDS
          return BOTH_PREDS;
        case 4: // COUNT
          return COUNT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TEMP330_ISSET_ID = 0;
  private static final int __CONF50_ISSET_ID = 1;
  private static final int __BOTHPREDS_ISSET_ID = 2;
  private static final int __COUNT_ISSET_ID = 3;
  private BitSet __isset_bit_vector = new BitSet(4);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TEMP330, new org.apache.thrift.meta_data.FieldMetaData("temp330", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CONF50, new org.apache.thrift.meta_data.FieldMetaData("conf50", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.BOTH_PREDS, new org.apache.thrift.meta_data.FieldMetaData("bothPreds", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.COUNT, new org.apache.thrift.meta_data.FieldMetaData("count", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FireTuple.class, metaDataMap);
  }

  public FireTuple() {
  }

  public FireTuple(
    int temp330,
    int conf50,
    int bothPreds,
    int count)
  {
    this();
    this.temp330 = temp330;
    setTemp330IsSet(true);
    this.conf50 = conf50;
    setConf50IsSet(true);
    this.bothPreds = bothPreds;
    setBothPredsIsSet(true);
    this.count = count;
    setCountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FireTuple(FireTuple other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.temp330 = other.temp330;
    this.conf50 = other.conf50;
    this.bothPreds = other.bothPreds;
    this.count = other.count;
  }

  public FireTuple deepCopy() {
    return new FireTuple(this);
  }

  @Override
  public void clear() {
    setTemp330IsSet(false);
    this.temp330 = 0;
    setConf50IsSet(false);
    this.conf50 = 0;
    setBothPredsIsSet(false);
    this.bothPreds = 0;
    setCountIsSet(false);
    this.count = 0;
  }

  public int getTemp330() {
    return this.temp330;
  }

  public FireTuple setTemp330(int temp330) {
    this.temp330 = temp330;
    setTemp330IsSet(true);
    return this;
  }

  public void unsetTemp330() {
    __isset_bit_vector.clear(__TEMP330_ISSET_ID);
  }

  /** Returns true if field temp330 is set (has been assigned a value) and false otherwise */
  public boolean isSetTemp330() {
    return __isset_bit_vector.get(__TEMP330_ISSET_ID);
  }

  public void setTemp330IsSet(boolean value) {
    __isset_bit_vector.set(__TEMP330_ISSET_ID, value);
  }

  public int getConf50() {
    return this.conf50;
  }

  public FireTuple setConf50(int conf50) {
    this.conf50 = conf50;
    setConf50IsSet(true);
    return this;
  }

  public void unsetConf50() {
    __isset_bit_vector.clear(__CONF50_ISSET_ID);
  }

  /** Returns true if field conf50 is set (has been assigned a value) and false otherwise */
  public boolean isSetConf50() {
    return __isset_bit_vector.get(__CONF50_ISSET_ID);
  }

  public void setConf50IsSet(boolean value) {
    __isset_bit_vector.set(__CONF50_ISSET_ID, value);
  }

  public int getBothPreds() {
    return this.bothPreds;
  }

  public FireTuple setBothPreds(int bothPreds) {
    this.bothPreds = bothPreds;
    setBothPredsIsSet(true);
    return this;
  }

  public void unsetBothPreds() {
    __isset_bit_vector.clear(__BOTHPREDS_ISSET_ID);
  }

  /** Returns true if field bothPreds is set (has been assigned a value) and false otherwise */
  public boolean isSetBothPreds() {
    return __isset_bit_vector.get(__BOTHPREDS_ISSET_ID);
  }

  public void setBothPredsIsSet(boolean value) {
    __isset_bit_vector.set(__BOTHPREDS_ISSET_ID, value);
  }

  public int getCount() {
    return this.count;
  }

  public FireTuple setCount(int count) {
    this.count = count;
    setCountIsSet(true);
    return this;
  }

  public void unsetCount() {
    __isset_bit_vector.clear(__COUNT_ISSET_ID);
  }

  /** Returns true if field count is set (has been assigned a value) and false otherwise */
  public boolean isSetCount() {
    return __isset_bit_vector.get(__COUNT_ISSET_ID);
  }

  public void setCountIsSet(boolean value) {
    __isset_bit_vector.set(__COUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TEMP330:
      if (value == null) {
        unsetTemp330();
      } else {
        setTemp330((Integer)value);
      }
      break;

    case CONF50:
      if (value == null) {
        unsetConf50();
      } else {
        setConf50((Integer)value);
      }
      break;

    case BOTH_PREDS:
      if (value == null) {
        unsetBothPreds();
      } else {
        setBothPreds((Integer)value);
      }
      break;

    case COUNT:
      if (value == null) {
        unsetCount();
      } else {
        setCount((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TEMP330:
      return new Integer(getTemp330());

    case CONF50:
      return new Integer(getConf50());

    case BOTH_PREDS:
      return new Integer(getBothPreds());

    case COUNT:
      return new Integer(getCount());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TEMP330:
      return isSetTemp330();
    case CONF50:
      return isSetConf50();
    case BOTH_PREDS:
      return isSetBothPreds();
    case COUNT:
      return isSetCount();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FireTuple)
      return this.equals((FireTuple)that);
    return false;
  }

  public boolean equals(FireTuple that) {
    if (that == null)
      return false;

    boolean this_present_temp330 = true;
    boolean that_present_temp330 = true;
    if (this_present_temp330 || that_present_temp330) {
      if (!(this_present_temp330 && that_present_temp330))
        return false;
      if (this.temp330 != that.temp330)
        return false;
    }

    boolean this_present_conf50 = true;
    boolean that_present_conf50 = true;
    if (this_present_conf50 || that_present_conf50) {
      if (!(this_present_conf50 && that_present_conf50))
        return false;
      if (this.conf50 != that.conf50)
        return false;
    }

    boolean this_present_bothPreds = true;
    boolean that_present_bothPreds = true;
    if (this_present_bothPreds || that_present_bothPreds) {
      if (!(this_present_bothPreds && that_present_bothPreds))
        return false;
      if (this.bothPreds != that.bothPreds)
        return false;
    }

    boolean this_present_count = true;
    boolean that_present_count = true;
    if (this_present_count || that_present_count) {
      if (!(this_present_count && that_present_count))
        return false;
      if (this.count != that.count)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_temp330 = true;
    builder.append(present_temp330);
    if (present_temp330)
      builder.append(temp330);

    boolean present_conf50 = true;
    builder.append(present_conf50);
    if (present_conf50)
      builder.append(conf50);

    boolean present_bothPreds = true;
    builder.append(present_bothPreds);
    if (present_bothPreds)
      builder.append(bothPreds);

    boolean present_count = true;
    builder.append(present_count);
    if (present_count)
      builder.append(count);

    return builder.toHashCode();
  }

  public int compareTo(FireTuple other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    FireTuple typedOther = (FireTuple)other;

    lastComparison = Boolean.valueOf(isSetTemp330()).compareTo(typedOther.isSetTemp330());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTemp330()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.temp330, typedOther.temp330);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetConf50()).compareTo(typedOther.isSetConf50());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConf50()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.conf50, typedOther.conf50);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBothPreds()).compareTo(typedOther.isSetBothPreds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBothPreds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bothPreds, typedOther.bothPreds);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCount()).compareTo(typedOther.isSetCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.count, typedOther.count);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // TEMP330
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.temp330 = iprot.readI32();
            setTemp330IsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // CONF50
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.conf50 = iprot.readI32();
            setConf50IsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // BOTH_PREDS
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.bothPreds = iprot.readI32();
            setBothPredsIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // COUNT
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.count = iprot.readI32();
            setCountIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(TEMP330_FIELD_DESC);
    oprot.writeI32(this.temp330);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(CONF50_FIELD_DESC);
    oprot.writeI32(this.conf50);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(BOTH_PREDS_FIELD_DESC);
    oprot.writeI32(this.bothPreds);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(COUNT_FIELD_DESC);
    oprot.writeI32(this.count);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("FireTuple(");
    boolean first = true;

    sb.append("temp330:");
    sb.append(this.temp330);
    first = false;
    if (!first) sb.append(", ");
    sb.append("conf50:");
    sb.append(this.conf50);
    first = false;
    if (!first) sb.append(", ");
    sb.append("bothPreds:");
    sb.append(this.bothPreds);
    first = false;
    if (!first) sb.append(", ");
    sb.append("count:");
    sb.append(this.count);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

