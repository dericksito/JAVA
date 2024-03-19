package Krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> Estudiantes = new ArrayList<Estudiante>();
	
	
	public String buscarEstudiantePorCedula(Estudiante estudiante) {
		
		
		Estudiante elementoEstudiante;
		for(int i=0;i<Estudiantes.size();i++) {
			elementoEstudiante=Estudiantes.get(i);
			
			if(elementoEstudiante.getCedula().equals(estudiante.getCedula())) {
				System.out.println("El estudiante si se encuentra en un curso");
				break;
			}
			
		}
		
		return null;
	}
	
	public void matricularEstudiante(Estudiante estudiante) {
		String estado=buscarEstudiantePorCedula(estudiante);
		
		if(estado == null) {
			Estudiantes.add(estudiante);
			System.out.println("Matriculacion exitosa");
		}else {
			System.out.println("El Estudiante ya esta matriculado");
		}
		
	}
	
	public double calcularPromedioCurso() {
		double promedioC=0.0;
		Estudiante elementoCurso;
		double resultado;
		for(int i =0;i<Estudiantes.size();i++) {
			elementoCurso=Estudiantes.get(i);
			promedioC+=elementoCurso.calcularPromedioNotasEstudiante();
		}
		resultado=promedioC/Estudiantes.size();
		return resultado;
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return Estudiantes;
	}
	
	public void mostrar() {
		Estudiante elementoEstudiante;
		for(int i =0;i<Estudiantes.size();i++) {
			elementoEstudiante=Estudiantes.get(i);
			System.out.println("Nombre="+elementoEstudiante.getNombre()+", Apellido="+elementoEstudiante.getApellido()+", Cedula="+elementoEstudiante.getCedula());
		}
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		Estudiantes = estudiantes;
	}
	
	
	
	
	
}
