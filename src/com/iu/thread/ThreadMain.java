package com.iu.thread;

public class ThreadMain {

	public static void main(String[] args) {

		ThreadTest1 test1 = new ThreadTest1();
//		test1.getNum();
		
		ThreadTest2 test2 = new ThreadTest2();
//		test2.getAlpa();
		
		Thread t = new Thread(test2);
		
		//개발자가 직접 호출이 아니라
		//OS에게 실행을 부탁
		test1.start();
		t.start();
	}

}
