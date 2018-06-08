package model;

import test.InvalidRadiusException;

public class CircleCustomEx {

	private double radius;

	// getters & setters

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) throws InvalidRadiusException {
		
		if(radius<0) throw new InvalidRadiusException(radius);	
		this.radius = radius;
	}

	// constructeur

	public CircleCustomEx(double radius) throws InvalidRadiusException {

		this.setRadius(radius);

	}

}
