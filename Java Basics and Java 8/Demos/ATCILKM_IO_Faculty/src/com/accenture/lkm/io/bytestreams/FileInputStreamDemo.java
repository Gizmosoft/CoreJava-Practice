package com.accenture.lkm.io.bytestreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void read() throws FileNotFoundException, IOException {
		try (FileInputStream fin = new FileInputStream("src/files/Greeting.txt");) {

			int ch;
			while ((ch = fin.read()) != -1) {
				System.out.print((char) ch);
			}
		}  
	}
	public static void main(String[] args) throws FileNotFoundException, IOException {
		read();
	}
}
