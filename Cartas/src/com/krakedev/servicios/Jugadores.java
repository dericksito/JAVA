package com.krakedev.servicios;
import com.krakedev.entidades.Carta;
import java.util.ArrayList;

public class Jugadores {

	 private ArrayList<String> jugadores=new ArrayList<String>();

	    public Jugadores() {
	        this.jugadores = new ArrayList<>();
	    }

	    public ArrayList<String> getJugadores() {
	        return jugadores;
	    }

	    public void setJugadores(ArrayList<String> jugadores) {
	        this.jugadores = jugadores;
	    }

	    public void jugar() {
	        ArrayList<String> jugadores = new ArrayList<>();
	        jugadores.add("Jugador1");
	        jugadores.add("Jugador2");
	        jugadores.add("Jugador3");

	        Juego juego = new Juego(jugadores);
	        juego.entregarCartas(5);

	        for (int i = 0; i < jugadores.size(); i++) {
	            System.out.println("Jugador " + (i + 1) + ": " + juego.getCartasJugadores().get(i).size() + " cartas.");
	        }

	        String ganador = determinarGanador(juego.getCartasJugadores());
	        
	        System.out.println("El ganador es: " + ganador);
	    }

	    private String determinarGanador(ArrayList<ArrayList<Carta>> cartasJugadores) {
	     
	        int indiceGanador = (int) (Math.random() * cartasJugadores.size());
	        return jugadores.get(indiceGanador);
	    }
}
