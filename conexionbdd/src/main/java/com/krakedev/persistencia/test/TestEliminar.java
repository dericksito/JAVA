package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestEliminar {

	public static void main(String[] args) {
		try {
			AdminPersonas.eliminar("178987654");
		} catch (Exception e) {
			System.out.println("Error del sistema: "+e.getMessage());
		}
	}

}
