package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GLT_XPA_BATCH_D")
public class BatchData {

    @Id
	public int sr_id;
    public int header_id;
    public int seq_num;
    public int api_id;
}
