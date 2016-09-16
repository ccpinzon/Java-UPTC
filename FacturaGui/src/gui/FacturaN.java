package gui;

import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class FacturaN extends JFrame{
	
	private JLabel lbTitulo, lbFecha, lbTotal;
	private JTextField txTotal;
	private String f,n;
	private JTable JtablaFacturaN;
	private DefaultTableModel modelTablaFacturaN;
	private JScrollPane JScrolTabFacturaN;	
	private JButton btAgrarP,btTerminar;
	
	public FacturaN (){
		
		this.getContentPane().setLayout (new GridBagLayout());
	   	GridBagConstraints Layout = new GridBagConstraints();
		setTitle("Mercado Donde Juancho");
		setSize(500,550);
	   	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	   	setVisible(true);
	    setResizable(false);
		
		String [] columna = new String [] {"Cantidad","Codigo","Descripcion","Precio","Total"};
		
		f=NuevaFactura.fecha;
		n= NuevaFactura.NFactura;
		
		lbTitulo = new JLabel("Factura N°:   "+n);
		Layout.gridx=0;
        Layout.gridy=0;
   	    Layout.gridwidth=2;
    	Layout.gridheight=1;
    	Layout.weighty = 1.0;
    	Layout.anchor = GridBagConstraints.CENTER;
    	this.getContentPane().add (lbTitulo, Layout);
		
		lbFecha = new JLabel("Fecha:  "+f);
		Layout.gridx=0;
        Layout.gridy=1;
   	    Layout.gridwidth=2;
    	Layout.gridheight=1;
    	Layout.weighty = 1.0;
    	Layout.anchor = GridBagConstraints.CENTER;
    	this.getContentPane().add (lbFecha, Layout);
		
		modelTablaFacturaN = new DefaultTableModel(columna,25);
		JtablaFacturaN = new JTable(modelTablaFacturaN);
		JtablaFacturaN.setEnabled(false);
		JScrolTabFacturaN = new JScrollPane(JtablaFacturaN);
		Layout.gridx=0;
        Layout.gridy=2;
   	    Layout.gridwidth=2;
    	Layout.gridheight=1;
    	Layout.anchor = GridBagConstraints.CENTER;
    	this.getContentPane().add (JScrolTabFacturaN, Layout);
		
	    btAgrarP = new JButton("Agregar Producto");
	    btAgrarP.addActionListener(new accionAgregarProducto());
	    Layout.gridx=0;
        Layout.gridy=4;
   	    Layout.gridwidth=1;
    	Layout.gridheight=1;
    	Layout.weightx = 1.0;
    	Layout.anchor = GridBagConstraints.CENTER;
    	this.getContentPane().add (btAgrarP, Layout);
    	
    	lbTotal = new JLabel("Total");
    	Layout.gridx=0;
        Layout.gridy=3;
   	    Layout.gridwidth=1;
    	Layout.gridheight=1;
    	Layout.anchor = GridBagConstraints.EAST;
    	this.getContentPane().add (lbTotal, Layout);
    	
    	txTotal = new JTextField(10);
    	txTotal.enable(false);
    	Layout.gridx=1;
        Layout.gridy=3;
   	    Layout.gridwidth=1;
    	Layout.gridheight=1;
    	Layout.anchor = GridBagConstraints.CENTER;
    	this.getContentPane().add (txTotal, Layout);
		
    	btTerminar = new JButton("Terminar");
	    btTerminar.addActionListener(new accionTerminar());
	    Layout.gridx=1;
        Layout.gridy=4;
   	    Layout.gridwidth=1;
    	Layout.gridheight=1;
    	Layout.weightx = 1.0;
    	Layout.anchor = GridBagConstraints.CENTER;
    	this.getContentPane().add (btTerminar, Layout);	
    	
    	//JtablaFacturaN.setValueAt(lbFecha.getText(), 0,0);
		
	}
	
	public class accionAgregarProducto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			ProductoN pr = new ProductoN();
		}}
	
	public class accionTerminar implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
		    					
		   if(JtablaFacturaN.getValueAt(0,0) == null){
				JOptionPane.showMessageDialog(null,"Porfavor Ingrese Productos a la Factura");}
			
			else{
			JOptionPane.showMessageDialog(null,"La Factura Se Ha Creado");
			dispose();}}}}