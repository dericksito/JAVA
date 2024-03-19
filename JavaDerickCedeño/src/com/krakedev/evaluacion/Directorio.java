package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
private ArrayList<Contacto> contactos =new  ArrayList<Contacto>(),correctos = new ArrayList<Contacto>(),incorrectos = new ArrayList<Contacto>();;

private Date fechaModificacion;

public boolean agregarContacto(Contacto cont) {
	Contacto elemento;
	for(int i=0;i<contactos.size();i++) {
		elemento=contactos.get(i);
		if(elemento.getCedula().equals(cont.getCedula())) {
			return false;
		}
	}
	contactos.add(cont);
	
	return true;
	
	
}

public Contacto buscarPorCedula(String cod) {
	Contacto elemento;
	for(int i=0;i<contactos.size();i++) {
		elemento=contactos.get(i);
		if(elemento.getCedula().equals(cod)) {
			return elemento;
		}
	}
	return null;
}

public String consultarUltimaModificacion() {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date fecha = new Date();
	String fechaFormateada = sdf.format(fecha);
	return fechaFormateada;
}

public int contarPerdidos() {
	int contador=0;
	Contacto elemento;
	for(int i=0;i<contactos.size();i++) {
		elemento=contactos.get(i);
		if(elemento.getDireccion()==null) {
			contador++;
		}
	}
	return contador;
}
public int contarFijos() {
int contador = 0;
Contacto elemento;
for (int i=0;i<contactos.size();i++) {
	elemento=contactos.get(i);
	ArrayList<Telefono> telefonos = elemento.getTelefonos();
    for (Telefono telefono : telefonos) {
        if (telefono.getTipo().equals("Convencional") && telefono.getEstado().equals("C")) {
            contador++;
            break;
        }
    }
}
return contador;

}

public void depurar(){
   Contacto elemento;
	for(int i=0;i<contactos.size();i++) {
		elemento=contactos.get(i);
		if(elemento.getDireccion()==null) {
			incorrectos.add(elemento);
		}else {
			correctos.add(elemento);
		}
	}
	contactos.clear();
	
}

public ArrayList<Contacto> getContactos() {
	return contactos;
}

public void setContactos(ArrayList<Contacto> contactos) {
	this.contactos = contactos;
}

public Date getFechaModificacion() {
	return fechaModificacion;
}

public void setFechaModificacion(Date fechaModificacion) {
	this.fechaModificacion = fechaModificacion;
}

public ArrayList<Contacto> getCorrectos() {
	return correctos;
}

public void setCorrectos(ArrayList<Contacto> correctos) {
	this.correctos = correctos;
}

public ArrayList<Contacto> getIncorrectos() {
	return incorrectos;
}

public void setIncorrectos(ArrayList<Contacto> incorrectos) {
	this.incorrectos = incorrectos;
}




}
