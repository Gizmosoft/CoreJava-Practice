package com.accenture.lkm.thread.client;

import com.accenture.lkm.thread.create.MailThread;
import com.accenture.lkm.thread.create.PayrollThread;

public class ThreadClient {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());

		System.out.println(Thread.currentThread().getPriority());

		PayrollThread threadOne = new PayrollThread("December");
		threadOne.start();

		PayrollThread threadTwo = new PayrollThread("November");
		threadTwo.start();

		MailThread mailOne = new MailThread("fred.accenture.com");

		Thread mailOneThread = new Thread(mailOne);
		mailOneThread.start();

	}

}
