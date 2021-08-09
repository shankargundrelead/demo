package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_PLATFORM")
public class XpaPlatform {
	@Id
	public int platform_id;
    public String customer_name;
    public String contact_name;
    public String address1;
    public String address2;
    public String state_code;
    public String zip_code;
    public String status;
    public String license_key;
    public String email_address;
    public String user_def_01;
    public String user_def_02;
    public String user_def_03;
    public String user_def_04;
    public String user_def_05;
    public String customer_id;
    public String error_reason;
}
