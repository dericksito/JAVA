package com.krakedev;

public class TestePersona {

	public static void main(String[] args) {

		// dentro del main se crean los objetos

		Persona p;// paso 1:para crear objetos tenemos que crear una variable de tipo persona
		Persona p2 = new Persona();
		
		Persona p4=new Persona("Vicente",18,1.70); 
		// 9.acceder a los atributos
				System.out.println("nombre: " + p4.getNombre());
				System.out.println("edad: " + p4.getEdadPersona());
				System.out.println("estatura: " + p4.getEstatura());

		
		p = new Persona();// 2. crea el objeto y referenciarlo a p

		// 3.acceder a los atributos
		System.out.println("nombre: " + p.getNombre());// asi se imprime en pantalla
		System.out.println("edad: " + p.getEdadPersona());
		System.out.println("estatura: " + p.getEstatura());

		// 4.Modificar atributos
		p.setNombre ("Derick");
		p.setEdadPersona (18);
		p.setEstatura (1.70);

		System.out.println("-----------------");
		// 5.acceder a los atributos
		System.out.println("nombre: " + p.getNombre());
		System.out.println("edad: " + p.getEdadPersona());
		System.out.println("estatura: " + p.getEstatura());

		// modificar p2
		p2.setNombre ("Angeline");
		System.out.println("-----------------");
		System.out.println("p.nonmbre: " + p.getNombre());
		System.out.println("p.nomnre: " + p2.getNombre());
	}

}
