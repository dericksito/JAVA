package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestCuentas {

	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement ps;
		try {
			Class.forName("org.postgresql.Driver");
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Yopesh06");
			System.out.println("coneccion establecida bro");
			
			ps=connection.prepareStatement("insert into cuentas(numero_cuenta,cedula_propietario,fecha_creacion,saldo)"
					+ "values(?,?,?,?)");
			
			ps.setString(1, "14344");
			ps.setString(2, "09509");
			ps.setBigDecimal(4, new BigDecimal(900.00));
			
			
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
			String fechai="2023/08/24";
			
			
			try {
				Date fecha = sdf.parse(fechai);
				 long fechaMilis=fecha.getTime();
				 
				 java.sql.Date fechaSQL=new java.sql.Date(fechaMilis);
				 System.out.println(fechaSQL);
				 
				 ps.setDate(3, fechaSQL);
				 
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
