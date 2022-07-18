package com.iu.lang.string;

public class StringStudy {
	
	public void studyCharAt() {
		//문자열 = 문자배열
		//첫번쨰 H꺼내오기
		char [] ch = {'H', 'e', 'l', 'l', 'o', ' ' , 'W', 'o', 'r', 'l', 'd'};
		System.out.println(ch[0]);
		String str = "Welcome to World";
		char c = str.charAt(0);
		System.out.println(c);
//		c = str.charAt(-1);
//		System.out.println(c);
//		charAt = 원하는 인덱스를 출력하겠다
		
		System.out.println(str.length());
		
		System.out.println("=============================");
		//str에 있는 문자열을 하나씩 꺼내서 출력하기
		for(int i = 0; i<str.length(); i++) 
		{
//			c = str.charAt(i); // 강사님 풀이
			System.out.print(str.charAt(i));
		}
		
		
		
		
		
	}
}
