

public class Runner {

	/**
	 * @param args
	 */
	private AlgoritmosORdenacion original;
	private AlgoritmosORdenacion burbuja;
	private AlgoritmosORdenacion seleccion;
	private AlgoritmosORdenacion shell;
	private AlgoritmosORdenacion insercion;
	private AlgoritmosORdenacion quickSort;
	
	public Runner (){
		original= new AlgoritmosORdenacion("Original",999);
	}
	public static void main(String[]args){
		Runner run=new Runner();
		run.inicializar();
		run.ejecutar();
	}
	private void inicializar(){
		burbuja = original.clonar();
		burbuja.setDescripcion("Burbuja");
		burbuja.ordenarBurbuja();
		
		seleccion=original.clonar();
		seleccion.setDescripcion("Seleccion");
		seleccion.ordenarSeleccion();
		
		insercion=original.clonar();
		insercion.setDescripcion("Insercion");
		insercion.ordenarInsercion();
		
		shell=original.clonar();
		shell.setDescripcion("Shell");
		shell.ordenarShell();
		
	}
	private void ejecutar(){
		System.out.println(original.getDescripcion()+"\n"+original);
		System.out.println(burbuja.getDescripcion()+"("+burbuja.getIntercambios()+")["+burbuja.calcularDuracion()+"]\n"+burbuja);
		System.out.println(seleccion.getDescripcion()+"("+seleccion.getIntercambios()+")["+seleccion.calcularDuracion()+"]\n"+seleccion);
		System.out.println(insercion.getDescripcion()+"("+insercion.getIntercambios()+")["+insercion.calcularDuracion()+"]\n"+insercion);
		System.out.println(shell.getDescripcion()+"("+shell.getIntercambios()+")["+shell.calcularDuracion()+"]\n"+shell);
	}
}
/**AlgoritmosORdenacion misnumeros=new AlgoritmosORdenacion(30);
		System.out.println(misnumeros);
		misnumeros.generarNumeros(100);
		
		System.out.println(misnumeros+"\n");
		misnumeros.ordenarBurbuja();
		System.out.println(misnumeros);
	}*/