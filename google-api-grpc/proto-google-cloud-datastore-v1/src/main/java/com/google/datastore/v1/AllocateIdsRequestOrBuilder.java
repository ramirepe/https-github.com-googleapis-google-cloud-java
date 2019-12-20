// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1/datastore.proto

package com.google.datastore.v1;

public interface AllocateIdsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.datastore.v1.AllocateIdsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The ID of the project against which to make the request.
   * </pre>
   *
   * <code>string project_id = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Required. The ID of the project against which to make the request.
   * </pre>
   *
   * <code>string project_id = 8 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Required. A list of keys with incomplete key paths for which to allocate IDs.
   * No key may be reserved/read-only.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Key keys = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.datastore.v1.Key> getKeysList();
  /**
   *
   *
   * <pre>
   * Required. A list of keys with incomplete key paths for which to allocate IDs.
   * No key may be reserved/read-only.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Key keys = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.datastore.v1.Key getKeys(int index);
  /**
   *
   *
   * <pre>
   * Required. A list of keys with incomplete key paths for which to allocate IDs.
   * No key may be reserved/read-only.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Key keys = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getKeysCount();
  /**
   *
   *
   * <pre>
   * Required. A list of keys with incomplete key paths for which to allocate IDs.
   * No key may be reserved/read-only.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Key keys = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.datastore.v1.KeyOrBuilder> getKeysOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. A list of keys with incomplete key paths for which to allocate IDs.
   * No key may be reserved/read-only.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Key keys = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.datastore.v1.KeyOrBuilder getKeysOrBuilder(int index);
}
