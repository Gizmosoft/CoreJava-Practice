package com.accenture.lkm.client;

import com.accenture.lkm.vehicle.Car;
import com.accenture.lkm.vehicle.HeavyVehicle;

public class VehicleMain {

	public static void main(String[] args) {
		HeavyVehicle truck = new HeavyVehicle();
		truck.start();
		truck.stop();

		Car huyndai = new Car();
		huyndai.start();
		huyndai.stop();
	}

}
