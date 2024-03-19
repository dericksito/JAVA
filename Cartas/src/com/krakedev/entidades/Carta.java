package com.krakedev.entidades;

public class Carta {

	private Numero numero;
	private String palo;
	private String estado="N";
	
	
	public Carta(Numero numero, String palo) {
	
		this.numero = numero;
		this.palo = palo;
	}
	
	public void mostrar() {
		System.out.println(numero.getNumeroCarta()+"-"+getPalo());
	}


	public Numero getNumero() {
		return numero;
	}


	public void setNumero(Numero numero) {
		this.numero = numero;
	}


	public String getPalo() {
		return palo;
	}


	public void setPalo(String palo) {
		this.palo = palo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Object getIdJugador() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getValor() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}
