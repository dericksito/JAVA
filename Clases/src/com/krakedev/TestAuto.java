package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Auto auto1=new Auto();
        Auto auto2=new Auto();
        //modificar auto1
        auto1.marca="KIA";
        auto1.anio=2023;
        auto1.precio=12.000;
        //modificar auto2
        auto2.marca="TOYOTA";
        auto2.anio=2017;
        auto2.precio=30.000;
        //mostrar valores de los autos
        System.out.println("AUTO 1-----------------");

        System.out.println("marca: "+auto1.marca);
        System.out.println("anio: "+auto1.anio);
        System.out.println("precio: "+auto1.precio);
        
        System.out.println("AUTO 2-----------------");
        
        System.out.println("marca: "+auto2.marca);
        System.out.println("anio: "+auto2.anio);
        System.out.println("precio: "+auto2.precio);
	}

}
