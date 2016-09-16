package gui;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class MuestraFactura extends JDialog{
	
	private JLabel lbTitulo, lbFecha;
	private JTable JtablaFacturaN;
	private DefaultTableModel modelTablaFacturaN;
	private JScrollPane JScrolTabFacturaN;	
	private JLabel lbTotal;
	private JTextField txTotal;
	
	public MuestraFactura(){
		
		this.getContentPane().setLayout (new GridBagLayout());
	   	GridBagConstraints Layout = new GridBagConstraints();
	   	
		setTitle("Mercado Donde Juancho");
		setSize(600,600);
	   	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	   	setVisible(true);
	    setResizable(false);
	   	
       String [] columna = new String [] {"Cantidad","Codigo","Descripcion","Precio","Total"};
		
		lbTitulo = new JLabel("Factura N°:   ");
		Layout.gridx=0;
        Layout.gridy=0;
   	    Layout.gridwidth=2;
    	Layout.gridheight=1;
    	Layout.weighty = 1.0;
    	Layout.anchor = GridBagConstraints.CENTER;
    	this.getContentPane().add (lbTitulo, Layout);
		
		lbFecha = new JLabel("Fecha:  ");
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
    	this.getContentPane().add (txTotal, Layout);}}