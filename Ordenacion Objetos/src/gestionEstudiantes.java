import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;


public class gestionEstudiantes {
	
	private ArrayList<Estudiante> estudaintes;

	public gestionEstudiantes() {
		estudaintes= new ArrayList<Estudiante>();
	}
	
	public void agregarEstudiante(Estudiante es){
		
		estudaintes.add(es);
	}
	
	

	public void ordenarEstudiante(){
		
		for(int i=1; i<estudaintes.size();i++){
			
			int pos=i-1;
			Estudiante aux = estudaintes.get(i);
			while(pos>=0 && aux.compareTo(estudaintes.get(pos))<0){
				
				estudaintes.set(pos+1,estudaintes.get(pos));
				pos--;
				
			}
			estudaintes.set(pos+1, aux);
		}
		
		
	}
	
	public Estudiante buscar(String codigoww){
		
		for(Estudiante estu:estudaintes){
			
				
			if(estu.getCodigo().equals(codigoww)){
				return estu;
				
			}
			
						
			
		}
		return null;
		
			
				
	}
	
	
	
	
	public String visualizarEstudiante(){
		
		StringBuffer salida = new StringBuffer();
		for(Estudiante estudiante: estudaintes){
			salida.append(estudiante+"\n");
			
		}
		return salida.toString();
		
		
	}
	
	public void ordenarEdad(){
		
		Collections.sort(estudaintes,new ComparatorEdad());
	}

	public void ordenarNombre(){
		Collections.sort(estudaintes, new ComparatorNombre());
		
	}

}
