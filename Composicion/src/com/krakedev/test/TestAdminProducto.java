package com.krakedev.test;

import com.krakedev.composicion.AdminProducto;
import com.krakedev.composicion.Producto;

public class TestAdminProducto {

	public static void main(String[] args) {
		Producto mc;
		AdminProducto admin=new AdminProducto();

		Producto producto1=new Producto("Doritos",0.50);
		Producto producto2=new Producto("Pulpin",0.50);

		
		mc=admin.buscarMasCaro(producto1, producto2);
		//si son iguales pusimos que nos de null asi que con este if evitamos algun error para u qe no pase de aqui
		
		//pero caso contrario se ejecutara nuestro llamado
		if(mc==null) {
			System.out.println("Son iguales bro");
		}else {
			System.out.println("El mas caro es : "+mc.getNombre());

		}
	}

}
