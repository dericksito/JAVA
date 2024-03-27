package com.krakedev.excepciones;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("imicio");
		String a=null;
		
		try {//estructura de un try chatch
			a.substring(3);//aqui se envuelve a la excepcion para que el programa no se caiga
			System.out.println("fin");
		}catch(Exception ex) {//aqui va exception
			System.out.println("Entra al chatch");//al saltar el error sigue con el programa ejecutando lo que sigue en el chatch
			//esto nos ayuda a que podamos trabajar pero el error sigue ahi solo lo envuelve para que el programa se ejecute

		}finally {//;uego del catch entra al finally antes de seguir con el programa
			System.out.println("Ingresa al finally");
		}
		
		//finally se ejecuta ocurra o no ocurra la excepcion 
		//nos va a ayudar cuando tengamos que cerrar algo si o si 
		

	}

}
