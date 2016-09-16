import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class DatosPrimos {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {


		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		String nombre = new String();
		byte edad=0;
		int sueldo=0;
		double ventas=0.0;
		
		DataOutputStream salida = new DataOutputStream(new FileOutputStream("resources/files/datos.dat",true));
		
		for (int i=1; i<=2; i++){
			
		System.out.println("Nombre: ");
		nombre =entrada.readLine();
		
		System.out.println("Edad: ");
		edad= Byte.parseByte(entrada.readLine());
		
		System.out.println("Sueldo: ");
		sueldo = Integer.parseInt(entrada.readLine());
		
		System.out.println("Ventas: ");
		ventas = Double.parseDouble(entrada.readLine());
		
		salida.writeUTF(nombre);
		salida.writeByte(edad);
		salida.writeInt(sueldo);
		salida.writeDouble(ventas);
		
		salida.close();
		System.out.println("***FIN***");
		DataInputStream lectura = new DataInputStream( new FileInputStream("resources/files/datos.dat"));
		try{
		while ( true ){
		String nomAux = lectura.readUTF( );
		byte edAux = lectura.readByte( );
		int s1Aux = lectura.readInt( );
		double vtaAux = lectura.readDouble( );
		System.out.println( nomAux + "\t" + edAux + "\t" + s1Aux + "\t" + vtaAux );
		}
		}catch( EOFException eof ){
		System.out.println("FIN ARCHIVO");
		lectura.close( );
		}
		
		
		}

	}

	

}
