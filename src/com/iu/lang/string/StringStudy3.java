package com.iu.lang.string;

public class StringStudy3 {
	
	public void studySplit3() {
		//도시별로 분리하기
		String info = "서울,대전-대구,부산-제주,광주-강릉";
		info = info.replace("-", ",");//글자 변경,전처리
		String[] citys = info.split(","); 
			for(String city:citys) {
			System.out.println(city);
	}
	}
	
	public void studySplit2() {
		//년도 월 일 분리
		String info = "1997-12-24";
		String[] years = info.split("-");
		for(String year:years) { //신포문
			System.out.println(year);
//			결과
//			1997
//			12
//			24
//			for(int i = 0; i<years.length; i++) { //구포문
//				String year = years[i];
//			}
		}
	}
	
	public void studySpilt() {
//		String str = new String();
		String str = "iu,suji,hani";
//		둘다 같은 방식
//		하나의 문자열을 이름단위로 꺼내기
		String[] names = str.split(",");
		
		//for문 - for(초기식;조건식;증감식;){}
		//향상된 for문(인덱스 번호가 필요 없을 시에 사용)-for(배열에모은데이터타입 변수명:배열참조변수명){}
		for(int i = 0; i< names.length; i++) {//구 포문
			String name = names[i];
		}
		
		for(String name:names) { //신포문
			System.out.println(name);
			//결과값
//			iu
//			suji
//			hani
		}
		
		
	}
}
