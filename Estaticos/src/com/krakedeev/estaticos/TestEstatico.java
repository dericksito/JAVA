package com.krakedeev.estaticos;

public class TestEstatico {

	public static void main(String[] args) {

		//para invocar a un metodo estatico se hace directo de su clase y no hay que instanciar un objeto
		//los estaticos son parte de la clase no de los objetos
		double numero=Math.random();
		
		System.out.println(numero);
		
		int radio=10;
		double area=Math.PI*radio;
		System.out.println(area);
	}

}
