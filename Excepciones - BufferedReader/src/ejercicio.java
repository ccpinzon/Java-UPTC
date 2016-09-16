

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;


public class ejercicio {

	
	public static void main(String[] args) throws IOException  {

		BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
		
 int numero=0;
		String cadena =new String();
		
		do{
			
			cadena=e.readLine();
			
			try{
				
			numero= Integer.parseInt(cadena);
			System.out.println(numero);
			}catch(NumberFormatException nfe){
			System.out.println("Error");
			}
		}	while(numero!=99);
		
		
	
	}
}
