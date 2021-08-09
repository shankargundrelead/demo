package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_APIS")
public class XpaApi {
	@Id
	public int api_id;
    public String api_name;
    public String api_desc;
    public String api_type;
    public String api_group;
    public String user_def5;
    public int internal_api_id;
    public String ws_obj_name;
    public String ws_obj_endpoint;
    public String auto_enabled;
}
