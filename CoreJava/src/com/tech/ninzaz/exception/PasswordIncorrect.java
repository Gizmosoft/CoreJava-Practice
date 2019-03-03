package com.tech.ninzaz.exception;

import java.util.Scanner;

public class PasswordIncorrect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserID:");
		String userId = sc.next();
		System.out.println("Enter Password");
		String pass = sc.next();
		
			try {
				checkPassword(pass);
			} catch (PasswordInCorrectException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				//System.out.println(e.getMessage());
			}
			
			
			//System.out.println("After Nested try Catch");
			
		} 
		/*catch (PasswordInCorrectException e) {
			e.printStackTrace();
		}*/
		
//}
	
	public static void checkPassword(String pass) throws PasswordInCorrectException { 
		
	if (!pass.equals("Lohith")){
		throw new PasswordInCorrectException("Password is incorrect");
	}
	}

}
