package com.tech.ninzaz.string;

public class ReverseString {

	public static void main(String[] args) {
		
		String s1 = "Lohith";
		char[] chrs = s1.toCharArray();
		String s2;
		
		for (int i = chrs.length-1; i >=0; i--) {
			System.out.print(chrs[i]);
			
		}
		
		System.out.println();
		
	}

}
