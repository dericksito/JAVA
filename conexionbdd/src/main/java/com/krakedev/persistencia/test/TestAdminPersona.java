package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

//solo podremos usar sysout en test esta prohibido para los demas
public class TestAdminPersona {

	public static void main(String[] args) {
		EstadoCivil ec=new EstadoCivil("U","Union libre");
		Persona p=new Persona("1709834202","Julio","Jaramillo",ec);
		try {
			Date fechaNacimiento=Convertidor.convertirFecha("2000/12/23");
			Date horaNacimiento=Convertidor.convertirHora("09:23");
			p.setFechaNacimiento(fechaNacimiento);
			p.setHoraNacimiento(horaNacimiento);
			p.setCantidadAhorrada(new BigDecimal(1230.45));
			p.setNumeroHijos(50);
			AdminPersonas.insertar(p);
			System.out.println("insert agregado");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			System.out.println("error en el sistema: "+e.getMessage());
		}
		

	}

}
