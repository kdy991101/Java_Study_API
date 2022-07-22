package com.iu.io.file.ex1;

public class StudentDTO {
	//DTO = Data Transfer Object'
		
	private String name;
	private int num;
	private int k;
	private int e;
	private int m;
	private int total;
	private double avg;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getK() {
		return k;
	}
	public void setK(int k) {
		this.k = k;
	}
	public int getE() {
		return e;
	}
	public void setE(int e) {
		this.e = e;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
}
