package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_PROG_TYPES")
public class ProgramTypes {
	@Id
	public int prog_type_id;
    public String prog_type_name;
    public String prog_type_desc;
    public int conn_type_id;
}
