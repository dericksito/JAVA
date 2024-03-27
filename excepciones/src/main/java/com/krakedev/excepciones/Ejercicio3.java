package com.krakedev.excepciones;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ejercicio3 {
	private static Logger  LOGGER = LogManager.getLogger(Ejercicio3.class);

	
	public void metodo1() {
		String a=null;
		try {
			
			
			a.substring(0);
		}catch(Exception ex) {
			
			System.out.println("Error");
			LOGGER.error("error al obtener la subcadena",ex);//mostrar este lloger error para que nos muestre donde esta el error y poder resolverr
			//se le pasa el mensaje a mostrar y la variable de la excepcion para uqe muestre donde esta el error
		}
			
	}
	public static void main(String[] args) {
		Ejercicio3 ej3=new Ejercicio3();
		
		ej3.metodo1();
	}
}
