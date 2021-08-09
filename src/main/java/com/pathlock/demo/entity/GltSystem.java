package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GLT_XPA_SYSTEMS")
public class GltSystem {
	
	@Id
	private int systems_id;
	private String system_name;
	private String system_desc;
	private String system_key;
	private int apps_id;
	private String created_by;
	private String creation_date;
	private String creation_time;
	private String updated_by;
	private String updated_date;
	private String updated_time;
	private String user_def_1;
	private String user_def_2;
	private String active_status;
	private String external_system_id;
	private int sod_ds_conn_id;

	public int getSystems_id() {
		return systems_id;
	}

	public void setSystems_id(int systems_id) {
		this.systems_id = systems_id;
	}

	public String getSystem_name() {
		return system_name;
	}

	public void setSystem_name(String system_name) {
		this.system_name = system_name;
	}

	public String getSystem_desc() {
		return system_desc;
	}

	public void setSystem_desc(String system_desc) {
		this.system_desc = system_desc;
	}

	public String getSystem_key() {
		return system_key;
	}

	public void setSystem_key(String system_key) {
		this.system_key = system_key;
	}

	public int getApps_id() {
		return apps_id;
	}

	public void setApps_id(int apps_id) {
		this.apps_id = apps_id;
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

	public String getUser_def_1() {
		return user_def_1;
	}

	public void setUser_def_1(String user_def_1) {
		this.user_def_1 = user_def_1;
	}

	public String getUser_def_2() {
		return user_def_2;
	}

	public void setUser_def_2(String user_def_2) {
		this.user_def_2 = user_def_2;
	}

	public String getActive_status() {
		return active_status;
	}

	public void setActive_status(String active_status) {
		this.active_status = active_status;
	}

	public String getExternal_system_id() {
		return external_system_id;
	}

	public void setExternal_system_id(String external_system_id) {
		this.external_system_id = external_system_id;
	}

	public int getSod_ds_conn_id() {
		return sod_ds_conn_id;
	}

	public void setSod_ds_conn_id(int sod_ds_conn_id) {
		this.sod_ds_conn_id = sod_ds_conn_id;
	}
}
