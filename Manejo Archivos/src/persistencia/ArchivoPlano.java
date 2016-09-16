package persistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ArchivoPlano {

	private File archivo;
	private boolean modoEscritura;
	private String nombre, ruta;
	
	public ArchivoPlano() {
		// TODO Auto-generated constructor stub
	}

	public boolean getModoEscritura() {
		return modoEscritura;
	}

	public void setModoEscritura(boolean modoEscritura) {
		this.modoEscritura = modoEscritura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	

	public void Open(){
		
		archivo = new File("recursos/Archivos/datos.txt");
		
	}
	
//	public void writeArchivo(Object registro) throws IOException{
//		
//		FileWriter guardar = new FileWriter(archivo);
//		PrintWriter salida = new PrintWriter(guardar);
//		salida.print(registro);
//		salida.close();
//		
//		
//		
//		
//	}
	
	public String readerArchivo() throws IOException{
		
		String salida = new String();
		FileReader lectura = new FileReader(archivo);
		BufferedReader linea= new BufferedReader(lectura);
		String aux = new String();
		
		while((aux=linea.readLine())!=null){
			
			salida+=aux+"\n";
		}

		
		return salida;
		}


	

}
