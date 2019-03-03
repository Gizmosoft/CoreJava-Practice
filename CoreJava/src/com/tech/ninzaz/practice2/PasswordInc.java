package com.tech.ninzaz.practice2;

public class PasswordInc extends Exception{
	
	private String message;
	public PasswordInc(String message) {
		super(message);
		this.message = message;
	}

}
