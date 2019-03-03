package com.tech.ninzaz.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class DeleteDuplicateLines {

	public static void main(String[] args) throws IOException 
    {
        PrintWriter pw = new PrintWriter("C:\\Temp\\output.txt");
        BufferedReader br1 = new BufferedReader(new FileReader("C:\\Temp\\input.txt"));
         
        String line1 = br1.readLine();
         
        while(line1 != null)
        {
            boolean flag = false;
             
            BufferedReader br2 = new BufferedReader(new FileReader("C:\\Temp\\output.txt"));
             
            String line2 = br2.readLine();
             
            while(line2 != null)
            {
                 
                if(line1.equals(line2))
                {
                    flag = true;
                    break;
                }
                 
                line2 = br2.readLine();
             
            }
             
            if(!flag){
                pw.println(line1);
                pw.flush();
            }
             
            line1 = br1.readLine();
             
        }

        br1.close();
        pw.close();
         
        System.out.println("File operation performed successfully");
    }
	
}
