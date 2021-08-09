package com.pathlock.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="GLT_XPA_BATCH_SCHD")
public class BatchSchedule {
	@Id
	@JsonProperty("scheduled_id") 
    public int sCHEDULED_ID;
    @JsonProperty("header_id") 
    public int hEADER_ID;
    @JsonProperty("SEQ_NUM") 
    public int sEQ_NUM;
    @JsonProperty("schedule_type") 
    public String sCHEDULE_TYPE;
    @JsonProperty("sch_recurrence") 
    public String sCH_RECURRENCE;
    @JsonProperty("sch_time") 
    public String sCH_TIME;
    @JsonProperty("sch_status") 
    public String sCH_STATUS;
    @JsonProperty("start_date") 
    public String sTART_DATE;
    @JsonProperty("start_time") 
    public String sTART_TIME;
    @JsonProperty("end_date") 
    public String eND_DATE;
    @JsonProperty("end_time") 
    public String eND_TIME;
    @JsonProperty("next_run_date") 
    public String nEXT_RUN_DATE;
    @JsonProperty("next_run_time") 
    public String nEXT_RUN_TIME;
    @JsonProperty("user_def_01") 
    public String uSER_DEF_01;
    @JsonProperty("user_def_02") 
    public String uSER_DEF_02;
    @JsonProperty("user_def_03") 
    public String uSER_DEF_03;
    @JsonProperty("user_def_04") 
    public String uSER_DEF_04;
    @JsonProperty("user_def_05") 
    public String uSER_DEF_05;
    
	public int getsCHEDULED_ID() {
		return sCHEDULED_ID;
	}
	public void setsCHEDULED_ID(int sCHEDULED_ID) {
		this.sCHEDULED_ID = sCHEDULED_ID;
	}
	public int gethEADER_ID() {
		return hEADER_ID;
	}
	public void sethEADER_ID(int hEADER_ID) {
		this.hEADER_ID = hEADER_ID;
	}
	public int getsEQ_NUM() {
		return sEQ_NUM;
	}
	public void setsEQ_NUM(int sEQ_NUM) {
		this.sEQ_NUM = sEQ_NUM;
	}
	public String getsCHEDULE_TYPE() {
		return sCHEDULE_TYPE;
	}
	public void setsCHEDULE_TYPE(String sCHEDULE_TYPE) {
		this.sCHEDULE_TYPE = sCHEDULE_TYPE;
	}
	public String getsCH_RECURRENCE() {
		return sCH_RECURRENCE;
	}
	public void setsCH_RECURRENCE(String sCH_RECURRENCE) {
		this.sCH_RECURRENCE = sCH_RECURRENCE;
	}
	public Object getsCH_TIME() {
		return sCH_TIME;
	}
	public void setsCH_TIME(String sCH_TIME) {
		this.sCH_TIME = sCH_TIME;
	}
	public String getsCH_STATUS() {
		return sCH_STATUS;
	}
	public void setsCH_STATUS(String sCH_STATUS) {
		this.sCH_STATUS = sCH_STATUS;
	}
	public Object getsTART_DATE() {
		return sTART_DATE;
	}
	public void setsTART_DATE(String sTART_DATE) {
		this.sTART_DATE = sTART_DATE;
	}
	public Object getsTART_TIME() {
		return sTART_TIME;
	}
	public void setsTART_TIME(String sTART_TIME) {
		this.sTART_TIME = sTART_TIME;
	}
	public Object geteND_DATE() {
		return eND_DATE;
	}
	public void seteND_DATE(String eND_DATE) {
		this.eND_DATE = eND_DATE;
	}
	public Object geteND_TIME() {
		return eND_TIME;
	}
	public void seteND_TIME(String eND_TIME) {
		this.eND_TIME = eND_TIME;
	}
	public Object getnEXT_RUN_DATE() {
		return nEXT_RUN_DATE;
	}
	public void setnEXT_RUN_DATE(String nEXT_RUN_DATE) {
		this.nEXT_RUN_DATE = nEXT_RUN_DATE;
	}
	public Object getnEXT_RUN_TIME() {
		return nEXT_RUN_TIME;
	}
	public void setnEXT_RUN_TIME(String nEXT_RUN_TIME) {
		this.nEXT_RUN_TIME = nEXT_RUN_TIME;
	}
	public String getuSER_DEF_01() {
		return uSER_DEF_01;
	}
	public void setuSER_DEF_01(String uSER_DEF_01) {
		this.uSER_DEF_01 = uSER_DEF_01;
	}
	public String getuSER_DEF_02() {
		return uSER_DEF_02;
	}
	public void setuSER_DEF_02(String uSER_DEF_02) {
		this.uSER_DEF_02 = uSER_DEF_02;
	}
	public String getuSER_DEF_03() {
		return uSER_DEF_03;
	}
	public void setuSER_DEF_03(String uSER_DEF_03) {
		this.uSER_DEF_03 = uSER_DEF_03;
	}
	public String getuSER_DEF_04() {
		return uSER_DEF_04;
	}
	public void setuSER_DEF_04(String uSER_DEF_04) {
		this.uSER_DEF_04 = uSER_DEF_04;
	}
	public String getuSER_DEF_05() {
		return uSER_DEF_05;
	}
	public void setuSER_DEF_05(String uSER_DEF_05) {
		this.uSER_DEF_05 = uSER_DEF_05;
	}
}
