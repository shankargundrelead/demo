package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_REGI_STATU")
public class RegistrationStatus {
	@Id
	public int sr_id;
    public int registration_id;
    public String status;
    public String updated_date;
    public String updated_time;
}
