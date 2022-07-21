package com.iu.util.map;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HashSet<Integer> hashSet = new HashSet<>();
			
			hashSet.add(10);
			hashSet.add(1);
			hashSet.add(10);
//			Set = 중복 금지, 에러는 안뜸
			System.out.println(hashSet.size());
//			결과 = 2
			
			Iterator<Integer> it = hashSet.iterator();
			//iterrator형식으로 변환
			while(it.hasNext()) {
				System.out.println(it.next());
//				결과 = 1
//					  10

			}
	}

}
