package com.iu.io.file.ex1;
import java.util.ArrayList;

public class ExMain {

	public static void main(String[] args){
//		// TODO Auto-generated method stub
//		StudentDAO da = new StudentDAO();
//		ArrayList<StudentDTO> ar = null;
//		try {
//			ar = da.getList();
//			for(StudentDTO studentDTO:ar)
//			{
//				System.out.println(studentDTO.getName());
//				System.out.println(studentDTO.getNum());
//				System.out.println(studentDTO.getK());
//				System.out.println(studentDTO.getE());
//				System.out.println(studentDTO.getM());
//				
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(ar);
//		
		StudentController sc = new StudentController();
		try {
			sc.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
