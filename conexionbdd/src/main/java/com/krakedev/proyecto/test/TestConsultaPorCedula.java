package com.krakedev.proyecto.test;

import java.util.ArrayList;

import com.krakedev.proyecto.entidades.Estudiantes;
import com.krakedev.proyecto.servicios.AdminEstudiantes;

public class TestConsultaPorCedula {

	public static void main(String[] args) {
		try {
			ArrayList<Estudiantes> estudiante=AdminEstudiantes.buscarPorCedula("178890123");
			
			System.out.println(estudiante);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
