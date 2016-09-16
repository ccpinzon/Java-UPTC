
public class runner {

	
	
	public static void main(String[] args) {
		
		//String x= "8";
		//String y= "1234";
		//System.out.println(x.compareTo(y));
		
		gestionEstudiantes datos = new gestionEstudiantes();
		datos.agregarEstudiante(new Estudiante("6923","Agudelo Restrepo","anglea Maria",27));
		datos.agregarEstudiante(new Estudiante("2345","Pinzon Peres","d",30));
		datos.agregarEstudiante(new Estudiante("7823","qgudelo Restrepo","vn",58));
		datos.agregarEstudiante(new Estudiante("4352","zgudelo Restrepo","cnglea",27));
		
		
	    //datos.ordenarEstudiante();
	    //datos.buscar("2345");
		String n ="234";
	    if(datos.buscar(n)!=null){
	    	System.out.println(datos.buscar(n));
	    }
	    else{
	    	System.out.println("no existe");}
	    
	   System.out.println(datos.visualizarEstudiante());
	    
	    //System.out.println(datos.buscar("4l"));
		//System.out.println(datos.visualizarEstudiante());
		
		
	//	datos.ordenarEdad();
		//System.out.println(datos.visualizarEstudiante());
		
	//	datos.ordenarNombre();
		//System.out.println(datos.visualizarEstudiante());
		}
	
}
