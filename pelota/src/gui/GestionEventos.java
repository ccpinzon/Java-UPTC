package gui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GestionEventos implements MouseListener{
	
	private VentanaPrincipal ventanaPrincipal;
	
	public GestionEventos(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("evenrois");
		ventanaPrincipal.crearPelota( e.getX(), e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
