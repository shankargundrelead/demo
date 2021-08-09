package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_PRGAPI_SYS")
public class ProgramApiSys {
	@Id
	public int prog_api_sys_id;
    public int prog_api_id;
    public int program_id;
    public int api_id;
    public int system_id;
    public int connector_id;
}
