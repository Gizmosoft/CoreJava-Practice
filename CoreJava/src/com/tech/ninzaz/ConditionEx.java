package com.tech.ninzaz;

public class ConditionEx {

	public static void main(String[] args) {
		//If both the methods below give a true output then print "Correct value".
		if (falseMethod() && trueMethod()){
			System.out.println("Correct value");
		} else{
			System.out.println("Incorrect values");
		}
	}
	
	
	private static boolean trueMethod() {
		return true;
	}

	private static boolean falseMethod() {
		return false;
	}

}
