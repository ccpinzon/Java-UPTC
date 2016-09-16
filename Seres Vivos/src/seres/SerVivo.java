/**
 * 
 */
package seres;


//Ejemplo polimorfismo, ejemplo tambine de composicon y agregacion

import java.util.ArrayList;

import compromisos.Comunicacion;

/**
 * @author user
 *
 */
public abstract class SerVivo implements Comunicacion {
	
	private String Descripcion;
	private ArrayList<Organo>organos;

	public SerVivo() {
		
		organos = new ArrayList< Organo >( );
	
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.Descripcion = descripcion;
	}

	
	public void agregarOrgano (Organo organo){
		organos.add(organo);
		
	}
	
	
	
	@Override
	public String toString() {
		return "SerVivo [Descripcion=" + Descripcion + ", organos=" + organos
				+ "]";
	}



	public class Organo {
		
		private String nombre,funcion;

		public Organo() {
					}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getFuncion() {
			return funcion;
		}

		public void setFuncion(String funcion) {
			this.funcion = funcion;
		}

		
		
		@Override
		public String toString() {
			return "Organo [nombre=" + nombre + ", funcion=" + funcion + "]";
		}
		
		
		
	}
	
	
		
	}


