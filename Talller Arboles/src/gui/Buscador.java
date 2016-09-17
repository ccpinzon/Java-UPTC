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
public class Buscador extends JDialog{

   
    private JLabel lbBuscar;
	private JButton btBuscar;
	private JButton btCancelar;
	private JTextField txBuscarCodigo;
	private JLabel jLabel1;
	private VentanaPrincipal ventanaPrincipal;

	public Buscador(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
        initComponents();
    }

                           
    private void initComponents() {

        lbBuscar = new javax.swing.JLabel();
        btBuscar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        txBuscarCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

       

        lbBuscar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbBuscar.setText("Buscar ");

        btBuscar.setText("Buscar");
        btBuscar.setActionCommand(GestionEventos.BUSCAR);
        btBuscar.addActionListener(ventanaPrincipal.getGestionEventos());

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        txBuscarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txBuscarCodigoActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addComponent(txBuscarCodigo))
                    .addComponent(lbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBuscar)
                    .addComponent(btCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }                      

    
    public JButton getBtBuscar() {
		return btBuscar;
	}


	public void setBtBuscar(JButton btBuscar) {
		this.btBuscar = btBuscar;
	}


	public JButton getBtCancelar() {
		return btCancelar;
	}


	public void setBtCancelar(JButton btCancelar) {
		this.btCancelar = btCancelar;
	}


	public JTextField getTxBuscarCodigo() {
		return txBuscarCodigo;
	}


	public void setTxBuscarCodigo(JTextField txBuscarCodigo) {
		this.txBuscarCodigo = txBuscarCodigo;
	}


	private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        this.dispose(); 
    }                                          

    private void txBuscarCodigoActionPerformed(java.awt.event.ActionEvent evt) {                                               
        
    }                                              

                       
               
}

