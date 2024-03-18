package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Persona> personas;
		
		personas=new ArrayList<Persona>();
		
		personas.add(new Persona("Derick ","Tenorio"));
		personas.add(new Persona("Emerick ","Ronaldo"));
		personas.add(new Persona("Ademir ","Cedeno"));//anadir directamente al array
		
		System.out.println(personas.size());
		
		Persona elementoPersona;//aqui se declaran las variables a usarse fuera del for 
		for (int i=0;i<personas.size();i++) {
			elementoPersona=personas.get(i);
			
			System.out.println(elementoPersona.getNombre()+" "+elementoPersona.getApellido());
			
		}

	}

}
