package com.krakedev.estaticos.ejercicio.utils;

public class Util {

	
	public static String formatearHora(int valor) {
		String hora = ""+valor;
		
		if(hora.length()==1) {
			return 0+hora;
			
		}
		return hora;
	}
	
	public static String formatearDia(int valor) {
		
		if(valor==DiasSemana.LUNES) {
			return "Lunes";
		}else if(valor==DiasSemana.MARTES) {
			return "Martes";
		}else if(valor==DiasSemana.MIERCOLES) {
			
			return "Miercoles";
		}else if (valor==DiasSemana.JUEVES) {
			return "Jueves";
		}else if (valor==DiasSemana.VIERNES) {
			return "Viernes";
		}else if (valor==DiasSemana.SABADO) {
			return "Sabado";
		}else if (valor==DiasSemana.DOMINGO) {
			return "Domingo";
		}else {
			return null;
		}
		
		
			
	}
}
