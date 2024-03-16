package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Producto productoA=new Producto();
		Producto productoB=new Producto();
		Producto productoC=new Producto();
		
		//modificar productoA
		productoA.setNombre("paracetamol");
		productoA.setDescripcion("cura todo xd");
		productoA.setPrecio(2.5);
		productoA.setStockActual(100);
		
		//modificar productoB
		productoB.setNombre("VITAMINA C");
		productoB.setDescripcion("da energia");
		productoB.setPrecio(1.5);
		productoB.setStockActual(10);
		
		//modificar productoC
		productoC.setNombre("Gasas");
		productoC.setDescripcion("limpia heridas");
		productoC.setPrecio(5.5);
		productoC.setStockActual(200);
		
	     System.out.println("PRODUCTO A-----------------");

	        System.out.println("nombre: "+productoA.getNombre());
	        System.out.println("descripcion: "+productoA.getDescripcion());
	        System.out.println("precio: "+productoA.getPrecio());
	        System.out.println("stockActual: "+productoA.getStockActual());

	        
	        System.out.println("PROCUTO B-----------------");
	        
	        System.out.println("nombre: "+productoB.getNombre());
	        System.out.println("descripcion: "+productoB.getDescripcion());
	        System.out.println("precio: "+productoB.getPrecio());
	        System.out.println("stockActual: "+productoB.getStockActual());
	        
	        
	        System.out.println("PROCUTO C-----------------");
	        
	        System.out.println("nombre: "+productoC.getNombre());
	        System.out.println("descripcion: "+productoC.getDescripcion());
	        System.out.println("precio: "+productoC.getPrecio());
	        System.out.println("stockActual: "+productoC.getStockActual());
	        
	}

}
