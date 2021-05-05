package com.accenture.lkm.activity;

public class Square extends TwoDimensionalShape {
	private int side;
	
	public Square(String shapeColor, int side) {
		super(shapeColor);
		this.side = side;		
	}

	@Override
	public double computeArea() {
		shapeArea = side * side;
		return shapeArea;
	}
	
	public double computeCircumference() {
		return 4*side;
	}

}
