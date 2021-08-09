package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_AUDIT_D")
public class XpaAuditD {
	@Id
	public int audit_header_id;
    public int request_id;
    public int audit_detail_id;
    public int log_id;
    public String log_desc;
    public String created_by;
    public String creation_date;
    public String creation_time;
}
