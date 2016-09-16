import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class flujoDatos {

	
	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis = new FileInputStream("resources/files/archivo.txt");
		System.out.println("se van a procesar"+fis.available()+"Bytes");
		
		int dato;
		
		while((dato=fis.read())!=-1){
			System.out.println((char)dato);	
			
		}
		fis.close();
		
		FileOutputStream fosUno = new FileOutputStream("resources/files/salidaUno.txt");
		String mensaje = "la posibilidad de realizar un sueño es  lo que hace que la vida esa interesante";
		
		byte[] datos = mensaje.getBytes();
		for(int i = 0; i< datos.length;i+=2){
			
			
			fosUno.write(datos[i]);
			
		}
		fosUno.close();
		
		
		
		FileOutputStream fosDos = new FileOutputStream("resources/files/salideDataos.txt",true);
		fosDos.write(datos);
		 byte[] firma = "\nPaulo Cohelo".getBytes();
		 fosDos.write(firma);
		 fosDos.close();


	}
	
	
}
