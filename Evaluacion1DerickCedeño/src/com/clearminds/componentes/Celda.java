package com.clearminds.componentes;

public class Celda {
	private String Codigo;
	private Producto Producto;
	private int Stock;
	
	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String Codigo) {
		this.Codigo = Codigo;
	}

	public Producto getProducto() {
		return Producto;
	}

	public void setProducto(Producto producto) {
		Producto = producto;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}

	public void ingresarProducto(Producto Producto,int Stock) {
		this.Producto = new Producto(Producto.getCodigo(),Producto.getNombre(),Producto.getPrecio());
		this.Stock = Stock;
	}
	
	public Celda(String Codigo) {
		this.Codigo=Codigo;
	}
}
