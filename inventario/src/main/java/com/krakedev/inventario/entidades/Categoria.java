package com.krakedev.inventario.entidades;

public class Categoria {

	private int codigo;
	private String nombre;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Categoria(String nombre,int codigo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	public Categoria() {
		
	}
	@Override
	public String toString() {
		return "Categoria [codigo=" + codigo + ", nombre=" + nombre + "]";
	}
	
	
	
}
