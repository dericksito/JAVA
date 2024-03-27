package com.krakedev.proyecto.test;

import java.util.Date;
import com.krakedev.proyecto.entidades.CodigoP;
import com.krakedev.proyecto.entidades.Estudiantes;
import com.krakedev.proyecto.servicios.AdminEstudiantes;
import com.krakedev.proyecto.utils.Convertir;

public class TestActualizar {

	public static void main(String[] args) {
		CodigoP profesor = new CodigoP(102,"Pedro");
		Estudiantes estudiante = new Estudiantes("0814785236","Santiago","Valencia","lasantival@gmail.com",profesor);
		try {
			Date fechaEstudiante = Convertir.convertirFecha("2007/12/12");
			estudiante.setFecha_nacimiento(fechaEstudiante);
			AdminEstudiantes.actualizar(estudiante);
			System.out.println("actualizacion exitosa");
		} catch (Exception e) {
			System.out.println("Error del sistema: "+e.getMessage());
		}

	}

}
