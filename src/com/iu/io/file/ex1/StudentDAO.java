package com.iu.io.file.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentDAO {
 //DAO = Data Access Object
	
//	file data에 접근

//메서드 이름 getList
// 스투던트데리터 파일의 내용을 읽어서 작업을 함
// 읽어서 DTO에 넣음
 public ArrayList<StudentDTO> getList() throws Exception {
	 
	 StudentDTO sd = new StudentDTO();
	 File file = new File("C:\\Study", "StudentData.txt");//
	 FileReader fr = new FileReader(file);//
	 BufferedReader br = new BufferedReader(fr);//

	 String str = br.readLine();
	 str =  br.readLine();
	 System.out.println(str);
	 boolean check = true;
	 ArrayList<StudentDTO> ar = new ArrayList<>();
	 while(check) {
	 
	 StringTokenizer st = new StringTokenizer(br.readLine(), ",");
	 
	 if(st == null) {
		 break;
	 }
	 
	 while(st.hasMoreTokens())
	 {
		 StudentDTO studentDTO = new StudentDTO();
		 studentDTO.setName(st.nextToken());
		 studentDTO.setNum(Integer.parseInt(st.nextToken()));
		 studentDTO.setK(Integer.parseInt(st.nextToken()));
		 studentDTO.setE(Integer.parseInt(st.nextToken()));
		 studentDTO.setM(Integer.parseInt(st.nextToken()));
		 ar.add(studentDTO);
	 }
	 }
	 br.close();
	 return ar;
	 
	 
 }
 //2.setList
 
 public int setList(ArrayList<StudentDTO> ar) {
	 //예외처리는 내부에서 처리
	 //LIST로 받은 데이터들을 StudentData에 작성
	 //기존의 내용은 삭제
	 //작성한 형식은 기존 내용의 형식과 동일하게
	 //1을 리턴하면 정상적인 성공
	 //0을 리턴하는 경우 예외가 발생했을 경우
 }
}
	 
	 
	 
	 
		 
	 
	 
	 