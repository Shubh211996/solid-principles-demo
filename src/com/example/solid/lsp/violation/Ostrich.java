package com.example.solid.lsp.violation;

public class Ostrich extends Bird {
	
	@Override
	public void fly() {
		throw new UnsupportedOperationException("Ostrich can't fly");
	}

}
