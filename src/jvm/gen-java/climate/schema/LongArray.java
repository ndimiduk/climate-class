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

public class LongArray implements org.apache.thrift.TBase<LongArray, LongArray._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LongArray");

  private static final org.apache.thrift.protocol.TField LONGS_FIELD_DESC = new org.apache.thrift.protocol.TField("longs", org.apache.thrift.protocol.TType.LIST, (short)1);

  public List<Long> longs;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LONGS((short)1, "longs");

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
        case 1: // LONGS
          return LONGS;
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

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LONGS, new org.apache.thrift.meta_data.FieldMetaData("longs", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LongArray.class, metaDataMap);
  }

  public LongArray() {
  }

  public LongArray(
    List<Long> longs)
  {
    this();
    this.longs = longs;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LongArray(LongArray other) {
    if (other.isSetLongs()) {
      List<Long> __this__longs = new ArrayList<Long>();
      for (Long other_element : other.longs) {
        __this__longs.add(other_element);
      }
      this.longs = __this__longs;
    }
  }

  public LongArray deepCopy() {
    return new LongArray(this);
  }

  @Override
  public void clear() {
    this.longs = null;
  }

  public int getLongsSize() {
    return (this.longs == null) ? 0 : this.longs.size();
  }

  public java.util.Iterator<Long> getLongsIterator() {
    return (this.longs == null) ? null : this.longs.iterator();
  }

  public void addToLongs(long elem) {
    if (this.longs == null) {
      this.longs = new ArrayList<Long>();
    }
    this.longs.add(elem);
  }

  public List<Long> getLongs() {
    return this.longs;
  }

  public LongArray setLongs(List<Long> longs) {
    this.longs = longs;
    return this;
  }

  public void unsetLongs() {
    this.longs = null;
  }

  /** Returns true if field longs is set (has been assigned a value) and false otherwise */
  public boolean isSetLongs() {
    return this.longs != null;
  }

  public void setLongsIsSet(boolean value) {
    if (!value) {
      this.longs = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LONGS:
      if (value == null) {
        unsetLongs();
      } else {
        setLongs((List<Long>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LONGS:
      return getLongs();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LONGS:
      return isSetLongs();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LongArray)
      return this.equals((LongArray)that);
    return false;
  }

  public boolean equals(LongArray that) {
    if (that == null)
      return false;

    boolean this_present_longs = true && this.isSetLongs();
    boolean that_present_longs = true && that.isSetLongs();
    if (this_present_longs || that_present_longs) {
      if (!(this_present_longs && that_present_longs))
        return false;
      if (!this.longs.equals(that.longs))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_longs = true && (isSetLongs());
    builder.append(present_longs);
    if (present_longs)
      builder.append(longs);

    return builder.toHashCode();
  }

  public int compareTo(LongArray other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    LongArray typedOther = (LongArray)other;

    lastComparison = Boolean.valueOf(isSetLongs()).compareTo(typedOther.isSetLongs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLongs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.longs, typedOther.longs);
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
        case 1: // LONGS
          if (field.type == org.apache.thrift.protocol.TType.LIST) {
            {
              org.apache.thrift.protocol.TList _list4 = iprot.readListBegin();
              this.longs = new ArrayList<Long>(_list4.size);
              for (int _i5 = 0; _i5 < _list4.size; ++_i5)
              {
                long _elem6;
                _elem6 = iprot.readI64();
                this.longs.add(_elem6);
              }
              iprot.readListEnd();
            }
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
    if (this.longs != null) {
      oprot.writeFieldBegin(LONGS_FIELD_DESC);
      {
        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, this.longs.size()));
        for (long _iter7 : this.longs)
        {
          oprot.writeI64(_iter7);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("LongArray(");
    boolean first = true;

    sb.append("longs:");
    if (this.longs == null) {
      sb.append("null");
    } else {
      sb.append(this.longs);
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

