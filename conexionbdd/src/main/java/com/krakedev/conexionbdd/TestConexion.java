package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {
		Connection connection=null;//1.primero creamos una variable de tipo conecction
	PreparedStatement ps;//2.R nos creamos una variable de este tipo para guardar el retorno 
		try {
			Class.forName("org.postgresql.Driver");//0.de esta manera se registra el driver para poder empezar con la conexion
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Yopesh06");//2.a la variable darle esta estructura de coneccion y agregar los parametros estos "link,usuario,contrasena"
			System.out.println("conexion establecida");
			
			ps=connection.prepareStatement("insert into  personas (cedula, nombre, apellido,   estado_civil_codigo,numero_hijos,estatura,cantidad_ahorrada,fecha_nacimiento,hora_nacimiento)"
					+ "values(?,?,?,?,?,?,?,?,?)");
					//para insertar registros/1.con nuestra variable de coneccion llamamos a este metodo y ponemos el insert
			
			ps.setString(1, "178098399");//2.R aqui para agregarla info del insert vemos que tipo de dato tiene en este caso son puros char entonces aqui serian Strings y usamos el set de String
			//ponemos la posicion del que queremos en este caso el primer ? que es cedula
			
			ps.setString(2, "Pablo");//y asi con todos 
			ps.setString(3, "Plaza");
			ps.setString(4, "S");
			ps.setInt(5, 2);//este es para ingresar enteros en este caso lo hijos
			ps.setDouble(6, 1.56);
			ps.setBigDecimal(7, new BigDecimal(1200.34));//para insertar money aqui en java se usa BigDecimal  de esta manera
			
			
			
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr="2020/03/22 10:05:04";
			try {
				Date fecha=sdf.parse(fechaStr);
			
				System.out.println(fecha);
		
				long fechaMilis=fecha.getTime();
				
				java.sql.Date fechaSQL=new java.sql.Date(fechaMilis);
				System.out.println(fechaSQL);
				
				
				//ahora para la hora 
				Time timeSQL=new Time(fechaMilis);
				System.out.println(timeSQL);
				
				ps.setDate(8, fechaSQL);
				ps.setTime(9, timeSQL);
				
				ps.executeUpdate();//esto es para ejecutar y en este caso para ejecutar en insert como en bdd

				System.out.println("Ejecutar insert");
			} catch (ParseException e) {
				
				e.printStackTrace();
			}
			
			
			
			
			
			
			
			
	
		} catch (ClassNotFoundException | SQLException e) {//3. aqui agregamos la excepcion que nos manda para que el cacth agarre la anterior o esta la que le salga y eso es con el |
			
			e.printStackTrace();
		}
		

	}

}
