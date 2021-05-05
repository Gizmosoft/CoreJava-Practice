package com.accenture.lkm.activity;

public class Validator {
	String emailAddress;

	public Validator(String emailAddress) {
		super();
		this.emailAddress = emailAddress;
	}
	
	public boolean validateEmail(String emailAddress) {
		if(emailAddress.indexOf("@")!=-1) {
			return true;
		}
		else
			return false;
	}
}

