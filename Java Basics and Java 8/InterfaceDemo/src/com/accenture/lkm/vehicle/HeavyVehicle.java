package com.accenture.lkm.vehicle;

public class HeavyVehicle implements Vehicle {

	@Override
	public void start() {
		System.out.println("Start heavy vehicle");
	}

	@Override
	public void stop() {
		System.out.println("Stop heavy vehicle");
	}

}
