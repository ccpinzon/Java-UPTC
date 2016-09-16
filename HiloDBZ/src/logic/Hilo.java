package logic;

import Gui.VentanaPrincipal;


public class Hilo {
	private boolean listo = true;
	private VentanaPrincipal ventanaPrincipal;
	
	public Hilo(VentanaPrincipal ventanaPrincipal) {
		super();
		this.ventanaPrincipal = ventanaPrincipal;
	}

	public synchronized void cell() {
		while (listo == true) {
			try {
				wait();
			} catch (InterruptedException e) { }
		}
		listo = true;
		notifyAll();
	}

	public synchronized void goku() {
		while (listo == false) {
			try {
				wait();
			} catch (InterruptedException e) { }
		}
		listo = false;
		notifyAll();
	}

	public VentanaPrincipal getVentanaPrincipal() {
		return ventanaPrincipal;
	}

	public void setVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}

}
