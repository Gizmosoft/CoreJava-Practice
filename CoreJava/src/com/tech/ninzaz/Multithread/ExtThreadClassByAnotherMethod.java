package com.tech.ninzaz.Multithread;

public class ExtThreadClassByAnotherMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t3 = new Thread() {
			@Override 													// Creating Anonymous Class
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10; i++) {
					System.out.println("Thread 3: " + i);
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		t3.start();
		try {
			t3.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("This is a main method: " + i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}