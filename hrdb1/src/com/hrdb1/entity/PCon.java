package com.hrdb1.entity;

public class PCon {
	int id;
	int salary;
	String startdate;
	String deadline;
	int eid;
	int jid;
	public PCon(int id, int salary, String startdate, String deadline, int eid, int jid) {
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
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
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
