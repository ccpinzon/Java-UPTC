package vectores;

import javax.swing.JOptionPane;

public class vector {



	

	
	public static void main(String[] args) {

		int [] Vector;
		int tamano;
		String nombre[];
		
		tamano = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tama�o del vector"));
		Vector = new int[tamano];
		for(int i =0; i<tamano;i++){
			
			Vector[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese el dato "+i+" del vector"));
		}
		// numero mayor:
		int mayor = 1;
		for(int n=0;n<tamano;n++){
			
			if(Vector[n]>mayor){
				mayor = Vector[n];
			}
		}
		
		
	
	// numero menor:
	int menor = 9999;
	for(int n=0;n<tamano;n++){
		
		if(Vector[n]<menor){
			menor = Vector[n];
		}
	}
	
	
	// ordenar vector
	int aux;
	for (int i=0; i<tamano-1; i ++){
		for(int j=0;j<tamano-1;j++){
			if (Vector[j]>Vector[j+1]) {
				aux = Vector[j];
				Vector[j]=Vector[j+1];
				Vector[j+1]= aux;
			}
			
		}
		
	}
	for (int i=0; i<tamano; i ++){
	JOptionPane.showMessageDialog(null,"el orden es: "+Vector[i]);}
		
		
		
		
		
		JOptionPane.showMessageDialog(null, "el numero mayor es: " + mayor+"\n el numero menor es: "+menor);

		
		for (int i=0; i<tamano-1; i ++){
			for(int j=0;j<tamano-1;j++){
				if (Vector[j]>Vector[j+1]) {
					aux = Vector[j];
					Vector[j]=Vector[j+1];
					Vector[j+1]= aux;
				}
				
			}
			
		}
		
		
		
		
		
		
		
	}
	
	
	//orden 
	//pedro  etica 3.5
	//maria  humanidades 4.2
	//carlos fisica 3.8
	//juan  Programacion  3.1
	// luis calculo 4.5
	// andrea algebra 2.8
}
