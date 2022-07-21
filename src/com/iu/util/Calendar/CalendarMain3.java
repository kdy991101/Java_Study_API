package com.iu.util.Calendar;

import java.util.Calendar;

public class CalendarMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar ca = Calendar.getInstance();
		
		ca.set(2022, 11, 31, 23, 59, 50);
		
		System.out.println(ca.getTime());
		
		long now = ca.getTimeInMillis();//현재시간을 롱타입으로 변환
		now += 10000;
		
		ca.setTimeInMillis(now);//롱타입을 날짜로 바꿈
		
		System.out.println(ca.getTime());
		
		
		
	}

}
