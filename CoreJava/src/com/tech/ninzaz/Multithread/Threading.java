package com.tech.ninzaz.Multithread;

public class Threading extends Thread{
	public void run() {										//Overriding of run method
		for(int i=0; i<=10; i++) {
			System.out.println("I'm in Thread: "+i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}
	//@Override start() method
	public void start() {
		super.start();
		System.out.println("Start Thread Method");
	}
	
	public void run(int i) {
		System.out.println("Argument RUN method");		
	}
}


//////RUN will always execute the one with NO ARGUMENTS.