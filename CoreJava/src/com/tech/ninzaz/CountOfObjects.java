package com.tech.ninzaz;

public class CountOfObjects {

	public static int count;
	
	public static void main(String[] args) {
		
		
		CountOfObjects o1 = new CountOfObjects();
		o1.count++;
		
		System.out.println(o1.count);
		
		CountOfObjects o2 = new CountOfObjects();
		o2.count++;
		
		System.out.println(o2.count);
		
	}

}
