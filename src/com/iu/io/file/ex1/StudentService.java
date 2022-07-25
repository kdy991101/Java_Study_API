package com.iu.io.file.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService implements Service {
	
	Scanner sc = new Scanner(System.in);

	@Override
	public ArrayList<StudentDTO> getList() throws Exception {
		// TODO Auto-generated method stub
		ArrayList<StudentDTO> ar = new ArrayList<>();
		ar = da.getList();
		for(int i = 0; i<ar.size(); i++)
		{
			ar.get(i).setTotal(i);
		}
		return ar;
	}

	@Override
	public int setList(ArrayList<StudentDTO> ar) throws Exception {
		// TODO Auto-generated method stub
		return da.setList(ar);
		
	}

	@Override
	public StudentDTO getStudent(ArrayList<StudentDTO> ar) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("검색할 학생의 번호를 입력하세요");
		int num = sc.nextInt();
		boolean check = true;
		for(int i = 0; i<ar.get(i).getNum(); i++)
		{
			if(num == ar.get(i).getNum())
			{
				check = !check;
				return ar.get(i);
			}
		}
		if(check)
		{
			System.out.println("일치하는 번호의 학생이 없음");
		}
		return null;
	}

	@Override
	public int setStudentDelete(ArrayList<StudentDTO> ar) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("삭제할 학생의 번호를 입력하세요");
		int num = sc.nextInt();
		int index = 0;
		for(int i = 0; i<ar.size(); i++)
		{
			if(num == ar.get(i).getNum())
			{
				ar.remove(i);
				index = 1;
				break;
			}
		}
		if(index == 0)
		{
			System.out.println("일치하는 번호의 학생이 없음");
		}
		return index;
	}

	@Override
	public void setStudentAdd(ArrayList<StudentDTO> ar) throws Exception {
		// TODO Auto-generated method stub
		StudentDTO dt = new StudentDTO();
		System.out.println("학생 추가 입력");
		System.out.print("학생의 이름 입력 : ");
		dt.setName(sc.next());
		System.out.print("학생의 번호 입력 : ");
		dt.setNum(sc.nextInt());
		System.out.print("학생의 국어 점수 입력 : ");
		dt.setK(sc.nextInt());
		System.out.print("학생의 영어 점수 입력 : ");
		dt.setE(sc.nextInt());
		System.out.print("학생의 수학 점수 입력 : ");
		dt.setM(sc.nextInt());
		ar.add(dt);
		
	}

}
