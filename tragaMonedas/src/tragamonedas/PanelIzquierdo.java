package tragamonedas;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class PanelIzquierdo extends JPanel{
	
	
	private VentanaPrincipal ventanaPrincipal;
	
	public PanelIzquierdo(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal=ventanaPrincipal;
		setLayout(new GridLayout(2,1));
		
		setOpaque(false);
		
		
		
	}

}
