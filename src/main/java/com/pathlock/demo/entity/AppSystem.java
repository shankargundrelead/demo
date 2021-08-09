package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_APPS_SYS")
public class AppSystem {
	@Id
	public int apps_sys_id;
    public int apps_id;
    public int systems_id;
    public String created_by;
    public String creation_date;
    public String creation_time;
    public String updated_by;
    public String updated_date;
    public String updated_time;
    public String active_status;
}
