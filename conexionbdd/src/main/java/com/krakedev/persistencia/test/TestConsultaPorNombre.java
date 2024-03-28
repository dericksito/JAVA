package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;



public class TestConsultaPorNombre {

	public static void main(String[] args) {
		try {
			ArrayList<Persona> persona=AdminPersonas.buscarPorNombre("a");
			
			System.out.println(persona);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
