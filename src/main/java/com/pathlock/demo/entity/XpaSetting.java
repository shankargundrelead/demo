package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_SETTINGS")
public class XpaSetting {
	@Id
	public int settings_id;
    public String setting_name;
    public String setting_value;
    public String setting_desc;
}
