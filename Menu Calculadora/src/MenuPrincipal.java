

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class MenuPrincipal extends JMenuBar {

	private JMenu Inicio, operaciones, ayuda;
	private JMenuItem sumar, restar, multiplicar, dividir, limpiar, salir;
	private MenuCalculadora ventana;

	public MenuPrincipal(MenuCalculadora ventana) {

		this.ventana = ventana;

		Inicio = new JMenu("Inicio");
		Inicio.setMnemonic('I');

		ayuda = new JMenu("?");
		operaciones = new JMenu("Operaciones");

		// JmenuItems

		sumar = new JMenuItem("Sumar");
		sumar.setActionCommand(GestioEventos.SUMAR);
		sumar.addActionListener(ventana.getGestioEventos());
		
		restar = new JMenuItem("Restar");
		restar.setActionCommand(GestioEventos.MENOS);
		restar.addActionListener(ventana.getGestioEventos());
		
		multiplicar = new JMenuItem("Multiplicar");
		multiplicar.setActionCommand(GestioEventos.MULTIPLICAR);
		multiplicar.addActionListener(ventana.getGestioEventos());
		dividir = new JMenuItem("Dividir");
		dividir.setActionCommand(GestioEventos.DIVIDIR);
		dividir.addActionListener(ventana.getGestioEventos());

		limpiar = new JMenuItem("Limpiar");
		limpiar.setActionCommand(GestioEventos.LIMPIAR);
		limpiar.addActionListener(ventana.getGestioEventos());

		salir = new JMenuItem("Salir");
		salir.setActionCommand(GestioEventos.SALIR);
		salir.addActionListener(ventana.getGestioEventos());
		salir.setIcon(new ImageIcon("recursos/iconos/saliricon.png"));
		salir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));
		

		this.add(Inicio);

		this.add(ayuda);
		Inicio.add(operaciones);

		operaciones.add(sumar);
		operaciones.add(restar);
		operaciones.add(multiplicar);
		operaciones.add(dividir);

		Inicio.add(limpiar);
		Inicio.addSeparator();
		Inicio.add(salir);

	}
}
