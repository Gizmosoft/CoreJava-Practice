package com.accenture.lkm.iodemo.characters;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadCharacter {
	public static void main(String[] args) {
		try (FileReader fileRdr = new FileReader("c:\\iodemo\\Dayeighttopics.txt")) {
			int i;
			while ((i = fileRdr.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (

		FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
