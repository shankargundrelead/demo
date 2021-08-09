package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_PROG_ASSOC")
public class ProgramAssociation {
	@Id
	public int prog_assoc_id;
    public int program_id;
    public int apps_id;
    public int adapter_id;
}
