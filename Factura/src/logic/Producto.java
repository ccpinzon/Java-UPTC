package logic;

public class Producto {
	
	private int codigo;
	private String descripcion;
	private int precio;
	
	
	public Producto() {}


	
	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}



	@Override
	public String toString() {
		return "Codigo: " + codigo + ", Descripcion: " + descripcion
				+ ", Precio: " + precio;
	}
	


	
	
	

}
