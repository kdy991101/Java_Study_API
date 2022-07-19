package com.iu.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx1 {
	//주민번호를 입력받음 : 6-7 = 991101-1234567.여2345678
	//남자 여자 판단
	//나이 출력
	//3월에서5월 사이는 : 봄
	//6-8사이는 여름
	//9-11가을
	//12-2겨울
	//문자열을 받을 것
	
	//나이...
	public void ex1() {
		Scanner sc  = new Scanner(System.in);
		System.out.println("주민번호를 입력하여 주세요.");
		String number = sc.next();
		
		String age = number.substring(0, 2);
//		System.out.println(age + "년생입니다.");
		int age1 = Integer.parseInt(age);
		if(age1 > 22)
		{
			int q = 100-age1;
			System.out.print("나이는 : ");
			System.out.println(q+22);
		}else if(age1 <22)
		{
			int w = 22-age1;
			System.out.print("나이는 : ");
			System.out.println(w);
			
		}else {
			System.out.println("오류입니다.");
		}

		
		//계절 구별
//		.equals(month) "1"
		String month = number.substring(2, 4);
		int month1 =  Integer.parseInt(month);
		
		if(month1 >= 03 && month1 <= 05)
		{
			System.out.println("태어난 계절 : 봄");
		}
		else if(month1 >= 06 && month1 <= 8)
		{
			System.out.println("태어난 계절 : 여름");
		}
		else if(month1 >= 9 && month1 <= 11)
		{
			System.out.println("태어난 계절 : 가을");
		}
		else if(month1 >= 12 && month1 < 01)
		{
			System.out.println("태어난 계절 : 겨울");
		}
		else 
			{
				System.out.println("오류입니다.");
			}

		//성별 구별
		int numbers = number.lastIndexOf("-");
		number = number.substring(numbers+1, 8);
		
		if(number.equals("1") || number.contains("3"))
		{
			System.out.println("성별은 : 남성");
		}
		else if(number.equals("2") || number.equals("4"))
		{
			System.out.println("성별은 : 여성");
		}else {
			System.out.println("오류");
		}
		

		
	}
}
