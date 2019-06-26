// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/data_payloads.proto

package com.google.cloud.datalabeling.v1beta1;

public final class DataPayloads {
  private DataPayloads() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_ImagePayload_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_ImagePayload_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_TextPayload_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_TextPayload_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_VideoThumbnail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_VideoThumbnail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_VideoPayload_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_VideoPayload_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/datalabeling/v1beta1/data"
          + "_payloads.proto\022!google.cloud.datalabeli"
          + "ng.v1beta1\032\034google/api/annotations.proto"
          + "\032\036google/protobuf/duration.proto\032\037google"
          + "/protobuf/timestamp.proto\"a\n\014ImagePayloa"
          + "d\022\021\n\tmime_type\030\001 \001(\t\022\027\n\017image_thumbnail\030"
          + "\002 \001(\014\022\021\n\timage_uri\030\003 \001(\t\022\022\n\nsigned_uri\030\004"
          + " \001(\t\"#\n\013TextPayload\022\024\n\014text_content\030\001 \001("
          + "\t\"S\n\016VideoThumbnail\022\021\n\tthumbnail\030\001 \001(\014\022."
          + "\n\013time_offset\030\002 \001(\0132\031.google.protobuf.Du"
          + "ration\"\251\001\n\014VideoPayload\022\021\n\tmime_type\030\001 \001"
          + "(\t\022\021\n\tvideo_uri\030\002 \001(\t\022K\n\020video_thumbnail"
          + "s\030\003 \003(\01321.google.cloud.datalabeling.v1be"
          + "ta1.VideoThumbnail\022\022\n\nframe_rate\030\004 \001(\002\022\022"
          + "\n\nsigned_uri\030\005 \001(\tBx\n%com.google.cloud.d"
          + "atalabeling.v1beta1P\001ZMgoogle.golang.org"
          + "/genproto/googleapis/cloud/datalabeling/"
          + "v1beta1;datalabelingb\006proto3"
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
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_datalabeling_v1beta1_ImagePayload_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datalabeling_v1beta1_ImagePayload_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_ImagePayload_descriptor,
            new java.lang.String[] {
              "MimeType", "ImageThumbnail", "ImageUri", "SignedUri",
            });
    internal_static_google_cloud_datalabeling_v1beta1_TextPayload_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datalabeling_v1beta1_TextPayload_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_TextPayload_descriptor,
            new java.lang.String[] {
              "TextContent",
            });
    internal_static_google_cloud_datalabeling_v1beta1_VideoThumbnail_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_datalabeling_v1beta1_VideoThumbnail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_VideoThumbnail_descriptor,
            new java.lang.String[] {
              "Thumbnail", "TimeOffset",
            });
    internal_static_google_cloud_datalabeling_v1beta1_VideoPayload_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_datalabeling_v1beta1_VideoPayload_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_VideoPayload_descriptor,
            new java.lang.String[] {
              "MimeType", "VideoUri", "VideoThumbnails", "FrameRate", "SignedUri",
            });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}