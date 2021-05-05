package com.accenture.lkm.client;


import com.accenture.lkm.activity.Rectangle;
import com.accenture.lkm.activity.Square;

public class AbstractMain {

	public static void main(String[] args) {
		Square sqr = new Square("red", 4);
		System.out.println("The area of Square is: "+ sqr.computeArea());
		sqr.getCoordinates(4, 4);
		System.out.println("The circumference of Square is: "+ sqr.computeCircumference());
		
		Rectangle rect = new Rectangle("pink", 2, 3);
		System.out.println("The area of Rectangle is: " + rect.computeArea());
		rect.getCoordinates(2, 3);
		

	}

}
