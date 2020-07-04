package com.tech.ninzaz.NewFeaturesJava8;

interface Demo{
	void def();		// Regular Declaration of method in interface
//	public void show(){System.out.println("in show");}	// Throws error as defining of method is not allowed in interface
	
	//To enable method definition in interface, Java 8 has default methods within interface
	default void show(){
		System.out.println("in default method show");
	}
}

class DemoImpl implements Demo{

	@Override
	public void def() {
		// Overriding 100% abstract method def() in the implementing class
		System.out.println("in def method");
	}
	
}
public class DefaultMethodInterface {

	public static void main(String[] args) {
		// Creating object of DemoImpl class with Demo interface as Reference
		Demo obj = new DemoImpl();
		obj.def();
		obj.show();
	}

}
