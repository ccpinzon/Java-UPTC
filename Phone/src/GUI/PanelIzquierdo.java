package GUI;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BoxLayout;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class PanelIzquierdo extends JPanel{
	
	private VentanaPrincipal ventanaPrincipal;
	
	
	public PanelIzquierdo(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal=ventanaPrincipal;
		
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
	
		
		
	}

}
