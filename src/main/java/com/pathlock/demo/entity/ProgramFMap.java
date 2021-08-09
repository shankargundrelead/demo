package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_PROG_F_MAP")
public class ProgramFMap {
	@Id
	public int prog_api_field_id;
    public int program_id;
    public int api_id;
    public int prog_api_id;
    public int prog_api_sys_id;
    public int system_id;
    public int connector_id;
    public int api_field_id;
    public int prog_field_id;
    public String api_field_name;
    public String program_field_name;
    public String user_def_01;
    public String user_def_02;
    public String user_def_03;
    public String user_def_04;
    public String user_def_05;
    public String field_value;
}
