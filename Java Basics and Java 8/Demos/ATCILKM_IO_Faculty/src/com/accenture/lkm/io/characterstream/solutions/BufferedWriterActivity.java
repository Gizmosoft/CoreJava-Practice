package com.accenture.lkm.io.characterstream.solutions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterActivity {

	public static void write(String fileName, String record) throws IOException {
		try (FileWriter fw = new FileWriter(fileName, true); BufferedWriter bw = new BufferedWriter(fw);) {
			bw.write(System.lineSeparator());
			bw.write(record);
			bw.flush();
			System.out.println("record written");
		}
	}

	public static void main(String[] args) throws IOException {
		write("src/files/users.txt", "Tom,Harry,880-674-9212,22-MAY-2015");
	}
}
