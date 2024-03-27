package com.krakedev.proyecto.test;

import com.krakedev.proyecto.servicios.AdminEstudiantes;

public class TestEliminar {
	public static void main(String[] args) {
		try {
			AdminEstudiantes.eliminar("0804514875");
		} catch (Exception e) {
			System.out.println("Error del sistema: "+e.getMessage());
		}
	}

}
