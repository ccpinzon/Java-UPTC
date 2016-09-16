package gui;

import java.awt.*; 
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.text.*;

import logic.GestionFactura;
import logic.Producto;

public class CrearProducto extends JDialog {
	
	private JLabel lbTitulo, lbCantidad, lbDescripcion, lbCodigo, lbPrecio;
	private JTextField txCantidad, txCodigo, txDescripcion, txPrecio;
	private JButton btCrear, btCancelar;
	private Inventario inventario;
	private GestionFactura gestionFactura;
	
	
public CrearProducto(){
	
	this.getContentPane().setLayout (new GridBagLayout());
   	GridBagConstraints Layout = new GridBagConstraints();
	setTitle("Mercado Donde Juancho");
	setSize(250,200);
   	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
   	setVisible(true);
    setResizable(false);
    
    lbTitulo = new JLabel("Nuevo Producto");
    Layout.gridx=0;
    Layout.gridy=0;
	Layout.gridwidth=2;
	Layout.gridheight=1;
	this.getContentPane().add (lbTitulo, Layout);
    
    lbCantidad = new JLabel("Cantidad");
    Layout.gridx=0;
    Layout.gridy=1;
	Layout.gridwidth=1;
	Layout.gridheight=1;
	this.getContentPane().add (lbCantidad, Layout);
    
    lbDescripcion = new JLabel("Descripcion");
    Layout.gridx=0;
    Layout.gridy=2;
	Layout.gridwidth=1;
	Layout.gridheight=1;
	this.getContentPane().add (lbDescripcion, Layout);
	
    lbCodigo = new JLabel("Codigo");
    Layout.gridx=0;
    Layout.gridy=3;
	Layout.gridwidth=1;
	Layout.gridheight=1;
	this.getContentPane().add (lbCodigo, Layout);
    
    lbPrecio = new JLabel("Precio c/u");
    Layout.gridx=0;
    Layout.gridy=4;
	Layout.gridwidth=1;
	Layout.gridheight=1;
	this.getContentPane().add (lbPrecio, Layout);
    
    txCantidad = new JTextField(10);
    txCantidad.addKeyListener(new KeyAdapter() {
    	
    public void keyTyped(KeyEvent e) {
    char c = e.getKeyChar();
    if (!(Character.isDigit(c) ||
    (c == KeyEvent.VK_BACK_SPACE) ||
    (c == KeyEvent.VK_DELETE))) {
    getToolkit().beep();
    e.consume();}}});
    
    Layout.gridx=1;
    Layout.gridy=1;
	Layout.gridwidth=1;
	Layout.gridheight=1;
	this.getContentPane().add (txCantidad, Layout);
    
    txCodigo = new JTextField(10);
    Layout.gridx=1;
    Layout.gridy=3;
	Layout.gridwidth=1;
	Layout.gridheight=1;
	this.getContentPane().add (txCodigo, Layout);
	
    txDescripcion = new JTextField(10);
    Layout.gridx=1;
    Layout.gridy=2;
	Layout.gridwidth=1;
	Layout.gridheight=1;
	this.getContentPane().add (txDescripcion, Layout);
	
	txPrecio = new JTextField(10);
	txPrecio.addKeyListener(new KeyAdapter() {
		
	public void keyTyped(KeyEvent e) {
	char c = e.getKeyChar();
	if (!(Character.isDigit(c) ||
	(c == KeyEvent.VK_BACK_SPACE) ||
	(c == KeyEvent.VK_DELETE))) {
	getToolkit().beep();
	e.consume();}}});
	 
	Layout.gridx=1;
    Layout.gridy=4;
	Layout.gridwidth=1;
	Layout.gridheight=1;
	this.getContentPane().add (txPrecio, Layout);
    
    btCrear = new JButton("Crear");
    btCrear.addActionListener(new accionCrear());
    Layout.gridx=0;
    Layout.gridy=5;
	Layout.gridwidth=1;
	Layout.gridheight=1;
	this.getContentPane().add (btCrear, Layout);
    
    btCancelar = new JButton("Cancelar");
    btCancelar.addActionListener(new accionCancelar());
    Layout.gridx=1;
    Layout.gridy=5;
	Layout.gridwidth=1;
	Layout.gridheight=1;
	this.getContentPane().add (btCancelar, Layout);
    
	
    }
    
  public JButton getBtCrear() {
	return btCrear;
}

public void setBtCrear(JButton btCrear) {
	this.btCrear = btCrear;
}

public class accionCrear implements ActionListener{

	   @Override
	   public void actionPerformed(ActionEvent arg0) {
		
			if(txCantidad.getText().length()==0 || txCodigo.getText().length()==0 || txDescripcion.getText().length()==0 || txPrecio.getText().length()==0){
			 	JOptionPane.showMessageDialog(null,"Porfavor llene todos los campos");}
		
		    else{ 
		    	    	
		    // aqui codigo para agregar el producto al array
		    			    	
		    	JOptionPane.showMessageDialog(null,"El Producto se ha creado con exito");
		         dispose();}}}
  
  public class accionCancelar implements ActionListener{

	    @Override
	    public void actionPerformed(ActionEvent e) {
		dispose();}}}