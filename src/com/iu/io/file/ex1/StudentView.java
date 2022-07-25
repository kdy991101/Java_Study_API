package com.iu.io.file.ex1;

import java.util.ArrayList;

public class StudentView {

	
	//view메서드 3개 
	//1.String출력
	//2.studentDTO출력 메서드
	//3.ArrayList<StudentDTO> 출력
	
	public void view(String messsage) {//문자열 출력
		
		System.out.println(messsage);
		
	}
	
	public void view(StudentDTO dt) {//DTO메서드 출력
		
		System.out.println(dt.getName());
		System.out.println(dt.getNum());
		System.out.println(dt.getK());
		System.out.println(dt.getE());
		System.out.println(dt.getM());
		System.out.println(dt.getAvg());
		
		
	}
	
	public void view(ArrayList<StudentDTO> ar) {
		for(int i = 0; i<ar.size(); i++)
		{
			StudentDTO sd = ar.get(i);
			this.view(sd);
		}
	}
}
