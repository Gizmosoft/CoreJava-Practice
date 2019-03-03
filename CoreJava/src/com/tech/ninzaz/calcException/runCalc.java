package com.tech.ninzaz.calcException;

public class runCalc {
	public static void main(String[] args) {
		
		try {
		calcException ce = new calcException();
				int ans = ce.divide(6, 0);
				System.out.println(ans);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Only Arithmetic");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Other Exception");
		}
		
		System.out.println("Post Exception");
	}
}
