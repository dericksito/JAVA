package com.krakedev.herencia;

public class Gato extends Animal {
	
	public void dormir() {
		System.out.println("Gatito mimiendo bro,no lo molestes");
	}

	public void maullar() {
		System.out.println("MIAUUUUUUU");
	}
	
	public void maullar(String adjetivo) {
		System.out.println("MIAUUUUUUU "+adjetivo);
	}
	
	
}
