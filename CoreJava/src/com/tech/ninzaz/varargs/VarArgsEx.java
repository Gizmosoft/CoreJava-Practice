package com.tech.ninzaz.varargs;

public class VarArgsEx {

	public static void main(String[] args) {
		
		String returnString = concatenateMethod(1, 2, "Lohith", "Gopal");
		System.out.println(returnString);
		
		returnString = concatenateMethod(1, 2, "Lohith", "Gopal", "Ramesh");
		System.out.println(returnString);
		
		returnString = concatenateMethod(1, 2, "Lohith", "Gopal", "Ramesh", "Kumar");
		System.out.println(returnString);
		
		
	}

	private static String concatenateMethod( int i, int j,  String... string) {
		
		String finalStr = "";
		for (String str : string) {
			finalStr+=str;
		}
		
		return finalStr;
	}

}
