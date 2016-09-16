package seres;

import java.util.ArrayList;


public class Racional extends SerVivo {
	
	private String nombre,apellido;
	ArrayList<Adorno>adornos;
	
	

	public Racional() {
		adornos =  new ArrayList<Adorno>();
	
	}

	


	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getApellido() {
		return apellido;
	}




	public void setApellido(String apellido) {
		this.apellido = apellido;
	}




	public ArrayList<Adorno> getAdornos() {
		return (ArrayList<Adorno>) adornos.clone();
	}


public void agregarAdorno (Adorno adorno){
	adornos.add(adorno);
	
}




	@Override
	public String toString() {
		return "Racional [nombre=" + nombre + ", apellido=" + apellido
				+ ", adornos=" + adornos + ", toString()=" + super.toString()
				+ "]";
	}




	@Override
	public String comunicarse() {
		
		return "Los seres racionales se comunican atraves del lenguaje";
	}

}
