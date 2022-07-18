package com.iu.lang;

// 또는
//java.util.*;
public class LangMain {

	public static void main(String[] args) {
//		패키지 이름은 전세계에서 중복되지 않도록.
//		클래스명은 중복이여도 상관은 없음
//		중복이 되더라도 패키지 명으로 구분을 함
//		패키지명은 *을 사용하지 못함
		 Object obj = new Object();
		 
		
		String str = obj.toString();
//		String = 리턴타입
//		str = 변수명
//		obj = 참조변수명
//		toString = 변수명();
		Member member = new Member();
		 System.out.println(str);
		 str = member.toString();	
		 System.out.println(str);
		 MemberClient mc = new MemberClient();
		 Car car = new Car();
		 Car car2 = new Car();
//		 obj = Object타입
		 obj = member;
		 //다형성 때문에 Object가 있는 것임
		 
//		 접근지정자가 protected = 같은 패키지 내에서는 사용가능하지만
//		 				   	  다르패키지에서 사용받으려면 상속받아야 함
		 
//		 Deprecated = 현재 버전에서는 사용할 수 있지만 다음 버전에서는 없어질
//				 	  예정이르모 사용하지 말 것을 권장한다
		 
//		 모든 클래스의 최고 조상은 Obiect이다
		 
		 boolean check = car.equals(car2);
//		 뜻 car == car2
//		 equals는 참조변수의 주소가 서로 같은지 확인하는 것
		 System.out.println(car);
		 System.out.println(car.toString());
		 System.out.println(check);
		 
		 String name = "iu";
		 System.out.println(name);
		 //참조변수를 출력하면 주소가 나와야 하는데
		 //값이 나옴 = 오버라이딩 했다는 것
		 
		 
//		 toString = 주소로 반환하는 것
		 
		 
		
		
	}

}
