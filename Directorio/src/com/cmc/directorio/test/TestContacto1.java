package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telef=new Telefono(10,"movi","09888908930");
		
		Contacto c=new Contacto("Derick","Cedeno",telef,53.7);
		
		c.imprimir();
		
      
		
	}

}
