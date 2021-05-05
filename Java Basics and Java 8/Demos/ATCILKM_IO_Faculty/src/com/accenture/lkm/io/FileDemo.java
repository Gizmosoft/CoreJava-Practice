package com.accenture.lkm.io;

import java.io.File;

public class FileDemo {
	public static void fileDemo() {
		File file = new File("src/files");
		System.out.println("file exists = " + file.exists());
		System.out.println("is directory = " + file.isDirectory());
		
		File files[] = file.listFiles();
		for(File f: files) {
			System.out.println(f.getName());
		}
	}
	public static void main(String[] args) {
		fileDemo();
	}
}
