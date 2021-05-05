package com.accenture.lkm.vehicle;

public class Car implements IVehicle {

	@Override
	public void start() {
		System.out.println("Start car");
	}

	@Override
	public void stop() {
		System.out.println("Stop car");
	}

	@Override
	public void turnOnAc() {
		System.out.println("Set the cooling");
	}

}
