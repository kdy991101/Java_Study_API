package com.iu.io.file;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File //File이나 폴더의 정보를 담고있는 클래스이다.
		//실제 파일이나 폴더가 없을 수도 있음
		
		File file = new File("C:\\Study\\test.txt");
		//폴더명 + 파일명을 한번에
		
		file = new File("C:\\Study", "test.txt");
		//parent : 폴더, Child : 파일명 또는 최종폴더명
		
		
		System.out.println(file.exists());//exists() = 존재합니까?
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		
		
		System.out.println("==================================");
		
		File path = new File("C:\\Study");
		//1.폴더명 경로가 있는 파일 객체를 만들고 이용
		file = new File(path, "test.txt");
		
		System.out.println(path.exists());//exists() = 존재합니까?
		System.out.println(path.isFile());
		System.out.println(path.isDirectory());
		
		System.out.println(file.length());
		
		file = new File("C:\\Study\\sub");
		if(!file.exists())//존재하지 않는다면~
		{
			file.mkdir();//없으면 만들어라~
		}
		File file2 = new File("C:\\Study\\sub2\\t1");
//		file.mkdir();//중간에 폴더가 없으면 생성 X
		file2.mkdirs();
		
//		file.delete();//sub라는 폴더를 지움
		
		file2.delete();//sub2를 지운것이 아닌 t1을 지워줌
		File file3 = new File("C:\\Study\\sub2");
		file3.delete();
	}

}
