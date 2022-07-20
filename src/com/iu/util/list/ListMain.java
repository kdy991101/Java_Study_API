package com.iu.util.list;

import java.util.ArrayList;



public class ListMain {

	public static void main(String[] args) {
		//1,2,3 
		int[] nums = new int[3];//몇개를 담을지 선언
		nums[0] = 1;
		
		//1.List -> ArrayList
		ArrayList ar = new ArrayList();
		//추가 = add메서드
		//필요할때마다 추가할 수 있음 

		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(0);
		ar.add(1, "abc");//1번 인덱스에 끼워 넣기 뒤에 인덱스는 뒤로 하나씩 밀리는 것
//		결과=    1
//				abc
//				2
//				3
//				4
//				0
		
		ListView lv = new ListView();
		lv.view(ar);
		
		//오토박싱했다~ int타입이 자동으로 Integer로 변환됨
		//pri->rep
		//꺼낼시에는 오토언박싱
		//Object타입이지만 
		
		//remove - 특정 인덱스 번호의 요소를 삭제
		ar.remove(2);
		lv.view(ar);
//		결과=    1
//				abc
//				3
//				4
//				0
		ar.remove("abc");
		lv.view(ar);
//		결과=    1
//				3
//				4
//				0
		
		//set-특정 인덱스 번호의 요소를 수정하는 것
		ar.set(1, 'c');
		lv.view(ar);
//		결과=    1
//				c
//				4
//				0
		
		//clear-모든 요소를 삭제하는 것
		ar.clear();
		lv.view(ar);
//		결과= 아무것도 안나옴
//		size = 0칸
		
	}

}
