package com.hrms.entity;

import java.util.Date;

public class PCon {
	Integer id;
	Integer salary;
	String startDate;
	String deadline;
	Integer eid;
	Integer jid;
	/**
	 * @param salary
	 * @param salary2 
	 * @param startDate
	 * @param deadline
	 * @param eid
	 * @param jid
	 */
	public PCon(Integer id, Integer salary, String startDate, String deadline, Integer eid, Integer jid) {
		super();
		this.id = id;
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
	public String getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the deadline
	 */
	public String getDeadline() {
		return deadline;
	}
	/**
	 * @param deadline the deadline to set
	 */
	public void setDeadline(String deadline) {
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
