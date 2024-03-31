package com.krakedev.inventario.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.krakedev.inventario.entidades.Categoria;
import com.krakedev.inventario.entidades.Producto;
@Path("productos")
public class ServiciosProducto {

	
	@Path("insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Producto producto) {
		
		System.out.println(">>>>>"+producto);
	}
	

	@Path("actu")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizar(Producto producto) {
		System.out.println("ACTUALIZADO>>>>>"+producto);
		
	}
	
	@Path("recuperar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	
	public ArrayList<Producto> recuperarTodos(){
		
		ArrayList<Producto> produ=new ArrayList<Producto>();
		
		Categoria c1 = new Categoria("CAT1",001);
		Categoria c2 = new Categoria("CAT2",002);
		Categoria c3 = new Categoria("CAT3",003);
		Producto p1 = new Producto("123","Dorito",c1,2.3,3);
		Producto p2 = new Producto("567","Rufles",c2,2.5,3);
		Producto p3 = new Producto("888","Chitos",c3,3.3,3);

		produ.add(p1);
		produ.add(p2);
		produ.add(p3);

		
		
		return produ;
	}
}
