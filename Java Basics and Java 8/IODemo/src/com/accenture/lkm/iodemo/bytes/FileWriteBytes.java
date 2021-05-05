package com.accenture.lkm.iodemo.bytes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteBytes {

	public static void main(String[] args) {

		FileOutputStream fOut = null;

		try {
			fOut = new FileOutputStream("TechversantAcademy.txt");
			String message = "Techversant Academy Java cohorts 14th Dec OB ";
			byte[] msg = message.getBytes();
			fOut.write(msg);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fOut.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
