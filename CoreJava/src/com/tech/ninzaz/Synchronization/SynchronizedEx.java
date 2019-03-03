package com.tech.ninzaz.Synchronization;

public class SynchronizedEx extends Thread{
	
	private static int count;							//volatile keyword can increase the value but still data corruption occurs.
	
	public synchronized static void incrementer() {		//Synchronized Keyword avoids data corruption
		count++;
	}

	public static void main(String[] args) {
		
		Thread t1 = new Thread() {
		@Override
		public void run() {
			for (int i = 0; i < 10000; i++) {
				//count++;
				incrementer();
			}
		}
	};
	
	
		Thread t2 = new Thread() {
		@Override
		public void run() {
			for (int i = 0; i < 10000; i++) {
				//count++;
				incrementer();
			}
		}
	};
	
	t1.start();
	t2.start();
	try {
		t1.join();
		t2.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	System.out.println(count);
	
	}
}
