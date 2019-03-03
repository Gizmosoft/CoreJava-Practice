package com.tech.ninzaz.Synchronization;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SyncBlockEx {
	
	Random r = new Random();
	List<Integer> l1 = new ArrayList<>();
	List<Integer> l2 = new ArrayList<>();
	
	
	
	public synchronized void stageone() {
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		l1.add(r.nextInt()); 			//gives random integer value
	}

	public synchronized void stagetwo() {
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		l2.add(r.nextInt()); 			//gives random integer value
	}
	
	public void process() {
		for (int i = 0; i < 1000; i++) {
			stageone();
			stagetwo();
		}
	}
	
	public void main1() {
		Long start = System.currentTimeMillis();
		Thread t1 = new Thread() {
			@Override
			public void run() {
				process();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				process();
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
		Long end = System.currentTimeMillis();
		System.out.println("Time Taken: "+ (end-start));
		System.out.println("List1 size: "+ l1.size()+ " List2 size" + l2.size());
		
	}
	public static void main(String[] args) {
		
		SyncBlockEx s1 = new SyncBlockEx();
		
		s1.main1();
		
		
		

	}

}
