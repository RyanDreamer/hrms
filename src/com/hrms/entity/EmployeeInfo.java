package com.hrms.entity;

public class EmployeeInfo {
	Integer eid;
	String name;
	Integer age;
	String sex;
	String hometown;
	String oldJob;
	Integer experience;
	String education;
	String cet4;
	Integer family;
	String password;
	
	public EmployeeInfo() {
		
	}
	/**
	 * @param name
	 * @param age
	 * @param sex
	 * @param hometown
	 * @param oldJob
	 * @param experience
	 * @param education
	 * @param cet4
	 * @param family
	 * @param password
	 */
	public EmployeeInfo(int eid, String name, int age, String sex, String hometown, String oldJob, int experience,
			String education, String cet4, int family, String password) {
		super();
		this.eid = eid;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.hometown = hometown;
		this.oldJob = oldJob;
		this.experience = experience;
		this.education = education;
		this.cet4 = cet4;
		this.family = family;
		this.password = password;
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
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the hometown
	 */
	public String getHometown() {
		return hometown;
	}
	/**
	 * @param hometown the hometown to set
	 */
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	/**
	 * @return the oldJob
	 */
	public String getOldJob() {
		return oldJob;
	}
	/**
	 * @param oldJob the oldJob to set
	 */
	public void setOldJob(String oldJob) {
		this.oldJob = oldJob;
	}
	/**
	 * @return the experience
	 */
	public Integer getExperience() {
		return experience;
	}
	/**
	 * @param experience the experience to set
	 */
	public void setExperience(Integer experience) {
		this.experience = experience;
	}
	/**
	 * @return the education
	 */
	public String getEducation() {
		return education;
	}
	/**
	 * @param education the education to set
	 */
	public void setEducation(String education) {
		this.education = education;
	}
	/**
	 * @return the cet4
	 */
	public String getCet4() {
		return cet4;
	}
	/**
	 * @param cet4 the cet4 to set
	 */
	public void setCet4(String cet4) {
		this.cet4 = cet4;
	}
	/**
	 * @return the family
	 */
	public Integer getFamily() {
		return family;
	}
	/**
	 * @param family the family to set
	 */
	public void setFamily(Integer family) {
		this.family = family;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String pw) {
		this.password = pw;
	}
	
	/**
	 * 输出一条信息
	 */
	public void outPut() {
		System.out.println(eid.intValue()+"\t"+ name+"\t"+age.intValue()+"\t"+
						sex+"\t"+hometown+"\t"+oldJob+"\t"+experience.intValue()+"\t"+
						education+"\t"+cet4+"\t"+family.intValue()+"\t"+password);
	}
}
