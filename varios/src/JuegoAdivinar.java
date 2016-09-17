import javax.swing.JOptionPane;


public class JuegoAdivinar {

	public static void main(String[] args) {
		 
		int respuesta=0; 
		int intentos=0 ; 
		int num=(int) (Math.random()*100); 
		boolean acertado=false; 
		 
		while(!acertado){ 
	   respuesta = Integer.parseInt(JOptionPane.showInputDialog(null,"Adivina: un numero de 1 a 100","Adivinar",3));
		if(respuesta<num)
		{JOptionPane.showMessageDialog(null, "el numero es mayor al ingresado ","Adivinar",3);}
		else if (respuesta>num)
		{JOptionPane.showMessageDialog(null, "el numero es menor al ingresado ","Adivinar",3);} 
		else if (respuesta==num){ 
		acertado=true;} 
		intentos++;} 
		JOptionPane.showMessageDialog(null, "Has adivinado el numero ","Adivinar",3);
		JOptionPane.showMessageDialog(null, "has necesitado "+intentos+" intentos","Adivinar",3); } }


