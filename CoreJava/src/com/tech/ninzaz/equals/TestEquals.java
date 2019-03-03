package com.tech.ninzaz.equals;

public class TestEquals {
public static void main (String[] args) {

	TestObject t1 = new TestObject(42);
	TestObject t2 = new TestObject(42);
	//Integer i1 = new Integer(42);
	//Integer i2 = new Integer(42);
	
	//==  returns true if the reference points to same object.
	
	
	if (t1 == t2 ) { 
		System.out.println("== is true");
	}else{
		System.out.println("== Method is false");
	}
	
	if (t1.equals(t2)){
		System.out.println(".equals Method is true");
	}else {
		System.out.println(".equals Method is False");
	}
	
	
	//toString() Object Class
	System.out.println(t1.toString());
}
}
