package com.hrdb1.entity;

import java.util.Date;

public class PTrans {
	int eid;
	int prejob;
	int nextjob;
	String predept;
	String nextdept;
	Date date;
	String PS;
	public PTrans(int eid, int prejob, int nextjob, String predept, String nextdept, Date date, String pS) {
		super();
		this.eid = eid;
		this.prejob = prejob;
		this.nextjob = nextjob;
		this.predept = predept;
		this.nextdept = nextdept;
		this.date = date;
		PS = pS;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getPrejob() {
		return prejob;
	}
	public void setPrejob(int prejob) {
		this.prejob = prejob;
	}
	public int getNextjob() {
		return nextjob;
	}
	public void setNextjob(int nextjob) {
		this.nextjob = nextjob;
	}
	public String getPredept() {
		return predept;
	}
	public void setPredept(String predept) {
		this.predept = predept;
	}
	public String getNextdept() {
		return nextdept;
	}
	public void setNextdept(String nextdept) {
		this.nextdept = nextdept;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getPS() {
		return PS;
	}
	public void setPS(String pS) {
		PS = pS;
	}
	
	

}
