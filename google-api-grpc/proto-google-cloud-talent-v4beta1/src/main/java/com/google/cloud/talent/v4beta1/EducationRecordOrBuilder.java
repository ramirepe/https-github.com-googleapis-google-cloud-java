// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/profile.proto

package com.google.cloud.talent.v4beta1;

public interface EducationRecordOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.EducationRecord)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional.
   * The start date of the education.
   * </pre>
   *
   * <code>.google.type.Date start_date = 1;</code>
   */
  boolean hasStartDate();
  /**
   *
   *
   * <pre>
   * Optional.
   * The start date of the education.
   * </pre>
   *
   * <code>.google.type.Date start_date = 1;</code>
   */
  com.google.type.Date getStartDate();
  /**
   *
   *
   * <pre>
   * Optional.
   * The start date of the education.
   * </pre>
   *
   * <code>.google.type.Date start_date = 1;</code>
   */
  com.google.type.DateOrBuilder getStartDateOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional.
   * The end date of the education.
   * </pre>
   *
   * <code>.google.type.Date end_date = 2;</code>
   */
  boolean hasEndDate();
  /**
   *
   *
   * <pre>
   * Optional.
   * The end date of the education.
   * </pre>
   *
   * <code>.google.type.Date end_date = 2;</code>
   */
  com.google.type.Date getEndDate();
  /**
   *
   *
   * <pre>
   * Optional.
   * The end date of the education.
   * </pre>
   *
   * <code>.google.type.Date end_date = 2;</code>
   */
  com.google.type.DateOrBuilder getEndDateOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional.
   * The expected graduation date if currently pursuing a degree.
   * </pre>
   *
   * <code>.google.type.Date expected_graduation_date = 3;</code>
   */
  boolean hasExpectedGraduationDate();
  /**
   *
   *
   * <pre>
   * Optional.
   * The expected graduation date if currently pursuing a degree.
   * </pre>
   *
   * <code>.google.type.Date expected_graduation_date = 3;</code>
   */
  com.google.type.Date getExpectedGraduationDate();
  /**
   *
   *
   * <pre>
   * Optional.
   * The expected graduation date if currently pursuing a degree.
   * </pre>
   *
   * <code>.google.type.Date expected_graduation_date = 3;</code>
   */
  com.google.type.DateOrBuilder getExpectedGraduationDateOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional.
   * The name of the school or institution.
   * For example, "Stanford University", "UC Berkeley", etc.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string school_name = 4;</code>
   */
  java.lang.String getSchoolName();
  /**
   *
   *
   * <pre>
   * Optional.
   * The name of the school or institution.
   * For example, "Stanford University", "UC Berkeley", etc.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string school_name = 4;</code>
   */
  com.google.protobuf.ByteString getSchoolNameBytes();

  /**
   *
   *
   * <pre>
   * Optional.
   * The physical address of the education institution.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Address address = 5;</code>
   */
  boolean hasAddress();
  /**
   *
   *
   * <pre>
   * Optional.
   * The physical address of the education institution.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Address address = 5;</code>
   */
  com.google.cloud.talent.v4beta1.Address getAddress();
  /**
   *
   *
   * <pre>
   * Optional.
   * The physical address of the education institution.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Address address = 5;</code>
   */
  com.google.cloud.talent.v4beta1.AddressOrBuilder getAddressOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional.
   * The full description of the degree.
   * For example, "Master of Science in Computer Science", "B.S in Math".
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string degree_description = 6;</code>
   */
  java.lang.String getDegreeDescription();
  /**
   *
   *
   * <pre>
   * Optional.
   * The full description of the degree.
   * For example, "Master of Science in Computer Science", "B.S in Math".
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string degree_description = 6;</code>
   */
  com.google.protobuf.ByteString getDegreeDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Optional.
   * The structured notation of the degree.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Degree structured_degree = 7;</code>
   */
  boolean hasStructuredDegree();
  /**
   *
   *
   * <pre>
   * Optional.
   * The structured notation of the degree.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Degree structured_degree = 7;</code>
   */
  com.google.cloud.talent.v4beta1.Degree getStructuredDegree();
  /**
   *
   *
   * <pre>
   * Optional.
   * The structured notation of the degree.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Degree structured_degree = 7;</code>
   */
  com.google.cloud.talent.v4beta1.DegreeOrBuilder getStructuredDegreeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional.
   * The description of the education.
   * Number of characters allowed is 100,000.
   * </pre>
   *
   * <code>string description = 8;</code>
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional.
   * The description of the education.
   * Number of characters allowed is 100,000.
   * </pre>
   *
   * <code>string description = 8;</code>
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Optional.
   * If this education is current.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue is_current = 9;</code>
   */
  boolean hasIsCurrent();
  /**
   *
   *
   * <pre>
   * Optional.
   * If this education is current.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue is_current = 9;</code>
   */
  com.google.protobuf.BoolValue getIsCurrent();
  /**
   *
   *
   * <pre>
   * Optional.
   * If this education is current.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue is_current = 9;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getIsCurrentOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The school name snippet shows how the
   * [school_name][google.cloud.talent.v4beta1.EducationRecord.school_name] is
   * related to a search query in search result. It's empty if the
   * [school_name][google.cloud.talent.v4beta1.EducationRecord.school_name]
   * isn't related to the search query.
   * </pre>
   *
   * <code>string school_name_snippet = 10;</code>
   */
  java.lang.String getSchoolNameSnippet();
  /**
   *
   *
   * <pre>
   * Output only. The school name snippet shows how the
   * [school_name][google.cloud.talent.v4beta1.EducationRecord.school_name] is
   * related to a search query in search result. It's empty if the
   * [school_name][google.cloud.talent.v4beta1.EducationRecord.school_name]
   * isn't related to the search query.
   * </pre>
   *
   * <code>string school_name_snippet = 10;</code>
   */
  com.google.protobuf.ByteString getSchoolNameSnippetBytes();

  /**
   *
   *
   * <pre>
   * Output only. The job description snippet shows how the
   * [degree][google.cloud.talent.v4beta1.degree] is related to a search query
   * in search result. It's empty if the
   * [degree][google.cloud.talent.v4beta1.degree] isn't related to the search
   * query.
   * </pre>
   *
   * <code>string degree_snippet = 11;</code>
   */
  java.lang.String getDegreeSnippet();
  /**
   *
   *
   * <pre>
   * Output only. The job description snippet shows how the
   * [degree][google.cloud.talent.v4beta1.degree] is related to a search query
   * in search result. It's empty if the
   * [degree][google.cloud.talent.v4beta1.degree] isn't related to the search
   * query.
   * </pre>
   *
   * <code>string degree_snippet = 11;</code>
   */
  com.google.protobuf.ByteString getDegreeSnippetBytes();

  public com.google.cloud.talent.v4beta1.EducationRecord.DegreeCase getDegreeCase();
}