package com.tech.ninzaz.overriding;

import java.io.IOException;

public class Animal {

	public String name = "Cow";
	public static String type;
	
	public void eat() throws IOException{
		System.out.println("Animal eating");
	}
	
	public void run(){
		System.out.println("Animal Running");
	}
	
}
