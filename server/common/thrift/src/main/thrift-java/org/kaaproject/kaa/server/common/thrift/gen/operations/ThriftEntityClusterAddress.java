/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.kaaproject.kaa.server.common.thrift.gen.operations;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-1-19")
public class ThriftEntityClusterAddress implements org.apache.thrift.TBase<ThriftEntityClusterAddress, ThriftEntityClusterAddress._Fields>, java.io.Serializable, Cloneable, Comparable<ThriftEntityClusterAddress> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftEntityClusterAddress");

  private static final org.apache.thrift.protocol.TField NODE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("nodeId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("address", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ThriftEntityClusterAddressStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ThriftEntityClusterAddressTupleSchemeFactory());
  }

  public String nodeId; // required
  public ThriftEntityAddress address; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NODE_ID((short)1, "nodeId"),
    ADDRESS((short)2, "address");

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
        case 1: // NODE_ID
          return NODE_ID;
        case 2: // ADDRESS
          return ADDRESS;
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
    tmpMap.put(_Fields.NODE_ID, new org.apache.thrift.meta_data.FieldMetaData("nodeId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("address", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThriftEntityAddress.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftEntityClusterAddress.class, metaDataMap);
  }

  public ThriftEntityClusterAddress() {
  }

  public ThriftEntityClusterAddress(
    String nodeId,
    ThriftEntityAddress address)
  {
    this();
    this.nodeId = nodeId;
    this.address = address;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftEntityClusterAddress(ThriftEntityClusterAddress other) {
    if (other.isSetNodeId()) {
      this.nodeId = other.nodeId;
    }
    if (other.isSetAddress()) {
      this.address = new ThriftEntityAddress(other.address);
    }
  }

  public ThriftEntityClusterAddress deepCopy() {
    return new ThriftEntityClusterAddress(this);
  }

  @Override
  public void clear() {
    this.nodeId = null;
    this.address = null;
  }

  public String getNodeId() {
    return this.nodeId;
  }

  public ThriftEntityClusterAddress setNodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

  public void unsetNodeId() {
    this.nodeId = null;
  }

  /** Returns true if field nodeId is set (has been assigned a value) and false otherwise */
  public boolean isSetNodeId() {
    return this.nodeId != null;
  }

  public void setNodeIdIsSet(boolean value) {
    if (!value) {
      this.nodeId = null;
    }
  }

  public ThriftEntityAddress getAddress() {
    return this.address;
  }

  public ThriftEntityClusterAddress setAddress(ThriftEntityAddress address) {
    this.address = address;
    return this;
  }

  public void unsetAddress() {
    this.address = null;
  }

  /** Returns true if field address is set (has been assigned a value) and false otherwise */
  public boolean isSetAddress() {
    return this.address != null;
  }

  public void setAddressIsSet(boolean value) {
    if (!value) {
      this.address = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NODE_ID:
      if (value == null) {
        unsetNodeId();
      } else {
        setNodeId((String)value);
      }
      break;

    case ADDRESS:
      if (value == null) {
        unsetAddress();
      } else {
        setAddress((ThriftEntityAddress)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NODE_ID:
      return getNodeId();

    case ADDRESS:
      return getAddress();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NODE_ID:
      return isSetNodeId();
    case ADDRESS:
      return isSetAddress();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftEntityClusterAddress)
      return this.equals((ThriftEntityClusterAddress)that);
    return false;
  }

  public boolean equals(ThriftEntityClusterAddress that) {
    if (that == null)
      return false;

    boolean this_present_nodeId = true && this.isSetNodeId();
    boolean that_present_nodeId = true && that.isSetNodeId();
    if (this_present_nodeId || that_present_nodeId) {
      if (!(this_present_nodeId && that_present_nodeId))
        return false;
      if (!this.nodeId.equals(that.nodeId))
        return false;
    }

    boolean this_present_address = true && this.isSetAddress();
    boolean that_present_address = true && that.isSetAddress();
    if (this_present_address || that_present_address) {
      if (!(this_present_address && that_present_address))
        return false;
      if (!this.address.equals(that.address))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_nodeId = true && (isSetNodeId());
    list.add(present_nodeId);
    if (present_nodeId)
      list.add(nodeId);

    boolean present_address = true && (isSetAddress());
    list.add(present_address);
    if (present_address)
      list.add(address);

    return list.hashCode();
  }

  @Override
  public int compareTo(ThriftEntityClusterAddress other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetNodeId()).compareTo(other.isSetNodeId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNodeId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nodeId, other.nodeId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAddress()).compareTo(other.isSetAddress());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAddress()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.address, other.address);
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
    StringBuilder sb = new StringBuilder("ThriftEntityClusterAddress(");
    boolean first = true;

    sb.append("nodeId:");
    if (this.nodeId == null) {
      sb.append("null");
    } else {
      sb.append(this.nodeId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("address:");
    if (this.address == null) {
      sb.append("null");
    } else {
      sb.append(this.address);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (address != null) {
      address.validate();
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

  private static class ThriftEntityClusterAddressStandardSchemeFactory implements SchemeFactory {
    public ThriftEntityClusterAddressStandardScheme getScheme() {
      return new ThriftEntityClusterAddressStandardScheme();
    }
  }

  private static class ThriftEntityClusterAddressStandardScheme extends StandardScheme<ThriftEntityClusterAddress> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ThriftEntityClusterAddress struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NODE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.nodeId = iprot.readString();
              struct.setNodeIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ADDRESS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.address = new ThriftEntityAddress();
              struct.address.read(iprot);
              struct.setAddressIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ThriftEntityClusterAddress struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.nodeId != null) {
        oprot.writeFieldBegin(NODE_ID_FIELD_DESC);
        oprot.writeString(struct.nodeId);
        oprot.writeFieldEnd();
      }
      if (struct.address != null) {
        oprot.writeFieldBegin(ADDRESS_FIELD_DESC);
        struct.address.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ThriftEntityClusterAddressTupleSchemeFactory implements SchemeFactory {
    public ThriftEntityClusterAddressTupleScheme getScheme() {
      return new ThriftEntityClusterAddressTupleScheme();
    }
  }

  private static class ThriftEntityClusterAddressTupleScheme extends TupleScheme<ThriftEntityClusterAddress> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ThriftEntityClusterAddress struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetNodeId()) {
        optionals.set(0);
      }
      if (struct.isSetAddress()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetNodeId()) {
        oprot.writeString(struct.nodeId);
      }
      if (struct.isSetAddress()) {
        struct.address.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ThriftEntityClusterAddress struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.nodeId = iprot.readString();
        struct.setNodeIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.address = new ThriftEntityAddress();
        struct.address.read(iprot);
        struct.setAddressIsSet(true);
      }
    }
  }

}

