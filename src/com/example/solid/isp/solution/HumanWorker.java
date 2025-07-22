package com.example.solid.isp.solution;

public class HumanWorker implements Workable, Eatable {

	@Override
	public void eat() {
		System.out.println("Human is Eating");
		
	}

	@Override
	public void work() {
		System.out.println("Human is working");
		
	}
	

}
