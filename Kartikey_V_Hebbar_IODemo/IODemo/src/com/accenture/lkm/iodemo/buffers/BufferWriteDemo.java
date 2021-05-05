package com.accenture.lkm.iodemo.buffers;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Add code to write characters into a file using buffer.
 * Filename is <yourname_buffer_activity.txt>
 */
public class BufferWriteDemo {

	public static void main(String[] args) {
		try(FileWriter file = new FileWriter("src/kartikey_buffer_activity.txt");
				BufferedWriter buffwrt = new BufferedWriter(file)){		// not in append mode now
			String data = "Entering data using Buffered Writer.";
			buffwrt.write(data);
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Write Successfully Completed!");
	}
}
