package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_API_FIELDS")
public class ApiFields {
	@Id
	public int api_field_id;
    public int api_id;
    public int sequence_id;
    public String field_name;
    public String field_desc;
    public String field_type;
    public int field_length;
    public String field_group;
    public String ws_obj_fieldname;
    public String user_def_01;
    public String user_def_02;
    public String user_def_03;
    public String user_def_04;
    public String user_def_05;
}
