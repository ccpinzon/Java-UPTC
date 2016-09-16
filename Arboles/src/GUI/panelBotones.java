package GUI;

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
	private JTextField txDes;
	private JTextField txValor;
	private JTextField txCant;
	private JButton btAgregar;
	private JButton btBuscar;
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
		lbDes = new JLabel("Descripcion: ");
		lbValor = new JLabel("Valor: ");
		lbCant = new JLabel("Cantidad:");

		txCod = new JTextField();
		txDes = new JTextField();
		txValor = new JTextField();
		txCant = new JTextField();

		btAgregar = new JButton("Agregar");
		btAgregar.setActionCommand(GestionEventos.AGREGAR);
		btAgregar.addActionListener(ventanaPrincipal.getGestionEventos());
		btBuscar = new JButton("Buscar");
		btBuscar.setActionCommand(GestionEventos.BUSCAR_CODIGO);
		btBuscar.addActionListener(ventanaPrincipal.getGestionEventos());
		btEliminar = new JButton("Eliminar");
		btEliminar.setActionCommand(GestionEventos.ELIMINAR);
		btEliminar.addActionListener(ventanaPrincipal.getGestionEventos());

	}

	private void agrComponets() {
		panel1.add(lbCod);
		panel1.add(txCod);
		panel1.add(lbDes);
		panel1.add(txDes);
		panel1.add(lbValor);
		panel1.add(txValor);
		panel1.add(lbCant);
		panel1.add(txCant);
		
		
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridx = 0; // El �rea de texto empieza en la columna cero.
		constraints.gridy = 1; // El �rea de texto empieza en la fila cero
		constraints.gridwidth = 1; // El �rea de texto ocupa dos columnas.
		constraints.gridheight = 1; // El �rea de texto ocupa 2 filas.
		panel2.add (btAgregar, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.gridwidth = 2;
		constraints.gridheight = 1;
		panel2.add (btBuscar, constraints);

		
		constraints.gridx =1;
		constraints.gridy = 1;
		constraints.gridwidth = 3;
		constraints.gridheight = 1;
		
	
		panel2.add(btEliminar,constraints);
		
		this.add(panel1);
		this.add(panel2);
	}

}
