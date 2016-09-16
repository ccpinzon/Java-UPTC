package gui;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class PanelDibujo extends JPanel {
	
	private GestionEventos gestionEventos;

	private VentanaPrincipal ventanaPrincipal;

	public PanelDibujo(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
		this.setLayout(new BorderLayout());
		this.addMouseListener(ventanaPrincipal.getGestionEventos());

	}
	
	public Graphics getGraphics2(){
		return this.getGraphics2();
	}
}
