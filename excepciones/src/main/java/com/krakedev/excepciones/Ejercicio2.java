package com.krakedev.excepciones;

import java.io.File;
import java.io.IOException;

public class Ejercicio2 {
	
	public void metoo1() {
		String a=null;
		a.substring(0);
		//unchecked
	}
	
public void metoo2() {
	
	try {
		
		File f=new File("archico1.txt");
		f.createNewFile();
	}catch(IOException io) {
		
		System.out.println("Error");
		
	}
	
	
	

		
		
}

public void metoo3() throws IOException{//propagarla para q alguien mas se encargo o hago u try chatch
	
	File f=new File("archico1.txt");
		f.createNewFile();//checked es una excepocio que exije arreglarlo o no podemos continuar 
		
		
}

public void metodo4() {
	
}

}
