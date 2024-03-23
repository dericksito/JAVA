package com.krakedev.estaticos.ejercicio.logica;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;

public class AdminAlarmas {
	private ArrayList<Alarma> alarmas=new ArrayList<Alarma>();
	
	
	public void agregarAlarma(Alarma alarmaNueva) {
		
		alarmas.add(alarmaNueva);
		
		
		
	}

	public ArrayList<Alarma> getAlarmas() {
		return alarmas;
	}

	
	
	

}
