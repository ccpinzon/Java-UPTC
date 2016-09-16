package runner;

import javax.swing.JOptionPane;

import logic.Computador;
import logic.GestionComputador;
import logic.Hadware;
import recursividad.serieFibonacci;

public class runner {
	
	public static void main(String[] args) {
		
		int n = 10;
		for(int i=n; i>=1;i--){
			System.out.println(recursividad.serieFibonacci.FiboRecursivo(i));}
		
		
		GestionComputador gescomp = new GestionComputador();
		
		
		
		Computador co = new Computador();
		co.setMarca("aell");
		co.setSerial("sasde");
		co.setTamanoPantalla(15);
		co.agregarHadware(new Hadware("awsd","ram",15000));
		co.agregarHadware(new Hadware("eser","mouse",20000));
		co.agregarHadware(new Hadware("bser","pntena",10000));
		co.calcularTotal();
		co.ordenarCosto();
		
		
		Computador co1 = new Computador();
		co1.setMarca("vaio");
		co1.setSerial("zs4wef");
		co1.setTamanoPantalla(20);
		co1.agregarHadware(new Hadware("eryt","ram",10000));
		co1.agregarHadware(new Hadware("brwda","mouse",30000));
		co1.agregarHadware(new Hadware("zaqr","pntena",100000));
		co1.calcularTotal();
		co1.ordenarCosto();
			
		gescomp.agregarComputador(co);
		gescomp.agregarComputador(co1);
		gescomp.ordenarComputadores();
		
			
		
		
		System.out.println(gescomp.visualizarComputador());
	}

}
