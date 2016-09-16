package logic;

public class Producto {

	private String codigo,descripcion;
	private double precio;
	private int excistencias;
	
	
	
	public Producto() {
		
			}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getExcistencias() {
		return excistencias;
	}
	public void setExcistencias(int excistencias) {
		this.excistencias = excistencias;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion
				+ ", precio=" + precio + ", excistencias=" + excistencias + "]";
	}
	
	
	
	
}
