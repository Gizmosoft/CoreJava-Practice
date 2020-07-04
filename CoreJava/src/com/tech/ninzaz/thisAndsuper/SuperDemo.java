package com.tech.ninzaz.thisAndsuper;

class A{
	public A(){
		System.out.println("in A");
	}
	
	// creating a parameterized constructor
	public A(int a){
		System.out.println("in parameterized A");
	}
}

class B extends A{
	public B(){
		System.out.println("in B");
	}
	
	// creating a parameterized constructor
		public B(int b){
			super(b);	// Adding this super() with a parameter, A(int a) can be invoked
			System.out.println("in parameterized B");
		}
}

public class SuperDemo {

	public static void main(String[] args) {
		A obj = new A(); 	// object of a class calls the constructor of that class
		B obj1 = new B();	// object of a sub-class calls the constructor of both - its parent class + its own constructor

		A obj2 = new A(5); 	// Calls A(int a) constructor
		B obj3 = new B(5);	// Calls A() and B(int b) constructors - only default constructor of parent
	}

}

/* To call A(int a) from B(), add parameterized super {for ex. super(5)} in B() */ 
