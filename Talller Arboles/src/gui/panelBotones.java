package gui;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class panelBotones extends JPanel {

	private VentanaPrincipal ventanaPrincipal;
	private JLabel lbCod;
	private JPanel panel1, panel2;
	private JLabel lbDes;
	private JLabel lbValor;
	private JLabel lbCant;
	private JTextField txCod;
	private JTextField txNombre;
	private JTextField txEdad;
	private JTextField txSemestre;
	private JButton btAgregar;

	private JButton btEliminar;

	public panelBotones(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
		this.setLayout(new GridLayout(1,2));
		initComponets();
		agrComponets();
	}

	private void initComponets() {

		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(4, 2));
		//filas , columnas
		panel2 = new JPanel();
		panel2.setLayout (new GridBagLayout()); // Le ponemos el GridBagLayout
		
		
		

		lbCod = new JLabel("Codigo: ");
		lbDes = new JLabel("Nombre: ");
		lbValor = new JLabel("Edad: ");
		lbCant = new JLabel("n� Semestre:");

		txCod = new JTextField();
		txNombre = new JTextField();
		txEdad = new JTextField();
		txSemestre = new JTextField();

		btAgregar = new JButton("Agregar");
		btAgregar.setActionCommand(GestionEventos.AGREGAR);
		btAgregar.addActionListener(ventanaPrincipal.getGestionEventos());
		
		btEliminar = new JButton("Eliminar");
		btEliminar.setActionCommand(GestionEventos.ELIMINAR);
		btEliminar.addActionListener(ventanaPrincipal.getGestionEventos());

	}

	private void agrComponets() {
		panel1.add(lbCod);
		panel1.add(txCod);
		panel1.add(lbDes);
		panel1.add(txNombre);
		panel1.add(lbValor);
		panel1.add(txEdad);
		panel1.add(lbCant);
		panel1.add(txSemestre);
		
		
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 0; // El �rea de texto empieza en la columna cero.
		constraints.gridy = 1; // El �rea de texto empieza en la fila cero
		constraints.gridwidth = 1; // El �rea de texto ocupa dos columnas.
		constraints.gridheight = 1; // El �rea de texto ocupa 2 filas.
		panel2.add (btAgregar, constraints);
		


		
		constraints.gridx =1;
		constraints.gridy = 1;
		constraints.gridwidth = 3;
		constraints.gridheight = 1;
		
	
		panel2.add(btEliminar,constraints);
		
		this.add(panel1);
		this.add(panel2);
	}

	public JTextField getTxCod() {
		return txCod;
	}

	public void setTxCod(JTextField txCod) {
		this.txCod = txCod;
	}

	public JTextField gettxNombre() {
		return txNombre;
	}

	public void settxNombre(JTextField txNombre) {
		this.txNombre = txNombre;
	}

	public JTextField gettxEdad() {
		return txEdad;
	}

	public void settxEdad(JTextField txEdad) {
		this.txEdad = txEdad;
	}

	public JTextField gettxSemestre() {
		return txSemestre;
	}

	public void settxSemestre(JTextField txSemestre) {
		this.txSemestre = txSemestre;
	}

	public JButton getBtAgregar() {
		return btAgregar;
	}

	public void setBtAgregar(JButton btAgregar) {
		this.btAgregar = btAgregar;
	}

	public JButton getBtEliminar() {
		return btEliminar;
	}

	public void setBtEliminar(JButton btEliminar) {
		this.btEliminar = btEliminar;
	}
	
	

}
