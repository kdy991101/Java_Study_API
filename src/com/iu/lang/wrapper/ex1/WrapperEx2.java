package com.iu.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx2 {
	//문자로 받은 것을 숫자로 변경하여 *2
	//문자열을 primitive로 변경한다
//	public void juminCheck1() {//======================강사님 풀이
//		Scanner sc = new Scanner(System.in);
//		System.out.println("주민번호 입력하세요.");
//		String jumin1 = "991101-1234567";
//		
//		int count = 2;
//		int sum1 = 0;
//		
//		for(int i = 0; i<jumin1.length()-1; i++) {
//		
//		//꺼내는 방법
//		//1.subString()메서드 리턴타입 String
//		String num1 = jumin1.substring(0, 1);//1,2 2,3 ...
//		int n1 = Integer.parseInt(num1);
//		
//		//2.charAt()메서드  리턴타입 char
//		char ch1 = jumin1.charAt(0);
//			
//		//ch -> 문자열로 변환
//
//		String num2 = String.valueOf(ch1);
//		int n2 = Integer.parseInt(String.valueOf(jumin1.charAt(i))); // 방법1
//		//위 두줄을 하나로
////		int n2 = Integer.parseInt(String.valueOf(ch1));
//		
//		if(i == 6) {
//			continue;
//		}
//		
//		sum1 = sum1 + n2*count;
//		count++;
////		int n3 = Integer.parseInt(ch1 + "");// 방법2
//		
//		}
//		int check = sum1%11;
//		check = 11-check;
//		if(check > 9) {
//			check = check%10;
//		}
//		
//		//check용 번호
//		int checkNum1 = String.valueOf(jumin1.charAt(jumin1.length()-1));
//		
//		if(check == checkNum1) {
//			System.out.println("정상 주민번호");
//		}else {
//			System.out.println("비정상 주민번호");
//		}
//	}//=========================================================================
	
	
	public void juminCheck() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 \"-\"를 포함하여 입력해주세요");
		String jumin = sc.next();
		//String jumin = "971124-1234567";
		int sum = 0;
		int j = 2;
		for(int i = 0; i < jumin.length() - 1; i++) {
			if(i == 6) {
				continue;
			}
			int count = Integer.parseInt(String.valueOf(jumin.charAt(i)));//괄호 안에부터 시작한다.
			count *= j;
			sum += count;
			j++;
			if(j > 9) {
				j = 2;
			}
		}
		
		int c = 11 - sum%11;
		System.out.println(c);
		
		if(c > 9 && c < 100) {
			c = c%10;
		}
		if(c == Integer.parseInt(String.valueOf(jumin.charAt(13)))) {
			System.out.println("합법 주민입니다");
		}else {
			System.out.println("합법 주민이 아닙니다");
		}
	}
}

		
	