package com.example.solid.ocp;

import java.util.List;

public class AreaCalculator {
	public double calculateTotalArea(List<Shape> shapes) {
		return shapes.stream()
				     .mapToDouble(Shape::calculateArea)
				     .sum();
	}

}
