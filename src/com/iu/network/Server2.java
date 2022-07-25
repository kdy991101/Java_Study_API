package com.iu.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Server2 {
	
	private ArrayList<String> lunch;
	
	private ArrayList<String> dinner;

	private String message;
	
	public Server2() {
		lunch = new ArrayList<>();
		dinner = new ArrayList<>();
		
		lunch.add("짜장면");
		lunch.add("라면");
		lunch.add("햄버거");
		lunch.add("피자");
		lunch.add("오늘은 다이어트 안머겅");
		//==============================
		dinner.add("삼겹살");
		dinner.add("치킨");
		dinner.add("샐러드");
		dinner.add("볶음밥");
		dinner.add("물");
	}
	
	//gerfood메서드
	//Server에서 메세지를 기다림
	//1. 점심 메뉴 중 랜덤한 하나를 Client에 전송
	//2. 저녁 메뉴 중 랜덤한 하나를 Client에 전송
	//3. 프로그램 종료
	//그외 나머지 번호가 오면 잘못 입력된 번호입니다 Client전송.
	public void getFood() throws Exception {
		Scanner sc = new Scanner(System.in);
		
		ServerSocket serverSocket = new ServerSocket(1111);
		Socket socket = serverSocket.accept();
		System.out.println("주문을 기다리고있습니다...");
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		boolean check = true;
		
		while(check) {
		is = socket.getInputStream();//0,1
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		String message = br.readLine();//한줄 읽어오기
		
		
		Random random = new Random(Calendar.getInstance().getTimeInMillis());
		if(message.equals("1"))
		{
			int index = random.nextInt(5);
			message = lunch.get(index);
			System.out.println("점심주문입니다.");
			}
			
		else if(message.equals("2"))
		{
			System.out.println("저녁주문입니다.");
			int index = random.nextInt(dinner.size());
			message = dinner.get(index);
			
			
		}else if(message.equals("3")) {
			break;
			
			
		}else {
			System.out.println("오류입니다.");
		}
	}
	
	
	
		
		os = socket.getOutputStream();
		ow = new OutputStreamWriter(os);
		bw = new BufferedWriter(ow);
		
		bw.write(message + "\r\n");
		bw.flush();
		//=================================================
		
		br.close();
		ir.close();
		is.close();
		//=======================================
		os.close();
		ow.close();
		bw.close();
		//========================================
		socket.close();
		
		
		
	}


	}
	


