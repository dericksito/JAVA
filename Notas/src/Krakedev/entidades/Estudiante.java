package Krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
private String nombre,apellido,cedula;
private ArrayList<Nota> notas = new ArrayList<Nota>();




public Estudiante(String nombre, String apellido, String cedula) {
	
	this.nombre = nombre;
	this.apellido = apellido;
	this.cedula = cedula;
	
}


public void agregarNota(Nota nuevaNota) {
	Nota elementoNota;
	boolean codigoRepetido=false;
	for (int i=0;i<notas.size();i++) {
		elementoNota=notas.get(i);
		if(elementoNota.getMateria().getCodigo().equals(nuevaNota.getMateria().getCodigo())) {
			codigoRepetido=true;
			break;
		}
	}


	boolean notaValida = nuevaNota.getCalificacion() >= 0 && nuevaNota.getCalificacion() <= 10;
	
	if(codigoRepetido || !notaValida) {
		System.out.println("No se puede agregar la nota. Verifique que el código de materia no se repita y que la nota esté en el rango válido de 0 a 10).");
	}else {
		notas.add(nuevaNota);
		System.out.println("Nota Agregada Correctamente");
	}
}


public void modificarNota(String codigo ,double nuevaNota) {
	boolean codigoEncontrado=false;
	
	
    if (nuevaNota < 0 || nuevaNota > 10) {
        System.out.println("Tu nota no está dentro del rango permitido de 0 a 10.");
        return; 
    }
	
	
	Nota elementoCodigo;
	for(int i=0;i<notas.size();i++) {
		elementoCodigo=notas.get(i);
		 
		if(elementoCodigo.getMateria().getCodigo().equals(codigo) ) {
			
			elementoCodigo.setCalificacion(nuevaNota);
			System.out.println("Nota modificada correctamente");
			codigoEncontrado=true;
			break;
			
		}
	}
	
	
	if(!codigoEncontrado) {
		 System.out.println("No se encontró ninguna nota con el código asignado.");
	}
}


public double calcularPromedioNotasEstudiante() {
	Nota elementoNotas;
	double promedio=0.0;
	double resultado;
	for(int i=0;i<notas.size();i++) {
		elementoNotas=notas.get(i);
		
		promedio+=elementoNotas.getCalificacion();
		
	}
	
	resultado=promedio/notas.size();
	return resultado;
}

public void mostrar() {
	System.out.println("Estudiante[Nombre="+getNombre()+", Apellido="+getApellido()+", Cedula="+getCedula()+"]");
	
	Nota elementoNota;
	for(int i=0;i<notas.size();i++) {
		elementoNota=notas.get(i);
		System.out.println("Materia[Nombre de materia="+elementoNota.getMateria().getNombre()+", Codigo="+elementoNota.getMateria().getCodigo()+", Calificacion="+elementoNota.getCalificacion()+"]");
	}
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
public String getCedula() {
	return cedula;
}
public void setCedula(String cedula) {
	this.cedula = cedula;
}
public ArrayList<Nota> getNotas() {
	return notas;
}
public void setNotas(ArrayList<Nota> notas) {
	this.notas = notas;
}





}
