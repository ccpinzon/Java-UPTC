package seres;

public class Adorno {

	private String descripcion,objetivo;
	

	public Adorno() {
		
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	@Override
	public String toString() {
		return "Adorno [descripcion=" + descripcion + ", objetivo=" + objetivo
				+ "]";
	}
	

	
	
}
