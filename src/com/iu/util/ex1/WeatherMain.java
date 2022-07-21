package com.iu.util.ex1;

import java.util.ArrayList;

public class WeatherMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//클래스의 역할과 메서드의 역할, 변수의 역할 파악..
//		WeatherMain  : 프로그램 실행,Test
//		WeatherService : 데이터를 가공하는 역할/실제 로직
//		WeatherController : 조종,관리하는 것/누구를 호출,사용 할 것인가
//		WeatherView : 정보를 출력,보여주는 것
//		CityDTO : 데이터를 담고있는 박스/ex)가방
		
		
		//===================강사님
		WeatherController wc = new WeatherController();
		wc.start();
		//=====================================
		
		ArrayList<String> ar1 = new ArrayList<>();
		ArrayList<Integer> ar2;
		ArrayList<Object> ar3;
		//레퍼런스타입만 가능하기 때문에 int가 아닌 Integer로 사용해야 함
//		ar2 = ar1;//타입이 달라서 에러
//		ar3 = ar1;//타입이 달라서 에러
//		제네릭 까지 타입이 같아야 가능함
		
		ArrayList<ArrayList<String>> ars = new ArrayList<>();
		//list안에 list
		ArrayList<ArrayList<ArrayList<String>>> arss = new ArrayList<>();
		//오류는 안나지만 꺼내기가 너무 힘듬
		//이론적으로는 가능
		
		
		
//		WeatherController wc = new WeatherController();
//		wc.start();
//	
//		WeatherService ws = new WeatherService();
//		ws.init(null);

//		WeatherView wv = new WeatherView();
//		CityDTO cityDTO = new CityDTO();
//		cityDTO.setName("NY");
//		
//		CityDTO cityDTO2 = new CityDTO();
//		cityDTO.setName("LA");
//		
//		ArrayList<CityDTO> ar = new ArrayList<>();//컬렉션기능
//		ar.add(cityDTO);
//		ar.add(cityDTO2);
//		
//		wv.view(ar);
//		
	}
}
