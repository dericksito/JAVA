package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		Telefono telef1 = new Telefono(23, "movi", "09888908930");
		Telefono telef2 = new Telefono(16, "movi", "0988553930");

		Contacto c1 = new Contacto("Angel", "Silva", telef1, 34.7);

		Contacto c2 = new Contacto("Pablo", "Lopez", telef2, 23.7);
		
		AdminContactos ad1=new AdminContactos();
		
		
		Contacto cd=ad1.buscarMasPesado(c1, c2);
		
		boolean cx=ad1.compararOperadoras(c1, c2);
		
		cd.imprimir();
		
		System.out.println("--------------------------------");
		System.out.println("Tus Operadoras son iguales: "+cx);

	}

}
