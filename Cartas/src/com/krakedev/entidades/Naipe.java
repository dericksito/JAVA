package com.krakedev.entidades;

import java.util.ArrayList;
import java.util.Random;

public class Naipe {
private ArrayList<Numero> numerosPosibles=new ArrayList<Numero>();
private ArrayList<Carta> cartas=new ArrayList<Carta>();
Palos palos = new Palos();

public Naipe() {
    numerosPosibles.add(new Numero("A", 11));
    numerosPosibles.add(new Numero("2", 2));
    numerosPosibles.add(new Numero("3", 3));
    numerosPosibles.add(new Numero("4", 4));
    numerosPosibles.add(new Numero("5", 5));
    numerosPosibles.add(new Numero("6", 6));
    numerosPosibles.add(new Numero("7", 7));
    numerosPosibles.add(new Numero("8", 8));
    numerosPosibles.add(new Numero("9", 9));
    numerosPosibles.add(new Numero("10", 10));
    numerosPosibles.add(new Numero("J", 10));
    numerosPosibles.add(new Numero("Q", 10));
    numerosPosibles.add(new Numero("K", 10));
    
    for (Numero numero : numerosPosibles) {
        cartas.add(new Carta(numero, palos.getCorazonRojo())); 
        cartas.add(new Carta(numero, palos.getCorazonNegro()));
        cartas.add(new Carta(numero, palos.getDiamante()));
        cartas.add(new Carta(numero, palos.getTrebol()));
    }
}

public ArrayList<Carta> barajar() {
    ArrayList<Carta> auxiliar = new ArrayList<>();
    Random random = new Random();


    for (int i = 0; i < 100; i++) {
        int posicion = random.nextInt(52); 
        
        Carta carta = cartas.get(posicion);

    
        if (carta.getEstado().equals("N")) {
            auxiliar.add(carta);
            carta.setEstado("C"); 
        }
    }


    for (int i = 0; i < 100; i++) {
        int posicion = random.nextInt(52); 

        Carta carta = cartas.get(posicion);

        // Verificar el estado de la carta
        if (carta.getEstado().equals("N")) {
            auxiliar.add(carta); 
            carta.setEstado("C"); 
        }
    }


    for (Carta carta : cartas) {
        if (carta.getEstado().equals("N")) {
            auxiliar.add(carta); 
        }
    }

    return auxiliar; 
}



public ArrayList<Carta> getCartas() {
	return cartas;
}



}
