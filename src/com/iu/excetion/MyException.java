package com.iu.excetion;

public class MyException extends Exception
{
	public MyException() {
		super("몰라요 포기");
	}
	
	public MyException(String message) {
//		super();//이것이 생략되어있음
		super(message);//부모 생성자에있는 메세지를 호출하세요
	}
}
