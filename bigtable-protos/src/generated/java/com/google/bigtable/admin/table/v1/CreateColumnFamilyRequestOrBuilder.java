// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/table/v1approved/bigtable_table_service_messages.proto

package com.google.bigtable.admin.table.v1;

public interface CreateColumnFamilyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.table.v1.CreateColumnFamilyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string name = 1;</code>
   *
   * <pre>
   * The unique name of the table in which to create the new column family.
   * </pre>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 1;</code>
   *
   * <pre>
   * The unique name of the table in which to create the new column family.
   * </pre>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional string column_family_id = 2;</code>
   *
   * <pre>
   * The name by which the new column family should be referred to within the
   * table, e.g. "foobar" rather than "&lt;table_name&gt;/columnFamilies/foobar".
   * </pre>
   */
  java.lang.String getColumnFamilyId();
  /**
   * <code>optional string column_family_id = 2;</code>
   *
   * <pre>
   * The name by which the new column family should be referred to within the
   * table, e.g. "foobar" rather than "&lt;table_name&gt;/columnFamilies/foobar".
   * </pre>
   */
  com.google.protobuf.ByteString
      getColumnFamilyIdBytes();

  /**
   * <code>optional .google.bigtable.admin.table.v1.ColumnFamily column_family = 3;</code>
   *
   * <pre>
   * The column family to create. The `name` field must be left blank.
   * </pre>
   */
  boolean hasColumnFamily();
  /**
   * <code>optional .google.bigtable.admin.table.v1.ColumnFamily column_family = 3;</code>
   *
   * <pre>
   * The column family to create. The `name` field must be left blank.
   * </pre>
   */
  com.google.bigtable.admin.table.v1.ColumnFamily getColumnFamily();
  /**
   * <code>optional .google.bigtable.admin.table.v1.ColumnFamily column_family = 3;</code>
   *
   * <pre>
   * The column family to create. The `name` field must be left blank.
   * </pre>
   */
  com.google.bigtable.admin.table.v1.ColumnFamilyOrBuilder getColumnFamilyOrBuilder();
}