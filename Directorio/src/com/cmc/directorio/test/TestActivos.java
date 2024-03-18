package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;
import com.cmc.directorio.entidades.AdminContactos;

public class TestActivos {

	public static void main(String[] args) {
		Telefono telef1 = new Telefono(23, "movi", "09888908930");

		Contacto c1 = new Contacto("Angel", "Silva", telef1, 34.7);

       AdminContactos cd=new AdminContactos();
		
		c1.imprimir();
		
		cd.activarContacto(c1);
		
		
		
		 
		
		
		
	}

}
