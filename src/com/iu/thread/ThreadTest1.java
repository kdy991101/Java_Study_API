package com.iu.thread;

public class ThreadTest1 extends Thread {
	
	@Override
	public void run() {
		this.getNum();
	}
	private void getNum() {
		
		for(int i = 0; i<25; i++) {
			System.out.println(i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
