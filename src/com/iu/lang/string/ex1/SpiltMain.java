package com.iu.lang.string.ex1;

public class SpiltMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkerService ws = new WorkerService();
		WorkerView wv = new WorkerView();
		
		
		
		WorkerDTO[]dtoArray  = ws.init();
//		wv.view(dtoArray);
		int num = 10;
		
		String str = String.valueOf(num);
		System.out.println(str);
		// 숫자 10이 아닌 문자열 일공
		//valueOf 문자열로 바꿔줌
		
	}

}
