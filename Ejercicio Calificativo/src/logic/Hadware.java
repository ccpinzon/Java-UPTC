package logic;

public class Hadware {

	private String codigo;
	private String Descripcion;
	private float precio;

	
	
	public Hadware(String codigo, String descripcion, float precio) {
		super();
		this.codigo = codigo;
		Descripcion = descripcion;
		this.precio = precio;
	}


	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Hadware [codigo=" + codigo + ", Descripcion=" + Descripcion
				+ ", precio=" + precio + "]";
	}

	
	
}
