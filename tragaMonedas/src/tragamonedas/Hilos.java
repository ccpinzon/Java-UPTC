package tragamonedas;

import javax.swing.ImageIcon;

public class Hilos extends Thread {
	
	
	private VentanaPrincipal ventanaPrincipal;
	private boolean movimientoUno=true, movimientoDos=true, movimientosTres=true;
	
	public Hilos(VentanaPrincipal ventanaPrincipal) {
		
		this.ventanaPrincipal=ventanaPrincipal;
	}

	
		public void run() {
			
			while(true){
				if(movimientoUno==true){
				
					ventanaPrincipal.getImagenes().getLbImagenUno().setIcon(new ImageIcon(getClass().getResource("/recursos/imagenes/O"+(int)(Math.random()*((11-1)+1))+".png")));
					
				}
				if(movimientoDos==true){
					ventanaPrincipal.getImagenes().getLbImagenDos().setIcon(new ImageIcon(getClass().getResource("/recursos/imagenes/O"+(int)(Math.random()*((11-1)+1))+".png")));
				}
				if(movimientosTres==true){
					ventanaPrincipal.getImagenes().getLbImagenTres().setIcon(new ImageIcon(getClass().getResource("/recursos/imagenes/O"+(int)(Math.random()*((11-1)+1))+".png")));
				}
				
				try {
					sleep(250);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			
			
			
			
		}


		public boolean isMovimientoUno() {
			return movimientoUno;
		}


		public void setMovimientoUno(boolean movimientoUno) {
			this.movimientoUno = movimientoUno;
		}


		public boolean isMovimientoDos() {
			return movimientoDos;
		}


		public void setMovimientoDos(boolean movimientoDos) {
			this.movimientoDos = movimientoDos;
		}


		public boolean isMovimientosTres() {
			return movimientosTres;
		}


		public void setMovimientosTres(boolean movimientosTres) {
			this.movimientosTres = movimientosTres;
		}
	
	
}
