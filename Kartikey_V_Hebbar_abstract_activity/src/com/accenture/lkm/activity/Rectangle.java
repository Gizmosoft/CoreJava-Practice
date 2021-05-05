package com.accenture.lkm.activity;

public class Rectangle extends TwoDimensionalShape {
	private int length;
	private int breadth;
	
	public Rectangle(String shapeColor, int length, int breadth) {
		super(shapeColor);
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public double computeArea() {
		shapeArea = length * breadth;
		return shapeArea;
	}

}
