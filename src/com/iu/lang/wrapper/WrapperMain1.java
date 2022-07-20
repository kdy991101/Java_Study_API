package com.iu.lang.wrapper;

import com.iu.lang.wrapper.ex1.WrapperEx1;
import com.iu.lang.wrapper.ex1.WrapperEx2;

public class WrapperMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Integer.BYTES); //결과 4바이트
		System.out.println(Integer.MAX_VALUE);//결과 21억
		System.out.println(Integer.MIN_VALUE);//결과 -21억
		System.out.println(Integer.SIZE);//결과 32비트
		
		String num = "10";
		
		Integer integer = new Integer(num);
		int n = integer.intValue();
		
		n = 50;
		integer = new Integer(n);
		//integer = 참조변수, int = 정수
		//원래는 불가능함
		//하지만 가능하게 만들어놈..?
		integer = n;//auto-boxing 정수의 값 인트를 레퍼런스로 바꿔줌
		
		n = integer;//auto-unboxing 
		
		long l = 10l;
//		integer = l;//오토박싱 불가
		long ll = 1l;
		System.out.println(ll);
		
//		같은 형식끼리만 가능함
	
		integer = (int)l;
		integer = (int)ll;
		
		System.out.println(n);
		
		//중요
		//문자열 중에서 숫자형식만 가능한 것임
		String num1 = "50";
		String num2 = "3.12";
		String num3 = "60";	
//	문자열 -> primitive
		
		int n1 = Integer.parseInt(num1);
		Double n2 = Double.parseDouble(num2);
		long n3 = Long.parseLong(num3);
		System.out.println(n1*2);
		System.out.println(n2*2);
		System.out.println(n3*2);
		
		
		
		
//		System.out.println(num + 2);
		
		WrapperEx1 we = new WrapperEx1();
		we.ex1();
		WrapperEx2 we2 = new WrapperEx2();
//		we2.juminCheck();

	}

}
