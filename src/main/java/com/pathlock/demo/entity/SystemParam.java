package com.pathlock.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(SysParamId.class)	
@Table(name="GLT_XPA_SYS_PARAMS")
public class SystemParam {
	
	@Id
	public int system_id;
	@Id
    public String param_key;
	
    public String param_value;
    public String user_def_01;
    public String user_def_02;
    public String user_def_03;
    public String user_def_04;
    public String user_def_05;
}


class SysParamId implements Serializable {
	protected int system_id;
	protected String param_key;

    public SysParamId() {
    	
    }

    public SysParamId(int system_id, String param_key) {
        this.system_id = system_id;
        this.param_key = param_key;
    }
}