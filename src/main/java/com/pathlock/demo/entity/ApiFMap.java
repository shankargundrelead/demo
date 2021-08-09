package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_API_F_MAP")
public class ApiFMap {
	@Id
	public int api_f_id;
    public int internal_api_id;
    public int external_api_id;
    public int int_api_field_id;
    public int ext_api_field_id;
    public String int_api_field_name;
    public String ext_api_field_name;
}
