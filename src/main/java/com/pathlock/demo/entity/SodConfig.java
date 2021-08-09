package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_SOD_CONFIG")
public class SodConfig {
	@Id
	public int sod_config_id;
    public String ext_system_id;
    public String file_name;
    public String realm_name;
    public String field_name;
    public String table_column;
    public String created_by;
    public String create_date;
    public String last_updated_by;
    public String last_update_date;
}
