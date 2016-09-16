package logic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import persistencia.ArchivoPersona;

public class ControlPersona {

	private ArchivoPersona archivo;
	private String separator;
	private ArrayList<Persona> personas;
	
	public ControlPersona() {
		
		personas = new ArrayList<>();
	}
	
	
	


	public ArchivoPersona getArchivo() {
		return archivo;
	}


	public void setArchivo(ArchivoPersona archivo) {
		this.archivo = archivo;
	}


	public String getSeparator() {
		return separator;
	}


	public void setSeparator(String separator) {
		this.separator = separator;
	}


	public ArrayList<Persona> getPersonas() {
		return personas;
	}


	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}
	
	public void readArchivo() throws IOException{
		
		
		archivo = new ArchivoPersona();
		archivo.setRuta("recursos/Archivos/");
		archivo.setNombre("datos.txt");
		archivo.Open();
		ArrayList<String> lineas = archivo.reader();
		separator = ";";
		
		for(String s: lineas){
			
			StringTokenizer t = new StringTokenizer(s,separator);
			Persona persona = new Persona();
			//revisar
			persona.setNombre(t.nextToken());
			persona.setApellido(t.nextToken());
			persona.setCodigo(t.nextToken());
			persona.setGenero(t.nextToken().charAt(0));
			persona.setEdad(Byte.parseByte(t.nextToken()));
			
			addPersona(persona);
		}
		
	}
	
	public void addPersona(Persona persona){
		   personas.add(persona);
		}
	
//	public void writerArchivo(String ruta,String nombre , boolean modoEscritura){
//		
//		archivo = new ArchivoPersona();
//		archivo.setRuta(ruta);
//		archivo.setNombre(nombre);
//		archivo.setModoEscritura(modoEscritura);
//		archivo.Open();
//		
//		for(Persona p:personas){
//			
//			String registro = p.getCodigo()+separator+p.getApellido()+separator+p.getNombre()+separator+p.getEdad()+separator+p.getGenero();
//			archivo.writer(registro);
//		}
//		
//		
//		
//		
//	}
	

}
