package gui;

import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

public class ProductoN extends JDialog {
	
	private JLabel lbTitulo,lbCantidad,lbCodigo,lbDescripcion,lbPrecio;
	private JTextField txCantidad,txPrecio, txCodigo;
	private JComboBox jbProducto;
	private JButton btAgregar,btCancelar;
		
	public ProductoN(){
		
		this.getContentPane().setLayout (new GridBagLayout());
	   	GridBagConstraints Layout = new GridBagConstraints();
		setTitle("Mercado Donde Juancho");
		setSize(300,230);
	   	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	   	setVisible(true);
	    setResizable(false);
	    
	    lbTitulo = new JLabel("Producto");
	    Layout.gridx=0;
        Layout.gridy=0;
   	    Layout.gridwidth=2;
    	Layout.gridheight=1;
    	Layout.weighty = 1.0;
    	this.getContentPane().add (lbTitulo, Layout);
    	
	    lbCantidad = new JLabel("Cantidad");
	    Layout.gridx=0;
        Layout.gridy=1;
   	    Layout.gridwidth=1;
    	Layout.gridheight=1;
    	this.getContentPane().add (lbCantidad, Layout);
	    
	    lbCodigo = new JLabel("Codigo");
	    Layout.gridx=0;
        Layout.gridy=2;
   	    Layout.gridwidth=1;
    	Layout.gridheight=1;
    	this.getContentPane().add (lbCodigo, Layout);
	    
	    
	    lbDescripcion = new JLabel("Producto");
	    Layout.gridx=0;
        Layout.gridy=3;
   	    Layout.gridwidth=1;
    	Layout.gridheight=1;
    	this.getContentPane().add (lbDescripcion, Layout);
	    
	    lbPrecio = new JLabel("Precio");
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
	    txCodigo.setEnabled(false);
	    Layout.gridx=1;
        Layout.gridy=2;
   	    Layout.gridwidth=1;
    	Layout.gridheight=1;
    	this.getContentPane().add (txCodigo, Layout);
    	
    	jbProducto = new JComboBox();
    	Layout.gridx=1;
        Layout.gridy=3;
   	    Layout.gridwidth=1;
    	Layout.gridheight=1;
    	this.getContentPane().add (jbProducto, Layout);
	    
	    txPrecio = new JTextField(10);
	    txPrecio.setEnabled(false);
	    Layout.gridx=1;
        Layout.gridy=4;
   	    Layout.gridwidth=1;
    	Layout.gridheight=1;
    	this.getContentPane().add (txPrecio, Layout);
	    
	    btAgregar = new JButton("Agregar");
	    btAgregar.addActionListener(new accionAgregar());
	    Layout.gridx=0;
        Layout.gridy=5;
   	    Layout.gridwidth=1;
    	Layout.gridheight=1;
    	this.getContentPane().add (btAgregar, Layout);
	    
	    btCancelar = new JButton("Cancelar");
	    btCancelar.addActionListener(new accionCancelar());
	    Layout.gridx=1;
        Layout.gridy=5;
   	    Layout.gridwidth=1;
    	Layout.gridheight=1;
    	this.getContentPane().add (btCancelar, Layout);
	        	
	    }
	
     public class accionAgregar implements ActionListener{

     	@Override
	    public void actionPerformed(ActionEvent arg0) {
		
		  String l = txCantidad.getText();
				
		if(l.equals("") || jbProducto.isEnabled()){
			JOptionPane.showMessageDialog(null,"PorFavor ingrese los datos");}
		
		else{
		JOptionPane.showMessageDialog(null,"El Producto Se Ha Agregado");
		dispose();}}}
     
     public class accionCancelar implements ActionListener{

	     @Override
         public void actionPerformed(ActionEvent e) {
		   dispose();}}}