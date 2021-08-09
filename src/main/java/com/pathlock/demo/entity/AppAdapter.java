package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_APPS_ADAPT")
public class AppAdapter {
	@Id
	public int sr_id;
    public int apps_id;
    public int adapter_id;
    public String created_by;
    public String creaetion_date;
    public String creation_time;
    public String updated_date;
    public String updated_time;
    public String active_status;
    public String locked_status;
}
