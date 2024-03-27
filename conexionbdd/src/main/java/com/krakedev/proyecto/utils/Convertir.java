package com.krakedev.proyecto.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.utils.Convertidor;

public class Convertir {
	private static final String  FORMATO_FECHA="yyyy/MM/dd";
	private static final String  FORMATO_HORA="hh:mm";
	private static final Logger LOGGER=LogManager.getLogger(Convertidor.class);
	
	
	
	public static Date convertirFecha(String fechaStr) throws Exception {
	
		Date fechaDate=null;
		SimpleDateFormat sdf=new SimpleDateFormat(FORMATO_FECHA);
		try {
			fechaDate =sdf.parse(fechaStr);
		} catch (ParseException e) {
			
			LOGGER.error("La fecha no tiene un formato correcto"+fechaStr,e);
			throw new Exception("La fecha no tiene un formato correcto"+fechaStr);
		}
		return fechaDate;
	}
	
	
	public static Date convertirHora(String horaStr) throws Exception {//lo convierto en DAte pq es el timo de dato que tenemos en entidad
		
		Date horaDate=null;
		SimpleDateFormat sdf=new SimpleDateFormat(FORMATO_HORA);
		try {
			horaDate =sdf.parse(horaStr);
		} catch (ParseException e) {
			
			LOGGER.error("La hora no tiene un formato correcto"+horaStr,e);
			throw new Exception("La hora no tiene un formato correcto"+horaStr);
		}
		return horaDate;
	}
}
