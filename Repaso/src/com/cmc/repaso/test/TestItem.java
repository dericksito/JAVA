package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item p=new Item();
		Item p2=new Item();
		
		
		p.setNombre("Cola");
		p.setProductosActuales(20);
		p.setProductosDevueltos(5);
		
		p2.setNombre("Papas");
		p2.setProductosActuales(30);
		p2.setProductosDevueltos(6);
		
		//probar un metodo en cada uno para que se entienda nejor
		p.vender(8);
		
		p2.devolver(3);
		
		
		//imprimir valores
		p.imprimir();
		
		System.out.println("-----------------------------------------");
		
		p2.imprimir();

	}

}
