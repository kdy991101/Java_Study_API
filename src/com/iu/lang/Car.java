package com.iu.lang;

public class Car {
	
	@Override
	public boolean equals(Object obj) {
		Car car = (Car)obj;
		return true;
	}//오버라이딩 하겠다
	
	@Override
	public String toString() {
		return "car에서 오버라이딩 함";
	}

}
