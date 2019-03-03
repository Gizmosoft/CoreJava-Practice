package com.tech.ninzaz.Multithread;

import java.util.Random;
import java.util.concurrent.Callable;

public class Worker implements Callable<Long>{

	@Override
	public Long call() throws Exception {
		System.out.println("Inside Callable");
		Random random = new Random();
		Long startTime = System.currentTimeMillis();
				Thread.sleep(random.nextInt(100));
		Long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}
	
	

}
