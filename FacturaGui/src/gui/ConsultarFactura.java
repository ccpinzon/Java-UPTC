package gui;

import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

public class ConsultarFactura extends JFrame{
	
	private JLabel lbTitulo,lbNFactura;
	private JTextField txNFactura;
	private JButton btAceptar, btCancelar;
	
	public ConsultarFactura() {
		
		this.getContentPane().setLayout (new GridBagLayout());
	   	GridBagConstraints Layout = new GridBagConstraints();
	   	
		setTitle("Mercado Donde Juancho");
		setSize(260,150);
	   	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	   	setVisible(true);
	    setResizable(false);
	   	
	   	lbTitulo = new JLabel("Busqueda Factura");
	   	Layout.gridx=0;
	    Layout.gridy=0;
		Layout.gridwidth=2;
		Layout.gridheight=1;
		Layout.weighty = 1.0;
		this.getContentPane().add (lbTitulo, Layout);
	   	
	   	lbNFactura = new JLabel("N° Factura");
	   	Layout.gridx=0;
	    Layout.gridy=1;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		this.getContentPane().add (lbNFactura, Layout);

	   	txNFactura = new JTextField(10);
	   	Layout.gridx=1;
	    Layout.gridy=1;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		Layout.weighty = 1.0;
		this.getContentPane().add (txNFactura, Layout);
	   	
	   	btAceptar = new JButton("Buscar");
	   	btAceptar.addActionListener(new accionBuscar());
	   	Layout.gridx=0;
	    Layout.gridy=2;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		this.getContentPane().add (btAceptar, Layout);
	   	
	   	btCancelar = new JButton("Cancelar");
	   	btCancelar.addActionListener(new accionCerrar());
	   	Layout.gridx=1;
	    Layout.gridy=2;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		this.getContentPane().add (btCancelar, Layout);
		
		}
	
	public class accionBuscar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			MuestraFactura mf;
			
			if(txNFactura.getText().equals("")){
				JOptionPane.showMessageDialog(null,"Porfavor Escriva el numero de la factura");}
			
			else				
			mf = new MuestraFactura();
			
		}}
	
    public class accionCerrar implements ActionListener{

	    @Override
	    public void actionPerformed(ActionEvent e) {
		
		    dispose();
		
	}}}
