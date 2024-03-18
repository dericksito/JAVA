package com.cmc.directorio.entidades;

public class AdminTelefono {

	
	public void activarMensajeria(Telefono tele) {
		if(tele.getOperadora()=="movi") {
			tele.setTieneWhatsapp(true);
		}
		
	}
	
	public int contarMovi(Telefono n1,Telefono n2, Telefono n3) {
		
		int contador=0;
	//el equals nos sirve para comparar 2 objetos si son iguales o no 
		
	    if (n1.getOperadora().equals("movi")) {
            contador++;
        }
        if (n2.getOperadora().equals("movi")) {
            contador++;
        }
        if (n3.getOperadora().equals("movi")) {
            contador++;
        }
        
        return contador;
	}
	
	public int contarClaro(Telefono n1,Telefono n2, Telefono n3, Telefono n4) {
		
		int contador=0;
	
		
	    if (n1.getOperadora().equals("claro")) {
            contador++;
        }
        if (n2.getOperadora().equals("claro")) {
            contador++;
        }
        if (n3.getOperadora().equals("claro")) {
            contador++;
        }
        
        return contador;
	}
}
