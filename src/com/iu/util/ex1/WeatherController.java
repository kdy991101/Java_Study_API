package com.iu.util.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherController {
	Scanner sc = new Scanner(System.in);
	WeatherService ws = new WeatherService();
//	WeatherView wv = new WeatherView();
	public void start() {
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
	
	

}
