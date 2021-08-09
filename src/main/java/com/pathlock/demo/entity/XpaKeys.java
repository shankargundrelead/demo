package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_KEYS")
public class XpaKeys {
	@Id
	public int key_id;
    public String key_name;
    public String key_contents;
    public String created_by;
    public String creation_date;
    public String creation_time;
    public String updated_by;
    public String updated_date;
    public String updated_time;
}
