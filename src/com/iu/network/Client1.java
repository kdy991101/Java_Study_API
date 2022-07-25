package com.iu.network;

import java.net.Socket;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.UnknownHostException;

public class Client1 {
	
	public void send() throws Exception {
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("192.168.7.8", 8282);
		boolean check = true;
		System.out.println("Server접속 완료!");
		
		while (check) {
			
		System.out.println("종료하려면 \"Q또는q\"를 누르세요");
		
		System.out.println("Server로 보낼 메세지를 입력하세요");
		String message = sc.next();
		
		OutputStream os = socket.getOutputStream();//0과1로 처리
		OutputStreamWriter ow = new OutputStreamWriter(os);//문자 한글자
		BufferedWriter bw = new BufferedWriter(ow);
		
		//전송
		bw.write(message + "\r\n");
		bw.flush();
		
		//=======================연결 준비 끝
		InputStream is = socket.getInputStream();//0,1
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		String message1 = br.readLine();//한줄 읽어오기
		System.out.println("Server : " + message1);
		//===========================================
		
		if(message1.toUpperCase().equals("Q")) {
		
			System.out.println("대화를 종료합니다.");
		//자원 해제
		bw.close();
		ow.close();
		os.close();
		//===============================
		br.close();
		ir.close();
		is.close();
		//=========================
		socket.close();
		check = !check;
		break;
			}
		}
	}

}
