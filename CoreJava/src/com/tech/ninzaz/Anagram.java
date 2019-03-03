package com.tech.ninzaz;

import java.util.Arrays;

public class Anagram {

	
	public static void main(String[] vars){
		
		String s1= "Keep";
		String s2 = "peek";
		
		checkIfAnagram(s1, s2);
		
	}

	private static void checkIfAnagram(String s1, String s2) {
		
		char[] chr1 = s1.toLowerCase().toCharArray();
		char[] chr2 = s2.toLowerCase().toCharArray();
		Arrays.sort(chr1);
		Arrays.sort(chr2);
		
		
		if (Arrays.equals(chr1, chr2)){
			System.out.println("Anagram");
		}else
			System.out.println("Not Anagram");
		
		
	}
}
