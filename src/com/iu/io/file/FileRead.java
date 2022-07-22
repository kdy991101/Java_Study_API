package com.iu.io.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	
	public void read() throws FileNotFoundException, IOException {//길어지는게 싫으면 더 넓은 부모를 던짐..//Excetion
		//파일을 읽어주는 클래스 = 파일리더
		//파일의 내용을 읽어 오기
		//1 어느 폴더에 어느 타입인가
		File file = new File("C:\\Study", "test.txt");
		
		//2 파일과 연결 준비
		FileReader fr = new FileReader(file);
		
//		fr.read()//한글자
		//3 파일의 내용을 읽기위한 보조 스트림 연결
		BufferedReader br = new BufferedReader(fr);
		
		//4 내용을 일기
		boolean check = true;
		
		while(check) {
		String name = br.readLine();//처음부터 시작해서 엔터키를 만날 때까지 
			if(name == null)
			{
				break;
			}
			System.out.println(name);
		}
	}
	
}
