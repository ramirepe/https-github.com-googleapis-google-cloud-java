// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1/query.proto

package com.google.datastore.v1;

public interface PropertyFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.datastore.v1.PropertyFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The property to filter by.
   * </pre>
   *
   * <code>.google.datastore.v1.PropertyReference property = 1;</code>
   *
   * @return Whether the property field is set.
   */
  boolean hasProperty();
  /**
   *
   *
   * <pre>
   * The property to filter by.
   * </pre>
   *
   * <code>.google.datastore.v1.PropertyReference property = 1;</code>
   *
   * @return The property.
   */
  com.google.datastore.v1.PropertyReference getProperty();
  /**
   *
   *
   * <pre>
   * The property to filter by.
   * </pre>
   *
   * <code>.google.datastore.v1.PropertyReference property = 1;</code>
   */
  com.google.datastore.v1.PropertyReferenceOrBuilder getPropertyOrBuilder();

  /**
   *
   *
   * <pre>
   * The operator to filter by.
   * </pre>
   *
   * <code>.google.datastore.v1.PropertyFilter.Operator op = 2;</code>
   *
   * @return The enum numeric value on the wire for op.
   */
  int getOpValue();
  /**
   *
   *
   * <pre>
   * The operator to filter by.
   * </pre>
   *
   * <code>.google.datastore.v1.PropertyFilter.Operator op = 2;</code>
   *
   * @return The op.
   */
  com.google.datastore.v1.PropertyFilter.Operator getOp();

  /**
   *
   *
   * <pre>
   * The value to compare the property to.
   * </pre>
   *
   * <code>.google.datastore.v1.Value value = 3;</code>
   *
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   *
   *
   * <pre>
   * The value to compare the property to.
   * </pre>
   *
   * <code>.google.datastore.v1.Value value = 3;</code>
   *
   * @return The value.
   */
  com.google.datastore.v1.Value getValue();
  /**
   *
   *
   * <pre>
   * The value to compare the property to.
   * </pre>
   *
   * <code>.google.datastore.v1.Value value = 3;</code>
   */
  com.google.datastore.v1.ValueOrBuilder getValueOrBuilder();
}
