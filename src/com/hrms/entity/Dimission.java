package com.hrms.entity;

import java.util.Date;

public class Dimission {
	Integer eid;
	Date date;
	Integer jid;
	String reason;
	/**
	 * @param eid
	 * @param date
	 * @param jid
	 * @param reason
	 */
	public Dimission(Integer eid, Date date, Integer jid, String reason) {
		super();
		this.eid = eid;
		this.date = date;
		this.jid = jid;
		this.reason = reason;
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
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}
	/**
	 * @param reason the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	
}
