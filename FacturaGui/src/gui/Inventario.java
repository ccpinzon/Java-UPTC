package gui;

import gui.CrearProducto.accionCrear;

import java.awt.*;  
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.*;
import javax.swing.table.*;

import logic.GestionFactura;
import logic.Producto;

public class Inventario extends JDialog{
	
	private JLabel labelInventario;
	private JButton btCerrar;
	private JTable JtablaInventario;
	private DefaultTableModel modeltablaInventario;
	private JScrollPane jScrollInventario;	
	private GestionFactura gestionFactura;
	private CrearProducto crearProducto;
	
	public Inventario (){
		
	 this.getContentPane().setLayout (new GridBagLayout());
   	 GridBagConstraints Layout = new GridBagConstraints();
    	 
   	 setTitle("Mercado Donde Juancho");
   	 setSize(600,600);
   	 setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
   	 setVisible(true);
     setResizable(false);
     
    
		
	 String [] columna = new String [] {"Codigo","Producto","Cantidad"};
	 
	 labelInventario =  new JLabel("Inventario:");
	 Layout.gridx=0;
	 Layout.gridy=0;
	 Layout.gridwidth=1;
	 Layout.gridheight=1;
	 Layout.weighty = 1.0;
	 Layout.anchor = GridBagConstraints.CENTER;
	 this.getContentPane().add (labelInventario, Layout);
	 
	 
	 
	 modeltablaInventario = new DefaultTableModel(columna,25);
	 
	 JtablaInventario = new JTable(modeltablaInventario);
	 JtablaInventario.setEnabled(false);
	 jScrollInventario = new JScrollPane(JtablaInventario);
	 Layout.gridx=0;
	 Layout.gridy=1;
	 Layout.gridwidth=1;
	 Layout.gridheight=1;
	 Layout.anchor = GridBagConstraints.CENTER;
	 this.getContentPane().add (jScrollInventario, Layout);
		
	 btCerrar = new JButton("Aceptar");
	 Layout.gridx=0;
	 Layout.gridy=2;
	 Layout.gridwidth=1;
	 Layout.gridheight=1;
	 btCerrar.addActionListener(new accion());
	 this.getContentPane().add (btCerrar, Layout);
	
	 
		
	 	
	
	}
	
	
	
	public DefaultTableModel getModeltablaInventario() {
		return modeltablaInventario;
	}



	public void setModeltablaInventario(DefaultTableModel modeltablaInventario) {
		this.modeltablaInventario = modeltablaInventario;
	}



	public class accion implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			setVisible(false);}}}