package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {
		ArrayList<String> cadenas;
		
		String valorRecuperado;
		
		cadenas=new ArrayList<String>();
		
		
		
		System.out.println(cadenas.size());// con size se conoce el tamano del array
		
		cadenas.add("XD");// con el add se agregan elementos 
		cadenas.add("DOS");
		
		System.out.println(cadenas.size());
		
		valorRecuperado=cadenas.get(1);//con get recupero poniendo la posicion de lo que quiero recuperar
		//esta vez nos devolvera 2 por uqe esta en la psicion 1 .
		
		System.out.println(valorRecuperado);
		
		String cadena;
		for(int i=0;i<cadenas.size();i++) {// con size nos da que el 0 llega hasta uno menos que el size 
			cadena=cadenas.get(i);//asi guardamos posicion aqui en java
			System.out.println("cadena: "+cadena);
		}
		
		
		//en conclusion con size nos leemos la cadena y con get recuperamos posicion 

		
	}

}
