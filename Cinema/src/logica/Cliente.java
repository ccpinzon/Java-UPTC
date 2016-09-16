package logica;

import java.util.ArrayList;

public class Cliente {
	
	private String documento, apellidos, nombres,direccion,telefono;
	private EgeneroCliente genero;
	private ArrayList<Pelicula> peliculas;
	
	
	public Cliente() {
		peliculas = new ArrayList<Pelicula>();
		
	}

	public Cliente(String documento, String apellidos, String nombres,
			String direccion, String telefono, EgeneroCliente genero,
			ArrayList<Pelicula> peliculas) {
		super();
		this.documento = documento;
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.direccion = direccion;
		this.telefono = telefono;
		this.genero = genero;
		this.peliculas = peliculas;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public EgeneroCliente getGenero() {
		return genero;
	}

	public void setGenero(EgeneroCliente genero) {
		this.genero = genero;
	}

	public ArrayList<Pelicula> getPeliculas() {
		return (ArrayList<Pelicula>) peliculas.clone();
	}

	public void setPeliculas(ArrayList<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

	@Override
	public String toString() {
		return "Cliente [documento=" + documento + ", apellidos=" + apellidos
				+ ", nombres=" + nombres + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", genero=" + genero
				+ ", peliculas=" + peliculas + "]";
	}
	
	public void agregarPelicula(Pelicula pelicula){
		//revisar que al agraga una pelicula se vuelva false
		peliculas.add(pelicula);		
	

		}}
