package com.hrdb1.entity;

import java.util.Date;

public class Entry {
	int eid;
	Date date;
	int jid;
	String dept;
	public Entry(int eid, Date date, int jid, String dept) {
		super();
		this.eid = eid;
		this.date = date;
		this.jid = jid;
		this.dept = dept;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getJid() {
		return jid;
	}
	public void setJid(int jid) {
		this.jid = jid;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	

}
