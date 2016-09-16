package logic;

import javax.swing.ImageIcon;


public class Cell extends Thread{
	
	private Hilo hilo;

	public Cell(Hilo hilo) {
		super();
		this.hilo = hilo;
	}
	public void run(){
		boolean var = true;

		while (true) {
			if (var == true) {
				for (int i = 1; i < 3; i++) {
					hilo.cell();
					hilo.getVentanaPrincipal().getPanelDerecho().getLbCell().setIcon(new ImageIcon(getClass().getResource("/Recursos/Imagenes/Cell"+i+".png")));
					
				}
				var = false;
			}
			if (var == false) {
				for (int i = 3; i > 1; i--) {
					hilo.cell();
					hilo.getVentanaPrincipal().getPanelDerecho().getLbCell().setIcon(new ImageIcon(getClass().getResource("/Recursos/Imagenes/Cell"+i+".png")));
				}
				var = true;
			}
		}
	}
}
