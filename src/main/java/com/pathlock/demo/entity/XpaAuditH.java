package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_AUDIT_H")
public class XpaAuditH {
	@Id
	public int audit_header_id;
    public int request_id;
    public String request_type;
    public String user_id;
    public String hcm_ts_date;
    public String hcm_ts_time;
    public int dependent_on;
    public String status;
    public String error_desc;
    public String request_desc;
    public int log_step_id;
    public String created_by;
    public String creation_date;
    public String creation_time;
    public String updated_by;
    public String updated_date;
    public String updated_time;
    public int grc_req_id;
    public String external_system_id;
    public String user_def_01;
    public String user_def_02;
    public String user_def_03;
    public String user_def_04;
    public String user_def_05;
}
