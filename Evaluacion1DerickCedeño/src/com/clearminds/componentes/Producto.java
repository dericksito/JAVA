package com.clearminds.componentes;

public class Producto {
	
	private String nombre;
	private String codigo;
	private double precio;
	


	public void incrementarPrecio(double porcentaje) {
		this.precio +=(this.precio*(porcentaje/100));
	}
	
	public void disminuirPrecio(double d) {
		this.precio -= d;
	}
	
	public Producto(String codigo,String nombre,double precio) {
		this.nombre=nombre;
		this.codigo=codigo;
		this.precio=precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	
}
