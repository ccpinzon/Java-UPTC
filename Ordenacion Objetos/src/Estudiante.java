import java.util.Collections;


public class Estudiante implements Comparable<Estudiante> {
	
	private String codigo;
	private String apellidos;
	private String nombres;
	private int edad;
	
	public Estudiante() {
		
	}

	

	public Estudiante(String codigo, String apellidos, String nombres, int edad) {
		super();
		this.codigo = codigo;
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.edad = edad;
	}
	
	
public int compareTo(Estudiante est){
	
	//return this.codigo.compareTo(est.getCodigo());
	//return est.getCodigo().compareTo(this.codigo);
	
	return this.apellidos.compareTo(est.getApellidos());
}



	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Estudiante [codigo=" + codigo + ", apellidos=" + apellidos
				+ ", nombres=" + nombres + ", edad=" + edad + "]";
	}
	
	
	
	
	
	

}
