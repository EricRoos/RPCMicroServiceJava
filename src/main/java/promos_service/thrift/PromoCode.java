/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import javax.annotation.Generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-02-14")
public class PromoCode implements org.apache.thrift.TBase<PromoCode, PromoCode._Fields>, java.io.Serializable, Cloneable, Comparable<PromoCode> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PromoCode");

  private static final org.apache.thrift.protocol.TField PROMO_FIELD_DESC = new org.apache.thrift.protocol.TField("promo", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("code", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PromoCodeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PromoCodeTupleSchemeFactory());
  }

  public Promo promo; // required
  public String code; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PROMO((short)1, "promo"),
    CODE((short)2, "code");

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
        case 1: // PROMO
          return PROMO;
        case 2: // CODE
          return CODE;
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
    tmpMap.put(_Fields.PROMO, new org.apache.thrift.meta_data.FieldMetaData("promo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Promo.class)));
    tmpMap.put(_Fields.CODE, new org.apache.thrift.meta_data.FieldMetaData("code", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PromoCode.class, metaDataMap);
  }

  public PromoCode() {
  }

  public PromoCode(
    Promo promo,
    String code)
  {
    this();
    this.promo = promo;
    this.code = code;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PromoCode(PromoCode other) {
    if (other.isSetPromo()) {
      this.promo = new Promo(other.promo);
    }
    if (other.isSetCode()) {
      this.code = other.code;
    }
  }

  public PromoCode deepCopy() {
    return new PromoCode(this);
  }

  @Override
  public void clear() {
    this.promo = null;
    this.code = null;
  }

  public Promo getPromo() {
    return this.promo;
  }

  public PromoCode setPromo(Promo promo) {
    this.promo = promo;
    return this;
  }

  public void unsetPromo() {
    this.promo = null;
  }

  /** Returns true if field promo is set (has been assigned a value) and false otherwise */
  public boolean isSetPromo() {
    return this.promo != null;
  }

  public void setPromoIsSet(boolean value) {
    if (!value) {
      this.promo = null;
    }
  }

  public String getCode() {
    return this.code;
  }

  public PromoCode setCode(String code) {
    this.code = code;
    return this;
  }

  public void unsetCode() {
    this.code = null;
  }

  /** Returns true if field code is set (has been assigned a value) and false otherwise */
  public boolean isSetCode() {
    return this.code != null;
  }

  public void setCodeIsSet(boolean value) {
    if (!value) {
      this.code = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PROMO:
      if (value == null) {
        unsetPromo();
      } else {
        setPromo((Promo)value);
      }
      break;

    case CODE:
      if (value == null) {
        unsetCode();
      } else {
        setCode((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PROMO:
      return getPromo();

    case CODE:
      return getCode();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PROMO:
      return isSetPromo();
    case CODE:
      return isSetCode();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PromoCode)
      return this.equals((PromoCode)that);
    return false;
  }

  public boolean equals(PromoCode that) {
    if (that == null)
      return false;

    boolean this_present_promo = true && this.isSetPromo();
    boolean that_present_promo = true && that.isSetPromo();
    if (this_present_promo || that_present_promo) {
      if (!(this_present_promo && that_present_promo))
        return false;
      if (!this.promo.equals(that.promo))
        return false;
    }

    boolean this_present_code = true && this.isSetCode();
    boolean that_present_code = true && that.isSetCode();
    if (this_present_code || that_present_code) {
      if (!(this_present_code && that_present_code))
        return false;
      if (!this.code.equals(that.code))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_promo = true && (isSetPromo());
    list.add(present_promo);
    if (present_promo)
      list.add(promo);

    boolean present_code = true && (isSetCode());
    list.add(present_code);
    if (present_code)
      list.add(code);

    return list.hashCode();
  }

  @Override
  public int compareTo(PromoCode other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPromo()).compareTo(other.isSetPromo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPromo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.promo, other.promo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCode()).compareTo(other.isSetCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.code, other.code);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("PromoCode(");
    boolean first = true;

    sb.append("promo:");
    if (this.promo == null) {
      sb.append("null");
    } else {
      sb.append(this.promo);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("code:");
    if (this.code == null) {
      sb.append("null");
    } else {
      sb.append(this.code);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (promo != null) {
      promo.validate();
    }
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

  private static class PromoCodeStandardSchemeFactory implements SchemeFactory {
    public PromoCodeStandardScheme getScheme() {
      return new PromoCodeStandardScheme();
    }
  }

  private static class PromoCodeStandardScheme extends StandardScheme<PromoCode> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PromoCode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PROMO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.promo = new Promo();
              struct.promo.read(iprot);
              struct.setPromoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.code = iprot.readString();
              struct.setCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, PromoCode struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.promo != null) {
        oprot.writeFieldBegin(PROMO_FIELD_DESC);
        struct.promo.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.code != null) {
        oprot.writeFieldBegin(CODE_FIELD_DESC);
        oprot.writeString(struct.code);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PromoCodeTupleSchemeFactory implements SchemeFactory {
    public PromoCodeTupleScheme getScheme() {
      return new PromoCodeTupleScheme();
    }
  }

  private static class PromoCodeTupleScheme extends TupleScheme<PromoCode> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PromoCode struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPromo()) {
        optionals.set(0);
      }
      if (struct.isSetCode()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetPromo()) {
        struct.promo.write(oprot);
      }
      if (struct.isSetCode()) {
        oprot.writeString(struct.code);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PromoCode struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.promo = new Promo();
        struct.promo.read(iprot);
        struct.setPromoIsSet(true);
      }
      if (incoming.get(1)) {
        struct.code = iprot.readString();
        struct.setCodeIsSet(true);
      }
    }
  }

}
