package com.tech.ninzaz.wrapperclasses;

/*Lohith Gopal
 * numeric values within range of -128 to 127 are cached so if you try to compare it will be true
 * out of the range comparison will return false.
 * 
 * 
 * */

public class IntegerEx {

	public static void main(String[] args) {
		
		Integer i1 = 500;
		Integer i2 = 500;
		
		System.out.println(i1==i2);
		
		Integer i3 = 120;
		Integer i4 = 120;
		
		System.out.println(i3==i4);
		
		
		
/*		Integer i5 = 5;
		String s = i5.toString();
		System.out.println("Integer to String: " + s);
		
		
		System.out.println("String to Integer: "+Integer.parseInt(s));
*/		
	}

}
