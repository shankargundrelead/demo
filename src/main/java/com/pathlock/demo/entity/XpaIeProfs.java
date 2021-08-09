package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="glt_xpa_ie_profs")
public class XpaIeProfs {
	@Id
	public int ie_prof_id;
    public String ie_prof_name;
    public String ie_prof_type;
    public String ie_prof_sub_type;
    public String ie_prof_desc;
}
