package provar;

import compromisos.Comunicacion;

import cosas.Cucu;
import seres.Adorno;
import seres.Racional;
import seres.SerVivo;
import seres.SerVivo.Organo;

public class runner {
	
	public static void main(String[] args) {
		
		Racional vicky = new Racional();
		vicky.setApellido("vwltran");
		vicky.setDescripcion("Ser Humano");
		vicky.setNombre("Victoria");
		
		SerVivo.Organo organo = vicky.new Organo(); // intancxiar en la composicion
		organo.setNombre("Corazon");
		organo.setFuncion("Bombear Sangre");
		vicky.agregarOrgano(organo);
		
		organo = vicky.new Organo();
		organo.setNombre("Cerebro");;
		organo.setFuncion("Pensar");
		vicky.agregarOrgano(organo);
		
		Cucu cucu = new Cucu();
		cucu.setMarca("javaco");
		
		Adorno adorno = new Adorno();
		adorno.setDescripcion("arete");
		adorno.setObjetivo("probocar a los ladrones");
		vicky.agregarAdorno(adorno);
		
		 System.out.println(vicky);
		 comunica(vicky);
		 comunica(cucu);
		 
		
	}
	
	public static void comunica(Comunicacion comunicacion){
		
		System.out.println(comunicacion.getClass().getSimpleName()+" "+comunicacion.comunicarse() );
	}

}
