package logic;

public class Estudiante {
	private String codigo, nombre;
	private int edad;
	private int semestre;

	public Estudiante() {
		// TODO Auto-generated constructor stub
	}

	public Estudiante(String codigo, String nombre, int edad, int semestre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.edad = edad;
		this.semestre = semestre;
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

	
	

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	@Override
	public String toString() {
		return "->  codigo: " + codigo + "    nombre: " + nombre
				+ "   edad: " + edad + "    semestre: " + semestre;
	}

}
