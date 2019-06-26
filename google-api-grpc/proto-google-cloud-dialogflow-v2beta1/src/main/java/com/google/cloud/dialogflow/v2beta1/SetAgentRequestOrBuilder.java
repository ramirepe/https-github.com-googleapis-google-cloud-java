// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/agent.proto

package com.google.cloud.dialogflow.v2beta1;

public interface SetAgentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.SetAgentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The agent to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Agent agent = 1;</code>
   */
  boolean hasAgent();
  /**
   *
   *
   * <pre>
   * Required. The agent to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Agent agent = 1;</code>
   */
  com.google.cloud.dialogflow.v2beta1.Agent getAgent();
  /**
   *
   *
   * <pre>
   * Required. The agent to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Agent agent = 1;</code>
   */
  com.google.cloud.dialogflow.v2beta1.AgentOrBuilder getAgentOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. The mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}