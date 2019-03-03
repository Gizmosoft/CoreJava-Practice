package com.tech.ninzaz.exception;

public class MyCustomException extends Exception {

	private Exception cause;
	private String msg;
	
	public MyCustomException(String msg){
		super(msg);
		this.msg = msg;
	}
	
	public MyCustomException(String msg, Exception cause){
		super(msg);
		this.msg = msg;
		this.cause = cause;
	}
	
	public String getMessage(){
	return this.msg;	
	}
	
}
