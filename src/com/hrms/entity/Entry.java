package com.hrms.entity;

import java.sql.Date;

public class Entry {
	Integer eid;
	String date;
	Integer jid;
	String dept;
	/**
	 * @param eid
	 * @param date2
	 * @param jid
	 * @param dept
	 */
	public Entry(Integer eid, String date2, Integer jid, String dept) {
		super();
		this.eid = eid;
		this.date = date2;
		this.jid = jid;
		this.dept = dept;
	}
	/**
	 * @return the eid
	 */
	public Integer getEid() {
		return eid;
	}
	/**
	 * @param eid the eid to set
	 */
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * @return the jid
	 */
	public Integer getJid() {
		return jid;
	}
	/**
	 * @param jid the jid to set
	 */
	public void setJid(Integer jid) {
		this.jid = jid;
	}
	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}
	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}
