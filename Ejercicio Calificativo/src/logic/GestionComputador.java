package logic;


import java.util.ArrayList;
import java.util.Collections;

public class GestionComputador {
	
	private ArrayList<Computador> computadores;

	public GestionComputador() {
		
		computadores = new ArrayList<Computador>();
		
	}

		
	public void agregarComputador (Computador com){
		computadores.add(com);
	}
	
	public void ordenarComputadores(){
		
		
		for(int i= 1; i<computadores.size();i++){
			int pos =i-1;
			
			Computador aux= computadores.get(i);			
			while(pos>=0 && aux.compareTo(computadores.get(pos))<0){
			computadores.set(pos+1,computadores.get(pos));
			pos--;
			
			}computadores.set(pos+1,aux);
		}
		
		
		
	}

	public String visualizarComputador(){
		
		StringBuffer salida = new StringBuffer();
		for(Computador compu: computadores){
			salida.append(compu+"\n");
			
		}
		return salida.toString();
		
		
	}

}
