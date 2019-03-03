package com.tech.ninzaz.encapsulation;

public class Car {

	private String steerig;
	private String engine;
	private int wheels;
	
	protected String door;
	
	 public Car(){}
	
	//This constructor is used for Inheritance example
	 public Car(String steerig, String engine, int wheels) {
		super();
		this.steerig = steerig;
		this.engine = engine;
		this.wheels = wheels;
	}
	
	
	public void carRunning(){
		System.out.println("Car Running ....." + this.steerig + " " + this.engine + " " + this.wheels );
	}
	
	public void carDestroy(){
		System.out.println("Car Destroy....");
	}
	
	public String getSteerig() {
		return steerig;
	}
	public void setSteerig(String steerig) {
		this.steerig = steerig;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		if (wheels !=4 ){
			System.out.println("Please set correct numer of wheels");
			System.exit(200); // better to throw exception and handle appropriately.
		}else{
			this.wheels = wheels;
		}
	}
	
	public String toString() {
		return "Car [steerig=" + steerig + ", engine=" + engine + ", wheels="
				+ wheels + "]";
	}
	
	
	
}
