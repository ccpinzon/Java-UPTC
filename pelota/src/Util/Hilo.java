package Util;

import java.util.Random;

import logic.Pelota;
import gui.VentanaPrincipal;

public class Hilo extends Thread {

	private VentanaPrincipal ventanaPrincipal;
	private Pelota pelota;

	public Hilo(VentanaPrincipal ventanaPrincipal, Pelota pelota) {
		super();
		this.ventanaPrincipal = ventanaPrincipal;
		this.pelota = pelota;
	}
	public void run(){
		int aux= new Random().nextInt(2);
		boolean movimiento = aux ==0? true:false;
		boolean direccion = aux ==0? true:false;
		while(true){

			ventanaPrincipal.dibujarPelota(pelota);
			try {
				sleep(Math.round(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ventanaPrincipal.moverPelota(pelota,movimiento,direccion);
			
			
		}
		
		
	}

}
