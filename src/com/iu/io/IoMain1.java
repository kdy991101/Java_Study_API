package com.iu.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IoMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//키보드로부터 글자를 입력받는 순서 작성
		InputStream is = System.in;//byte처리
		//키보드 = 표준입력기
		InputStreamReader ir = new InputStreamReader(is);//준비과정/ 한글자 처리
		BufferedReader br = new BufferedReader(ir);//키보드와 연결
		//BufferedReader = 키보드에서 입력한것이 버퍼에 담아짐
//		String msg = br.readLine();//Unhandled exception type IOException에러 (처리되지 않은 예외 유형 IOException)
		try {
			System.out.println("키보드에서 입력 후 엔터");
			String msg = br.readLine();
			System.out.println(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
