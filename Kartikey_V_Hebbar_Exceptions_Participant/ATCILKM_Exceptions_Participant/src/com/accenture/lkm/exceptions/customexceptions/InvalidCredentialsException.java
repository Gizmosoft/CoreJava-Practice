package com.accenture.lkm.exceptions.customexceptions;

// TODO 1. extend InvalidCredentialsException from Exception
// TODO 2. Press ALT +SHIFT +S , select generate constructor from super class
public class InvalidCredentialsException extends Exception{

	public InvalidCredentialsException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvalidCredentialsException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public InvalidCredentialsException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InvalidCredentialsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public InvalidCredentialsException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
