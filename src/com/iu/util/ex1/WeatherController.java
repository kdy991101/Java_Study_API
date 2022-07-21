package com.iu.util.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherController {
	//서비스와 뷰를 이어주는 역할
	
	Scanner sc = new Scanner(System.in);
	WeatherView wv = new WeatherView();
	
//	private WeatherService ws;//2.방법
	//누군가가 객체를 만들어야 함
	
	
	WeatherService ws = new WeatherService();//1.방법
	public void start() {
		//메서드안에서 참조해야하는 객체를 생성
		
		ArrayList<CityDTO> ar = new ArrayList<>();
		 
		boolean check = true;
		while(check){
			System.out.println("1.날씨정보초기화\n2.전국날씨출력\n3.지역날씨검색\n4.지역정보추가\n5.지역정보삭제\n6.종     료");
			System.out.println("번호를 입력해주세요");
			int num = sc.nextInt();
			if(num == 1)//초기화
			{
				
				
			
			}
			else if(num == 2)//전국 검색
			{
				
				wv.view(ar);
			
			}
			else if(num == 3)//도시 날씨 검색
			{
				ws.find(ar);
				
				
			
			}
			else if(num == 4)//추가
			{
				
				ws.add(ar);
				
			}
			else if(num == 5)//삭제
			{
				
				ws.remove(ar);
				
			}
			else if(num == 6)//종료
			{
				
				System.out.println("프로그램을 종료합니다.");
				break;
			
			}else {
				
				System.out.println("오류입니다.");
			
			}
			
		}
		
		
		
		
	}
	//=======================강사님 풀이
//	public class WeatherController1() 
//	public void start1() {
//		ArrayList<CityDTO> ar = new ArrayList<>();
//		boolean check = true;
//		
//		while(check) {
//			System.out.println("1 날씨 초기화");
//			System.out.println("2 날씨 정보 출력");
//			System.out.println("3 지역 정보 출력");
//			System.out.println("4 지역 정보 추가");
//			System.out.println("5 지역 정보 삭제");
//			System.out.println("6 종       료");
//			int select = sc.nextInt();
//			if(select == 1) {
//				
//				ws.init(ar);
//			}else if (select == 2)
//			{
//				wv.view(ar);
//			}else if (select == 3)
//			{
//				CityDTO cityDTO = ws.find(ar);
//				//리턴 받아온 것을 사용
//				if(cityDTO != null)
//				{
//					wv.view(cityDTO);
//				}else {
//					wv.view("잘못된 도시명");
//				}
//				
//			}else if (select == 4)
//			{
//				boolean result = ws.add(ar);
//				String message = "추가 실패";
//				if(result)
//				{
//					message = "추가 성공";
//				}
//				wv.view(message);
//			}else if (select == 5)
//			{
//				boolean result = ws.remove(ar);
//				String message = "삭제 실패";
//				if(result)
//				{
//					message = "삭제 성공";
//				}
//				wv.view(message);
//			}else {
//			
//				break;
//				//아니면 check = !check;
//			}
//		}//while
	}
	
	
	


