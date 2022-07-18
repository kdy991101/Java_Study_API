package com.iu.lang.ex1;

public class Phone {
	private int price;
	private int size;
	
	@Override
	public boolean equals(Object obj) { // obj = p2
		// TODO Auto-generated method stub
		Phone p2 = (Phone)obj;
//		this.getPrice() && ph.getPrice(); // this == p1
//		this. = 그 객체의 멤버변수
		boolean check = false;
		if(this.getPrice() == p2.getPrice() && this.getSize() == p2.getSize())
		{
			check = true;
//			또는
//			check = !check;
		}
		
		return check;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
//	오버라이딩 = 상속받은 메서드를 재정의하는 것
	
	
//	public boolean equals() {
//		
//		// TODO Auto-generated method stub
//		boolean check = p1.price == p2.price && p1.size == p2.size ? true : false;
//		return check;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		Phone ph = (Phone)obj;
//		boolean price = ph.price && getPrice() ? true : false;
//		boolean size = ph.size && getSize() ? true : false;
//		
//		return price == size;
//		return super.equals(obj);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		Phone ph = (Phone)obj;
//		
//		
//	}
	
	
}
