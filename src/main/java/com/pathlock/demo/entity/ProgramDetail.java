package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_PROG_DEAIL")
public class ProgramDetail {
	@Id
	public int program_id;
	public String program_code;
    public String prog_instruction;
    public String user_def_1;
    public String user_def_2;
    public String user_def_3;
    public String user_def_4;
    public String user_def_5;
    public String program_details1;
    public String program_details2;
    public String program_details3;
    public String program_details4;
    public String program_details5;
    public String program_details6;
    public String program_details7;
    public String program_details8;
    public String program_details9;
    public String program_details10;
}
