package gui;

import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelDibujo extends JPanel{

	private GestionEventos gestionEventos;
	private VentanaPrincipal ventanaPrincipal;
	
	
	public PanelDibujo(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
		this.setBorder(new TitledBorder("Dibujar Aqui"));
		this.addMouseListener(ventanaPrincipal.getGestionEventos());
		
		
		this.setLayout(new FlowLayout());
		
	}
}
