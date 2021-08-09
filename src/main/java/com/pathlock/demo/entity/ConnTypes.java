package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_CONN_TYPES")
public class ConnTypes {
	@Id
	public int conn_type_id;
    public String conn_type_name;
    public String conn_type_desc;
    public String conn_exe_point;
    public String active_status;
    public String locked_status;
    public String connpool_exepoint;
    public String is_pool_allowed;
    public String grc_type;
}
