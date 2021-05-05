package com.accenture.lkm.activity;

import java.util.Scanner;

public class ValidatorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the email to be verified:");
		String email = sc.next();
		sc.close();
		Validator valid = new Validator(email);
		if(valid.validateEmail(email)) {
			System.out.println("The entered email address is VALID.");
		}
		else {
			System.out.println("The entered email address is INVALID.");
		}
	}

}
