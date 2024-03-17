package com.krakedev.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto produ=new Producto(12345,"Papitas");
		
		produ.setDescripcion("Rufless");
		produ.setPeso(56.8);
		
		System.out.println("-----PRODUCTOS AGREGADOS------");
		System.out.println("Codigo: "+produ.getCodigo());
		System.out.println("Nombre: "+produ.getNombre());
		System.out.println("Descripcion: "+produ.getDescripcion());
		System.out.println("Peso: "+produ.getPeso());
		
	

	}

}
