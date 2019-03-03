package com.tech.ninzaz;

public class SumOfAllDigits {

	public static void main(String[] args) {
	
		Integer i = 1234;
		int sum = 0;
		
		while (i !=0 ){
			Integer lastDigit = i%10;
			sum += lastDigit;
			i = i/10;
		}
		System.out.println("Sum is: "+ sum);
	}

}
