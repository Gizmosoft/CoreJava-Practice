package com.accenture.lkm.io.characterstream.solutions;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterActivity {
	public static void writeCharacterData(String fileName, String record) throws IOException {
		try (FileWriter fw = new FileWriter(fileName, true);) {

			fw.write(System.lineSeparator());
			fw.write(record);
			System.out.println("data written to file");

		}
	}

	public static void main(String[] args) throws IOException {
		writeCharacterData("src/files/users.txt", "Alice, alice@gmail.com,+91-998768765");
	}
}
