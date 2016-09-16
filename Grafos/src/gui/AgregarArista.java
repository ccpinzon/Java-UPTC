package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import logic.GestionGrafo;

public class AgregarArista extends JDialog {
	private JPanel pn1;
	private JPanel pn2;
	private JPanel pn3;

	private JLabel lbNom;
	private JTextField txNombre;
	private JLabel lbDe;
	private JLabel lbA;
	private JComboBox boxDesde;
	private JComboBox boxHasta;

	private JButton btAceptar;
	private VentanaPrincipal principal;
	private JLabel lbpeso;
	private JTextField txpeso;

	public AgregarArista(VentanaPrincipal ventanaPrincipal) {
		this.principal = ventanaPrincipal;

		this.setLayout(new BorderLayout());
		this.setSize(400, 150);
		this.setTitle("Agregar Arista");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		inicializar();
		agregar();
	}

	private void inicializar() {

		pn1 = new JPanel();
		pn1.setLayout(new FlowLayout());
		pn2 = new JPanel();
		pn2.setLayout(new FlowLayout());
		pn3 = new JPanel();
		pn3.setLayout(new FlowLayout());

		lbNom = new JLabel("Nombre: ");
		txNombre = new JTextField(8);
		lbpeso = new JLabel("Peso: ");
		txpeso = new JTextField(8);
		lbDe = new JLabel("De: ");
		boxDesde = new JComboBox<>();
		boxHasta = new JComboBox<>();

		lbA = new JLabel("A: ");
		btAceptar = new JButton("Aceptar");
		btAceptar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if (txNombre.getText().equals("")||txpeso.getText().equals("")){
		
				JOptionPane.showMessageDialog(null, "Campos vacios");
				
				
				}else{
					if(principal.getGestionGrafo().buscarArista(txNombre.getText())!=null){
						JOptionPane.showMessageDialog(null, "Ya existe");
					}else{
					principal.getGestionGrafo().agregarArista(
							String.valueOf(boxDesde.getSelectedItem()),
							String.valueOf(boxHasta.getSelectedItem()),
							txNombre.getText(), Integer.parseInt(txpeso.getText()));

				if (String.valueOf(boxDesde.getSelectedItem()).equals(
						
						String.valueOf(boxHasta.getSelectedItem()))) {

					principal.crearCuadrado(
							principal.getPanelDibujo().getGraphics(),
							principal
									.getGestionGrafo()
									.buscarVertice(
											String.valueOf(boxDesde
													.getSelectedItem()))
									.getPosX(),
							principal
									.getGestionGrafo()
									.buscarVertice(
											String.valueOf(boxDesde
													.getSelectedItem()))
									.getPosY(), txNombre.getText());

				}else{

				principal.crearlinea(
						principal.getPanelDibujo().getGraphics(),
						principal
								.getGestionGrafo()
								.buscarVertice(
										String.valueOf(boxDesde
												.getSelectedItem())).getPosX(),
						principal
								.getGestionGrafo()
								.buscarVertice(
										String.valueOf(boxDesde
												.getSelectedItem())).getPosY(),
						principal
								.getGestionGrafo()
								.buscarVertice(
										String.valueOf(boxHasta
												.getSelectedItem())).getPosX(),
						principal
								.getGestionGrafo()
								.buscarVertice(
										String.valueOf(boxHasta
												.getSelectedItem())).getPosY(),
						txNombre.getText());
				}
				dispose();
					}
			}
			}
		});

	}

	private void agregar() {
		pn1.add(lbNom);
		pn1.add(txNombre);
		pn1.add(lbpeso);
		pn1.add(txpeso);

		pn2.add(lbDe);
		pn2.add(boxDesde);
		pn2.add(lbA);
		pn2.add(boxHasta);

		pn3.add(btAceptar);

		this.add(pn1, BorderLayout.NORTH);
		this.add(pn2, BorderLayout.CENTER);
		this.add(pn3, BorderLayout.SOUTH);

	}

	public JComboBox getBoxDesde() {
		return boxDesde;
	}

	public void setBoxDesde(JComboBox boxDesde) {
		this.boxDesde = boxDesde;
	}

	public JComboBox getBoxHasta() {
		return boxHasta;
	}

	public void setBoxHasta(JComboBox boxHasta) {
		this.boxHasta = boxHasta;
	}

}
