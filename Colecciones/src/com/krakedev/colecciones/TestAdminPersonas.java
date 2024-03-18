package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		AdminPersonas admin=new AdminPersonas();
		
		admin.agregar(new Persona("Derick","Tenorio",18));
		admin.agregar(new Persona("Flash","Allen",23));
		admin.agregar(new Persona("Iris","Allen",67));
		
		admin.imprimir();
		

		
		Persona p1=admin.buscarPorNombre("PEPE");
		
		if(p1!=null) {
			System.out.println("ENCONTRADO: "+p1.getApellido()+" "+p1.getEdad());

		}else {
			System.out.println("No esxiste esta persona ");
		}
		
		ArrayList<Persona> personasMayores=admin.buscarMayores(25);
		
		System.out.println(personasMayores.size());//uso el size para mostrar la cantidad de personas del array qeue quiero ver 
		
	}
	


}
