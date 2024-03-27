package com.krakedev.conexionbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestEstudiante {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps;
		
		try {
			Class.forName("org.postgresql.Driver");
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Yopesh06");
			System.out.println("coneccion establecida");
			
			ps=connection.prepareStatement("insert into  estudiantes (cedula, nombre, apellido, email, fecha_nacimiento, codigo_profesor)"
					+ "values(?,?,?,?,?,?)");
			
			ps.setString(1, "1700001099");
			ps.setString(2, "Lajose");
			ps.setString(3, "Paez");
			ps.setString(4, "lajosepaez@gmail.com");
			ps.setInt(6, 100);
			
			
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
			String fechaN="2000/05/15";
			
			try {
				Date fecha =sdf.parse(fechaN);
				long fechaMilis=fecha.getTime();
				
				java.sql.Date fechaSQL=new java.sql.Date(fechaMilis);
				
				
				ps.setDate(5, fechaSQL);
				
				ps.executeUpdate();
				System.out.println("insert ejecutado");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
