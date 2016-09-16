package gui;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelBoton extends JPanel {
	
	private JButton btEjecutar;
	private JTextField txTexto;
	private VentanaPrincipal ventanaPrincipal;

	public PanelBoton(VentanaPrincipal ventanaPrincipal) {
		
		this.ventanaPrincipal=  ventanaPrincipal;
		
		setLayout(new FlowLayout());
		
		incializa();
		agrega();
		
	}

	private void incializa() {
		
		txTexto = new JTextField(8);
		txTexto.addKeyListener(ventanaPrincipal.getEventos());
		
		btEjecutar = new JButton("Ejecutar");
		btEjecutar.setActionCommand(GestionEventos.EJECUTAR);
		btEjecutar.addActionListener(ventanaPrincipal.getEventos());
		
		
	}

	private void agrega() {
		
		add(txTexto);
		add(btEjecutar);
		
	}

	public JTextField getTxTexto() {
		return txTexto;
	}

	public void setTxTexto(JTextField txTexto) {
		this.txTexto = txTexto;
	}

	
	
	
	
}
