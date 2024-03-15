package com.krakedev;

public class TestePersona {

	public static void main(String[] args) {

		// dentro del main se crean los objetos

		Persona p;// paso 1:para crear objetos tenemos que crear una variable de tipo persona
		Persona p2 = new Persona();

		p = new Persona();// 2. crea el objeto y referenciarlo a p

		// 3.acceder a los atributos
		System.out.println("nombre: " + p.nombre);// asi se imprime en pantalla
		System.out.println("edad: " + p.edadPersona);
		System.out.println("estatura: " + p.estatura);

		// 4.Modificar atributos
		p.nombre = "Derick";
		p.edadPersona = 18;
		p.estatura = 1.70;

		System.out.println("-----------------");
		// 5.acceder a los atributos
		System.out.println("nombre: " + p.nombre);
		System.out.println("edad: " + p.edadPersona);
		System.out.println("estatura: " + p.estatura);

		// modificar p2
		p2.nombre = "Angeline";
		System.out.println("-----------------");
		System.out.println("p.nonmbre: " + p.nombre);
		System.out.println("p.nomnre: " + p2.nombre);
	}

}
