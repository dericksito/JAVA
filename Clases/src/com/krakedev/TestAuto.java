package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Auto auto1=new Auto("MERCEDES",2024,54.900);
        Auto auto2=new Auto("BMW",2013,14.000);
        //modificar auto1
        
       /* auto1.setMarca("KIA");
        auto1.setAnio(2023);
        auto1.setPrecio(12.000);
        
        //modificar auto2
         * 
        auto2.setMarca("TOYOTA");
        auto2.setAnio(2017);
        auto2.setPrecio(30.000);*/
        
        //mostrar valores de los autos
        System.out.println("AUTO 1-----------------");

        System.out.println("marca: "+auto1.getMarca());
        System.out.println("anio: "+auto1.getAnio());
        System.out.println("precio: "+auto1.getPrecio());
        
        System.out.println("AUTO 2-----------------");
        
        System.out.println("marca: "+auto2.getMarca());
        System.out.println("anio: "+auto2.getAnio());
        System.out.println("precio: "+auto2.getPrecio());
	}

}
