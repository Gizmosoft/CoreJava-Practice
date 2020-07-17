package com.tech.ninzaz.java8.lambda;

interface Sayable{
	
	public String say(String name);
}

public class LambdaEx2 {

	public static void main(String[] args) {

		Sayable s1 = (name)->{ 
			return "Hello First " +name;
			};
			
		System.out.println(s1.say("Lohith"));
		
		Sayable s2 = name ->{
			return "Hello Second "+ name;
		};
		
		System.out.println(s2.say("Gopal"));
		
	}

}
