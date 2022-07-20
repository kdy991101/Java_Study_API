package com.iu.util.st;

import java.util.StringTokenizer;

public class StMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//초봉
		String str = "samsung-500-lg-600-google-900-kakao-700";//결과 8
		
		StringTokenizer st = new StringTokenizer(str, "-");//다른패키지에 있기에 import가 있음
		//기본 생성자 없음
		
		System.out.println(st.countTokens());//참조변수명.메서드명()
		//countTokens=parsing해서 나온 덩어리들의 계수를 담아줌
		
		while(st.hasMoreTokens()) {
//			hasMoreTokens=토큰이 더 있는지 물어보는 것 (이동하는 것이 아님)
//			hasMoreTokens와 nextToken과 주로 같이 사용함
			//있으면 parsing작업을 시작
			String token = st.nextToken();
			//nextToken = 다음 구분을 지정한 곳으로 찾아감
			System.out.println(token);
			
			token = st.nextToken();
			System.out.println(token);
			System.out.println("=================================");
		}

	}

}
