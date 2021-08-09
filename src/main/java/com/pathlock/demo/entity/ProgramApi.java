package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_PROG_APIS")
public class ProgramApi {
	@Id
	public int prog_api_id;
    public int program_id;
    public int api_id;
}
