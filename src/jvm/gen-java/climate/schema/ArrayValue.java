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

public class ArrayValue extends org.apache.thrift.TUnion<ArrayValue, ArrayValue._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ArrayValue");
  private static final org.apache.thrift.protocol.TField LONGS_FIELD_DESC = new org.apache.thrift.protocol.TField("longs", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField DOUBLES_FIELD_DESC = new org.apache.thrift.protocol.TField("doubles", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LONGS((short)1, "longs"),
    DOUBLES((short)2, "doubles");

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
        case 2: // DOUBLES
          return DOUBLES;
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

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LONGS, new org.apache.thrift.meta_data.FieldMetaData("longs", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, LongArray.class)));
    tmpMap.put(_Fields.DOUBLES, new org.apache.thrift.meta_data.FieldMetaData("doubles", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, DoubleArray.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ArrayValue.class, metaDataMap);
  }

  public ArrayValue() {
    super();
  }

  public ArrayValue(_Fields setField, Object value) {
    super(setField, value);
  }

  public ArrayValue(ArrayValue other) {
    super(other);
  }
  public ArrayValue deepCopy() {
    return new ArrayValue(this);
  }

  public static ArrayValue longs(LongArray value) {
    ArrayValue x = new ArrayValue();
    x.setLongs(value);
    return x;
  }

  public static ArrayValue doubles(DoubleArray value) {
    ArrayValue x = new ArrayValue();
    x.setDoubles(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case LONGS:
        if (value instanceof LongArray) {
          break;
        }
        throw new ClassCastException("Was expecting value of type LongArray for field 'longs', but got " + value.getClass().getSimpleName());
      case DOUBLES:
        if (value instanceof DoubleArray) {
          break;
        }
        throw new ClassCastException("Was expecting value of type DoubleArray for field 'doubles', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected Object readValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case LONGS:
          if (field.type == LONGS_FIELD_DESC.type) {
            LongArray longs;
            longs = new LongArray();
            longs.read(iprot);
            return longs;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case DOUBLES:
          if (field.type == DOUBLES_FIELD_DESC.type) {
            DoubleArray doubles;
            doubles = new DoubleArray();
            doubles.read(iprot);
            return doubles;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void writeValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case LONGS:
        LongArray longs = (LongArray)value_;
        longs.write(oprot);
        return;
      case DOUBLES:
        DoubleArray doubles = (DoubleArray)value_;
        doubles.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case LONGS:
        return LONGS_FIELD_DESC;
      case DOUBLES:
        return DOUBLES_FIELD_DESC;
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public LongArray getLongs() {
    if (getSetField() == _Fields.LONGS) {
      return (LongArray)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'longs' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setLongs(LongArray value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.LONGS;
    value_ = value;
  }

  public DoubleArray getDoubles() {
    if (getSetField() == _Fields.DOUBLES) {
      return (DoubleArray)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'doubles' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setDoubles(DoubleArray value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.DOUBLES;
    value_ = value;
  }

  public boolean equals(Object other) {
    if (other instanceof ArrayValue) {
      return equals((ArrayValue)other);
    } else {
      return false;
    }
  }

  public boolean equals(ArrayValue other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(ArrayValue other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    HashCodeBuilder hcb = new HashCodeBuilder();
    hcb.append(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      hcb.append(setField.getThriftFieldId());
      Object value = getFieldValue();
      if (value instanceof org.apache.thrift.TEnum) {
        hcb.append(((org.apache.thrift.TEnum)getFieldValue()).getValue());
      } else {
        hcb.append(value);
      }
    }
    return hcb.toHashCode();
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
