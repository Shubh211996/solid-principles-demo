package com.example.solid.dip.violation;

public class Computer {
	private MechanicalKeyboard keyboard;
	
	public Computer() {
		this.keyboard = new MechanicalKeyboard(); // direct dependency
		
	}
	
	public void type() {
		keyboard.type();
	}

}
