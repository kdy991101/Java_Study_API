package com.iu.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client2 {
	
	//getfood메서드이름
	//서버랑 접속 후
	//1.점심 메뉴
	//2.저녁 메뉴
	//3.종   료
	//번호를 입력받아서 server로 전송
	//받아서 출력
	public void getFood() throws Exception {
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("192.168.7.8", 1111);
		boolean check = true;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		while(check) {
		System.out.println("1.점심  2.저녁 3.종료");
		int select = sc.nextInt();
		System.out.println(select + "번을 선택하셨습니다.");
		
		os = socket.getOutputStream();//0과1로 처리
		ow = new OutputStreamWriter(os);//문자 한글자
		bw = new BufferedWriter(ow);
		
		//전송
		bw.write(select + "\r\n");
		bw.flush();
		
		if(select == 3) {
			break;
		}

		is = socket.getInputStream();//0,1
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		String message = br.readLine();//한줄 읽어오기
		System.out.println(message);
		}
		br.close();
		ir.close();
		is.close();
		//=======================================
		os.close();
		ow.close();
		bw.close();
		//========================================
		socket.close();
//		serverSocket.close();
		}
		
	}


