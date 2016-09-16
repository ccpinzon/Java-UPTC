package GUI;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
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

	public panelRadios(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		initComponets();
		agrComponets();
	}

	private void initComponets() {

		radioInOrden = new JRadioButton("In-Orden");

		radioPreOrden = new JRadioButton("Pre-Orden");

		radioPostOrden = new JRadioButton("Post-Orden");
		radioAplitudHojas = new JRadioButton("Aplitud-Hojas");
		radioAplitudRaiz = new JRadioButton("Aplitud-Raiz");

	}

	private void agrComponets() {
		this.add(radioInOrden);
		this.add(radioPreOrden);
		this.add(radioPostOrden);
		this.add(radioAplitudHojas);
		this.add(radioAplitudRaiz);

	}
}
