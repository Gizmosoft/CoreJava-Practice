package com.accenture.lkm.io.bytestreams.solutions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamActivity {
 
	public static void read(String fileName) throws  IOException {
		try (FileInputStream fin = new FileInputStream(fileName);) {

			int ch;
			while ((ch = fin.read()) != -1) {
				System.out.print((char) ch);
			}
		}  
	}
	public static void main(String[] args) throws IOException {
		read("src/files/users.txt");
	}
}
