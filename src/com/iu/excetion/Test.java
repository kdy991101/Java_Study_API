package com.iu.excetion;

import java.util.Random;
import java.util.Scanner;

public class Test {

	public void t1() {
		System.out.println("t1 메서드 실행");
		Random random = new Random();
		
		String str = null;//초기값
		if(random.nextInt(10)%2==0)
		{
			str = "10";
		}
		
		int num = Integer.parseInt(str);//눈에는 안보이지만 new NumberFormatException이 만들어짐
		try {
		num = num/0;
		System.out.println(num);
		
		}catch (ArithmeticException e) {//메소드 선언형식과 비슷/ ()안에 어떤 타입을 받을건지 작성
			System.out.println("예외처리");
			
		}//예외가 발생하지 않으면 밑으로 내려감
		
		System.out.println(str.toString());
		new NullPointerException();//
		System.out.println("t1 메서드 종료");
	}//t1
	
	public void t2() {
		String[] str = {"10", "five", "3.14", "0"};
		Scanner sc = new Scanner(System.in);
		
		for(String s : str)
		{
			try {
				
				System.out.println("숫자를 입력하세요");
				int n = sc.nextInt();
			int num = Integer.parseInt(s);
			num = n/num;
			System.out.println(num);
			//num=지역변수 
			}catch (NumberFormatException e) 
			{
				System.out.println("예외처리");
			}catch (ArithmeticException e)
			{
				System.out.println("예외처리");
			}catch (Exception e)// 99%는 에러 잡아 줌 
			//밑으로 가면서 더 넓은 부모 타입을 선언
			{
				e.printStackTrace();

			}catch (Throwable e) 
			{

			}
		}
		
	}//t2
	
	public void t3() throws NullPointerException, ArithmeticException {
		String str = null;
		System.out.println(str.toString());
		
	}//t3
	
	public void t4() throws MyException{
		//유치원생 프로그램
		//0~99까지만 일고있음
		int num = 48;
		int num2 = 83;
		int num3 = num+num2;
		int num4 = num-num2;
		
		if(num3>99)
		{
			throw new MyException();
		}
		if(num4<0)
		{
			throw new MyException("그런 숫자 몰라요");
		}
	}
}
