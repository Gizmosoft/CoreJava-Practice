package com.tech.ninzaz.io;

import java.io.File;

public class ListOfFilesEx {

	public static void main(String[] args) {
		
		File f = new File("C:\\Temp");
		
		for (String file : f.list()) {
			System.out.println(file);
		}
		
	}

}
