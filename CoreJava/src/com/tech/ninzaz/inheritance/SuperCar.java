package com.tech.ninzaz.inheritance;

import com.tech.ninzaz.encapsulation.Car;

public class SuperCar extends Car{

	private String color;
	private boolean autoDoorClose;
	private String autoDrive;
	
	
	public SuperCar(String autoDrive) {
		super();
		this.autoDrive = autoDrive;
	}

	public SuperCar(String steering, String engine, int wheels, String color, boolean autoDoorClose, String autoDrive) {
		super(steering, engine,  wheels);
		this.color = color;
		this.autoDoorClose = autoDoorClose;
		this.autoDrive = autoDrive;
		
	}

	public void doSuperCarThings() {
		super.getSteerig();
		this.color ="";
		super.carRunning();
		door="Door1";
		System.out.println("Super Car Things: " + color + " " + autoDoorClose + " " + autoDrive );
		
		
	}
	
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isAutoDoorClose() {
		return autoDoorClose;
	}

	public void setAutoDoorClose(boolean autoDoorClose) {
		this.autoDoorClose = autoDoorClose;
	}

	public String getAutoDrive() {
		return autoDrive;
	}

	public void setAutoDrive(String autoDrive) {
		this.autoDrive = autoDrive;
	}

	public String toString() {
		return "SuperCar [color=" + color + ", autoDoorClose=" + autoDoorClose
				+ ", autoDrive=" + autoDrive + "]";
	}
	
	
	
	
	
	
	
	
}
