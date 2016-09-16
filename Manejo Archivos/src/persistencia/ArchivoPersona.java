package persistencia;

import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ArchivoPersona extends ArchivoPlano {
	
	public ArrayList<String> reader() throws IOException{
		
		ArrayList<String> datos = new ArrayList<String>();
		String contenido = readerArchivo();
		StringTokenizer tokens = new StringTokenizer(contenido,"\n");
		
		while(tokens.hasMoreTokens()){
			
			String linea = tokens.nextToken();
			datos.add(linea);
		}
		
		return datos;}
	
//	public void writer(String registro){
//		
//		try {
//			writeArchivo(registro);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	 

	

}
