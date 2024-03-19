package com.krakedev.test;

import com.krakedev.evaluacion.Contacto;
import com.krakedev.evaluacion.Direccion;

public class TestContacto {

	public static void main(String[] args) {
	    

        // Crear una instancia de Contacto
        Contacto contacto = new Contacto("1234567890", "Juan", "Pérez");
        
        Direccion Direccion = new Direccion("Av. siempre viva", "Calle 24");

        
       
        // Settear la dirección
        Direccion Direccion2 = new Direccion("Cdl del ejercito", "Pasaje 2B");
        contacto.setDireccion(Direccion2);

        // Mostrar información 
        System.out.println("\nInformación del Contacto:");
        System.out.println("Cedula: " + contacto.getCedula());
        System.out.println("Nombre: " + contacto.getNombre());
        System.out.println("Apellido: " + contacto.getApellido());
        System.out.println("Dirección: \nCalle Principal: " + Direccion.getCallePrincipal() + "\nCalle Secundaria: " + Direccion.getCalleSecundaria());
        contacto.imprimir();
        
        
    }
}

