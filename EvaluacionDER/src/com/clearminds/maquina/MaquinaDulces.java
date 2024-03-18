package com.clearminds.maquina;

import com.clearminds.componentes.*;

public class MaquinaDulces {
	private Celda c1;
	private Celda c2;
	private Celda c3;
	private Celda c4;
	public double Saldo;

	public void configurarMaquina(String cd1,String cd2,String cd3,String cd4) {
		c1 = new Celda(cd1);
		c2 = new Celda(cd2);
		c3 = new Celda(cd3);
		c4 = new Celda(cd4);
	}
	
	public void mostrarConfiguracion() {
		System.out.println("Codigo de celda 1: "+this.c1.getCodigo()); 
		System.out.println("Codigo de celda 2: "+this.c2.getCodigo());
		System.out.println("Codigo de celda 3: "+this.c3.getCodigo());
		System.out.println("Codigo de celda 4: "+this.c4.getCodigo());
	}
	
	public Celda buscarCelda(String cd) {
		if(cd==this.c1.getCodigo()) {
			return c1;
		}else if(cd==this.c2.getCodigo()) {
			return c2;
		}else if(cd==this.c3.getCodigo()) {
			return c3;
		}else if(cd==this.c4.getCodigo()) {
			return c4;
		}else {
			return null;
		}
	}
	
	public void cargarProducto(Producto producto,String cdl,int itm) {
		Celda celdaRecuperada;
		celdaRecuperada=buscarCelda(cdl);
		celdaRecuperada.ingresarProducto(producto, itm);
	}
	
	public void mostrarProductos() {
		System.out.println("*******CELDA A1*******");
		System.out.println("Stock: "+c1.getStock());
		if(c1.getProducto()==null) {
			System.out.println("Esta celda no tiene producto!");
		}else {
			System.out.println("Nombre: "+c1.getProducto().getNombre());
			System.out.println("Precio: "+c1.getProducto().getPrecio());
			System.out.println("Codigo: "+c1.getProducto().getCodigo());
		}
		
		System.out.println(" ");
		
		System.out.println("*******CELDA A2*******");
		System.out.println("Stock: "+c2.getStock());
		if(c2.getProducto()==null) {
			System.out.println("Esta celda no tiene producto!");
		}else {
			System.out.println("Nombre: "+c2.getProducto().getNombre());
			System.out.println("Precio: "+c2.getProducto().getPrecio());
			System.out.println("Codigo: "+c2.getProducto().getCodigo());
		}
		System.out.println(" ");
		
		System.out.println("*******CELDA B1*******");
		System.out.println("Stock: "+c3.getStock());
		if(c3.getProducto()==null) {
			System.out.println("Esta celda no tiene producto!");
		}else {
			System.out.println("Nombre: "+c3.getProducto().getNombre());
			System.out.println("Precio: "+c3.getProducto().getPrecio());
			System.out.println("Codigo: "+c3.getProducto().getCodigo());
		}
		System.out.println(" ");
		
		System.out.println("*******CELDA B2*******");
		System.out.println("Stock: "+c4.getStock());
		if(c4.getProducto()==null) {
			System.out.println("Esta celda no tiene producto!");
		}else {
			System.out.println("Nombre: "+c4.getProducto().getNombre());
			System.out.println("Precio: "+c4.getProducto().getPrecio());
			System.out.println("Codigo: "+c4.getProducto().getCodigo());
		}
		System.out.println("Saldo: "+Saldo);
	}
	
	public Producto buscarProductoEnCelda(String cd) {
		if(cd==c1.getCodigo()) {
			return c1.getProducto();
		}else if(cd==this.c2.getCodigo()) {
			return c2.getProducto();
		}else if(cd==this.c3.getCodigo()) {
			return c3.getProducto();
		}else if(cd==this.c4.getCodigo()) {
			return c4.getProducto();
		}else {
			return null;
		}
	}
	
	public double consultarPrecio(String cd) {
		Celda celdaRecuperada=buscarCelda(cd);
		return celdaRecuperada.getProducto().getPrecio();
	}
	
	public Celda buscarCeldaProducto(String cp) {
		
		if(this.c1.getProducto()!=null) {
			if(cp==this.c1.getProducto().getCodigo()) {
				return c1;
			}
		}else if(this.c2.getProducto()!=null) {
			if(cp==this.c2.getProducto().getCodigo()) {
				return c2;
			}
		}else if(this.c3.getProducto()!=null) {
			if(cp==this.c3.getProducto().getCodigo()) {
				return c3;
				}
		}else if(this.c4.getProducto()!=null) {
			if(cp==this.c4.getProducto().getCodigo()) {
				return c4;
			}
		}
		return null;
	}
		
	
	public void incrementarProductos(String cd,int itm) {
		Celda celdaEncontrada = buscarCeldaProducto(cd);
		celdaEncontrada.setStock(itm);
	}
	
	public void vender(String cd) {
		Celda celdaVenta =buscarCelda(cd);
		celdaVenta.setStock(celdaVenta.getStock()-1);
		
		this.Saldo += celdaVenta.getProducto().getPrecio();
		mostrarProductos();
	}
	
	public double venderConCambio(String cd,double valorU) {
		Celda celdaVenta =buscarCelda(cd);
		vender(cd);
		return valorU-celdaVenta.getProducto().getPrecio();		
	}
}
