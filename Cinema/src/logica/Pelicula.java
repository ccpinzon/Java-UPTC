package logica;

public class Pelicula {
	
	private String codigo, nombre;
	private double precio;
	private boolean disponible;
	private Egenero genero;
	private Eformato formato;
	private String fecha;
	
	
	public Pelicula() {
		
	}
	
	
	


	public Pelicula(String codigo, String nombre, double precio,
			boolean disponible, Egenero genero, Eformato formato, String fecha) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.disponible = disponible;
		this.genero = genero;
		this.formato = formato;
		this.fecha = fecha;
	}





	public String getFecha() {
		return fecha;
	}





	public void setFecha(String fecha) {
		this.fecha = fecha;
	}





	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public boolean getDisponible() {
		return disponible;
	}


	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}


	public Egenero getGenero() {
		return genero;
	}


	public void setGenero(Egenero genero) {
		this.genero = genero;
	}


	public Eformato getFormato() {
		return formato;
	}


	public void setFormato(Eformato formato) {
		this.formato = formato;
	}





	@Override
	public String toString() {
		return "Pelicula [codigo=" + codigo + ", nombre=" + nombre
				+ ", precio=" + precio + ", disponible=" + disponible
				+ ", genero=" + genero + ", formato=" + formato + ", fecha="
				+ fecha + "]";
	}


	
	
	
	
	

}
