package com.krakedev.test;

import com.krakedev.Rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		
       Rectangulo r1=new Rectangulo(11,5);
       Rectangulo r2=new Rectangulo(7,4);
       int areaR1;
       int areaR2;
       double perimetroR1;
       double perimetroR2;
       
       //seteo de atributos
       /*r1.setBase(10);
       r1.setAltura(5);
       
       r2.setBase(8);
       r2.setAltura(3);*/
       
       areaR1=r1.calcularArea();
       areaR2=r2.calcularArea();
       
       //probar perimetro
       perimetroR1=r1.calcularPerimetro();
       perimetroR2=r2.calcularPerimetro();
       
       System.out.println("Area de r1: "+areaR1);
       System.out.println("Area de r1: "+areaR2);
       
       System.out.println("PERIMETRO de r1: "+perimetroR1);
       System.out.println("PERIMETRO de r2: "+perimetroR2);
	}

}
