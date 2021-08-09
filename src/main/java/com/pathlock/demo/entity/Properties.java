package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_PROPERTIES")
public class Properties {
	@Id
	public String prop_name;
	public String prop_value;
	public String prop_def_value;
	public String prop_desc;
    public String user_def_01;
    public String user_def_02;
    public String user_def_03;
    public String user_def_04;
    public String user_def_05;
}
