package com.iu.lang.string;

import javax.naming.ldap.StartTlsRequest;

public class StringMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "iu";
		String str2 = "iu";
		String str3 = new String("iu");
		String str4 = new String("iu");
		//변수에 넣는 데이터 = 상수 리터럴 
		//str1, str2 변수명은 달라도 주소는 같음...
		//하지만 str3 str4는 만들어진 위치가 다르기 때문에 false가 나옴
		
		System.out.println(str1 == str2); // true 나옴
		System.out.println(str1 == str3); // false 나옴
		System.out.println(str3 == str4); // false 나옴
		System.out.println(str1); //iu
		System.out.println(str2); //iu
		System.out.println(str3); //iu
		System.out.println(str4); //iu
		
		System.out.println("=======================================");
//		System.out.println(str1.equals(str2));
//		System.out.println(str1.equals(str3));
		//주소를 판단하는 것이 아닌 주소안에있는 데이터의 내용이 서로 같은지를 확인
		System.out.println("=======================================");
		StringStudy ss = new StringStudy();
		System.out.println("0번 인덱스만 출력하기");
//		ss.studyCharAt();
		System.out.println("\n=======================================");
		StringStudy2 ss2 = new StringStudy2();
//		System.out.println("\nindexOf출력하기");
//		ss2.StudyIndexOf();
//		ss2.StudyIndexOfEx1();
//		ss2.studySubString();
//		ss2.ex2();
		System.out.println("\n=======================================");
		StringStudy3 ss3 = new StringStudy3();
//		ss3.studySpilt();
		ss3.studySplit2();
		ss3.studySplit3();


	}

}
