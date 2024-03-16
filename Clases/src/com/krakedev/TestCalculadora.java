package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculadora calcu;
		int resultadoSuma;
		int resultadoResta;
		double resultadoMulti;
		double resultadoDivision;
		double resultadoPromedio;
	
		calcu = new Calculadora();
		resultadoSuma = calcu.sumar(5, 3);
		resultadoResta = calcu.restar(10, 3);
		System.out.println("RESULTADO SUMA: " + resultadoSuma);
		System.out.println("RESULTADO RESTA: " + resultadoResta);
		// invocar multiplicar
		resultadoMulti = calcu.multiplicar(10, 5);
		System.out.println("RESULTADO MULTIPLICACION: " + resultadoMulti);

		// invocar dividir
		resultadoDivision = calcu.dividir(10, 2);
		System.out.println("RESULTADO DIVISION : " + resultadoDivision);

		// invocar promediar
		resultadoPromedio = calcu.promediar(10,8,9);
		System.out.println("RESULTADO PROMEDIO : " + resultadoPromedio);
		
	//usar mostrarResultado
		calcu.mostrarResultado();
	}

}
