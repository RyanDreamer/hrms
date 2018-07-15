package com.hrms.entity;

import java.util.Date;

public class PTrans {
	Integer eid;
	Integer preJob;
	Integer nextJob;
	String preDept;
	String nextDept;
	String date;
	String PS;
	/**
	 * @param eid
	 * @param preJob
	 * @param nextJob
	 * @param preDept
	 * @param nextDept
	 * @param date2
	 * @param pS
	 */
	public PTrans(Integer eid, Integer preJob, Integer nextJob, String preDept, String nextDept, String date, String PS) {
		super();
		this.eid = eid;
		this.preJob = preJob;
		this.nextJob = nextJob;
		this.preDept = preDept;
		this.nextDept = nextDept;
		this.date = date;
		this.PS = PS;
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
	 * @return the preJob
	 */
	public Integer getPreJob() {
		return preJob;
	}
	/**
	 * @param preJob the preJob to set
	 */
	public void setPreJob(Integer preJob) {
		this.preJob = preJob;
	}
	/**
	 * @return the nextJob
	 */
	public Integer getNextJob() {
		return nextJob;
	}
	/**
	 * @param nextJob the nextJob to set
	 */
	public void setNextJob(Integer nextJob) {
		this.nextJob = nextJob;
	}
	/**
	 * @return the preDept
	 */
	public String getPreDept() {
		return preDept;
	}
	/**
	 * @param preDept the preDept to set
	 */
	public void setPreDept(String preDept) {
		this.preDept = preDept;
	}
	/**
	 * @return the nextDept
	 */
	public String getNextDept() {
		return nextDept;
	}
	/**
	 * @param nextDept the nextDept to set
	 */
	public void setNextDept(String nextDept) {
		this.nextDept = nextDept;
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
	 * @return the pS
	 */
	public String getPS() {
		return PS;
	}
	/**
	 * @param pS the pS to set
	 */
	public void setPS(String PS) {
		this.PS = PS;
	}
	
	
}