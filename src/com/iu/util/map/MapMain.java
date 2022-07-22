package com.iu.util.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
		//많이 사용함
		HashMap<String, Integer> map = new HashMap<>();
		//키는 보통 스트링으로 많이 함
		
		map.put("n1", 10);//집어 넣는 것
		System.out.println(map.size());//몇개 있는지
		System.out.println(map.isEmpty());//비어있는지
//		결과 = 1
//		     false
		map.put("n1", 10);//집어 넣는 것
		map.put("n2", 20);
		map.put("thrid", 270);
		System.out.println(map.size());//몇개 있는지
		System.out.println(map.isEmpty());//비어있는지
//		결과 =3
//		    false

		
		int num = map.get("n2");//n2 = 키임
		System.out.println(num);
//		결과 = 20
		
		//전체를 순환하면서 다 꺼내려 하면 키를 알아야 함
		//방법 외울 것
		
		//map는 순서 유지 불가
		
//		boolean containsKey(Object key) // 이 키가 있나 물어보는 것. 리턴 타입은 boolean
		boolean check = map.containsKey("n2");
		System.out.println(check);

		//1.key들을 알아내기
		Set<String> set = map.keySet();
		//맵에 있는 키들을 모아 set이라는 타입으로 모아줌
		
		Iterator<String> it =  set.iterator();
//		iterator = 열거,반복
		
		while(it.hasNext()) {
//			it.hasNext()//다음 요소가 있는지 물음
			String key = it.next();
			System.out.println("key 꺼내" + key);
			System.out.println("value 꺼내" + map.get(key));
		}
		
		
	}

}
