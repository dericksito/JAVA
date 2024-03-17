package com.cmc.repaso.entidades;

public class Producto {
private String nombre;
private double precio;

public Producto(String nombre,double precio) {
	this.nombre=nombre;
	this.precio=precio;
}

public double calcularPrecioPromo(double porcentaje) {
	double descuento;
	
	descuento=(this.precio*porcentaje)/100;
	this.precio-=descuento;
	
	return precio;
	
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
	
	if(precio<0) {
			this.precio=precio*-1;
			System.out.println("El valor no puede ser negativo, se convirtio a positivo");
	}else {
		this.precio=precio;
	}
}


}
