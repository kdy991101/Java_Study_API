package com.iu.util.list;

import java.util.ArrayList;

public class ListMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<String> ar = new ArrayList();
			//<>안에 String을 넣으면 String만 모으겠다 이런것을 Generic이라 부름
//			ArrayList<E> ar = new ArrayList<E>(); 앞 뒤 <>안에 같은 것을 넣어야 함 
			//Generic 어떤 타입을 모을거니~
			
					
			ListView listView = new ListView();
			
			ar.add("first");
//			ar.add(2);//Integer라는 클래스오 outo-boxing...다형성때문에 모든 데이터는 object타입
//			ar.add('c');//Character 타입으로 outo-boxing
//			ar.add(2.123);//Double타입으로 outo-boxing
			ar.add(null);
//			결과=    first
//					2
//					c
//					2.123
//					null
			
			listView.view(ar);
			
			//get -> 특정 인덱스의 요소를 반환받는 것
//			String n1 = ar.get(0);
//			int num = ar.get(1);
			//다형성 때문에 에러가 뜸...
			
			String n1 = ar.get(0);
//			int num = (int)ar.get(1);//원래(int)자리에 Integer가 들어가야 함
//			char ch = (Character)ar.get(2);
//			결과=    first
//					2
//				 	c
//			System.out.println(ar.get(0) instanceof String);
			//get 0번째 인덱스의 값이 String타입인지 물어보는 것
			//단, 보장 못함
			
			System.out.println(n1);
//			System.out.println(num);
//			System.out.println(ch);
			
		

	}

}
