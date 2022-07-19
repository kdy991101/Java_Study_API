package com.iu.lang.string;

public class StringBufferStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "max";
		String str2 = "age";
		
//		str1 = str1 + str2;
//		str1 += str2;
		
		StringBuffer sb = new StringBuffer();
		sb.append(str1);
		sb.append(str2);
		sb.append(10);
		//결과 maxage10
		//참조변수안에 주소가 있음 내부적으로 toString이 자동 호출
		
		//오버라이딩 
		  
		String result = sb.toString();
		System.out.println(sb);
		System.out.println(result);
		
		}

}
