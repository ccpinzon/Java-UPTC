
public class runner {
	
	public static void main(String[] args){
		
		reloj miventana = new reloj();
		miventana.setVisible(true);
		
		Contador hiloUno = new Contador("Hilo Uno");
		Contador hiloDos = new Contador("hilo Dos");
		Contador hiloTres = new Contador("Hilo Tres");
		
		Thread h1 = new Thread(hiloUno);
		Thread h2 = new Thread(hiloDos);
		Thread h3 = new Thread(hiloTres);
		h1.start();
		h2.start();
		h3.start();
	}
	

}
