package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_BATCH_RUNS")
public class BatchRuns {
	@Id
	public int job_run_id;
    public int sr_id;
    public int header_id;
    public int seq_num;
    public String current_status;
    public String start_date;
    public String start_time;
    public String end_date;
    public String end_time;
    public String reason;
    public String user_def_01;
    public String user_def_02;
    public String user_def_03;
    public String user_def_05;
    public int exe_num;
    public String total;
    public String processed;
    public String passportid;
}
