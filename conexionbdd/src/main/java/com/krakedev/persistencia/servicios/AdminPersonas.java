package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
	private static final Logger LOGGER=LogManager.getLogger(AdminPersonas.class);//comstante de loggers conectado a mi clase para los errores 

	public static void insertar(Persona persona) throws Exception{
		Connection con=null;
		PreparedStatement ps;
		LOGGER.trace("Persona a insertar>>>"+persona);//si esta en el nivel trace me aparecera esta informacion --no immporta mucho
		try {
			con=ConexionBDD.conectar();
			
			 
			 ps=con.prepareStatement("insert into  personas (cedula, nombre, apellido,   estado_civil_codigo,numero_hijos,estatura,cantidad_ahorrada,fecha_nacimiento,hora_nacimiento)"
						+ "values(?,?,?,?,?,?,?,?,?)");
				
				ps.setString(1, persona.getCedula());
		
				
				ps.setString(2, persona.getNombre());
				ps.setString(3, persona.getApellido());
				ps.setString(4, persona.getEstadoCivil().getCodigo());
				ps.setInt(5, persona.getNumeroHijos());
				ps.setDouble(6, persona.getEstatura());
				ps.setBigDecimal(7, persona.getCantidadAhorrada());
				ps.setDate(8, new java.sql.Date(persona.getFechaNacimiento().getTime()));//en la insercion estos Datos son de sql pero necesitamos refereciar de java util asi que lo instanciamos 
				//y lo convertimos a sql eso que referenciamos usandfo el get time SIEMPRE
				ps.setTime(9, new Time(persona.getHoraNacimiento().getTime()));
				
				ps.executeUpdate();
			
		} catch (Exception e) {
			//logeamos el error
			LOGGER.error("error al insertar ",e);
			//mostrar el eror al usuario
			
			throw new Exception ("error al insertar ");//asi propagamos el error e igual se le muestra al usuario solo si es Exepction e osea es una misma excpcion se puede propagar
			
		
		}finally {//cerramos conexion en el finally pq este siempre se ejecuta despues del try este bien o mal 
			//cerramos conexion 
			try {
				con.close();//este es para cerrar la conexion
			} catch (SQLException e) {
				
				LOGGER.error("error con la base de datos",e);
                throw new Exception("error con la base de datos");		//aqui no la propago pq es una exepcion diferente entonces me creo una y mando al usuario
                }
		}
       
		
		
		 
	}
	
	
	//METODO PARA ACTUALIZAR
	
	public static void actualizar(Persona persona )throws Exception {
		Connection con=null;
		PreparedStatement ps;
		
	  try {
		con=ConexionBDD.conectar();
		
		ps=con.prepareStatement("UPDATE person set nombre=?,apellido=?,estado_civil=?,numero_hijos=?,estatura=?,cantidad_ahorrada=?,fecha_nacimiento=?,hora_nacimiento=? WHERE cedula=?");
		
		ps.setString(1, persona.getNombre());
		ps.setString(2,persona.getApellido());
		ps.setString(3,persona.getEstadoCivil().getCodigo());
		ps.setInt(4,persona.getNumeroHijos());
		ps.setDouble(5,persona.getEstatura());
		ps.setBigDecimal(6, persona.getCantidadAhorrada());
		ps.setDate(7,new java.sql.Date(persona.getFechaNacimiento().getTime()));
		ps.setTime(8, new Time(persona.getHoraNacimiento().getTime()));
		ps.setString(9, persona.getCedula());
		
		ps.executeUpdate();
	} catch (Exception e) {
		
		LOGGER.error("Error en la actualizacion",e);
		throw e;
	}finally {
		try {
			con.close();
		} catch (SQLException e) {
			
			LOGGER.error("error con la base de datos",e);
            throw new Exception("error con la base de datos");		
            }

		
	}
	}
	
	
	
	
	
	
	
	public static void eliminar(String cedula) throws Exception{
		Connection con=null;
		PreparedStatement ps;
		
		try {
			con=ConexionBDD.conectar();
			ps=con.prepareStatement("DELETE FROM PERSONAS WHERE cedula=?");
			
			ps.setString(1, cedula);
			
			ps.executeUpdate();
		} catch (Exception e) {
			
			LOGGER.error("error en la eliminacion");
			throw e;
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				
				LOGGER.error("error con la base de datos",e);
	            throw new Exception("error con la base de datos");		
	            }

			
		}
		
		
	}
	
	
	
	public static ArrayList<Persona> buscarPorNombre(String nombreBusqueda)throws Exception{
		ArrayList<Persona> personas=new ArrayList<Persona>();
		Connection con=null;
		PreparedStatement ps;
		ResultSet rs=null;
		
		try {
			
			con=ConexionBDD.conectar();
			
			ps=con.prepareStatement("select * from personas where nombre like ?");
			ps.setString(1, "%"+nombreBusqueda+"%");
			rs=ps.executeQuery();
			
			while (rs.next()) {
				String nombre=rs.getString("nombre");
				String cedula=rs.getString("cedula");
				
				Persona p=new Persona();
				p.setNombre(nombre);
				p.setCedula(cedula);
				personas.add(p);
				
			}
			
			
		}catch (Exception e) {
			
			LOGGER.error("error en la eliminacion");
			throw e;
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				
				LOGGER.error("error con la base de datos",e);
	            throw new Exception("error con la base de datos");		
	            }

			
		
		
		
		
		
	
	}
		return personas;
}
}
