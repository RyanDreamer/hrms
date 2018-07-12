package com.hrms.entity;

import java.util.Date;

public class Entry {
	Integer eid;
	Date date;
	Integer jid;
	String dept;
	/**
	 * @param eid
	 * @param date
	 * @param jid
	 * @param dept
	 */
	public Entry(Integer eid, Date date, Integer jid, String dept) {
		super();
		this.eid = eid;
		this.date = date;
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
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
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
