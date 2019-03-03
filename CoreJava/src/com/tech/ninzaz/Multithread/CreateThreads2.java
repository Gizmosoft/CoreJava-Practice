package com.tech.ninzaz.Multithread;

public class CreateThreads2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable runnable = new MyRunnable();
		
		Thread t1 = new Thread(runnable);			//By this, we are invoking the Thread(parent) class. As we are not hitting the
		t1.start();									//parent(Thread) class directly because of implementing the Interface(Runnable), so
		//t1.start();   -- IllegalThreadStateException	//we add this extra step here to hit the parent class.
		for (int i = 0; i < 10 ; i++) {
			System.out.println("Executing the Main Class: "+i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
