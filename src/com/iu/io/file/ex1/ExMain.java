package com.iu.io.file.ex1;
import java.util.ArrayList;

public class ExMain {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		StudentDAO sd = new StudentDAO();
		ArrayList<StudentDTO> ar = null;
		try {
			ar = sd.getList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		StudentDTO studentDTO = new StudentDTO();
		
		for(int i = 0; i<ar.size(); i++)
		{
			System.out.println(ar.get(i).getName());
			System.out.println(ar.get(i).getNum());
			System.out.println(ar.get(i).getK());
			System.out.println(ar.get(i).getE());
			System.out.println(ar.get(i).getM());
			
		}
		
		
	}

}
