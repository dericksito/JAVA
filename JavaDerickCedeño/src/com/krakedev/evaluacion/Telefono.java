package com.krakedev.evaluacion;

public class Telefono {
private String numero,tipo,estado;

public Telefono(String numero ,String tipo) {
	this.numero=numero;
	this.tipo=tipo;
	

	
	if(numero!=null && tipo!=null) {
		this.estado="C";
	}else {
		this.estado="E";
	}
	
	if(tipo=="Movil" && numero !=null) {
		this.estado="C";
	}else if(tipo=="Convencional" && numero !=null) {
		this.estado="C";
	}else {
		this.estado="E";
	}
	
	 if (numero != null) {
         if (tipo=="Movil" && numero.length() != 10) {
             System.out.println("Advertencia: El número de teléfono móvil debe tener 10 caracteres.");
             this.numero = null;
         } else if (tipo=="Convencional" && numero.length() != 7) {
             System.out.println("Advertencia: El número de teléfono convencional debe tener 7 caracteres.");
             this.numero = null;
         } else {
             this.numero = numero;
         }
     } else {
    	 
         System.out.println("Advertencia: El número de teléfono es null.");
     }
}

public String getNumero() {
	return numero;
}

public String getTipo() {
	return tipo;
}

public String getEstado() {
	return estado;
}


}
