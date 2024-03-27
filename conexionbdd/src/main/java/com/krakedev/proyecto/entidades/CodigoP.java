package com.krakedev.proyecto.entidades;

public class CodigoP {
private int codigo;
private String nombre;


public CodigoP(int codigo, String nombre) {
	super();
	this.codigo = codigo;
	this.nombre = nombre;
}

public CodigoP() {
	
	
}
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


}
