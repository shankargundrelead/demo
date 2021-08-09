package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_PROGRAMS")
public class Program {
	@Id
	public int program_id;
    public String program_name;
    public String program_desc;
    public int connection_type;
    public int program_type;
    public String program_category;
    public String active_status;
    public String locked_status;
    public String created_by;
    public String creation_date;
    public String creation_time;
    public String updated_by;
    public String updated_date;
    public String update_time;
    public String program_group;
    public String program_status;
    public String sort_by;
    public String user_def_1;
    public String user_def_2;
    public String user_def_3;
    public String user_def_4;
    public String user_def_5;
    public String lines_to_ignore;
}
