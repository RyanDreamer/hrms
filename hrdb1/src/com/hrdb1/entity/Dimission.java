package com.hrdb1.entity;

import java.util.Date;



public class Dimission {
	int eid;
	Date date;
	int jid;
	String reason;
	public Dimission(int eid, Date date, int jid, String reason) {
		super();
		this.eid = eid;
		this.date = date;
		this.jid = jid;
		this.reason = reason;
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
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	

}
