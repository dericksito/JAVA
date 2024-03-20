package com.cmc.prueba;

import com.cmc.evaluacion.Clientes;
import com.cmc.servicios.Banco;

public class TestClientes {
    public static void main(String[] args) {
        Banco banco = new Banco();
            Clientes cliente1 = new Clientes("1234567890", "Juan", "Perez");
            banco.registrarCliente(cliente1);
            cliente1.mostrarClientes();

          Clientes cliente2 = new Clientes("0987654321", "Maria", "Lopez");
            banco.registrarCliente(cliente2);
           cliente2.mostrarClientes();

           

          //  Intentar registrar un cliente duplicado
            Clientes cliente3 = new Clientes("1234567890", "Pedro", "Gomez");
            banco.registrarCliente(cliente3);
            
            
        }
    }

