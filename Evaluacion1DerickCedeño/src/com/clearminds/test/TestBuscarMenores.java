package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		Producto p1 = new Producto("PP1", "PAPITAS", 0.85),p2 = new Producto("PP2", "DORITOS", 0.5),p3 = new Producto("PP3", "JET", 0.25),p4 = new Producto("PP3", "DETODITO", 0.6),p5 = new Producto("PP5", "SARITAS", 1.5),p6 = new Producto("PP6", "PANCHITOS", 3.85) ;
		MaquinaDulces md = new MaquinaDulces();
		md.agregarCelda(new Celda("A"));
        md.agregarCelda(new Celda("B"));
        md.agregarCelda(new Celda("C"));
        md.agregarCelda(new Celda("D"));
        md.agregarCelda(new Celda("E"));
        md.agregarCelda(new Celda("F"));
        md.cargarProducto(p1, "A", 6);
        md.cargarProducto(p2, "B", 8);
        md.cargarProducto(p3, "C", 10);
        md.cargarProducto(p4, "D", 5);
        md.cargarProducto(p5, "E", 3);
        md.cargarProducto(p6, "F", 2);
        
        ArrayList<Producto> lista=md.buscarMenores(0.8);
        
       System.out.println("Productos Menores: "+lista.size());
       for(int i=0;i<lista.size();i++) {
    	   System.out.println("Nombre:"+lista.get(i).getNombre()+" "+"Precio:"+lista.get(i).getPrecio());
       }
	}

}
