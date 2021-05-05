package com.accenture.lkm.io.characterstream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void write() throws IOException{
		try (FileWriter fw = new FileWriter("src/files/Greeting.txt", true);) {

			fw.write(System.lineSeparator());
			fw.write("Pleasant to meet u");
			System.out.println("data written to file");

		} 
	}

	public static void main(String[] args)throws IOException {
		write();
	}
}
