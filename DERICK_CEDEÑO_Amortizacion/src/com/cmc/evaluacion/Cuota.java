package com.cmc.evaluacion;

public class Cuota {
private int numero;
private double cuota,capital,inicio,interes,abonoCapital,saldo ;

public Cuota(int numero) {
	this.numero=numero;
	
}

public void mostrarPrestamo() {
   //para que tengan 2 decimales:3
	 String cuotaFormateada = String.format("%.2f", cuota);
     String capitalFormateado = String.format("%.2f", capital);
     String inicioFormateado = String.format("%.2f", inicio);
     String interesFormateado = String.format("%.2f", interes);
     String abonoCapitalFormateado = String.format("%.2f", abonoCapital);
     String saldoFormateado = String.format("%.2f", saldo);
     
     
     System.out.println(numero + " | " + cuotaFormateada + " | " + capitalFormateado + " | " + inicioFormateado + " | " + interesFormateado + " | " + abonoCapitalFormateado + " | " + saldoFormateado);}

public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public double getCuota() {
	return cuota;
}
public void setCuota(double cuota) {
	this.cuota = cuota;
}
public double getCapital() {
	return capital;
}
public void setCapital(double capital) {
	this.capital = capital;
}
public double getInicio() {
	return inicio;
}
public void setInicio(double inicio) {
	this.inicio = inicio;
}
public double getInteres() {
	return interes;
}
public void setInteres(double interes) {
	this.interes = interes;
}
public double getAbonoCapital() {
	return abonoCapital;
}
public void setAbonoCapital(double abonoCapital) {
	this.abonoCapital = abonoCapital;
}
public double getSaldo() {
	return saldo;
}
public void setSaldo(double saldo) {
	this.saldo = saldo;
}


}
