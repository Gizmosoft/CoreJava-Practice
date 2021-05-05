package com.accenture.lkm.io.solution;

import java.io.File;

public class FileDemo {

	public static void fileDemo() {
		File file = new File("src/files/users.txt");
		System.out.println(file.canRead()); 
		System.out.println(file.canWrite()); 

	}

	public static void main(String[] args) {
		fileDemo();
	}
}
