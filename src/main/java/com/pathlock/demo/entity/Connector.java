package com.pathlock.demo.entity;

import java.sql.Clob;
import java.sql.NClob;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.type.ClobType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
//import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString), Root.class); */
@Entity // This tells Hibernate to make a table out of this class
@Table(name = "GLT_XPA_CONNECTORS")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Connector {
	@Id
	@JsonProperty("connector_id")
	public int connector_id;
	@JsonProperty("connector_name")
	public String connector_name;
	@JsonProperty("connector_desc")
	public String connector_desc;
	@JsonProperty("connector_system")
	public String connector_system;
	@JsonProperty("connector_type")
	public String connector_type;
	@JsonProperty("internal_appname")
	public String internal_appname;
	@JsonProperty("connector_username")
	public String connector_username;
	@JsonProperty("connector_password")
	public String connector_password;
	@JsonProperty("created_by")
	public String created_by;
	@JsonProperty("creation_date")
	public String creation_date;
	@JsonProperty("creation_time")
	public String creation_time;
	@JsonProperty("updated_by")
	public String updated_by;
	@JsonProperty("updated_date")
	public String updated_date;
	@JsonProperty("updated_time")
	public String updated_time;
	@JsonProperty("addi_connector_id")
	public int addi_connector_id;
	@JsonProperty("user_def_01")
	public String user_def_01;
	@JsonProperty("user_def_02")
	public String user_def_02;
	@JsonProperty("user_def_03")
	public String user_def_03;
	@JsonProperty("user_def_04")
	public String user_def_04;
	@JsonProperty("user_def_05")
	public String user_def_05;
	@JsonProperty("user_def_06")
	public String user_def_06;
	@JsonProperty("user_def_07")
	public String user_def_07;
	@JsonProperty("user_def_08")
	public String user_def_08;
	@JsonProperty("user_def_09")
	public String user_def_09;
	@JsonProperty("user_def_10")
	public String user_def_10;
	@JsonProperty("connector_category")
	public String connector_category;
	@JsonProperty("pool_size")
	public int pool_size;
	@JsonProperty("pool_incr_size")
	public int pool_incr_size;
	@JsonProperty("active_status")
	public String active_status;
	
	@JsonProperty("is_grc_conn")
	public String is_grc_conn;
	
	//@JsonIgnore
	@JsonProperty("user_def_11")
	@Lob
	public String user_def_11;

	public int getConnector_id() {
		return connector_id;
	}

	public void setConnector_id(int connector_id) {
		this.connector_id = connector_id;
	}

	public String getConnector_name() {
		return connector_name;
	}

	public void setConnector_name(String connector_name) {
		this.connector_name = connector_name;
	}

	public String getConnector_desc() {
		return connector_desc;
	}

	public void setConnector_desc(String connector_desc) {
		this.connector_desc = connector_desc;
	}

	public String getConnector_system() {
		return connector_system;
	}

	public void setConnector_system(String connector_system) {
		this.connector_system = connector_system;
	}

	public String getConnector_type() {
		return connector_type;
	}

	public void setConnector_type(String connector_type) {
		this.connector_type = connector_type;
	}

	public String getInternal_appname() {
		return internal_appname;
	}

	public void setInternal_appname(String internal_appname) {
		this.internal_appname = internal_appname;
	}

	public String getConnector_username() {
		return connector_username;
	}

	public void setConnector_username(String connector_username) {
		this.connector_username = connector_username;
	}

	public String getConnector_password() {
		return connector_password;
	}

	public void setConnector_password(String connector_password) {
		this.connector_password = connector_password;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(String creation_date) {
		this.creation_date = creation_date;
	}

	public String getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(String creation_time) {
		this.creation_time = creation_time;
	}

	public String getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}

	public String getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(String updated_date) {
		this.updated_date = updated_date;
	}

	public String getUpdated_time() {
		return updated_time;
	}

	public void setUpdated_time(String updated_time) {
		this.updated_time = updated_time;
	}

	public int getAddi_connector_id() {
		return addi_connector_id;
	}

	public void setAddi_connector_id(int addi_connector_id) {
		this.addi_connector_id = addi_connector_id;
	}

	public String getUser_def_01() {
		return user_def_01;
	}

	public void setUser_def_01(String user_def_01) {
		this.user_def_01 = user_def_01;
	}

	public String getUser_def_02() {
		return user_def_02;
	}

	public void setUser_def_02(String user_def_02) {
		this.user_def_02 = user_def_02;
	}

	public String getUser_def_03() {
		return user_def_03;
	}

	public void setUser_def_03(String user_def_03) {
		this.user_def_03 = user_def_03;
	}

	public String getUser_def_04() {
		return user_def_04;
	}

	public void setUser_def_04(String user_def_04) {
		this.user_def_04 = user_def_04;
	}

	public String getUser_def_05() {
		return user_def_05;
	}

	public void setUser_def_05(String user_def_05) {
		this.user_def_05 = user_def_05;
	}

	public String getUser_def_06() {
		return user_def_06;
	}

	public void setUser_def_06(String user_def_06) {
		this.user_def_06 = user_def_06;
	}

	public String getUser_def_07() {
		return user_def_07;
	}

	public void setUser_def_07(String user_def_07) {
		this.user_def_07 = user_def_07;
	}

	public String getUser_def_08() {
		return user_def_08;
	}

	public void setUser_def_08(String user_def_08) {
		this.user_def_08 = user_def_08;
	}

	public String getUser_def_09() {
		return user_def_09;
	}

	public void setUser_def_09(String user_def_09) {
		this.user_def_09 = user_def_09;
	}

	public String getUser_def_10() {
		return user_def_10;
	}

	public void setUser_def_10(String user_def_10) {
		this.user_def_10 = user_def_10;
	}

	public String getConnector_category() {
		return connector_category;
	}

	public void setConnector_category(String connector_category) {
		this.connector_category = connector_category;
	}

	public int getPool_size() {
		return pool_size;
	}

	public void setPool_size(int pool_size) {
		this.pool_size = pool_size;
	}

	public int getPool_incr_size() {
		return pool_incr_size;
	}

	public void setPool_incr_size(int pool_incr_size) {
		this.pool_incr_size = pool_incr_size;
	}

	public String getActive_status() {
		return active_status;
	}

	public void setActive_status(String active_status) {
		this.active_status = active_status;
	}

	public String getIs_grc_conn() {
		return is_grc_conn;
	}

	public void setIs_grc_conn(String is_grc_conn) {
		this.is_grc_conn = is_grc_conn;
	}

	public String getUser_def_11() {
		return user_def_11;
	}

	public void setUser_def_11(String user_def_11) {
		this.user_def_11 = user_def_11;
	}

}
