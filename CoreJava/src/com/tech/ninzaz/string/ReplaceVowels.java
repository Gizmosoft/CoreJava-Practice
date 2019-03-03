package com.tech.ninzaz.string;

public class ReplaceVowels {

	public static void main(String[] args) {
		
		String s1 = "aeiou Lohith";
		//s1= s1.replaceAll("[aeiou]", "");
		
		
		s1= s1.substring(3, 7);
		System.out.println(s1);
		
		//Replace all whitespaces with blank
		String s2 = "Tech Ninzaz 1234";
		s2 = s2.replaceAll("\\s", "");
		System.out.println(s2);
		
		String s3 = "Tech Ninzaz 1234";
		String[] strs = s3.split("\\s");
		for (String string : strs) {
			System.out.println(string);
		}
	
	}

}
