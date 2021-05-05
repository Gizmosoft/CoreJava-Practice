package com.accenture.lkm;

public class SavingsAccount {
	private int balance;
	public SavingsAccount(){
	balance = 1000;
	}
	
	public void withdraw(int amount) throws OverdraftException{
		if(amount > balance)
			throw new OverdraftException("Insufficient Balance");
		else
			balance = balance - amount;
	}

	public void deposit(int amount){
	balance = balance + amount;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
