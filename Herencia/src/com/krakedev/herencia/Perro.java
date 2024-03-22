package com.krakedev.herencia;

public class Perro extends Animal{
	
	public Perro() {
		
		System.out.println("Ejecutar constructor de perro");
	}

	public void ladrar() {
		
		System.out.println("perro ladrando ");
	}
	
	public void dormir() {
		 super.dormir();//llamaar al mismo metodo pero del padre para que se ejecute primero 
		System.out.println("perro durmiendo");
		//reutilizo el metodo del papa y le implementamos algo 
	}
}
