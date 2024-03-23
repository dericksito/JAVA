package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;


import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

public class TestAlarmas {

	public static void main(String[] args) {
		Alarma al1=new Alarma(DiasSemana.LUNES,5,12);
		Alarma al2=new Alarma(DiasSemana.MARTES,3,17);
		Alarma al3=new Alarma(DiasSemana.MIERCOLES,4,42);
		Alarma al4=new Alarma(DiasSemana.JUEVES,8,56);
		Alarma al5=new Alarma(DiasSemana.VIERNES,7,32);
	
		
		AdminAlarmas agAL=new AdminAlarmas();
		
		agAL.agregarAlarma(al1);
		agAL.agregarAlarma(al2);
		agAL.agregarAlarma(al3);
		agAL.agregarAlarma(al4);
		agAL.agregarAlarma(al5);
		
		ArrayList<Alarma> alarm =agAL.getAlarmas();
		System.out.println(alarm);

	}

}
