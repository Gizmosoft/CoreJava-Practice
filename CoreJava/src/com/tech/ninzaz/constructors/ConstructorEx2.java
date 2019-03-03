package com.tech.ninzaz.constructors;

import java.io.IOException;

public class ConstructorEx2 {

	private int id;
	private String name;
	
	
	public ConstructorEx2(int id) throws IOException {
		//System.out.println("Constructor first line");
		super();
		System.out.println("Constructor for id is being executed");
		this.id = id;
		//throw new IOException("File not present");
	}

	public ConstructorEx2(String name) {
		super();
		this.name = name;
		System.out.println("Constructor for Name is being executed");
	}

	public ConstructorEx2(int id, String name) throws IOException {
		this(id);
		System.out.println("Constructor for id and Name is being executed");
		this.name = name;
		
	}


	public static void main(String[] args) throws IOException {
		
		ConstructorEx2 c1 = new ConstructorEx2(1, "Ravi");
		System.out.println(c1.toString());
		System.out.println(new ConstructorEx2(123).toString() );
		
	}

	public String toString() {
		return "ConstructorEx2 [id=" + id + ", name=" + name + "]";
	}
	
	

}
