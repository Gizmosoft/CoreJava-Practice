package com.tech.ninzaz.NewFeaturesJava8;

interface Sayable1{
	public String say(String name);
}

public class LambdaEx2 implements Sayable1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable1 s1 = new LambdaEx2();
		System.out.println(s1.say("Kartikey"));
		
		Sayable1 s2 = (name) -> {
			return "Hello From Lambda Expressions"+ name;
		};
		
		System.out.println(s2.say("Ankit"));
		
	}

	@Override
	public String say(String name) {
		// TODO Auto-generated method stub
		return "Hello From Regular Inheritence method"+ name;
	}

}
