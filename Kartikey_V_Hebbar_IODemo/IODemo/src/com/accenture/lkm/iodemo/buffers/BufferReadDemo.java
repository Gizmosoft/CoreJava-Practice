package com.accenture.lkm.iodemo.buffers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReadDemo {

	public static void main(String[] args) {

		try (FileReader file = new FileReader("src/kartikey_buffer_activity.txt");
				BufferedReader buffer = new BufferedReader(file)) {
			String data;
			while ((data = buffer.readLine()) != null) {
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
