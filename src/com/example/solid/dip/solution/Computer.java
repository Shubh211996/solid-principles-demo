package com.example.solid.dip.solution;

public class Computer {
	private Keyboard keyboard; //depends on abstraction
	
	public Computer(Keyboard keyboard) {
		this.keyboard = keyboard;
	}
	
	public void type() {
		keyboard.type();
	}

}
