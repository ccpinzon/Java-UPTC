package logica;

import java.util.ArrayList;

public class GestionVideoClub {
	
	private ArrayList<Cliente> clientes;
	private ArrayList<Pelicula> peliculas;
	
	
	public GestionVideoClub() {
		
	clientes = new ArrayList<Cliente>();
	peliculas = new ArrayList<Pelicula>();
	
	}

	public ArrayList<Cliente> getClientes() {
		return (ArrayList<Cliente>) clientes.clone();
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Pelicula> getPeliculas() {
		return (ArrayList<Pelicula>) peliculas.clone();
	}

	public void setPeliculas(ArrayList<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}
	
	
	public void agregarCleinte(Cliente cliente){
		clientes.add(cliente);
	}
	
	public Cliente buscarCliente(String Cedula){
		
		for(int i =0; i<clientes.size();i++){
			if(clientes.get(i).getDocumento().equals(Cedula)){
				return clientes.get(i);
			}
		}
		return null;
		
	}
	
	
	
	@Override
	public String toString() {
		return "GestionVideoClub [clientes=" + clientes + ", peliculas="
				+ peliculas + "]";
	}

	public void modificarCliente(String cedula,String Apellidos, String nombres, String Direccion, String Telefono, EgeneroCliente genero){
		
		for (int i=0; i<clientes.size();i++){
		if(clientes.get(i).getDocumento().equals(cedula)){
		clientes.get(i).setApellidos(Apellidos);
		clientes.get(i).setDireccion(Direccion);
		clientes.get(i).setGenero(genero);
		clientes.get(i).setNombres(nombres);
		clientes.get(i).setTelefono(Telefono);
		}
		
		}
		
		
		
	}
	
	public void eliminarCliente(String Cedula){
		
		for(int p =0;p<clientes.size();p++){
			if(clientes.get(p).getDocumento().equals(Cedula)){
				clientes.remove(p);
			}
		}
		
	}
	
	
	
	
   public void agregarPelicula(Pelicula pelicula){
	   peliculas.add(pelicula);
   }
	
	public Pelicula buscarPelicula(String codigo){
		
		for(int j=0; j<peliculas.size();j++){
			if(peliculas.get(j).getCodigo().equals(codigo)){
				return peliculas.get(j);
			}
		}
		return null;	
	}
	
	public void modificarPelicula(String codigo, String nombre, double precio, Egenero genero, Eformato formaro){
		
		for(int m =0; m<peliculas.size();m++){

			if(peliculas.get(m).getCodigo().equals(codigo)){
		peliculas.get(m).setFormato(formaro);
		peliculas.get(m).setGenero(genero);
		peliculas.get(m).setNombre(nombre);
		peliculas.get(m).setPrecio(precio);
			}
		
		}
		
	}
	
	public void eliminarPelicula(String codigo){
		
		for(int q =0;q<peliculas.size();q++){
			if(peliculas.get(q).getCodigo().equals(codigo)){
				peliculas.remove(q);
			}
		}
	}
	
	
	
		
	
	
	

}
