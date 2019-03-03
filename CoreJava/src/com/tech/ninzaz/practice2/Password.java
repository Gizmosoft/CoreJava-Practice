package com.tech.ninzaz.practice2;

import java.util.Scanner;

import com.tech.ninzaz.exception.PasswordInCorrectException;

public class Password {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				System.out.println("Enter ID:");
				String id = scan.next();
				System.out.println("Enter Password:");
				String pass = scan.next();
				
				try {
					checkPass(pass);
				}
				catch(PasswordInc e){
					e.printStackTrace();
					
				}
	}
	
	public static void checkPass(String pass) throws PasswordInc{
		if (!pass.equals("Kartikey")){
			throw new PasswordInc("Password is incorrect");
	}
	}

}
