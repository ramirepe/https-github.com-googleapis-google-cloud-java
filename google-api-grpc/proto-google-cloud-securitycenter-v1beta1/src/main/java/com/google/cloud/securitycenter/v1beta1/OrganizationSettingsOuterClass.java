// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1beta1/organization_settings.proto

package com.google.cloud.securitycenter.v1beta1;

public final class OrganizationSettingsOuterClass {
  private OrganizationSettingsOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1beta1_OrganizationSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1beta1_OrganizationSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1beta1_OrganizationSettings_AssetDiscoveryConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1beta1_OrganizationSettings_AssetDiscoveryConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n?google/cloud/securitycenter/v1beta1/or"
          + "ganization_settings.proto\022#google.cloud."
          + "securitycenter.v1beta1\032\034google/api/annot"
          + "ations.proto\"\250\003\n\024OrganizationSettings\022\014\n"
          + "\004name\030\001 \001(\t\022\036\n\026enable_asset_discovery\030\002 "
          + "\001(\010\022n\n\026asset_discovery_config\030\003 \001(\0132N.go"
          + "ogle.cloud.securitycenter.v1beta1.Organi"
          + "zationSettings.AssetDiscoveryConfig\032\361\001\n\024"
          + "AssetDiscoveryConfig\022\023\n\013project_ids\030\001 \003("
          + "\t\022t\n\016inclusion_mode\030\002 \001(\0162\\.google.cloud"
          + ".securitycenter.v1beta1.OrganizationSett"
          + "ings.AssetDiscoveryConfig.InclusionMode\""
          + "N\n\rInclusionMode\022\036\n\032INCLUSION_MODE_UNSPE"
          + "CIFIED\020\000\022\020\n\014INCLUDE_ONLY\020\001\022\013\n\007EXCLUDE\020\002B"
          + "~\n\'com.google.cloud.securitycenter.v1bet"
          + "a1P\001ZQgoogle.golang.org/genproto/googlea"
          + "pis/cloud/securitycenter/v1beta1;securit"
          + "ycenterb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_securitycenter_v1beta1_OrganizationSettings_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1beta1_OrganizationSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1beta1_OrganizationSettings_descriptor,
            new java.lang.String[] {
              "Name", "EnableAssetDiscovery", "AssetDiscoveryConfig",
            });
    internal_static_google_cloud_securitycenter_v1beta1_OrganizationSettings_AssetDiscoveryConfig_descriptor =
        internal_static_google_cloud_securitycenter_v1beta1_OrganizationSettings_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_securitycenter_v1beta1_OrganizationSettings_AssetDiscoveryConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1beta1_OrganizationSettings_AssetDiscoveryConfig_descriptor,
            new java.lang.String[] {
              "ProjectIds", "InclusionMode",
            });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}