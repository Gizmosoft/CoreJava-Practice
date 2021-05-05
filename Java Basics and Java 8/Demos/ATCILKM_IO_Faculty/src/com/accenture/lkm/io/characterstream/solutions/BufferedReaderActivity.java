package com.accenture.lkm.io.characterstream.solutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderActivity {
	public static void read(String fileName) throws IOException {

		try (FileReader fr = new FileReader(fileName); BufferedReader br = new BufferedReader(fr);) {
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		read("src/files/users.txt");
	}
}
