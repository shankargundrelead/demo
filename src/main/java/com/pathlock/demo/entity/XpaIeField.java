package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="glt_xpa_ie_fields")
public class XpaIeField {
	@Id
	public int ie_field_id;
    public int ie_file_id;
    public String ie_field_name;
    public String ie_field_desc;
    public String ie_field_data_type;
    public int ie_field_length;
    public String ie_field_required;
    public String ie_field_null;
    public String ie_field_file_col;
}
