package com.tech.ninzaz.string;

public class StringConcatenate {

	public static void main(String[] args) {
		
		String s1= "Lohith";
		s1.concat(" Gopal");
		System.out.println(s1);
		
		StringBuffer sb = new StringBuffer("Lohith");
		sb.append(" Gopal");
		
		System.out.println(sb);
		
	}

}
