import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.StringTokenizer;


public class FlujoDeCaracteres {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		final int MAX = 5;
		Random aleatorio = new Random( );
		PrintWriter salida = new PrintWriter( new FileWriter( "resources/files/numeros.txt" ) );
		for ( int i = 1 ; i <= MAX ; i++ ){
		for ( int j = 1 ; j <= MAX ; j++ ){
		salida.print( (aleatorio.nextInt( 89 ) + 11 ) + "\t" );
		}
		salida.println( );
		}
		salida.close( );
		BufferedReader lectura = new BufferedReader( new FileReader( "resources/files/numeros.txt" ) );
		String linea = null;
		while ( ( linea = lectura.readLine( ) ) != null ){
		StringTokenizer token = new StringTokenizer( linea, "\t" );
		int suma = 0;
		while ( token.hasMoreElements( ) ){
		suma += Integer.parseInt( token.nextToken( ) );
		}
		System.out.println( linea + " --> " + suma );
		}
		lectura.close( );



	}
}


