package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Producto productoA=new Producto();
		Producto productoB=new Producto();
		Producto productoC=new Producto();
		
		//modificar productoA
		productoA.nombre="paracetamol";
		productoA.descripcion="cura todo xd";
		productoA.precio=2.5;
		productoA.stockActual=100;
		
		//modificar productoB
		productoB.nombre="vitamina C";
		productoB.descripcion="da energia";
		productoB.precio=1.5;
		productoB.stockActual=10;
		
		//modificar productoC
		productoC.nombre="curitas";
		productoC.descripcion="limpiar heridas";
		productoC.precio=5.5;
		productoC.stockActual=200;
		
	     System.out.println("PRODUCTO A-----------------");

	        System.out.println("nombre: "+productoA.nombre);
	        System.out.println("descripcion: "+productoA.descripcion);
	        System.out.println("precio: "+productoA.precio);
	        System.out.println("stockActual: "+productoA.stockActual);

	        
	        System.out.println("PROCUTO B-----------------");
	        
	        System.out.println("nombre: "+productoB.nombre);
	        System.out.println("descripcion: "+productoB.descripcion);
	        System.out.println("precio: "+productoB.precio);
	        System.out.println("stockActual: "+productoB.stockActual);
	        
	        
	        System.out.println("PROCUTO C-----------------");
	        
	        System.out.println("nombre: "+productoC.nombre);
	        System.out.println("descripcion: "+productoC.descripcion);
	        System.out.println("precio: "+productoC.precio);
	        System.out.println("stockActual: "+productoC.stockActual);
	        
	}

}
