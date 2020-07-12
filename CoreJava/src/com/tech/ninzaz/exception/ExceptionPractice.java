package com.tech.ninzaz.exception;

public class ExceptionPractice {

	public static void main(String[] args) {
		int i=10;
		int j=11;
		
		int k = i/j;
		
		try{
			if(k==0)
				throw new CustomException("Value of j must be lesser than i");
			else
				System.out.println(k);
		}
		catch(Exception e){
			System.out.println("Error: "+ e.getMessage());
		}

	}

}
