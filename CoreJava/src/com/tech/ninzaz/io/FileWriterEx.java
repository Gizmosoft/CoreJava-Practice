package com.tech.ninzaz.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterEx {

	public static void main(String[] args) throws IOException {
	
		File f;
		FileWriter writer = null;
		
		try {
			//f = new File("C:/Temp/temp.txt");
			f = new File("C:\\Temp", "temp.txt");
			//
			writer = new FileWriter(f);
			//writer = new FileWriter(f, true);
			
			if(!f.createNewFile()){
				System.out.println("File Created Succesfully !!");
			}else{
				System.out.println("File Not Created Succesfully");
			}
			
			
			for (int i = 0; i < 1000; i++) {
				writer.write("Temp String getting Created "+i+ "\n");
			}
			System.out.println("File writting is complete");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			writer.flush(); // To gurantee that even the last character is written to the file correctly.
			writer.close();
			System.out.println("Closed the file");
		}
		
		
		
		
	}

}
