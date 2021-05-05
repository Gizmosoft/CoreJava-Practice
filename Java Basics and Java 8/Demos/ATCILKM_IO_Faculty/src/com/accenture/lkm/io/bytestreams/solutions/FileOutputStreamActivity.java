package com.accenture.lkm.io.bytestreams.solutions;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamActivity {
	public static void write(String fileName, String record) throws IOException {

		try (FileOutputStream fout = new FileOutputStream(fileName, true);) {

			fout.write(System.lineSeparator().getBytes());
			fout.write(record.getBytes());
			fout.flush();
			System.out.println("data written to file");

		}
	}

	public static void main(String[] args) throws IOException {
		write("src/files/users.txt", "mary,mary@gmail.com,+91-892237654");
	}
}
