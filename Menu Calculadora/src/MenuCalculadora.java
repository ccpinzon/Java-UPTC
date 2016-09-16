

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MenuCalculadora extends JFrame {

	private PanelBotones panelBotones;
	private PanelDatos panelDatos;
	private GestioEventos gestioEventos;

	private MenuPrincipal MenuPrincipal;

	public MenuCalculadora() {

		this.setLayout(new BorderLayout());
		iniComponentes();
		agrComponentes();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public GestioEventos getGestioEventos() {
		return gestioEventos;
	}

	private void iniComponentes() {
		gestioEventos = new GestioEventos(this);
	    MenuPrincipal = new MenuPrincipal(this);
		panelBotones = new PanelBotones(this);
		panelDatos = new PanelDatos(this);
		
	}

	private void agrComponentes() {
		
		this.add(MenuPrincipal,BorderLayout.NORTH);	
		this.add(panelDatos, BorderLayout.CENTER);
		this.add(panelBotones, BorderLayout.SOUTH);
	}

	public void sumar() {
		int solucion;

		solucion = Integer.parseInt(panelDatos.getTextnumero1().getText())
				+ Integer.parseInt(panelDatos.getTextnumero2().getText());
		panelDatos.getTxresultado().setText(String.valueOf(solucion));

	}

	public void menos() {
		int solucion;

		solucion = Integer.parseInt(panelDatos.getTextnumero1().getText())
				- Integer.parseInt(panelDatos.getTextnumero2().getText());
		panelDatos.getTxresultado().setText(String.valueOf(solucion));
		System.out.println("menos");

	}

	public void dividir() {
		int solucion;

		solucion = Integer.parseInt(panelDatos.getTextnumero1().getText())
				/ Integer.parseInt(panelDatos.getTextnumero2().getText());
		panelDatos.getTxresultado().setText(String.valueOf(solucion));

	}

	public void multiplicar() {
		int solucion;
		solucion = Integer.parseInt(panelDatos.getTextnumero1().getText())
				* Integer.parseInt(panelDatos.getTextnumero2().getText());
		panelDatos.getTxresultado().setText(String.valueOf(solucion));

	}

	public void limpiar() {
		for(int i=0; panelDatos.getComponents().length>i;i++){
			
			              //Limpia todos los JTextField de un JPanel
				           if(panelDatos.getComponents()[i]instanceof JTextField){
			               ((JTextField)panelDatos.getComponents()[i]).setText("");
				           }
			
		}
	}

	public void Salir() {
		int opcion = JOptionPane.showConfirmDialog(null, "Seguro?");
		if(opcion ==JOptionPane.YES_OPTION){
			this.dispose();
		}
	}


}
