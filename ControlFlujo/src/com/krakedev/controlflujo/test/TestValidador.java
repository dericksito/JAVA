package com.krakedev.controlflujo.test;

import com.krakedev.controlflujo.Validador;

public class TestValidador {

	public static void main(String[] args) {
		Validador validador=new Validador();
		validador.ValidarEdad(10);
		validador.ValidarEdad(20);
		validador.ValidarEdad(18);
		validador.ValidarEdad(16);
		validador.ValidarEdad(-3);

	}

}
