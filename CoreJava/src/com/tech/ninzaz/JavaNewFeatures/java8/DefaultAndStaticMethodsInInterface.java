package com.tech.ninzaz.java8;


public interface DefaultAndStaticMethodsInInterface {

	void method1(String str);
	
	default void log(String str){
		System.out.println("Logging  "+ str );
	}
	
	static void print(String str){
		System.out.println("Printing  "+ str);
	}
	
	
	
}
