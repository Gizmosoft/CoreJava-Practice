package com.accenture.lkm.thread.create;

public class PayrollThread extends Thread {

	private String month;

	public PayrollThread(String month) {
		this.month = month;
	}

	@Override
	public void run() {
		generatePaySlip();
	}

	public void generatePaySlip() {
		System.out.println("Generate pay slip for the month " + month);
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println(Thread.currentThread().getPriority());
	}
}
