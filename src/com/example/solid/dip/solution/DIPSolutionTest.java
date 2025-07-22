package com.example.solid.dip.solution;

public class DIPSolutionTest {
	public static void main(String[] args) {
		Keyboard mechanical = new MechanicalKeyboard();
		
		Computer computer1 = new Computer(mechanical);
		computer1.type();
		
		Keyboard wireless = new WirelessKeyboard();
		Computer computer2 = new Computer(wireless);
		computer2.type();
	}

}
