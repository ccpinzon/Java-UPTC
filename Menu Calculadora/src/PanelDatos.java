

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelDatos extends JPanel {
	private JLabel lbNumeroUno, lbNumeroDos, lbresultado;

	private JTextField textnumero1, textnumero2, txresultado;
	private MenuCalculadora ventana;

	public PanelDatos(MenuCalculadora ventana) {
		this.ventana = ventana;
		this.setLayout(new GridLayout(3, 2, 8, 8));

		initComponentes();
		agreComponentes();

	}

	public JTextField getTextnumero1() {
		return textnumero1;
	}

	public void setTextnumero1(JTextField textnumero1) {
		this.textnumero1 = textnumero1;
	}

	public JTextField getTextnumero2() {
		return textnumero2;
	}

	public void setTextnumero2(JTextField textnumero2) {
		this.textnumero2 = textnumero2;
	}

	public JTextField getTxresultado() {
		return txresultado;
	}

	public void setTxresultado(JTextField txresultado) {
		this.txresultado = txresultado;
	}

	private void initComponentes() {
		lbNumeroUno = new JLabel("Numero uno: ");
		lbNumeroDos = new JLabel("Numero Dos: ");
		lbresultado = new JLabel("Resultado: ");

		textnumero1 = new JTextField(5);
		textnumero1.addKeyListener(ventana.getGestioEventos());
		textnumero2 = new JTextField(5);
		textnumero2.addKeyListener(ventana.getGestioEventos());

		txresultado = new JTextField(5);
		txresultado.addKeyListener(ventana.getGestioEventos());


	}

	private void agreComponentes() {
		this.add(lbNumeroUno);
		this.add(textnumero1);
		this.add(lbNumeroDos);
		this.add(textnumero2);
		this.add(lbresultado);
		this.add(txresultado);

	}
}
