package com.hrdb1.entity;

public class Dept {
	String name;
	int minister;
	String sdept;
	
	public Dept(String name, int minister, String sdept) {
		super();
		this.name = name;
		this.minister = minister;
		this.sdept = sdept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMinister() {
		return minister;
	}
	public void setMinister(int minister) {
		this.minister = minister;
	}
	public String getSdept() {
		return sdept;
	}
	public void setSdept(String sdept) {
		this.sdept = sdept;
	}
	
	
}
