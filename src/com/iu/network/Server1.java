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

public class Server1 {
	
	public void receive() throws Exception {
		Scanner sc = new Scanner(System.in);
		ServerSocket serverSocket = new ServerSocket(8282);
		//객체가 만들어지는 순간 서버를 오픈하고 Client의 접속을 기다림
		System.out.println("Client접속 기다리는 중...");
		//socket : 상대방과 1:1통신
		
		Socket socket =  serverSocket.accept();
		boolean check = true;
		System.out.println("Client 접속 완료!");
		
		while(check) {
			
		
		System.out.println("종료하려면 \"Q또는q\"를 누르세요");
		
		InputStream is = socket.getInputStream();//0,1
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		String message = br.readLine();//한줄 읽어오기
		System.out.println("Client : " + message);
		
		System.out.println("Client로 보낼 메세지를 입력하세요");
		String message1 = sc.next();
		
		//===============================================
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		//=================================================
		
		bw.write(message + "\r\n");
		bw.flush();
		
		if(message1.toUpperCase().equals("Q"))
		{
			System.out.println("대화를 종료합니다.");
		br.close();
		ir.close();
		is.close();
		//=======================================
		os.close();
		ow.close();
		bw.close();
		//========================================
		socket.close();
		serverSocket.close();
		check = !check;
		break;
			}
		}
	}
}
