package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="glt_xpa_ie_files")
public class XpaIeFile {
	@Id
	public int ie_file_id;
    public int ie_prof_id;
    public String ie_file_name;
}
