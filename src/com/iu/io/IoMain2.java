package com.iu.io;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

//import java.util.Scanner;

public class IoMain2 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		//DDOS = 분산 서비스 거부 공격..?
//		//DOS = Denial Of Service
//		
//		sc.close();//이용을 했으면 끊어줘야 함..?
		InputStream is = System.in;//0과1을 처리
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println("입력");
		
		try {
		String message = br.readLine();
		System.out.println(message);
		}catch (Exception e) {
				e.printStackTrace();
		}finally {//예외가 발생하든 안하든 무조건 해야하는 것을 작성해야함
			//연결된 역순으로 자원을 해제
			try {
			br.close();
			ir.close();
			is.close();
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

}
