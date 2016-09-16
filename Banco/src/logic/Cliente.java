package logic;

import java.util.ArrayList;
import java.util.Calendar;

public class Cliente {
	
	//crear  
	
	private String nombre, apellido, direccion, documento;
	private Calendar fechaNacimiento;
	private EGenero genero;
	private ArrayList<Cuenta>cuentas;
	
	public Cliente(){
		
		cuentas = new ArrayList<>();
	}

	public Cliente(String nombre, String apellido, String direccion,String documento, Calendar fechaNacimiento, EGenero genero) {
		
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		cuentas = new ArrayList<>() ;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public EGenero getGenero() {
		return genero;
	}

	public void setGenero(EGenero genero) {
		this.genero = genero;
	}

	public ArrayList<Cuenta> getCuentas() {
		return (ArrayList<Cuenta>) cuentas.clone();
	}

	public void setCuentas(ArrayList<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
	
	
	
	
	public Cuenta BuscarCuenta(String numeroCuenta){
			
		
       for(Cuenta cuen:cuentas){
			
			if(cuen.getNumeroCuenta().equals(numeroCuenta)){
				
				return cuen;
				}
			
			
		}
       return null;
	}
	
public void agregarCuenta(Cuenta cuenta){
		
		cuentas.add(cuenta);
		
		
		
	}

@Override
public String toString() {
	return "\nCliente [nombre=" + nombre + ", apellido=" + apellido
			+ ", direccion=" + direccion + ", documento=" + documento
			+ ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero
			+ ", cuentas=" + cuentas + "]";
}
	
	
	

}
