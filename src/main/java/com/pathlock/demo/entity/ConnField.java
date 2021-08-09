package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_CONN_FIELD")
public class ConnField {
	@Id
	public int sr_id;
    public int conn_type_id;
    public String field_name;
    public String field_desc;
    public String field_alias_name;
    public String field_type;
    public String field_data_type;
    public String field_length;
    public String conn_type_name;
    public String user_def_datafield;
    public int user_def_datafindx;
}
