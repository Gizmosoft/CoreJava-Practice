package com.tech.ninzaz.instanceblocks;

public class InstanceBlocksEx {

	public int id;
	public String name;
	
	//Instance Block
	{
		System.out.println("Inside Instance Block -1 ");
		
	}
	
	public InstanceBlocksEx(int id, String name) {
		super();
		System.out.println("Inside Constructor - 1");
		this.id = id;
		this.name = name;
	}



	public static void main(String[] args) {
		
		InstanceBlocksEx ib1 = new InstanceBlocksEx(123, "Gopal");
		System.out.println(ib1.toString());
		System.out.println();
		InstanceBlocksEx ib2 = new InstanceBlocksEx(23, "Lohith");
		System.out.println(ib2.toString());
	}
	
	public String toString() {
		return "InstanceBlocksEx [id=" + id + ", name=" + name + "]";
	}

	
}
