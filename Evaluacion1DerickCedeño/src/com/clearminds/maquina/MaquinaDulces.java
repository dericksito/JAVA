package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
    private ArrayList<Celda> celdas=new ArrayList<>();;
    private double saldo;

    public void agregarCelda(Celda codigo) {
        Celda celda = new Celda(codigo.getCodigo());
        celdas.add(celda);
    }

    public void mostrarConfiguracion() {
    	int x=1;
        for (Celda celda : celdas) {
            System.out.println("Celda"+x+++": "+celda.getCodigo());
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Celda buscarCelda(String cd) {
    	Celda cel=null;
    	for(int i=0;i<celdas.size();i++) {
    		cel=celdas.get(i);
    		if(cel.getCodigo().equals(cd)) {
    			return celdas.get(i);
    		}
    	}
		return null;
    }
    
    public void cargarProducto(Producto pd,String cd,int itm) {
    	Celda celdaRecuperada = buscarCelda(cd);
    	celdaRecuperada.ingresarProducto(pd, itm);
    }
    
    public void mostrarProductos() {
    	for (Celda celda : celdas) {
    		if(celda.getProducto()==null) {
    			System.out.println("CELDA:"+celda.getCodigo()+" Stock:"+celda.getStock()+" Sin Producto Asignado");;
    		}else {
    			System.out.println("CELDA:"+celda.getCodigo()+" Stock:"+celda.getStock()+" Producto:"+celda.getProducto().getCodigo()+" Precio:"+celda.getProducto().getPrecio());
    		}
        }
    	System.out.println("Saldo: "+saldo);
	}
    
    public Producto buscarProductoEnCelda(String cd) {
        	Celda cel=null;
        	for(int i=0;i<celdas.size();i++) {
        		cel=celdas.get(i);
        		if(cel.getCodigo().equals(cd)) {
        			return celdas.get(i).getProducto();
        		}
        	}
    		return null;
        }
    
    public Double consultarPrecio(String cd) {
    	Celda celdaRecuperada = buscarCelda(cd);
    	return celdaRecuperada.getProducto().getPrecio();
    }
    
    public Celda buscarCeldaProducto(String cd) {
    	for(int i=0;i<celdas.size();i++) {
    		if(celdas.get(i).getProducto()!=null) {
    			if(celdas.get(i).getProducto().getCodigo().equals(cd)) {
    				return celdas.get(i);
    			}
    		}
    	}
    	return null;
    }

    public void incrementarProductos(String cd,int itm) {
    	Celda celdaEncontrada=buscarCeldaProducto(cd);
    	celdaEncontrada.setStock(celdaEncontrada.getStock()+itm);
    }
    
    public void vender(String cd) {
    	Celda celdaEncontrada = buscarCelda(cd);
    	celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
    	saldo += celdaEncontrada.getProducto().getPrecio();
    }
    
    public double venderConCambio(String cd,double valU) {
    	Celda cel = buscarCelda(cd);
    	saldo+=cel.getProducto().getPrecio();
    	cel.setStock(1-cel.getStock());
    	return valU-cel.getProducto().getPrecio();
    }

    public ArrayList<Producto> buscarMenores(double limite){
    	ArrayList<Producto> prodlis = new ArrayList<Producto>();
    	for(int i=0;i<celdas.size();i++) {
    		if(celdas.get(i).getProducto().getPrecio()<limite) {
    			Producto prod = new Producto("X"+i, celdas.get(i).getProducto().getNombre(), celdas.get(i).getProducto().getPrecio());
    			prodlis.add(prod);
    		}
    	}
    	return prodlis;
    }


}
   


