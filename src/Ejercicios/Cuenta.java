/**
 * 
 */
package Ejercicios;

/**
 * @author alicia
 *
 */
/*
 * Escribe una clase Cuenta para representar una cuenta bancaria. Los datos de la cuenta son: nombre del cliente (String),
 *  número de cuenta (String), tipo de interés (double) y saldo (double).
 *  La clase contendrá los siguientes métodos:
 *  - Constructor por defecto
 *  - Constructor con todos los parámetros
 *  - Constructor copia.
 *  - Métodos setters/getters para asignar y obtener los datos de la cuenta.
 *  - Métodos ingreso y reintegro. Un ingreso consiste en aumentar el saldo en la cantidad que se indique. Esa cantidad no 
 *  puede ser negativa. Un reintegro consiste en disminuir el saldo en una cantidad pero antes se debe comprobar que hay saldo 
 *  suficiente. La cantidad no puede ser negativa. Los métodos ingreso y reintegro devuelven true si la operación se ha podido realizar 
 *  o false en caso contrario.
 *  Método transferencia que permita pasar dinero de una cuenta a otra siempre que en la cuenta de origen haya dinero suficiente para 
 *  poder hacerla. Ejemplo de uso del método transferencia: cuentaOrigen.transferencia(cuentaDestino, importe);
 *  que indica que queremos hacer una transferencia desde cuentaOrigen a cuentaDestino del importe indicado.
 */
public class Cuenta {
	String nombreCliente;
	String numCuenta;
	double tipoInteres;
	double saldo;
	
	
	public Cuenta() {
		
	}
	public Cuenta(String nombreCliente, String numCuenta, double tipoInteres,double saldo) {
		this.nombreCliente = nombreCliente;
		this.numCuenta = numCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;
	}
	public Cuenta (final Cuenta copia) {
		nombreCliente = copia.nombreCliente;
		numCuenta = copia.numCuenta;
		tipoInteres = copia.tipoInteres;
		saldo = copia.saldo;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	public double getTipoInteres() {
		return tipoInteres;
	}
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean ingreso (double num) {
		boolean ingresoExitoso = true;
		if (num < 0) {
			ingresoExitoso = false;
		} else {
			saldo = saldo +num;
		}
		return ingresoExitoso;
		
		// this.saldo = num < 0 ? this.saldo + num : this.saldo;
		
		// return num < 0 ? true : false;
	}
	public boolean reintegro (double num) {
		boolean reintegroCorrecto = true;
		if (saldo >= num) {
			saldo -= num;
		} else {
			reintegroCorrecto = false;
		}
		return reintegroCorrecto;
	}
	public boolean transferencia (Cuenta a, double num){
		boolean correcto = true;
		if (num < 0) {
			correcto = false;
		} else if (saldo >= 0) {
			reintegro(num);
			a.ingreso(num);
		} else {
			correcto = false;
		}
		return correcto;
	}
}

