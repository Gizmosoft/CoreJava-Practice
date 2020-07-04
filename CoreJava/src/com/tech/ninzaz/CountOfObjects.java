package com.tech.ninzaz;

public class CountOfObjects {

	public static int count;	//count will be 0 by default. We can assign any specific value to it also
	
	public static void main(String[] args) {
		
		
		CountOfObjects o1 = new CountOfObjects();
		o1.count++;
		
		System.out.println(o1.count);
		
		CountOfObjects o2 = new CountOfObjects();
		o2.count++;
		
		System.out.println(o2.count);
		
	}

}
