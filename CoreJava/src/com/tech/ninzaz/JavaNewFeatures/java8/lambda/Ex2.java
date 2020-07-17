package com.tech.ninzaz.java8.lambda;


interface Sayable1{

	public String say(String name);
}

public class Ex2 implements Sayable1 {

	public static void main(String[] args) {
	
		Sayable1 s1  = new Ex2();
		System.out.println(s1.say("Lohith"));
		
		Sayable1 s2 = (name)-> { 
			return "Hello from Lambda Expressions "+ name; 
		}; 
		
		System.out.println(s2.say("Ramesh"));
		
		
	}

	@Override
	public String say(String name) {
	
		return "Hello From Regular Inheritance method "+ name;
	}

}
