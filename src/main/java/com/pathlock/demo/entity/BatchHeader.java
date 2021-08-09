package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_BATCH_H")
public class BatchHeader {
	@Id
	public int header_id;
    public int seq_num;
    public String name;
    public String description;
    public int apps_id;
    public int system_id;
    public String from_user_id;
    public String to_user_id;
    public String from_role_id;
    public String to_role_id;
    public String created_by;
    public String creation_date;
    public String creation_time;
    public int max_no_of_lines;
    public int scheduled_id;
    public String job_status;
    public String user_def_01;
    public String schedule_type;
}
