package com.tech.ninzaz.string;

public class StringTest {

	public static void main(String[] args) {
		
		//How many Objects in SCP (2)
		//== compares the refereces, if they point to same object then == is true
		String s1 = "Lohith";
		String s2 = "Gopal";
		String s3 = "Lohith";
		
		if(s1==s2) System.out.println("S1==s2");
		if(s1==s3) System.out.println("S1==S3");
		
		//How many Objects in Heap (3)
		String s4 = new String("Lohith");
		String s5 = new String("Gopal");
		String s6 = new String("Lohith");
		
		if(s4==s5) System.out.println("S4==S5");
		if(s4==s6) System.out.println("S4==S6");
	}

}
