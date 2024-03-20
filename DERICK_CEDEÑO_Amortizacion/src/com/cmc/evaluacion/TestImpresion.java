package com.cmc.evaluacion;

public class TestImpresion {

	public static void main(String[] args) {
	     Cuota cuota = new Cuota(1);
	        cuota.setCuota(444.24);
	        cuota.setCapital(5000.00);
	        cuota.setInicio(50.00);
	        cuota.setInteres(394.24);
	        cuota.setAbonoCapital(4605.76);
	        cuota.setSaldo(4605.76); 

	      
	        cuota.mostrarPrestamo();

	}

}
