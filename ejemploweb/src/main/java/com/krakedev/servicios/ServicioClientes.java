package com.krakedev.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.krakedev.entidades.Cliente;

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
	public void insertar(Cliente cliente) {
		
		System.out.println(">>>>>"+cliente);
	}
	
	@Path("act")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)//aqui usamos consumes pq va a recibir un cliente en formato jeson
	public void actualizar(Cliente cliente) {
		
		System.out.println("ACTUALIZANDO>>>>>"+cliente);
	}
}
