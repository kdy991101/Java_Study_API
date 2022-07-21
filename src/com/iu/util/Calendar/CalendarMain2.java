package com.iu.util.Calendar;

import java.sql.Date;
import java.util.Calendar;

public class CalendarMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Calendar now = Calendar.getInstance();
			
			Calendar birth = Calendar.getInstance();
			birth.set(Calendar.YEAR, 1999);
			birth.set(Calendar.MONTH, 10);
			birth.set(Calendar.DATE, 1);
//			birth.set(Calendar.MINUTE, 15);
			System.out.println("생년월일" + birth);
			
			int y = birth.get(Calendar.YEAR);
			int m = birth.get(Calendar.MONTH);
			int d = birth.get(Calendar.DATE);
			
			System.out.println(y + "년");
			System.out.println(m+1 + "월");
			System.out.println(d + "일");
			
			long n = now.getTimeInMillis();
			long b = birth.getTimeInMillis();
			
			long result = n-b;
			System.out.println(result);
			System.out.println(result/(1000*60*60*24)/365 + "살");
			
//			Date date = now.getTime();
//			System.out.println(date);
			
			
			
//			
//			System.out.println(result);
//			
//			int s = 1000;
//			long result2 = result/s; 
//			System.out.println(result2/60);
//			
			
	}

}
