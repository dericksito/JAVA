package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
private String cedula,nombre,apellido;
private Direccion direccion;
private ArrayList<Telefono> telefonos = new ArrayList<Telefono>();

public Contacto(String cedula,String nombre,String apellido) {
	this.cedula=cedula;
	this.nombre=nombre;
	this.apellido=apellido;
	

}


public ArrayList<Telefono> recuperarIncorrectos(){
	Telefono elementoTelefono;
	ArrayList<Telefono> errores = new ArrayList<Telefono>();
	for (int i=0;i<telefonos.size();i++) {
		elementoTelefono=telefonos.get(i);
		if(elementoTelefono.getEstado()=="E") {
			
			errores.add(elementoTelefono);
		}
		
	}
	return errores;
}

public void agregarTelefono(Telefono telefono1) {
	
	telefonos.add(telefono1);
	
}
	
public void mostrarTelefono() {
	Telefono elementoTelefono;
	for (int i=0;i<telefonos.size();i++) {
		elementoTelefono=telefonos.get(i);
		
		if(elementoTelefono.getEstado().equals("C")) {
			System.out.println("telefonos con estado 'C' ");
			System.out.println("Numero: "+elementoTelefono.getNumero()+"Tipo: "+elementoTelefono.getTipo());
			
		
		}
		
	}
	
}


public void imprimir() {
	
	
	System.out.println("*****"+getNombre()+" "+getApellido()+"************");
	
	if(getDireccion()!=null) {
		System.out.println("    Direccion: "+getDireccion().getCallePrincipal()+" y " +getDireccion().getCalleSecundaria());
	
	}else {
		System.out.println("    No tiene una direccion asociada");
	}
	
	
	//contacto 1
	
	//Tipo 1
	/*System.out.println("Cedula:"+getCedula());
	System.out.println("Nombre:"+getNombre());
	System.out.println("Apellido:"+getApellido());
	System.out.println("Direcion:");
	if(getDir()!=null) {
		System.out.println("    Calle Principal:"+getDireccion().getCallePrincipal());
		System.out.println("    Calle Secundaria:"+getDireccion().getCalleSecundaria());
	}else {
		System.out.println("    No tiene una direccion asociada");
	}*/
}


public ArrayList<Telefono> getTelefonos() {
	return telefonos;
}



public void setTelefonos(ArrayList<Telefono> telefonos) {
	this.telefonos = telefonos;
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

public Direccion getDireccion() {
	return direccion;
}

public void setDireccion(Direccion direccion) {
	this.direccion = direccion;
}


}
