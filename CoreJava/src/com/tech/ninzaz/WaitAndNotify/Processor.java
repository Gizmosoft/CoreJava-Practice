package com.tech.ninzaz.WaitAndNotify;

import java.util.Scanner;

public class Processor {
	
	public void workOne() throws InterruptedException{
		synchronized (this) {
			System.out.println("Producer Thread Running.....");
			wait();
			System.out.println("Producer Resumed");
		}
	}
	
	public void workTwo() throws InterruptedException{
		Thread.sleep(2000);
		Scanner scan = new Scanner(System.in);
		
		synchronized (this) {
			System.out.println("Waiting for Return Key......");
			scan.nextLine();
			System.out.println("Return Key Pressed");
			notify();
			System.out.println("Post Notify");
			
		}
		
	}

}
