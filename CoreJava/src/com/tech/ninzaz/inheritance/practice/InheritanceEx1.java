package com.tech.ninzaz.inheritance.practice;

class A
{
	int i = 10;
}

class B extends A
{
	int i = 20;
}

public class InheritanceEx1 {

	public static void main(String[] args)
	{
		A a = new B();

		System.out.println(a.i);
	}
	
	
}
