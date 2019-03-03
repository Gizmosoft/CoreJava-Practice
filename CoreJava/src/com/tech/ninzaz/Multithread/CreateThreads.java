package com.tech.ninzaz.Multithread;

public class CreateThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threading t1 = new Threading();
		Threading t2 = new Threading();
		//t1.start();
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		t1.start();
		
		for(int i=0; i<=10; i++) {
			System.out.println("I'm in Main Method: "+i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
