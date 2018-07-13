package com.hrdb1.entity;

import java.util.Date;

public class PCon {
	int id;
	int salary;
	Date startdate;
	Date deadline;
	int eid;
	int jid;
	public PCon(int id, int salary, Date startdate, Date deadline, int eid, int jid) {
		super();
		this.id = id;
		this.salary = salary;
		this.startdate = startdate;
		this.deadline = deadline;
		this.eid = eid;
		this.jid = jid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getJid() {
		return jid;
	}
	public void setJid(int jid) {
		this.jid = jid;
	}
	
	

}
