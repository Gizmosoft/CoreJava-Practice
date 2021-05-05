package com.accenture.lkm;

public class Bank {
public static void main(String[] args) {
	SavingsAccount account = new SavingsAccount();
	try {
		account.withdraw(2000);
	}catch(OverdraftException e) {
		System.out.println(e.getMessage());
	}
	System.out.println(account.getBalance());
}
}
