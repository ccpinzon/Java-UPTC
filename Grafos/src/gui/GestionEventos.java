package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GestionEventos implements ActionListener, KeyListener  , MouseListener{

	public static final String BT_GENERAR = "BotonGenerar";
	public static final String BT_AGREGAR_ARISTA = "BotonAgregarArista";
	public static final String BT_VER = "BotonVer";

	private VentanaPrincipal ventanaPrincipal;

	public GestionEventos(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals(BT_GENERAR)) {
			ventanaPrincipal.btnGenerar();
		}else if (e.getActionCommand().equals(BT_AGREGAR_ARISTA)) {
			ventanaPrincipal.btnAgregarArista();
		}else if (e.getActionCommand().equals(BT_VER)) {
			ventanaPrincipal.btnVer();
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

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
		ventanaPrincipal.crearVertice(ventanaPrincipal.getPanelDibujo().getGraphics(), e.getX(), e.getY());

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
