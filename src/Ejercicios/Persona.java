/**
 * 
 */
package Ejercicios;

/**
 * @author alicia
 *
 */
public class Persona {

	/**
	 * @param args
	 * Crear una clase llamada Persona con los atributos: Nombre, Apellido, DNI, Domicilio. Con  los m�todos: Constructor 
	 * y un m�todo que permita mostrar la informaci�n de la persona.  
	 */
	
		String nombre;
		String apellido;
		int dni;
		String domicilio;
		
		public Persona (String nombre, String apellido, int dni, String domicilio) {
			this. nombre = nombre;
			this. apellido = apellido;
			this. dni = dni;
			this. domicilio = domicilio;
		}
		
		public void mostrar() {
			System.out.print("nombre:"+ this.nombre);
			System.out.print("apellido:"+this.apellido);
			System.out.print("dni:"+ this.dni);
			System.out.print("domicilio:"+ this.domicilio);
		}

	}


