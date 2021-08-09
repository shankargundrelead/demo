package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_PROG_M_MAP")
public class ProgramMMap {
	@Id
	public int prog_api_param_id;
    public int program_id;
    public int api_id;
    public int prog_api_id;
    public int prog_api_sys_id;
    public int system_id;
    public int connector_id;
    public int api_param_id;
    public int prog_param_id;
    public String api_param_name;
    public String program_param_name;
    public String user_def_01;
    public String user_def_02;
    public String user_def_03;
    public String user_def_04;
    public String user_def_05;
}
