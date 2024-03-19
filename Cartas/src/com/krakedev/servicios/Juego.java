package com.krakedev.servicios;

import java.util.ArrayList;
import java.util.Collections;

import com.krakedev.entidades.Carta;
import com.krakedev.entidades.Naipe;

public class Juego {

	
	
	  private Naipe naipe;
	    private ArrayList<ArrayList<Carta>> cartasJugadores;
	    private ArrayList<Carta> naipeBarajado;	

	    public Juego(ArrayList<String> idsJugadores) {
	        this.naipe = new Naipe();
	        this.cartasJugadores = new ArrayList<>();

	        for (String id : idsJugadores) {
	            ArrayList<Carta> cartasJugador = new ArrayList<>();
	            cartasJugadores.add(cartasJugador);
	        }
	        
	    }
	    
	

	    public ArrayList<ArrayList<Carta>> getCartasJugadores() {
	        return cartasJugadores;
	    }

	    private ArrayList<Carta> barajarNaipe() {
	        ArrayList<Carta> cartasNaipe = naipe.getCartas();
	        Collections.shuffle(cartasNaipe);
	        return cartasNaipe;
	    }

	    public void entregarCartas(int cartasPorJugador) {
	        int totalJugadores = cartasJugadores.size();
	        int posicion = 0;

	        for (int i = 0; i < cartasPorJugador; i++) {
	            for (int j = 0; j < totalJugadores; j++) {
	                ArrayList<Carta> cartasJugador = cartasJugadores.get(j);
	                if (posicion < naipeBarajado.size()) {
	                    cartasJugador.add(naipeBarajado.get(posicion++));
	                }
	            }
	        }
	    }
	    
	    public int devolverTotal(int i) {
	        int total = 0;
	  
	        for (ArrayList<Carta> cartasJugador : cartasJugadores) {
	            for (Carta carta : cartasJugador) {
	                if (carta.getIdJugador().equals(i)) {
	                    total += carta.getValor();
	                }
	            }
	        }
	        return total;
	    }
	    
	    public String determinarGanador() {
	        
	        String idGanador = "";
	        int sumaGanador = 0;

	     
	        for (ArrayList<Carta> cartasJugador : cartasJugadores) {
	            int sumaCartasJugador = 0;
	            for (Carta carta : cartasJugador) {
	                sumaCartasJugador += carta.getValor();
	            }
	            if (sumaCartasJugador >= sumaGanador) {
	                idGanador = (String) cartasJugador.get(0).getIdJugador(); 
	                sumaGanador = sumaCartasJugador;
	            }
	        }
	        return idGanador;
	    }
	    
	    
}
