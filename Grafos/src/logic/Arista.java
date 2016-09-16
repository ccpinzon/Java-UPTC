package logic;

public class Arista {
	
	private String verticeInicial;
	private String verticeFinal;
	private String nombre;
	private int peso;
	
	public Arista(String verticeInicial, String verticeFinal, String nombre, int peso) {
		this.verticeInicial = verticeInicial;
		this.verticeFinal = verticeFinal;
		this.nombre = nombre;
		this.peso = peso;
	}
	
	public Arista() {
		
		
	}

	public String getVerticeInicial() {
		return verticeInicial;
	}

	public void setVerticeInicial(String verticeInicial) {
		this.verticeInicial = verticeInicial;
	}

	public String getVerticeFinal() {
		return verticeFinal;
	}

	public void setVerticeFinal(String verticeFinal) {
		this.verticeFinal = verticeFinal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String toString() {
		return "Arista [verticeInicial=" + verticeInicial + ", verticeFinal="
				+ verticeFinal + ", nombre=" + nombre + ", peso=" + peso + "]";
	}
	
}
