package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_APPS")
public class Application {
	@Id
	public int apps_id;
    public String apps_name;
    public String apps_desc;
    public String creation_date;
    public String creation_time;
}
