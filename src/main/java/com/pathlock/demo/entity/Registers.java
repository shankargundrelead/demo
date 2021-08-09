package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_REGISTRS")
public class Registers {
	@Id
	public int registration_id;
    public String registr_name;
    public String registr_company;
    public String email_address;
    public String telephone;
    public String fax;
    public String address1;
    public String address2;
    public String state_name;
    public String zip_code;
    public int apps_id;
    public int systems_id;
    public String operating_system;
    public String status;
    public String created_by;
    public String creation_date;
    public String creation_time;
    public String updated_by;
    public String updated_date;
    public String updated_time;
    public String license_key;
    public String customer_id;
    public String error_reason;
    public String datasource_type;
    public String ac_version;
}
