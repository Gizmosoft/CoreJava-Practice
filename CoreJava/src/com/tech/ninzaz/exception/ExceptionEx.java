package com.tech.ninzaz.exception;

public class ExceptionEx {

	public static void main(String[] args) {
		
		try {
			
			//Lets say i was doing something and there was a MyCustom Exception thrown
			throw new MyCustomException("Exception Raised !!!");
			
		} catch(MyCustomException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}

}
