package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		
		Cuadrado c1=new Cuadrado();
		Cuadrado c2=new Cuadrado();
		Cuadrado c3=new Cuadrado();
		
		double areaC1;
		double areaC2;
		double areaC3;
		
		double perimetroC1;
		double perimetroC2;
		double perimetroC3;
		//modificar atributos
		c1.lado=3;
		c2.lado=5;
		c3.lado=8;
	//testear calcularArea
       areaC1=c1.calcularArea();
       areaC2=c2.calcularArea();
		areaC3=c3.calcularArea();
       //testear calcularPerimetro
       
      perimetroC1=c1.calcularPerimetro();
      perimetroC2=c2.calcularPerimetro();
      perimetroC3=c3.calcularPerimetro();
      //imprimir areas
      System.out.println("Area de c1: "+areaC1);
      System.out.println("Area de c2: "+areaC2);
      System.out.println("Area de c2: "+areaC3);
      
      //imprimir perimetros
      System.out.println("Perimetro de c1: "+perimetroC1);
      System.out.println("Perimetro de c2: "+perimetroC2);
      System.out.println("Perimetro de c3: "+perimetroC3);


	}

}
