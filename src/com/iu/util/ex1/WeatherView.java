package com.iu.util.ex1;

import java.util.ArrayList;

public class WeatherView {
	CityDTO cd = new CityDTO();
	public void view(CityDTO cityDTO) {
		System.out.println(cityDTO.getName());
		System.out.println(cityDTO.getGion());
		System.out.println(cityDTO.getHum());
		System.out.println(cityDTO.getStatus());
	}
	
//	
	public void view(ArrayList<CityDTO> ar) {
//		//리스트를 받아서 모든 정보를 출력
		System.out.println("전국 정보를 표시합니다.");
		for(int i = 0; i<ar.size(); i++)
		{
			CityDTO cityDTO = ar.get(i);
			this.view(cityDTO);
		}
	}
	
	public void view(String message) {
		System.out.println(message);
	}

}
