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
		//내가 파싱할 데이터명 , 기준을 설정
		System.out.println(st);
		
		while(st.hasMoreTokens()) {
			CityDTO cityDTO = new CityDTO();//도시가 4개이니 DTO도 4개
			cityDTO.setName(st.nextToken());
			cityDTO.setGion(Double.parseDouble(st.nextToken().trim()));
			cityDTO.setHum(Integer.parseInt(st.nextToken().trim()));
			cityDTO.setStatus(st.nextToken());
			ar.add(cityDTO);
			
		}
//		listView.view(ar);
	}
	
	Scanner sc = new Scanner(System.in);
	public boolean add(ArrayList<CityDTO> ar) {//추가
		//add(ArrayList<CityDTO> ar)=리스트를 받아옴
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
		return ar.add(cityDTO);
			
	}//add끝
	
	
	
	public void remove(ArrayList<CityDTO> ar) {//삭제
		//add(ArrayList<CityDTO> ar)=리스트를 받아옴
		//리스트에서 꺼낼 시에는 get
		//리스트는 배열기반임
		//배열은 인덱스 번호가 있음
		CityDTO cityDTO = new CityDTO();
		System.out.println("지역 정보를 삭제 시작");
		System.out.println("도시명을 입력하세요");
		String name = sc.next().toUpperCase();
		boolean r = false;
		for(int i = 0; i<ar.size(); i++)
		{
		if(name.equals(ar.get(i).getName().toUpperCase())){
			//입력한 도시명과 같냐 라는 질문임
			//ar. = 리스트이고,CityDTO를 갖고있음/get()=리스트 안에있는 것을 꺼내오는 것 CityDTO를 꺼내온 것
			//그 안에있는 getName = 도시명을 꺼내옴
			//찾으면 해당 인덱스에 있는 모든 요소를 삭제
//			System.out.println("지역정보를 삭제합니다.");
			ar.remove(i);
			r = !r;
//			System.out.println("삭제 완료");
			break;//찾고 반복문 종료
		}
		else 
			{
				System.out.println("오류입니다.");
			}
		}
		
		//향상된 for문
		//향상된 포문은 인덱스를 사용할 수 없음
		
//		for(CityDTO cityDTO2:ar)
		//ar= 지역변수
		//레퍼런스타입의 변수는 변수 안에 주소값이 들어가있음
		//힙에 만들어지는 변수 = 인스턴스 변수
		
//		{
//			if(name.equals(cityDTO.getName()))
//			{
//				ar.remove(cityDTO);
		//같은 주소값을 확인하는 것
//				break;
//			}
//		}
	}//remove끝
	
	public CityDTO find(ArrayList<CityDTO> ar) {//검색
		CityDTO cityDTO = new CityDTO();
		System.out.println("도시를 검색합니다\n도시명을 입력하세요.");
		String name = sc.next().toLowerCase();
//		ListView listView = new ListView();
		
		CityDTO cityForReturn = null;
		
		for(int i = 0; i<ar.size(); i++)
		{
			if(name.equals(ar.get(i).getName().toLowerCase()))
			{
				//listView.view(ar.get(i));
				cityForReturn = ar.get(i);
				System.out.println("정보를 출력합니다.");
			}else
			{
				//System.out.println("정보가 없습니다.");
//				cityForReturn = null;
				System.out.println("정보가 없습니다.");
			}
		}
		return cityForReturn;
		
	}//find끝
	
	//========================강사님 풀이
	 public CityDTO find1(ArrayList<CityDTO> ar) {
		 //출력하는 것이 아닌 찾기만 해주면 되는것
		 CityDTO cityDTO = null;
		System.out.println("도시명 입력");
		String name1 = sc.next();
		 //향상된 포
		for(CityDTO cityDTO2 : ar)
		{
			if(name1.equals(cityDTO2.getName()))
			{
				cityDTO = cityDTO2;
				break;
			}
		}
		//못찾으면 null이 리턴되는 것
		 return cityDTO;
	 }//강사님 find끝
	 //===========================================
}
