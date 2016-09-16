package test;

import java.io.IOException;
import java.util.ArrayList;

import persistencia.ArchivoPersona;
import persistencia.ArchivoPlano;
import logic.ControlPersona;
import logic.Persona;

public class RunTest {

	private ControlPersona cp;
	private Persona persona;
	private ArrayList<Persona> personas;
	
	public RunTest() {
		
		
//		persona = new Persona();
//		persona.setNombre("aaa");
//		persona.setCodigo("23");
//		persona.setApellido("bb");
//		persona.setEdad((byte) 12);
//		persona.setGenero('M');
//		
		cp= new ControlPersona();
//		
//		cp.addPersona(persona);
//		
//		
//		
//		
		
		
		
		
	}
	
	
	public static void main(String[] args) throws IOException {
		
		RunTest run = new RunTest();
		run.leerDatos();

	}
	
	private void leerDatos() throws IOException {
		
		
		
		cp.readArchivo();
		personas = cp.getPersonas();
		for(Persona persona : personas){
			
			System.out.println(persona);
		}
		
		
	}

	public void menuPrincipal (){}
	
	public void agregarPersona(){}
	
	public void listarPersonas(){}
	
	public void BuscarPersona(String busqueda){}

}
