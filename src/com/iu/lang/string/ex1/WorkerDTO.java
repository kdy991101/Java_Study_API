package com.iu.lang.string.ex1;

public class WorkerDTO {
	private String name;//이름
	private String department;//무서명
	private String jop;//직급
	private String phone;//전화번호
	
	//생성자는 기본 생성자가 필수임(=매개변수가 없는 생성자)
	
	//setter getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getJop() {
		return jop;
	}
	public void setJop(String jop) {
		this.jop = jop;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
