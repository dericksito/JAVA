package com.cmc.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.Clientes;
import com.cmc.evaluacion.Prestamo;

public class Banco {
    private ArrayList<Prestamo> prestamos;
    private ArrayList<Clientes> clientes;

    public Banco() {
        this.prestamos = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }


    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public ArrayList<Clientes> getClientes() {
        return clientes;
    }

    // Método para buscar un cliente por su cédula
    public Clientes buscarCliente(String cedula) {
        for (Clientes cliente : clientes) {
            if (cliente.getCedula().equals(cedula)) {
                return cliente;
            }
        }
        return null; 
    }
    
    
    public void registrarCliente(Clientes cliente) {
        // Verificar si el cliente ya existe en la lista
        if (buscarCliente(cliente.getCedula()) == null) {
            
            clientes.add(cliente);
            System.out.println("Cliente registrado exitosamente.");
        } else {
            System.out.println("El cliente ya existe en el banco.");
        }
    }
    
    public void asignarPrestamo(String cedulaCliente, Prestamo prestamo) {
        Clientes cliente = buscarCliente(cedulaCliente);
        if (cliente == null) {
            System.out.println("El cliente no es cliente del banco.");
        } else {
            prestamos.add(prestamo);
            System.out.println("Préstamo asignado exitosamente.");
        }
    }
    
    public ArrayList<Prestamo> buscarPrestamos(String cedulaCliente) {
        Clientes cliente = buscarCliente(cedulaCliente);
        if (cliente == null) {
            return null;
        }

        ArrayList<Prestamo> prestamosCliente = new ArrayList<>();
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getClientes().equals(cliente)) {
                prestamosCliente.add(prestamo);
            }
        }
        
        if (prestamosCliente.size() == 0) {
            return null; // Retorna null si el cliente no tiene préstamos
        } else {
            return prestamosCliente;
        }

    }
}
