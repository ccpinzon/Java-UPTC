package logic;

import javax.swing.ImageIcon;


public class Goku extends Thread {

	private Hilo hilo;

	public Goku(Hilo hilo) {
		super();
		this.hilo = hilo;
	}

	public void run() {
		boolean var = true;

		while (true) {
			if (var == true) {
				for (int i = 1; i < 3; i++) {

					try {
						sleep(1500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					hilo.goku();
					hilo.getVentanaPrincipal().getPanelIzquierdo().getLbGoku().setIcon(new ImageIcon(getClass().getResource("/Recursos/Imagenes/Goku"+i+".png")));

				}
				var = false;
			}
			if (var == false) {
				for (int i = 3; i > 1; i--) {

					try {
						sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					hilo.goku();
					hilo.getVentanaPrincipal().getPanelIzquierdo().getLbGoku().setIcon(new ImageIcon(getClass().getResource("/Recursos/Imagenes/Goku"+i+".png")));
				}
				var = true;
			}
		}
	}
}
