package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_SYS_CONN")
public class SystemConnection {
	@Id
	public int sys_conn_id;
    public int systems_id;
    public int connector_id;
    public String created_by;
    public String creation_date;
    public String creation_time;
    public String updated_by;
    public String updated_date;
    public String updated_time;
    public String active_status;
    public String locked_status;
    public String connector_for;
}
