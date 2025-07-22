package com.example.solid.ocp;

import java.util.Arrays;
import java.util.List;

public class OCPDemo {
	public static void main(String[] args) {
		Shape circle = new Circle(5);
		
		Shape reactangle = new Reactangle(4, 6);
		
		Shape triangle = new Triangle(3, 5);
		
		List<Shape> shapes = Arrays.asList(circle, reactangle, triangle);
		
		AreaCalculator calculator = new AreaCalculator();
		double totalArea = calculator.calculateTotalArea(shapes);
		
		System.out.println("Total area: " + totalArea);
	}

}
