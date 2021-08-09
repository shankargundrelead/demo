package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_SEQUENCES")
public class Sequence {
	@Id
	public String table_name;
    public int last_sequence_no;
}
