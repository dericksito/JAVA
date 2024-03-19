package Krakedev.entidades;

public class Nota {
private Materia materia;
private double calificacion;

public void mostrar() {
	System.out.println("Codigo="+materia.getCodigo()+", Nombre="+materia.getNombre()+", Calificion="+getCalificacion());
}

public Materia getMateria() {
	return materia;
}
public void setMateria(Materia materia) {
	this.materia = materia;
}
public double getCalificacion() {
	return calificacion;
}
public void setCalificacion(double calificacion) {
	this.calificacion = calificacion;
}




}
