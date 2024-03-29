package com.cmc.prueba;

import com.cmc.evaluacion.Clientes;
import com.cmc.evaluacion.Prestamo;
import com.cmc.servicios.Banco;
import com.cmc.servicios.CalculadoraAmortizacion;

import java.util.ArrayList;

public class TestPrestamo {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Clientes cliente1 = new Clientes("1234567890", "Juan", "Perez");
        
        Clientes cliente2 = new Clientes("0987654321", "Maria", "Lopez");

        banco.getClientes().add(cliente1);
        banco.getClientes().add(cliente2);

        
            Prestamo prestamo1 = new Prestamo(4000,12,16);
            banco.asignarPrestamo("1234567890", prestamo1);
            CalculadoraAmortizacion.generarTabla(prestamo1);
            
            Prestamo prestamo2 = new Prestamo(50000,10,11);
            banco.asignarPrestamo("1234567890", prestamo2);

            Prestamo prestamo3 = new Prestamo(2000,8,14);
            banco.asignarPrestamo("0987654321", prestamo3);

            ArrayList<Prestamo> prestamosCliente1 = banco.buscarPrestamos("1234567890");
            for (Prestamo prestamo : prestamosCliente1) {
            	cliente1.mostrarClientes();
            	prestamo.mostrarPrestamo();
            	
            }
            ArrayList<Prestamo> prestamosCliente2 = banco.buscarPrestamos("0987654321");
            for (Prestamo prestamo : prestamosCliente2) {
            cliente2.mostrarCliente();
            prestamo.mostrarPrestamo();
            }

          
           

            
            
 
 
        }
    
}
