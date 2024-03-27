package com.krakedev.proyecto.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.utils.ConexionBDD;

public class ConexionBD {


	private static final String DRIVER="org.postgresql.Driver";
	private static final String  URL="jdbc:postgresql://localhost:5432/postgres";
	private static final String USUARIO="postgres";
	private static final String CLAVE="Yopesh06";
	private static final Logger LOGGER=LogManager.getLogger(ConexionBDD.class);
	//METODO PARA REALIZAR LA CONECCION A LA BASE DE DATOS Y RETORNA ESA CONEXION
public static Connection conectarBDD()throws  Exception {
	Connection connection=null;
	try {
		Class.forName(DRIVER);
		connection=DriverManager.getConnection(URL,USUARIO,CLAVE);
		LOGGER.debug("conexion exitosa");
		
	} catch (ClassNotFoundException e) {
		
		LOGGER.error("Error en la infraestructura",e);
		throw new Exception("Error en la infraestructura");
		
	}catch(SQLException e) {
		LOGGER.error("Error al concectarse revise usuario y clave",e);
		throw new Exception("Error al concectarse revise usuario y clave ");
	}
	return connection;
}
}
