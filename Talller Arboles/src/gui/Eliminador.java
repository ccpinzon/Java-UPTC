/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 * @author cristhian
 */
public class Eliminador extends JDialog {

	private JLabel lbBuscar;

	private JButton btCancelar;

	private JLabel jLabel1;
	private VentanaPrincipal ventanaPrincipal;
	private JTextField txBuscarEliminar;
	private JButton btEliminar;

	public Eliminador(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
		initComponents();
	}

	private void initComponents() {

		lbBuscar = new javax.swing.JLabel();
		btEliminar = new javax.swing.JButton();
		btCancelar = new javax.swing.JButton();
		txBuscarEliminar = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();

		lbBuscar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
		lbBuscar.setText("Eliminar ");

		btEliminar.setText("Eliminar");
		btEliminar.setActionCommand(GestionEventos.ELIMINARCOD);
		btEliminar.addActionListener(ventanaPrincipal.getGestionEventos());

		btCancelar.setText("Cancelar");
		btCancelar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btCancelarActionPerformed(evt);
			}
		});

		jLabel1.setText("Codigo: ");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING,
												false)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel1)
																.addGap(31, 31,
																		31)
																.addComponent(
																		txBuscarEliminar))
												.addComponent(
														lbBuscar,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														58,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		btEliminar)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		btCancelar)))
								.addContainerGap(37, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(lbBuscar,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										25,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel1)
												.addComponent(
														txBuscarEliminar,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(21, 21, 21)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(btEliminar)
												.addComponent(btCancelar))
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));

		pack();
	}

	public JTextField getTxBuscarEliminar() {
		return txBuscarEliminar;
	}

	public void setTxBuscarEliminar(JTextField txBuscarEliminar) {
		this.txBuscarEliminar = txBuscarEliminar;
	}

	public JButton getBtEliminar() {
		return btEliminar;
	}

	public void setBtEliminar(JButton btEliminar) {
		this.btEliminar = btEliminar;
	}

	private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {

		this.dispose();
	}

}