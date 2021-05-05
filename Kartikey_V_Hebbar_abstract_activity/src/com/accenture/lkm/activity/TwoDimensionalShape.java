package com.accenture.lkm.activity;

public abstract class TwoDimensionalShape {
	protected double shapeArea;
	private String shapeColor;
	
	public TwoDimensionalShape(String shapeColor) {
		this.shapeColor = shapeColor;
	}
	
	public void getCoordinates(int x, int y) {
		System.out.println("Co-ordinates noted ("+x+","+y+")");
	}
	
	public abstract double computeArea();
	
}
