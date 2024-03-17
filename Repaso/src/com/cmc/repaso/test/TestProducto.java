package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto p=new Producto("Papas",5.3);
		
		p.setPrecio(-5.3);
		p.calcularPrecioPromo(12);
		
		System.out.println("Su precio con descuento es: "+p.getPrecio());
  
	}

}
