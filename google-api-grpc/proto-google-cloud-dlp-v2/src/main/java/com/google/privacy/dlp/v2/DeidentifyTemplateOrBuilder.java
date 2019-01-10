// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface DeidentifyTemplateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.DeidentifyTemplate)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The template name. Output only.
   * The template will have one of the following formats:
   * `projects/PROJECT_ID/deidentifyTemplates/TEMPLATE_ID` OR
   * `organizations/ORGANIZATION_ID/deidentifyTemplates/TEMPLATE_ID`
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The template name. Output only.
   * The template will have one of the following formats:
   * `projects/PROJECT_ID/deidentifyTemplates/TEMPLATE_ID` OR
   * `organizations/ORGANIZATION_ID/deidentifyTemplates/TEMPLATE_ID`
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Display name (max 256 chars).
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Display name (max 256 chars).
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Short description (max 256 chars).
   * </pre>
   *
   * <code>string description = 3;</code>
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Short description (max 256 chars).
   * </pre>
   *
   * <code>string description = 3;</code>
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * The creation timestamp of a inspectTemplate, output only field.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * The creation timestamp of a inspectTemplate, output only field.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * The creation timestamp of a inspectTemplate, output only field.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The last update timestamp of a inspectTemplate, output only field.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5;</code>
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * The last update timestamp of a inspectTemplate, output only field.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5;</code>
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * The last update timestamp of a inspectTemplate, output only field.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * ///////////// // The core content of the template  // ///////////////
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DeidentifyConfig deidentify_config = 6;</code>
   */
  boolean hasDeidentifyConfig();
  /**
   *
   *
   * <pre>
   * ///////////// // The core content of the template  // ///////////////
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DeidentifyConfig deidentify_config = 6;</code>
   */
  com.google.privacy.dlp.v2.DeidentifyConfig getDeidentifyConfig();
  /**
   *
   *
   * <pre>
   * ///////////// // The core content of the template  // ///////////////
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DeidentifyConfig deidentify_config = 6;</code>
   */
  com.google.privacy.dlp.v2.DeidentifyConfigOrBuilder getDeidentifyConfigOrBuilder();
}