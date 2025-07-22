package com.example.solid.ocp;

public class Reactangle implements Shape {
	private double width;
	private double height;
	
	public Reactangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return width * height;
	}

}
