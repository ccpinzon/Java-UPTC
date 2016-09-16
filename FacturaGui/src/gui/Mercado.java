package gui;

import java.awt.*;  
import java.awt.event.*;
import javax.swing.*;

public class Mercado extends JFrame {
	
     private JLabel titulo;
     private JButton btUno, btDos, btTres, btCuatro;
     public static Mercado mer;
     
     public Mercado (){
    	 
    	this.getContentPane().setLayout (new GridBagLayout());
    	GridBagConstraints Layout = new GridBagConstraints();
     	 
    	setTitle("Mercado Donde Juancho");
    	setSize(300,150);
    	setVisible(true);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setResizable(false);
    	
    	titulo = new JLabel("Factura:");
    	Layout.gridx=0;
        Layout.gridy=0;
   	    Layout.gridwidth=2;
    	Layout.gridheight=1;
    	Layout.weighty = 1.0;
    	Layout.weightx = 1.0;
    	this.getContentPane().add (titulo, Layout);
    	 
    	btUno = new JButton("Crear Factura");
    	Layout.gridx=0;
    	Layout.gridy=2;
    	Layout.gridwidth=1;
    	Layout.gridheight=1;
    	Layout.anchor = GridBagConstraints.NORTHEAST;
    	this.getContentPane().add (btUno, Layout);
    	 
    	btDos = new JButton("Crear Producto");
    	Layout.gridx=1;
    	Layout.gridy=1;
    	Layout.gridwidth=1;
    	Layout.gridheight=1;
    	Layout.anchor = GridBagConstraints.SOUTHWEST;
    	this.getContentPane().add (btDos, Layout);
    	 
    	btTres = new JButton("Consultar Factura");
    	Layout.gridx=0;
    	Layout.gridy=1;
    	Layout.gridwidth=1;
    	Layout.gridheight=1;
    	Layout.anchor = GridBagConstraints.SOUTHEAST;
    	this.getContentPane().add (btTres, Layout);
    	     	 
    	btCuatro = new JButton("Inventario");
    	Layout.gridx=1;
    	Layout.gridy=2;
    	Layout.gridwidth=1;
    	Layout.gridheight=1;
    	Layout.anchor = GridBagConstraints.NORTHWEST;
    	this.getContentPane().add (btCuatro, Layout);
    	 
        btUno.addActionListener(new accionCrearFactura());
        btDos.addActionListener(new accionCrearProducto());
        btTres.addActionListener(new accionConsultarFactura());
    	btCuatro.addActionListener(new accionInventario());
    	      	 
     }
     
     public static void main(String[] args) {
    	 
    	mer = new Mercado();
    	
     }
          
     public class accionInventario implements ActionListener{

    	 @Override
		public void actionPerformed(ActionEvent arg0) {
							
			Inventario invent = new Inventario();}}
     
     public class accionCrearFactura implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			NuevaFactura nf = new NuevaFactura();}}
     
     public class accionCrearProducto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			CrearProducto pro = new CrearProducto();}}
     
     public class accionConsultarFactura implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			ConsultarFactura  confact = new ConsultarFactura();}}}