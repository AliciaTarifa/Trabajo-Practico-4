package Ejercicios;

public class NumerosEnteros {
	/*
	 * Crear una clase NumerosEnteros y redefinir las operaciones elementales (+, -, *, /).  
	 * esta clase tendr� los m�todos suma (), resta(), multiplicaci�n() y divisi�n() que recibir�n 
	 * como par�metros otro objeto de la misma clase NumerosEnteros.
	 */
	
	int num;
	
	public NumerosEnteros (int num) {
		this.num = num;
	}
	public int suma (int num1) {
		return this.num + num1;
	}
	public int resta (int num1) {
		return this.num - num1;
	}
	public int multiplicacion (int num1) {
		return this.num * num1;
	}
	public float division (int num1) {
		if (num1 == 0) {
			System.out.println("No se puede dividir por 0");
			return 0;
		}else {
			return this.num/num1;
		}
	}
	


}
