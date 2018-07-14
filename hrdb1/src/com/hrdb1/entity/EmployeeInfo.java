package com.hrdb1.entity;

public class EmployeeInfo {
	int eid;
	String name;
	int age;
	String  sex;
	String hometowm;
	String oldjob;
	int experience;
	String education;
	String cet4;
	int family;
	String password;
	public EmployeeInfo(int eid, String name, int age, String sex, String hometowm, String oldjob, int experience,
			String education, String cet4, int family,String password) {
		super();
		this.eid = eid;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.hometowm = hometowm;
		this.oldjob = oldjob;
		this.experience = experience;
		this.education = education;
		this.cet4 = cet4;
		this.family = family;
		this.password = password;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getHometowm() {
		return hometowm;
	}
	public void setHometowm(String hometowm) {
		this.hometowm = hometowm;
	}
	public String getOldjob() {
		return oldjob;
	}
	public void setOldjob(String oldjob) {
		this.oldjob = oldjob;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getCet4() {
		return cet4;
	}
	public void setCet4(String cet4) {
		this.cet4 = cet4;
	}
	public int getFamily() {
		return family;
	}
	public void setFamily(int family) {
		this.family = family;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
