package com.iu.io.file.ex1;

import java.io.BufferedReader;//
import java.io.File;//
import java.io.FileReader;//
import java.io.FileWriter;
import java.util.ArrayList;//
import java.util.StringTokenizer;//
import com.iu.io.file.FileWrite;//

public class StudentDAO {
 //DAO = Data Access Object
	
//	file data에 접근

//메서드 이름 getList
// 스투던트데리터 파일의 내용을 읽어서 작업을 함
// 읽어서 DTO에 넣음
	 public ArrayList<StudentDTO> getList() throws Exception{
		 ArrayList<StudentDTO> ar = new ArrayList<>();
		 File file = new File("C:\\Study", "StudentData.txt");
		 FileReader fr = new FileReader(file);
		 BufferedReader br = new BufferedReader(fr);
		 
		 while(true) {
			 String info = br.readLine();
			 if(info == null) {
				 break;
			 }
			 if(info.isEmpty()) {
//				 isEmpty()는 공백의 length를 가지고
//				 0이면 true / 아니면 false를 반환하기 때문에
//				 공백에 띄어쓰기가 들어가면 false를 반환한다
				 continue;
			 }
			 
			 info = info.trim();
			 //trim() = 공백 제거
			 StringTokenizer st = new StringTokenizer(info, ",");
			 //String을 자름 '파싱'
			 
			 StudentDTO dt = new StudentDTO();
			 dt.setName(st.nextToken().trim());
			 dt.setNum(Integer.parseInt(st.nextToken().trim()));
			 dt.setK(Integer.parseInt(st.nextToken().trim()));
			 dt.setE(Integer.parseInt(st.nextToken().trim()));
			 dt.setM(Integer.parseInt(st.nextToken().trim()));
			 
			 ar.add(dt);
		 }
		 br.close();
		 fr.close();
		 return ar;
	 }//1 끝
	 
	 
 
// 2.setList
 
 public int setList(ArrayList<StudentDTO> ar) {
	 //예외처리는 내부에서 처리
	 //LIST로 받은 데이터들을 StudentData에 작성
	 //기존의 내용은 삭제
	 //작성한 형식은 기존 내용의 형식과 동일하게
	 //1을 리턴하면 정상적인 성공
	 //0을 리턴하는 경우 예외가 발생했을 경우
	int result = 1;
	
	File file = new File("C:\\Study", "StudentData.txt");
	try {
		FileWriter fw = new FileWriter(file, false);
		for(int i = 0; i<ar.size(); i++)
		{
			fw.write(ar.get(i).getName() + "," + ar.get(i).getNum() + "," + ar.get(i).getK() + "," + ar.get(i).getE() + "," + ar.get(i).getM());
			fw.write("\n");
		}
		fw.close();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		result = -1;
	}
		return result;
 }//2끝
}//끝
	 
	 
	 
	 
		 
	 
	 
	 