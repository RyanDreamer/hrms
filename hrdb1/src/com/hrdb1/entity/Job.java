package com.hrdb1.entity;

public class Job {
	int jid;
	String title;
	String dept;
	int countDemand;
	int countReal;
	int salary;
	public Job(int jid, String title, String dept, int countDemand, int countReal, int salary) {
		super();
		this.jid = jid;
		this.title = title;
		this.dept = dept;
		this.countDemand = countDemand;
		this.countReal = countReal;
		this.salary = salary;
	}
	public int getJid() {
		return jid;
	}
	public void setJid(int jid) {
		this.jid = jid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getCountDemand() {
		return countDemand;
	}
	public void setCountDemand(int countDemand) {
		this.countDemand = countDemand;
	}
	public int getCountReal() {
		return countReal;
	}
	public void setCountReal(int countReal) {
		this.countReal = countReal;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}
