package com.accenture.lkm.io.characterstream.solutions;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderActivity {
 
	public static void readCharacterData(String fileName) {
		try (FileReader fr = new FileReader(fileName);) {

			int ch;
 			while ((ch = fr.read()) != -1) {
				System.out.print((char) ch);
			}
		} catch (IOException io) {
			io.printStackTrace();
		}
	}
	public static void main(String[] args) {
		readCharacterData("src/files/users.txt");
 	}
}
