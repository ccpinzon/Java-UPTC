package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class PanelMenus extends JMenuBar{
	
	private JMenu Inicio, Mostrar, ayuda;
	private JMenuItem Todo, Fecha,Hora, Numero,Duracion,Costo,Abrir,Salir,AcercaDe;
	private VentanaPrincipal ventanaPrincipal;
	
	public PanelMenus(VentanaPrincipal ventanaPrincipal) {
		
		this.ventanaPrincipal=ventanaPrincipal;
		Inicio = new JMenu("Inicio");
		Inicio.setMnemonic('I');
		
		ayuda = new JMenu("?");
		
		
		Mostrar = new JMenu("Mostrar");
		
		Todo = new JMenuItem("Todo");
		Todo.setActionCommand(GestionEventos.TODO);
		Todo.addActionListener(ventanaPrincipal.getEventos());
		
		Fecha = new JMenuItem("Fecha");
		Fecha.setActionCommand(GestionEventos.FECHA);
		Fecha.addActionListener(ventanaPrincipal.getEventos());
		
		Hora = new JMenuItem("Hora");
		Hora.setActionCommand(GestionEventos.HORA);
		Hora.addActionListener(ventanaPrincipal.getEventos());
		
		Duracion = new JMenuItem("Duracion");
		Duracion.setActionCommand(GestionEventos.DURACION);
		Duracion.addActionListener(ventanaPrincipal.getEventos());
		
		Numero = new JMenuItem("Numero");
		Numero.setActionCommand(GestionEventos.NUMERO);
		Numero.addActionListener(ventanaPrincipal.getEventos());
		
		Costo = new JMenuItem("Costo");
		Costo.setActionCommand(GestionEventos.COSTO);
		Costo.addActionListener(ventanaPrincipal.getEventos());
		
		Abrir = new JMenuItem("Abrir");
		Abrir.setActionCommand(GestionEventos.ABRIR);
		Abrir.addActionListener(ventanaPrincipal.getEventos());
				
		Salir = new JMenuItem("Salir");
		Salir.setActionCommand(GestionEventos.SALIR);
		Salir.addActionListener(ventanaPrincipal.getEventos());
		Salir.setIcon(new ImageIcon(("recursos/imagenes/salir.jpg")));
		Salir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));
		
		AcercaDe = new JMenuItem("Acerca De");
		AcercaDe.setActionCommand(GestionEventos.AYUDA);
		AcercaDe.addActionListener(ventanaPrincipal.getEventos());
		
		
		this.add(Inicio);
		this.add(ayuda);
		

		Inicio.add(Abrir);
		Inicio.addSeparator();
		Inicio.add(Mostrar);

		Mostrar.add(Todo);
		Mostrar.add(Fecha);
		Mostrar.add(Hora);
		Mostrar.add(Numero);
		Mostrar.add(Duracion);
		Mostrar.add(Costo);
		Inicio.addSeparator();
		Inicio.add(Salir);
		
		ayuda.add(AcercaDe);
	}

}
