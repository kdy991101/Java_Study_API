package com.iu.util.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.iu.util.list.ListView;

public class WeatherService {
	private StringBuffer sb;
	
	public WeatherService() {
		
		sb = new StringBuffer();
		sb.append("Seoul,30.2,70,맑음,");
		sb.append("Daegu-38.9-90-흐림-");
		sb.append("jeju,12.1,10,눈,");
		sb.append("Busan-0.5-85-태풍-");
	}
	
//		-init메서드
//		 sb에 있는 요소들을 파싱해서 CityDTO에 담아 리턴한다
	public void init(ArrayList<CityDTO> ar) {
		ListView listView = new ListView();
		String info = sb.toString();
		info = info.replace(",", "-");
		System.out.println(info);
		StringTokenizer st = new StringTokenizer(info, "-");
		System.out.println(st);
		while(st.hasMoreTokens()) {
			CityDTO cityDTO = new CityDTO();
			cityDTO.setName(st.nextToken());
			cityDTO.setGion(Double.parseDouble(st.nextToken().trim()));
			cityDTO.setHum(Integer.parseInt(st.nextToken().trim()));
			cityDTO.setStatus(st.nextToken());
			
		}
		listView.view(ar);
	}
	
	Scanner sc = new Scanner(System.in);
	public void add(ArrayList<CityDTO> ar) {
		CityDTO cityDTO = new CityDTO();
		System.out.println("지역 정보를 추가 시작");
		System.out.println("도시이름을 입력해 주세요.");
		cityDTO.setName(sc.next());
		System.out.println("도시의 기온을 입력해 주세요");
		cityDTO.setGion(sc.nextDouble());
		System.out.println("도시의 습도를 입력해주세요");
		cityDTO.setHum(sc.nextInt());
		System.out.println("도시의 날씨를 입력해주세요");
		cityDTO.setStatus(sc.next());
		ar.add(cityDTO);
			
	}
	
	
	
	public void remove(ArrayList<CityDTO> ar) {
		CityDTO cityDTO = new CityDTO();
		System.out.println("지역 정보를 삭제 시작");
		System.out.println("도시명을 입력하세요");
		String name = sc.next();
		for(int i = 0; i<ar.size(); i++)
		{
		if(name.equals(ar.get(i).getName())){
			System.out.println("지역정보를 삭제합니다.");
			ar.remove(i);
			System.out.println("삭제 완료");
		}
		else 
			{
				System.out.println("오류입니다.");
			}
		}
	}
	
	public CityDTO find(ArrayList<CityDTO> ar) {
		CityDTO cityDTO = new CityDTO();
		System.out.println("도시를 검색합니다\n도시명을 입력하세요.");
		String name = sc.next();
		ListView listView = new ListView();
		
		CityDTO cityForReturn = null;
		
		for(int i = 0; i<ar.size(); i++)
		{
			if(name.equals(ar.get(i).getName()))
			{
				//listView.view(ar.get(i));
				cityForReturn = ar.get(i);
				System.out.println("정보를 출력합니다.");
			}else
			{
				//System.out.println("정보가 없습니다.");
				cityForReturn = null;
				System.out.println("정보가 없습니다.");
			}
		}
		return cityForReturn;
		
	}
}
