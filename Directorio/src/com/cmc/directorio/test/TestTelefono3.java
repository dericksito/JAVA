package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono t1=new Telefono(12,"movi","0988890930");
		Telefono t2=new Telefono(14,"claro","098459930");
		Telefono t3=new Telefono(19,"movi","0988780930");
		
		int op;
		
		AdminTelefono at=new AdminTelefono();
		
		
		op=at.contarMovi(t1, t2, t3);
		
		System.out.println("La cantidad de telefonos con la operadora movi son: "+op);

	}

}
