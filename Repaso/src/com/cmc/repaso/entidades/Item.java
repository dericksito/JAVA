package com.cmc.repaso.entidades;

public class Item {
 
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;
	
	public void imprimir() {
		System.out.println("Nombre: " + getNombre()  + "\nProductos Actuales: " + getProductosActuales() + "\nProductos Devueltos: " + getProductosDevueltos() + "\nProductos Vendidos: " + getProductosVendidos());
	}

	public void vender(int productosVendidos) {
		this.productosVendidos=productosVendidos;
		
		this.productosActuales -= productosVendidos;
		
		
	}
	
	public void devolver (int productosVendidos) {
		this.productosVendidos=productosVendidos;
		
		this.productosActuales += productosVendidos;
		this.productosVendidos-= productosVendidos;
		this.productosDevueltos+=productosVendidos;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getProductosActuales() {
		return productosActuales;
	}

	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}

	public int getProductosDevueltos() {
		return productosDevueltos;
	}

	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}

	public int getProductosVendidos() {
		return productosVendidos;
	}

	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}
	
	
}
