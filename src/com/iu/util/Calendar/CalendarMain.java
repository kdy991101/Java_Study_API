package com.iu.util.Calendar;

import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			Calendar ca = new GregorianCalendar();//다형성
		//객체를 만드는 순간 현재 년 월 일 분 초 밀리세컨즈
			Calendar ca = Calendar.getInstance();
			System.out.println(ca);
			ca.set(Calendar.YEAR, 2002);
			ca.set(Calendar.MONTH, 11);
			ca.set(Calendar.DATE, 25);
			
			int y = ca.get(Calendar.YEAR);
			int m = ca.get(Calendar.MONTH);
			int d = ca.get(Calendar.DATE);
			int h = ca.get(Calendar.HOUR);
			int m1 = ca.get(Calendar.MINUTE);
			int s = ca.get(Calendar.SECOND);
			
			long milis = ca.getTimeInMillis();
			
			System.out.println(y + "년");
			System.out.println(m+1 + "월");//7월 이지만 6월로 나옴
			//컴퓨터가 생각하기레 0월로 인식하여 6월로 나오는 것
			System.out.println(d + "일");
			System.out.println(h + "시");
			System.out.println(m1 + "분");
			System.out.println(s + "초");
			System.out.println(milis);
	}

}
