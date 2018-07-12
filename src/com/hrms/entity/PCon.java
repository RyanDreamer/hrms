package com.hrms.entity;

import java.util.Date;

public class PCon {
	Integer id;
	Integer salary;
	Date startDate;
	Date deadline;
	Integer eid;
	Integer jid;
	/**
	 * @param salary
	 * @param startDate
	 * @param deadline
	 * @param eid
	 * @param jid
	 */
	public PCon(Integer salary, Date startDate, Date deadline, Integer eid, Integer jid) {
		super();
		this.salary = salary;
		this.startDate = startDate;
		this.deadline = deadline;
		this.eid = eid;
		this.jid = jid;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the salary
	 */
	public Integer getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the deadline
	 */
	public Date getDeadline() {
		return deadline;
	}
	/**
	 * @param deadline the deadline to set
	 */
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
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
	
	
}
