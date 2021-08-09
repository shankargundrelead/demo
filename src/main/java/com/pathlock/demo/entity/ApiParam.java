package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_API_PARAM")
public class ApiParam {
	@Id
	public int parameter_id;
    public int api_id;
    public String parameter_name;
    public String parameter_desc;
    public String parameter_type;
    public String parameter_opr;
    public String parameter_ieopr;
    public String parameter_value;
    public String param_low_value;
    public String param_high_value;
    public String param_data_type;
    public String param_condition;
    public String parameter_token;
    public String param_multi_value;
    public String is_required;
    public int lookup_id;
    public String lookup_param_name;
    public String periodic_date_type;
    public String user_def_01;
    public String user_def_02;
    public String user_def_03;
    public String user_def_04;
    public String user_def_05;
    public String created_by;
    public String creation_date;
    public String creation_time;
    public String updated_by;
    public String updated_date;
    public String updated_time;
}
