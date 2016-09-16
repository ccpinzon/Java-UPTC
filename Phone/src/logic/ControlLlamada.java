package logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ControlLlamada {

	private File archivo;
	private String separator, ruta;
	private ArrayList<Llamada> llamadas;

	public ControlLlamada() {

		llamadas = new ArrayList<>();
		

	}

	

	public String getRuta() {
		return ruta;
	}



	public void setRuta(String ruta) {
		this.ruta = ruta;
	}



	public String readerArchivo() throws IOException {

		archivo = new File(ruta);
		String salida = new String();
		FileReader lectura = new FileReader(archivo);
		BufferedReader linea = new BufferedReader(lectura);
		String aux = new String();
		while ((aux = linea.readLine()) != null) {
			salida += aux + "\n";
		}
		return salida;
	}

	public ArrayList<String> reader() throws IOException {

		ArrayList<String> datos = new ArrayList<String>();
		String contenido = readerArchivo();
		StringTokenizer tokens = new StringTokenizer(contenido, "\n");

		while (tokens.hasMoreTokens()) {

			String linea = tokens.nextToken();
			datos.add(linea);
		}

		return datos;
	}

	public ArrayList<Llamada> readArchivo(String rutita) throws IOException {

		setRuta(rutita);
		
		
		ArrayList<String> lineas = reader();
		separator = " ";

		for (String s : lineas) {

			StringTokenizer t = new StringTokenizer(s, separator);
			Llamada llamada = new Llamada();
     		llamada.setFecha(t.nextToken());
			llamada.setHora(t.nextToken());
			llamada.setNumero(t.nextToken());
			llamada.setDuracion(t.nextToken());
			llamada.setCosto(Double.parseDouble(t.nextToken()));
            
			llamadas.add(llamada);
			

			
          
		}
		//System.out.println(llamadas);
		return llamadas;
		
	}

	

	public static void main(String[] args) throws IOException {
		ControlLlamada l = new ControlLlamada();
		l.readArchivo("recursos/archivos/datos.txt");
	}

}
