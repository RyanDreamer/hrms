package com.hrms.entity;

public class Dept {
	String name;
	Integer minister;
	String Sdept;
	/**
	 * @param name
	 * @param minister
	 * @param sdept
	 */
	public Dept(String name, Integer minister, String sdept) {
		super();
		this.name = name;
		this.minister = minister;
		Sdept = sdept;
	}
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the minister
	 */
	public Integer getMinister() {
		return minister;
	}
	/**
	 * @param minister the minister to set
	 */
	public void setMinister(Integer minister) {
		this.minister = minister;
	}
	/**
	 * @return the sdept
	 */
	public String getSdept() {
		return Sdept;
	}
	/**
	 * @param sdept the sdept to set
	 */
	public void setSdept(String sdept) {
		Sdept = sdept;
	}
	
	
}
