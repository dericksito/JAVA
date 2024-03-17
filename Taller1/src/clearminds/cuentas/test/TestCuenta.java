package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		
		Cuenta cuenta1=new Cuenta("03476");
		Cuenta cuenta2=new Cuenta("03476","C",98);
		Cuenta cuenta3=new Cuenta("03476");
		Cuenta cuenta4=new Cuenta("0987");
		Cuenta cuenta5=new Cuenta("0557","C",10);
		Cuenta cuenta6=new Cuenta("0666");//no fue necesario setear
		//modificar datos de cuenta
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta3.setTipo("C");
	    cuenta2.setTipo("D");
	    
	    //modificar cuenta4
	    cuenta4.setTipo("A");
	    cuenta4.setSaldo(10);
		
		//imprimo cuentas
		System.out.println("-----Valores Iniciales------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		System.out.println("-----Valores Modificados------");
		
		
		//imprimir calores de cuenta4,5y6
		System.out.println("-----Cuentas Extras------");
		cuenta4.imprimir();
		cuenta5.imprimir();
		cuenta6.imprimir();
	}

}
