package com.krakedev.persistencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.servicios.AdminPersonas;

public class ConexionBDD {
	
	private static final String DRIVER="org.postgresql.Driver";//CRAMOS CONSTANTES CON LOS DATOS DE CONEXION PQ SON FIJOS 
	private static final String  URL="jdbc:postgresql://localhost:5432/postgres";
	private static final String USUARIO="postgres";
	private static final String CLAVE="Yopesh06";
	private static final Logger LOGGER=LogManager.getLogger(ConexionBDD.class);
	//METODO PARA REALIZAR LA CONECCION A LA BASE DE DATOS Y RETORNA ESA CONEXION
public static Connection conectar()throws  Exception {//como estoy usando una exception aqui tiene que ir la firma de eso en este caso esta 
	Connection connection=null;
	try {
		Class.forName(DRIVER);
		connection=DriverManager.getConnection(URL,USUARIO,CLAVE);//Y LOS USAMOS AQUI ABAJO 
		LOGGER.debug("conexion exitosa");//solo saldra cuando este en debug para ayudarnos viendo en el archilo log
		
	} catch (ClassNotFoundException e) {
		
		LOGGER.error("Error en la infraestructura",e);
		throw new Exception("Error en la infraestructura");//estas excepciones van para mostrarle al usuario que algo fallo y se detenga ahi y no continue con el codigo
		
	}catch(SQLException e) {
		LOGGER.error("Error al concectarse revise usuario y clave",e);
		throw new Exception("Error al concectarse revise usuario y clave ");
	}
	return connection;
}

}
