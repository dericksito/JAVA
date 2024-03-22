package com.cmc.servicios;

import com.cmc.evaluacion.Cuota;
import com.cmc.evaluacion.Prestamo;

public class CalculadoraAmortizacion {

	 public static void generarTabla(Prestamo prestamo) {
	        // Paso 1: Calcular la cuota
	        double cuota = calcularCuota(prestamo.getMonto(), prestamo.getInteres(), prestamo.getPlazo());
	        
	        // Paso 2: Inicializar cuotas en el arreglo
	        for (int i = 0; i < prestamo.getPlazo(); i++) {
	            Cuota nuevaCuota = new Cuota(i + 1);
	            nuevaCuota.setCuota(cuota);
	            prestamo.getCuotas().add(nuevaCuota);
	        }
	        
	        // Paso 3: Establecer valor al inicio del período en la primera cuota
	        Cuota primeraCuota = prestamo.getCuotas().get(0);
	        primeraCuota.setInicio(prestamo.getMonto());
	        
	        // Paso 4 y 5: Calcular valores de las cuotas
	        for (int i = 0; i < prestamo.getPlazo(); i++) {
	            Cuota cuotaActual = prestamo.getCuotas().get(i);
	         
	        }
	        
	        // Paso 6: Ajustar última cuota
	        Cuota ultimaCuota = prestamo.getCuotas().get(prestamo.getPlazo() - 1);
	        ultimaCuota.setCuota(ultimaCuota.getCuota() + ultimaCuota.getSaldo());
	        ultimaCuota.setSaldo(0);
	    }
	    
	    private static double calcularCuota(double monto, double interes, int plazo) {
	        // Cálculo de la cuota basado en la fórmula proporcionada
	        double interesMensual = interes / 12 / 100;
	        double cuota = (monto * interesMensual) / (1 - Math.pow(1 + interesMensual, -plazo));
	        return cuota;
	    }
		
	    public static double calcularCuota(Prestamo prestamo) {
	        double Co = prestamo.getMonto();
	        double i = prestamo.getInteres() / 12.0 / 100.0; 
	        int n = prestamo.getPlazo(); 

	        
	        double cuota = Co * i / (1 - Math.pow(1 + i, -n));

	        return cuota;
	    }
	    
	    public static void mostrarTabla(Prestamo prestamo) {
	        System.out.println("Tabla de Amortización:");
	        for (Cuota cuota : prestamo.getCuotas()) {
	            System.out.println("Número: " + cuota.getNumero() + " | Cuota: " + cuota.getCuota() +
	                               " | Capital: " + cuota.getCapital() + " | Inicio: " + cuota.getInicio() +
	                               " | Interés: " + cuota.getInteres() + " | Abono Capital: " + cuota.getAbonoCapital() +
	                               " | Saldo: " + cuota.getSaldo());
	        }
	    }
		
	
}
