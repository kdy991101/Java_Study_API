package com.iu.io.file.ex1;


import java.util.ArrayList;
import java.util.Scanner;


public class StudentController {
	Scanner sc = new Scanner(System.in);
	
	
	//Start 메서드 메뉴들이 나옴
	//1.모든학생정보출력 file에 있음 
	//2.학생정보검색 학생 한명의 정보
	//3.학생정보추가
	//4.학생정보삭제
	//5.백업
	//6.종료
	
	public void start() throws Exception{
		StudentService ss = new StudentService();
		StudentView sv = new StudentView();
		ArrayList<StudentDTO> ar = new ArrayList<>();
		
		boolean check = true;
		while(check)
		{
			System.out.println("1. 모든학생정보출력");
			System.out.println("2. 학생한명정보검색");
			System.out.println("3. 학생한명정보추가");
			System.out.println("4. 학생한명정보삭제");
			System.out.println("5. 백         업");
			System.out.println("6. 종         료");
			int select = sc.nextInt();
			if(select == 1)
			{
				//모든 학생 정보 출력
				try {

					ar = ss.getList();
					sv.view(ar);
					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				break;
				
			}
			else if(select == 2)
			{
				//학생 한명 정보 검색
				StudentDTO dt = new StudentDTO();
				try {
					dt = ss.getStudent(ar);
					if(dt != null)
					{
						sv.view(ar);
					}
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				break;
			}
			else if(select == 3)
				//학생 정보 추가
			{
				try {
					ss.setStudentAdd(ar);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				break;
			}
			else if(select == 4)
			{
				//학생 정보 삭제
				try {
					ss.setStudentDelete(ar);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				break;
			}
			else if(select == 5)
			{
				//백업
				try {
					ss.setList(ar);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				break;
			}
			else if(select == 6)
			{
				//종료
				
				break;
			}
			else 
			{
				String message = "오류입니다.";
				sv.view(message);
			}
		}//check
	}
}//끝
