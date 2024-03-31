package com.krakedev.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.krakedev.entidades.Cliente;
import com.krakedev.excepciones.KrakedevException;
import com.krakedev.persistencia.ClientesBDD;

@Path("customers")
public class ServicioClientes {

	@Path("m1")
	@GET
	public String saludar() {
		
		return "Hola mundo Rest Web Servics";
	}
	
	@Path("mbuscar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)//aqui usamos produces pq nos va a devolver un cliente en este formato json  
	public Cliente buscar() {
		
		Cliente cliente =new Cliente("0850983420","Derick");
		return cliente;
	}
	
	@Path("insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)//aqui usamos consumes pq va a recibir un cliente en formato jeson
	public Response insertar(Cliente cliente) {
		
		System.out.println(">>>>>"+cliente);
		ClientesBDD cli=new ClientesBDD();
		try {
			cli.insertar(cliente);
			return Response.ok().build();//con esto devolvemos un 200 diciendo que todo esta bien 
		} catch (KrakedevException e) {
			
			e.printStackTrace();
			return Response.serverError().build();//nos da un error 500 para el postman
		}
	}
	
	@Path("act")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)//aqui usamos consumes pq va a recibir un cliente en formato jeson
	public Response actualizar(Cliente cliente) {
		
		System.out.println("ACTUALIZANDO>>>>>"+cliente);
		ClientesBDD cli=new ClientesBDD();
		
		try {
			cli.actualizar(cliente);
			return Response.ok().build();
		} catch (KrakedevException e) {
			
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
}
