package com.accenture.lkm.thread.create;

public class MailThread implements Runnable {

	private String emailId;

	public MailThread(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public void run() {
		mailPaySlip();
	}

	public void mailPaySlip() {
		System.out.println("Mailed to " + emailId + " successfully");
		System.out.println(Thread.currentThread().getName());

		System.out.println(Thread.currentThread().getPriority());
	}

}
