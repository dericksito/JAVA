package com.krakedev.proyecto.servicios;

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
import com.krakedev.proyecto.entidades.Estudiantes;
import com.krakedev.proyecto.utils.ConexionBD;

public class AdminEstudiantes {
	private static final Logger LOGGER=LogManager.getLogger(AdminEstudiantes.class);
	
	public static void insertar(Estudiantes estudiante) throws Exception{
		Connection con=null;
		PreparedStatement ps;
		
		try {
			con=ConexionBD.conectarBDD();
			ps=con.prepareStatement("insert into  estudiantes (cedula, nombre, apellido, email,fecha_nacimiento,codigo_profesor)"
					+ "values(?,?,?,?,?,?)");
			
			ps.setString(1, estudiante.getCedula());
			ps.setString(2, estudiante.getNombre());
			ps.setString(3, estudiante.getApellido());
			ps.setString(4, estudiante.getEmail());
			ps.setDate(5, new java.sql.Date(estudiante.getFecha_nacimiento().getTime()));
			ps.setInt(6, estudiante.getCodigo_profesor().getCodigo());
			
			ps.executeUpdate();
		} catch (Exception e) {
			
			LOGGER.error("Ërror al insertar",e);
			throw new Exception ("error al insertar ");
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
	
		public static void actualizar(Estudiantes estudiante )throws Exception {
			Connection con=null;
			PreparedStatement ps;
			
		  try {
			con=ConexionBD.conectarBDD();
			
			ps=con.prepareStatement("UPDATE estudiantes set nombre=?,apellido=?,email=?,fecha_nacimiento=?,codigo_profesor=? WHERE cedula=?");
			
			ps.setString(1, estudiante.getNombre());
			ps.setString(2,estudiante.getApellido());
			ps.setString(3,estudiante.getEmail());
			ps.setDate(4,new java.sql.Date(estudiante.getFecha_nacimiento().getTime()));
			ps.setDouble(5,estudiante.getCodigo_profesor().getCodigo());
			ps.setString(6, estudiante.getCedula());
			
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
				con=ConexionBD.conectarBDD();
				ps=con.prepareStatement("Delete from estudiantes WHERE cedula=?");
				
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
		
		
		
		public static ArrayList<Estudiantes> buscarPorCedula(String cedulaBusqueda)throws Exception{
			ArrayList<Estudiantes> estudiante=new ArrayList<Estudiantes>();
			Connection con=null;
			PreparedStatement ps;
			ResultSet rs=null;
			
			try {
				
				con=ConexionBDD.conectar();
				
				ps=con.prepareStatement("select * from estudiantes where cedula=?");
				ps.setString(1, cedulaBusqueda);
				rs=ps.executeQuery();
				
				if(rs.next()) {
					String cedula=rs.getString("cedula");
					
					Estudiantes est=new Estudiantes();
					est.setCedula(cedula);
					estudiante.add(est);
					
				}else {
					return null;
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
		            }finally {
						try {
							con.close();
						} catch (SQLException e) {
							
							LOGGER.error("error con la base de datos",e);
				            throw new Exception("error con la base de datos");		
				            }

						
					}

				
			
			
			
			
			
		
		}
			return estudiante;
	}
		
		
		
		public static ArrayList<Estudiantes> buscarPorNombre(String nombreBusqueda)throws Exception{
			ArrayList<Estudiantes> estudiante=new ArrayList<Estudiantes>();
			Connection con=null;
			PreparedStatement ps;
			ResultSet rs=null;
			
			try {
				
				con=ConexionBDD.conectar();
				
				ps=con.prepareStatement("select * from estudiantes where nombre like ?");
				ps.setString(1, "%"+nombreBusqueda+"%");
				rs=ps.executeQuery();
				
			while(rs.next()){
				String cedula=rs.getString("cedula");
				String nombre=rs.getString("nombre");
				String apellido=rs.getString("nombre");
				
				Estudiantes estu=new Estudiantes();
				estu.setCedula(cedula);
				estu.setNombre(nombre);
				estu.setApellido(apellido);
				estudiante.add(estu);
				
				
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
		            }finally {
						try {
							con.close();
						} catch (SQLException e) {
							
							LOGGER.error("error con la base de datos",e);
				            throw new Exception("error con la base de datos");		
				            }

						
					}

				
			
			
			
			
			
		
		}
			return estudiante;
	}
		
		
	
	
}
