package com.krakedev.proyecto.test;

import java.util.Date;

import com.krakedev.proyecto.entidades.CodigoP;
import com.krakedev.proyecto.entidades.Estudiantes;
import com.krakedev.proyecto.servicios.AdminEstudiantes;
import com.krakedev.proyecto.utils.Convertir;

public class TestAdminEstudiantes {

	public static void main(String[] args) {
		CodigoP cg= new CodigoP(100,"Juan");
		Estudiantes est=new Estudiantes("0850983420","Abel","Carrazco","abelcarra@gmail.com",cg);
		
		try {
			Date fecha_nacimiento=Convertir.convertirFecha("2006/05/02");
			est.setFecha_nacimiento(fecha_nacimiento);
			
			AdminEstudiantes.insertar(est);
			System.out.println("insert agregado");
		} catch (Exception e) {
			
			System.out.println("error en el sistema: "+e.getMessage());
		}

	}

}
