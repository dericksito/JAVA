package com.krakedev.conexionbdd;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFecha {

	public static void main(String[] args) {
		//Date - java.unitl.Date
		//Date -java.sql.Date
		
		//convertir a String a java.utilDate

		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");//quiro que la fecha me llegue en este formato
		String fechaStr="2020/03/22 10:05:04";//time. aqui agregamos la hora en el formato y el string para recuperarlo y mostrarlo abajo
		try {
			Date fecha=sdf.parse(fechaStr);//esta conversion como es parse llega en el Date del paquete de java 
			//esto sirve para que si me llega algo que no es una fecha me da una excepcion
			System.out.println(fecha);
			//realizamos la convercion a milis para pasarlo a DAte sql// el long es para guardar un entero de mayor tamano
			long fechaMilis=fecha.getTime();
			//cramos un java.sqlDate, partiendo de mi java.utilDate
			java.sql.Date fechaSQL=new java.sql.Date(fechaMilis);
			System.out.println(fechaSQL);
			
			
			//ahora para la hora 
			Time timeSQL=new Time(fechaMilis);//con el time podemos reciclar lo obtenido de fechaMilis para sacar la hora 
			//simplemente agregamos al formato de la fehca los datos de la hora y ya nos aparecera
			System.out.println(timeSQL);
			
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
	}

}
