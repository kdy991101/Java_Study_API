package com.iu.util.ex1;

public class CityDTO {
	//도시의 날씨 정보
	//모든 멤버변수의 접근지정자는 private
	private String name;//도시명
	private double gion;//기온정보
	private int hum;//습도 정보
	private String status;//맑음,비,눈,태풍...
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGion() {
		return gion;
	}
	public void setGion(double gion) {
		this.gion = gion;
	}
	public int getHum() {
		return hum;
	}
	public void setHum(int hum) {
		this.hum = hum;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
	
	
	
	
	
	
}
