package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="glt_xpa_sod_idata")
public class XpaSodIData {
	@Id
	public int sod_idata_id;
    public String ext_system_id;
    public String file_name;
    public String realm_name;
    public String identy;
    public String identy_typ;
    public String created_by;
    public String create_date;
    public String last_updated_by;
    public String last_update_date;
}
