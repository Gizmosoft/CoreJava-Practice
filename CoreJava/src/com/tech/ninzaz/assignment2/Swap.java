package com.tech.ninzaz.assignment2;

public class Swap {
	public static void main(String args[]) {
		String a = "Kartikey";
		String b = "Hebbar";
		
		System.out.println("a = "+ a);			//Print old variables
		System.out.println("b = "+ b);
		
		a = a+b; 							//Concatenation
		
		b = a.substring(0,a.length()-b.length()); 	//Using substring to swap
		a = a.substring(b.length());				//the two strings
		
		System.out.println("New a = "+a);			//Print new variables
		System.out.println("New b = "+b);
		
	}
}
