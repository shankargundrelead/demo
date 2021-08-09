package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_JOBS")
public class XpaJob {
	@Id
	public int schedule_id;
    public String thread_name;
    public String server_name;
    public String job_status;
    public String cancelled_by;
    public String cancelled_server;
}
