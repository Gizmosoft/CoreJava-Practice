package com.accenture.lkm.io.characterstream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void readCharacterData(String fileName) throws IOException {
		try (FileReader fr = new FileReader(fileName);) {

			int ch;
			while ((ch = fr.read()) != -1) {
				System.out.print((char) ch);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		readCharacterData("src/files/Greeting.txt");
	}

}
