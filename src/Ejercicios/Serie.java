/**
 * 
 */
package Ejercicios;

/**
 * @author alicia
 *
 */
public class Serie {
/*
 * Crear una clase llamada serie con los atributos: titulo, números de temporadas, género y  creador. 
 * Con los siguientes métodos: Constructor, mostrar todos los atributos, sobrescribir  todos los atributos.  
 */
	
	String titulo;
	int numDeTemporadas;
	String genero;
	String creador;
	
	
	public Serie (String titulo, int numDeTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numDeTemporadas = numDeTemporadas;
		this.genero = genero;
		this.creador = creador;
	}
	
	public String getTitulo() {
		return this.titulo;
	}

	public int getNumDeTemporadas() {
		return numDeTemporadas;
	}

	public void setNumDeTemporadas(int numDeTemporadas) {
		this.numDeTemporadas = numDeTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

}
