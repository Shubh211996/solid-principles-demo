package com.example.solid.lsp.violation;

public class LSPViolationTest {
	public static void main(String[] args) {
		Bird bird = new Ostrich(); //Substituting parent with child
		bird.fly(); // Runtime error: Ostrich can't fly
	}

}
