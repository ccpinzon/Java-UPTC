package gui;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class panelRadios extends JPanel {
	private VentanaPrincipal ventanaPrincipal;
	private JRadioButton radioInOrden;
	private JRadioButton radioPreOrden;
	private JRadioButton radioPostOrden;
	private JRadioButton radioAplitudHojas;
	private JRadioButton radioAplitudRaiz;
	private JLabel lbInOrden;
	private JButton btBuscar;
	private ButtonGroup grupoBotones;

	public panelRadios(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
		this.setLayout(new FlowLayout());
		initComponets();
		agrComponets();
	}

	private void initComponets() {
		grupoBotones = new ButtonGroup();
		radioInOrden = new JRadioButton("In-Orden");
		radioInOrden.setActionCommand(GestionEventos.INORDEN);
		radioInOrden.addActionListener(ventanaPrincipal.getGestionEventos());

		radioPreOrden = new JRadioButton("Pre-Orden");
		radioPreOrden.setActionCommand(GestionEventos.PREORDEN);
		radioPreOrden.addActionListener(ventanaPrincipal.getGestionEventos());

		radioPostOrden = new JRadioButton("Post-Orden");
		radioPostOrden.setActionCommand(GestionEventos.POSTORDEN);
		radioPostOrden.addActionListener(ventanaPrincipal.getGestionEventos());
		
		radioAplitudHojas = new JRadioButton("Aplitud-Hojas");
		radioAplitudHojas.setActionCommand(GestionEventos.RAIZHOJAS);
		radioAplitudHojas.addActionListener(ventanaPrincipal.getGestionEventos());
		
		radioAplitudRaiz = new JRadioButton("Aplitud-Raiz");
		radioAplitudRaiz.setActionCommand(GestionEventos.HOJASRAIZ);
		radioAplitudRaiz.addActionListener(ventanaPrincipal.getGestionEventos());
		
		
		btBuscar = new JButton("Buscar");
		btBuscar.setActionCommand(GestionEventos.BUSCAR_CODIGO);
		btBuscar.addActionListener(ventanaPrincipal.getGestionEventos());
		
		grupoBotones.add(radioAplitudHojas);
		grupoBotones.add(radioAplitudRaiz);
		grupoBotones.add(radioInOrden);
		grupoBotones.add(radioPostOrden);
		grupoBotones.add(radioPreOrden);

	}

	private void agrComponets() {
		this.add(radioInOrden);
		this.add(radioPreOrden);
		this.add(radioPostOrden);
		this.add(radioAplitudHojas);
		this.add(radioAplitudRaiz);
		this.add(btBuscar);

	}

	public JRadioButton getRadioInOrden() {
		return radioInOrden;
	}

	public void setRadioInOrden(JRadioButton radioInOrden) {
		this.radioInOrden = radioInOrden;
	}

	public JRadioButton getRadioPreOrden() {
		return radioPreOrden;
	}

	public void setRadioPreOrden(JRadioButton radioPreOrden) {
		this.radioPreOrden = radioPreOrden;
	}

	public JRadioButton getRadioPostOrden() {
		return radioPostOrden;
	}

	public void setRadioPostOrden(JRadioButton radioPostOrden) {
		this.radioPostOrden = radioPostOrden;
	}

	public JRadioButton getRadioAplitudHojas() {
		return radioAplitudHojas;
	}

	public void setRadioAplitudHojas(JRadioButton radioAplitudHojas) {
		this.radioAplitudHojas = radioAplitudHojas;
	}

	public JRadioButton getRadioAplitudRaiz() {
		return radioAplitudRaiz;
	}

	public void setRadioAplitudRaiz(JRadioButton radioAplitudRaiz) {
		this.radioAplitudRaiz = radioAplitudRaiz;
	}

	public JButton getBtBuscar() {
		return btBuscar;
	}

	public void setBtBuscar(JButton btBuscar) {
		this.btBuscar = btBuscar;
	}
	
}
