package com.iu.util.map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//random클래스 이용 6개 숫자 
		//1~45중 6개
		System.out.println("복권 번호를 출력합니다.");
		HashSet<Integer> hashSet = new HashSet<>();
		Random rd = new Random();
		
		
		while(hashSet.size() < 6){
			
			hashSet.add(rd.nextInt(45));
			
			}
		Iterator<Integer> it = hashSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
//		System.out.println(it.next());
		
		//====================강사님 풀이
//		Random random = new Random();
//		HashSet<Integer> hashSet1 = new HashSet<>();
//		
//		while(hashSet1.size() != 6) { 
//		int num = random.nextInt(45)+1;//0~45미만 까지만 출력
//		hashSet1.add(num);
//		}
//		Iterator<Integer> it1 = hashSet1.iterator();
//		while(it1.hasNext()){ 
//			System.out.println(it1.next());
//			
//		}
		
	}
	

}
