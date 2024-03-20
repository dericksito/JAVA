package com.cmc.evaluacion;

public class Clientes {
private String cedula,nombre,apellido;


public Clientes(String cedula, String nombre, String apellido) {
	this.cedula = cedula;
	this.nombre = nombre;
	this.apellido = apellido;
}

public void mostrarClientes() {
    System.out.println("Información de Clientes:");
    System.out.println("Cédula: " + getCedula());
    System.out.println("Nombre: " + getNombre());
    System.out.println("Apellido: " + getApellido());
}



public String getCedula() {
	return cedula;
}

public void setCedula(String cedula) {
	this.cedula = cedula;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}


}
