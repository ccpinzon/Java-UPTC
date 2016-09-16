package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

public class VentanaPrincipal extends JFrame {

	private panelTabla pTabla;
	private panelRadios pRadios;
	private panelBotones pBotones;
	private JPanel panelIzquierdo;
	private GestionEventos gestionEventos;

	public VentanaPrincipal() {
// http://tabasco.torreingenieria.unam.mx/ --->>>>
		this.setLayout(new FlowLayout());
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(600, 250);
		// this.setResizable(false);
		initComponets();
		agrComponets();
	}

	private void initComponets() {
		gestionEventos = new GestionEventos(this);
		pTabla = new panelTabla(this);
		
		
		pRadios = new panelRadios(this);
		pRadios.setBorder(new TitledBorder("Agregar Por :"));

		pBotones = new panelBotones(this);
		pBotones.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
		panelIzquierdo = new JPanel();
		panelIzquierdo.setBorder(new TitledBorder("Productos: "));
		panelIzquierdo.setLayout(new GridLayout(2, 1));

	}

	private void agrComponets() {
		panelIzquierdo.add(pTabla);
		panelIzquierdo.add(pBotones);

		this.add(panelIzquierdo);
		this.add(pRadios);

	}

	public GestionEventos getGestionEventos() {
		return gestionEventos;
	}

	public static void main(String[] args) {
		VentanaPrincipal v = new VentanaPrincipal();
		v.setVisible(true);

	}

	public void BtAgregar() {
	System.out.println("agregar");
	}

	public void BtBuscar() {
	System.out.println("buscar");

	}

	public void BtEliminar() {
	System.out.println("Eliminar");

	}

}
