package com.iu.lang.string;

import java.util.Scanner;

public class StringStudy2 {
	public void StudyIndexOf()
	{
		String str = "Hello World";
		int indexOf = str.charAt(0);
		System.out.println(indexOf);	
		//ch => char
		int a = str.indexOf("ll");
		System.out.println(a);
//		indexOf = 몇번째 인덱스인지 알려줌
		//못찾으면 -1이 나옴
		String str2 = str.replace('l', 'w');
		System.out.println(str2);
		System.out.println(str);
		
		str = "Google에 입사지원동기는...Google에 입사하면 노예가 되겠습니다.";
		System.out.println(str);
		str = str.replace("Google", "Samsung");
		System.out.println(str);
		//주로 출판사같은 곳에서 한글 -> 영문 등으로 번역할 시에 많이 사용함.
		
		str = "Hi";
		String str3 = "Hi            ";
		str3 = str3.trim();
//		trim() => 앞, 뒤 공백을 지워줌
		System.out.println(str.equals(str3));
		str3 = str3.replace(" ", "");
//		중간 공백 지우는 방법
				
	}
	public void StudyIndexOfEx1()
	{
		String names = "iu,suji,choa,hani";
//				1.names 에는 몇개의 쉼표가 있는가?
//				2.총 몇명이 있는가?
		int n =-1;//쉼표의 인덱스 번호.
		boolean check = true;
		int count = 0;//쉼표의 개수를 담을 변수
//		
		while(check){
//		for(int i = 0; i < names.length(); i++)
//			{
				n = names.indexOf(",", n+1);
				System.out.print(",의 인덱스 번호 : " + n + "\n");
				if(n == -1)
				{
					break;
				}
				else 
				{
					count++;
					n++;
				}
			}	
		System.out.println(", 개수 :" + count);
		System.out.println("인원 수 :" + (count +1));
		
		}
		public void studySubString()
		{
			//하나의 문자열을 분리하는 작업 (parsing)
			String member = "iu/1111";
			String pw = member.substring(3);//결과 1111
			String id = member.substring(0, 2);//결과 iu
			//0번부터 2글자만 출력, 0번부터 2번 미만 인덱스까지만 출력
			System.out.println(pw);
			System.out.println(id);
		}
		public void ex2() {
			//키보드로부터 파일명을 입력받음, abc.txt, jpg.word;
			//파일이 이미지파일인지 아닌지 구별
			//이미지파일이면 이미지 파일입니다 아니면 아닙니다 출력
			//확장자가 jpg, pmg, gif, jpeg
			Scanner sc = new Scanner(System.in);
			System.out.println("파일을 입력해 주세요.");
			String file = sc.next();
			
			
			 int name = file.lastIndexOf(".");
			 
			 file = file.substring(name + 1);
				if(file.equals("jpg") || file.equals("pmg") || file.equals("gif") || file.equals("jpeg")) {
				 System.out.println("이미지 파일입니다.");
			 }else {
				System.out.println("이미지 파일이 아닙니다.");
			}
				//================강사님 풀이
//				String [] files = {"jpg", "png", "gif", "jpeg"};//강사
//				for(int i = 0; i<files.length; i++) {
//					if(name.equals(files[i])) {
//						result = "이미지 파일입니다."
//								break;
//					}else {
//						System.out.println("이미지 파일이 아닙니다.");
//					}
//				}
			//====================================
			
			
	//		int q = 0;
//			boolean check = true;
//			int count=0;
//			while(check) {
//			String file = ".jpg,.pmg,.gif,.jpeg";
//			System.out.println("파일 이름을 입력해주세요.");
//			String f = sc.next();
//			System.out.println("입력하신 파일은 :" + f + "입니다.");
//				q = file.indexOf(".", q);
//				System.out.println(q);
//				if(q == 0)
//				{
//					System.out.println("이미지 파일이 맞습니다.");
//				}
//				else 
//				{
//					count++;
//					q++;
//				}
//				String g = file.substring(q, count);
//				System.out.println(g);
//			
//			}
		}
	}

