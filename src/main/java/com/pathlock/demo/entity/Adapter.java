package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_ADAPTERS")
public class Adapter {
	@Id
	public int adapter_id;
    public String adapter_name;
    public String adapter_desc;
    public String is_shared;
    public String adapter_type;
    public int apps_id;
    public String created_by;
    public String creation_date;
    public String creation_time;
    public String updated_date;
    public String updated_time;
    public String active_status;
    public String locked_status;
    public String locked_by;
    public String locked_reason;
    public String user_def_1;
}
