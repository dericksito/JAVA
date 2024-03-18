package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarProductoNull {
	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B1", 4);
		
		Producto produ=maquina.buscarProductoEnCelda("A1");
		/*En esta linea exacta esta el error en la variable afecta es "produ"*/System.out.println("Producto encontrado:"+produ.getNombre());
		
		
		
		
	}
}
