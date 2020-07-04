package com.tech.ninzaz.inheritance.practice;

class A
{
	int i = 10;
	String name = "A";
}

class B extends A
{
	int i = 20;
}

class C extends A{
	int i = 30;
}
public class InheritanceEx1 {

	public static void main(String[] args)
	{
		B a = new B();

		System.out.println(a.i);		//will print 20. Change to A a = new B(); to get value as 10. 
		System.out.println(a.name);
		
		C b = new C();
		System.out.println(b.i);
		System.out.println(b.name);
	}
	
	
}
