package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		Telefono telef1 = new Telefono(10, "movi", "09888908930");
		Telefono telef2 = new Telefono(12, "claro", "09885633930");

		Contacto c1 = new Contacto("Derick", "Cedeno", telef1, 53.7);

		Contacto c2 = new Contacto("Vicente", "Fernandez", telef2, 67.7);
		
		AdminContactos ad1=new AdminContactos();
		
		
		Contacto cd=ad1.buscarMasPesado(c1, c2);
		
		boolean cx=ad1.compararOperadoras(c1, c2);
		
		cd.imprimir();
		
		System.out.println("--------------------------------");
		System.out.println("Tus Operadoras son iguales: "+cx);
		

	}

}
