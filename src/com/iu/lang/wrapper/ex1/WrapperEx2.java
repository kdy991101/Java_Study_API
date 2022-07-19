package com.iu.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx2 {
	
	//juminCheck
	//주민번호 입력
	//9  7  1 1 2   4 - 1 2  3  4  5  6 7
  //* 2  3  4 5 6   7 - 8 9  2  3  4  5 6 
//   18 21  4 5 12 28 - 8 18 6 12 20 30
	//192
	//총합을 11로 나누어 나머지를 구함
	//192/11 몫-17 나머지 -5
	//나머지를 11에서 뺸 결과 (6)
	
	//나머지를 11에서 뺀 결과를 체크용 번호와 같은지 비교
//	11-0 = 11
	
	//만약에 위의 연상결과가 두자리라면 연산결과를 다시 10으로 나눈 나머지와
	//체크용번호를 비교
	//11/10=1
	public void juminCheck() {
		String jumin = "9 9 1 1 0 1 - 1 2 3 4 5 6 7";
//		Scanner sc  = new Scanner(System.in);
//		System.out.println("주민번호를 입력하여 주세요.");
//		String number = sc.next();
//		String str2 = str.replace('l', 'w');
		String ju = jumin.replace("-", "");
		System.out.println(ju);
		//결과 : 9 9 1 1 0 1  1 2 3 4 5 6 7
		char jumin2[] = ju.toCharArray();
		System.out.println(jumin2);
		int nums[] = Character.getNumericValue(jumin2[]);
		for(int i = 0; i<jumin2.length; i++)
		{
			System.out.print(jumin2[i]);
		}
//		int[] nums = Character.getNumericValue();
//		int i;
//		for(i = 0; i<ju.length(); i++)
		{
//			jumin2[i];
		}
		
		
		
		
		
	}
}
