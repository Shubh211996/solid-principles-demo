package com.example.solid.isp.violation;

public class RobotWorker implements Worker {

	@Override
	public void work() {
		System.out.println("Robot is working");
		
	}

	@Override
	public void eat() {
		// Robot doesn't eat - forced to implement unused method
		throw new UnsupportedOperationException("Robot doesn't eat");
		
	}
	

}
