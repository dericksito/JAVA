package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono t1 = new Telefono(10, "claro", "098830930");
		Telefono t2 = new Telefono(14, "claro", "0988870930");
		Telefono t3 = new Telefono(13, "claro", "0988340930");
		Telefono t4 = new Telefono(17, "movi", "0988560930");

		int op;

		AdminTelefono at = new AdminTelefono();

		op = at.contarClaro(t1, t2, t3,t4);

		System.out.println("La cantidad de telefonos con la operadora claro son: " + op);

	}

}
