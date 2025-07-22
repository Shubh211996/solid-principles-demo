package com.example.solid.isp.solution;

public class ISPSolutionTest {
	public static void main(String[] args) {
		Workable human = new HumanWorker();
		human.work();
		
		Workable robot = new RobotWorker();
		robot.work();
		
		Eatable humanEater = new HumanWorker();
		humanEater.eat();
	}

}
