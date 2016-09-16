

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;

/**
 * @author user
 *
 */
public class AlgoritmosORdenacion {
	private ArrayList<Integer> numeros;
	private Calendar tiempoInicio, tiempoFinal;
	private int intercambios;
	private String descripcion;
	
	public AlgoritmosORdenacion(String descripcion){
		numeros=new ArrayList<Integer>();
		tiempoInicio=Calendar.getInstance();
		tiempoFinal=Calendar.getInstance();
		intercambios=0;
		this.descripcion=descripcion;
	}
			
	public AlgoritmosORdenacion(String descripcion, int tamano){
		this (descripcion);		
		generarNumeros(tamano);	
	}
	public void generarNumeros(int tamano){
		Random aleatorio=new Random();
		numeros=new ArrayList<Integer>();
		for ( int i=0;i<tamano;i++){
			numeros.add(aleatorio.nextInt(100));
		}
	}
	public ArrayList getNumeros(){
			return (ArrayList)numeros.clone();	
	}
	public Calendar getTiempoInicio() {
		return tiempoInicio;
	}

	public void setTiempoInicio(Calendar tiempoInicio) {
		this.tiempoInicio = tiempoInicio;
	}

	public Calendar getTiempoFinal() {
		return tiempoFinal;
	}

	public void setTiempoFinal(Calendar tiempoFinal) {
		this.tiempoFinal = tiempoFinal;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setNumeros(ArrayList<Integer> numeros) {
		this.numeros = numeros;
	}

	public void setIntercambios(int intercambios) {
		this.intercambios = intercambios;
	}

	public void ordenarBurbuja(){
		tiempoInicio=Calendar.getInstance();
	for(int i=numeros.size();i>0;i--){
		for (int j=0; j<i-1;j++){
			if(numeros.get(j)>numeros.get(j+1)){
			 int aux=numeros.get(j);
			 numeros.set(j, numeros.get(j+1));
			 numeros.set(j+1, aux);
			intercambios++;
			}
		}		
	}
	tiempoFinal=Calendar.getInstance();
	}
	public void ordenarSeleccion(){
		tiempoInicio=Calendar.getInstance();
		for (int i=0;i<numeros.size()-1;i++){
			int menor=numeros.get(i);
			int pos=i;
			for (int j=i+1; j<numeros.size();j++){
				if(numeros.get(j)<menor){
					menor=numeros.get(j);
					pos=j;
				}
			}
			if(menor!=numeros.get(i)){
				numeros.set(pos,numeros.get(i));
				numeros.set(i,menor);
				intercambios++;
			}
		}
		tiempoFinal=Calendar.getInstance();
		}
	public void ordenarInsercion(){
		tiempoInicio=Calendar.getInstance();
		for (int i=1; i<numeros.size();i++){
			int aux=numeros.get(i);
			int pos=i-1;
			while (pos>=0 && aux<numeros.get(pos)){
				numeros.set(pos+1,numeros.get(pos));
				pos--;
			}
			numeros.set(pos+1,aux);
			intercambios++;
		}
		tiempoFinal=Calendar.getInstance();
	}
	public void ordenarShell(){
		tiempoInicio=Calendar.getInstance();
		int incremento = numeros.size()/2;
		while (incremento>0){
			for(int i = incremento;i<numeros.size();i++){
				for (int j=i; j>=incremento&& numeros.get(j-incremento)>numeros.get(j);j-=incremento){
					int temp=numeros.get(j);
					numeros.set(j, numeros.get(j-incremento));
					numeros.set(j-incremento, temp);
					intercambios++;
				}
			}
			incremento=incremento==2?1:(int)Math.round(incremento/2.2);
		}
		tiempoFinal=Calendar.getInstance();
	}
	public void ordenarQuickSort(){
		
		
		
	
	}
	
	
	public AlgoritmosORdenacion clonar(){
		AlgoritmosORdenacion nuevo=new AlgoritmosORdenacion(new String());
		for (Integer numero:numeros){
			nuevo.numeros.add(numero);
		}
		return nuevo;
	}
	public void setDescripcion(String descripcion){
		this.descripcion=descripcion;
	}
	public int getIntercambios(){
		return intercambios;
	}
	public String calcularDuracion(){
		int segundos=tiempoFinal.get(Calendar.SECOND)-tiempoInicio.get(Calendar.SECOND);
		int milesimas=tiempoFinal.get(Calendar.MILLISECOND)-tiempoInicio.get(Calendar.MILLISECOND);
		
		if (milesimas<0){
			milesimas+=1000;
		}
			return (segundos+":"+milesimas);		
	}

	@Override
	public String toString() {
		return "AlgoritmosORdenacion [numeros=" + numeros ;
	}	
}


