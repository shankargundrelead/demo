package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="glt_xpa_sod_data")
public class XpaSodData {
	@Id
	public int sod_data_id;
    public String ext_system_id;
    public String file_name;
    public String realm_name;
    public String user_def_00;
    public String user_def_01;
    public String user_def_02;
    public String user_def_03;
    public String user_def_04;
    public String user_def_05;
    public String user_def_06;
    public String user_def_07;
    public String user_def_08;
    public String user_def_09;
    public String created_by;
    public String create_date;
    public String last_updated_by;
    public String last_update_date;
}
