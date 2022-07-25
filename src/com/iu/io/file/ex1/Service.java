package com.iu.io.file.ex1;

import java.util.ArrayList;


public interface Service  {
	public StudentDAO da = new StudentDAO();
		
	
	public ArrayList<StudentDTO> getList() throws Exception;
	//studentDAO에서 getList를 호출하여 총점과 평균을 각각 계산해서 대입하고
	//그 List를 리턴

	public int setList(ArrayList<StudentDTO> ar) throws Exception;
	//DAO의 setList 호추하고
	//그 결과를 리턴
	
	public StudentDTO getStudent(ArrayList<StudentDTO>ar) throws Exception;
	//찾으려고 하는 학생의 번호입력받아서 
	//찾은 학생을 리턴 못찾으면 null리턴
	
	public int setStudentDelete(ArrayList<StudentDTO> ar)throws Exception;
	//삭제하려는 학생의 번호를 입력받아서 
	//일치하는 학생을 삭제한다.
	//삭제가 성공하면 1을 리턴, 실패하면 0을 리턴
	
	public void setStudentAdd(ArrayList<StudentDTO>ar)throws Exception;
	//학생을 추가 이름, 번호, 국어, 영어, 수학
	
		
	

}
