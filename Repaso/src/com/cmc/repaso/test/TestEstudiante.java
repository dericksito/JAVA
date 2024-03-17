package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante n=new Estudiante("Derick");
		
		n.calificar(10);
		
		System.out.println("Asignacion de nota: "+n.getResultado());
	}

}
