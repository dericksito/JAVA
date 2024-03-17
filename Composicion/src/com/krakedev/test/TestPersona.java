package com.krakedev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		
		Persona p1=new Persona();
		p1.setNombre("Derick");
		p1.setApellido("Tenorio");
		//rellenamos todos los atributos de direccion para poder usar
		Direccion dir=new Direccion();
		dir.setCallePrincipal("Santa Rosa");
		dir.setCalleSecundaria("Velazco Ibarra");
		dir.setNumero("N-34");		
		
		p1.setDireccion(dir);// y aqui llamamos a esa direccion para poder setearlo dentro de permosa1
		
		
		String nombre =p1.getNombre();
		Direccion d1=p1.getDireccion();
		
		System.out.println(nombre);
		System.out.println(d1.getCallePrincipal());
		
		
		p1.imprimir();
		
		Direccion dir2=new Direccion("Cristo Rey", "Nuevo Horizontes", "S-56");
		
	    Persona p2=new Persona();
		
	    p2.setNombre("Derick2");
	    p2.setDireccion(dir2);
	    p2.imprimir();
	    
	    Persona p3=new Persona();
	    //manera mas abreviada de crear direccion mandando directo al set
	    p3.setDireccion(new Direccion("xx","yy","d-98"));
	    p3.imprimir();
	}

}
