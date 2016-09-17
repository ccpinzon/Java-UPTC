package tragamonedas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;





public class PanelMenu extends JMenuBar {
	
	private  JMenu Inicio, ayuda;
	private JMenuItem apostar, salir,acercade;
	
	private VentanaPrincipal ventanaPrincipal;
	
	public PanelMenu(VentanaPrincipal ventanaPrincipal) {
		
		this.ventanaPrincipal=ventanaPrincipal;
		
		//setLayout(new BorderLayout());
		
		Inicio = new JMenu("Inicio");
		Inicio.setMnemonic('I');

		ayuda = new JMenu("?");
		
		
		
		

		// JmenuItems

		apostar = new JMenuItem("Apostar");
		apostar.setActionCommand(GestionEventos.EJECUTAR);
		apostar.addActionListener(ventanaPrincipal.getEventos());
		
		acercade = new JMenuItem("Acerca De");
		acercade.setActionCommand(GestionEventos.AYUDA);
		acercade.addActionListener(ventanaPrincipal.getEventos());
		
		salir = new JMenuItem("Salir");
		salir.setActionCommand(GestionEventos.SALIR);
		salir.addActionListener(ventanaPrincipal.getEventos());
		salir.setIcon(new ImageIcon(getClass().getResource("/recursos/imagenes/salir.jpg")));
		salir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));
		

		
		
		Inicio.add(apostar);
		Inicio.addSeparator();
		Inicio.add(salir);
		
		ayuda.add(acercade);
		
		this.add(Inicio);
		this.add(ayuda);
		
		
	}

}
