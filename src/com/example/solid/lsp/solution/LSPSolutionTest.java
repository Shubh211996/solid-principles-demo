package com.example.solid.lsp.solution;

public class LSPSolutionTest {
	public static void main(String[] args) {
		FlyingBird flyingbird = new Sparrow();
		flyingbird.fly();
		flyingbird.layEggs();
		
		Bird bird = new Ostrich(); // Safe substitution
		bird.layEggs(); // Works without breaking
	}

}
