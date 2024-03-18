package com.cmc.directorio.entidades;

public class AdminContactos {

	
	public Contacto buscarMasPesado(Contacto c1,Contacto c2) {
		
		if(c1.getPeso()>c2.getPeso()) {
			return c1;
		}else {
			return c2;
		}
		
		
	}
	
	public boolean compararOperadoras(Contacto c1,Contacto c2) {
		
		if(c1.getTelefono().getOperadora().equals("claro") && c2.getTelefono().getOperadora().equals("claro")) {
			return true;
		}else if(c1.getTelefono().getOperadora().equals("movi") && c2.getTelefono().getOperadora().equals("movi")) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public void activarContacto (Contacto c1) {
		if(c1.getTelefono().getOperadora().equals("movi")) {
			
			c1.setActivo(true);
		}
	}
	

	
}
