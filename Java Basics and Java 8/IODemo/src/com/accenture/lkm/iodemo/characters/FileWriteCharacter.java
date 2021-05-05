package com.accenture.lkm.iodemo.characters;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteCharacter {

	public static void main(String[] args) {

		try (FileWriter fileWtr = new FileWriter("c:\\iodemo\\Dayeighttopics.txt", true)) {
			String topics = "java.io Package\r\n" + "Byte & Character Stream\r\n" + "Chaining Streams\r\n"
					+ "Serialization";
			fileWtr.write(topics);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("File written successfully");

	}

}
