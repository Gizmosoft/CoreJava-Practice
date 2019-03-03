package com.tech.ninzaz.staticblocks;

public class StaticBlockEx {

	public int id;
	public String name;
	
	static {
		System.out.println("Inside Static Block - 1");
	}
	static {
		System.out.println("Inside Static Block - 2");
	}
	
	{
		System.out.println("Inside Instance Block - 1 ");
	}
	
	{
		System.out.println("Inside Instance Block - 2 ");
		
	}
	
	public StaticBlockEx(int id, String name) {
		super();
		System.out.println("Inside Constructor - 1");
		this.id = id;
		this.name = name;
	}


	public static void main(String[] args) {
		
		System.out.println("Inside Main");
		StaticBlockEx s1 = new StaticBlockEx(1, "Gopal");
		System.out.println(s1.toString());
		System.out.println();
		StaticBlockEx s2 = new StaticBlockEx(2, "Lohith");
		System.out.println(s2.toString());
	}


	public String toString() {
		return "StaticBlockEx [id=" + id + ", name=" + name + "]";
	}
	

}
