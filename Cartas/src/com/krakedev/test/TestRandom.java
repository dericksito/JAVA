package com.krakedev.test;

import com.krakedev.entidades.RandomNumber;

public class TestRandom {

	public static void main(String[] args) {
		int posicion = RandomNumber.obtenerPosicion();
		System.out.println("Posicion obtenida : "+ posicion);
		 if (posicion == 0 || posicion == 1) {
	            System.out.println("El método obtenerPosicion ha arrojado 0 o 1.");
	        } else {
	            System.out.println("El método obtenerPosicion no ha arrojado 0 o 1.");
	        }

	}

}
