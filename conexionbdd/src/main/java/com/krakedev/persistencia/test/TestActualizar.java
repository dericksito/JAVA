package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizar {

	public static void main(String[] args) {
		EstadoCivil ec=new EstadoCivil("C","Casado");
		Persona Pruebas = new Persona("178098399", "Pablo", "Plaza", ec);
		try {
			Date fechaNac = Convertidor.convertirFecha("2012/11/05");
			Date horaNac = Convertidor.convertirHora("20:08");
			Pruebas.setFechaNacimiento(fechaNac);
			Pruebas.setHoraNacimiento(horaNac);
			Pruebas.setCantidadAhorrada(new BigDecimal(1200.5));
			Pruebas.setNumeroHijos(3);
			AdminPersonas.actualizar(Pruebas);
		} catch (Exception e) {
			System.out.println("Error del sistema: "+e.getMessage());
		
		}

	}

}
