package com.hrms.entity;

public class Job {
	Integer jid;
	String title;
	String dept;
	Integer countDemand;
	Integer countReal;
	Integer salary;
	/**
	 * @param title
	 * @param dept
	 * @param countDemand
	 * @param countReal
	 * @param salary
	 */
	public Job(String title, String dept, Integer countDemand, Integer countReal, Integer salary) {
		super();
		this.title = title;
		this.dept = dept;
		this.countDemand = countDemand;
		this.countReal = countReal;
		this.salary = salary;
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
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
	/**
	 * @return the countDemand
	 */
	public Integer getCountDemand() {
		return countDemand;
	}
	/**
	 * @param countDemand the countDemand to set
	 */
	public void setCountDemand(Integer countDemand) {
		this.countDemand = countDemand;
	}
	/**
	 * @return the countReal
	 */
	public Integer getCountReal() {
		return countReal;
	}
	/**
	 * @param countReal the countReal to set
	 */
	public void setCountReal(Integer countReal) {
		this.countReal = countReal;
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
	
	
}
