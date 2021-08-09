package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_API_P_MAP")
public class ApiPMap {
	@Id
	public int api_p_id;
    public int internal_api_id;
    public int external_api_id;
    public int int_api_param_id;
    public int ext_api_param_id;
    public String int_api_param_name;
    public String ext_api_param_name;
    public String user_def_01;
    public String user_def_02;
    public String user_def_03;
    public String user_def_04;
    public String user_def_05;
}
