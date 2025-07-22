package com.example.solid.isp.violation;

public class ISPViolationTest {
	public static void main(String[] args) {
		Worker robot = new RobotWorker();
		robot.work();
		robot.eat(); // Throws exception
	}

}
