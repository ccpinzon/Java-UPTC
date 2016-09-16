package gui;

import java.awt.*; 
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class NuevaFactura extends JFrame{
	
	private  JLabel lbtitulo, lbNFactura, lbFeca, lbFechaActual;
	private JTextField txNFacturam;
	private JButton btCrear;
	public static String fecha;
	public static String NFactura;
		
	public NuevaFactura (){
		
		this.getContentPane().setLayout (new GridBagLayout());
	   	GridBagConstraints Layout = new GridBagConstraints();
		setTitle("Mercado Donde Juancho");
		setSize(250,150);
	   	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	   	setVisible(true);
	    setResizable(false);
	    
	    lbtitulo = new JLabel("Nueva Factura");
	    Layout.gridx=0;
        Layout.gridy=0;
   	    Layout.gridwidth=2;
    	Layout.gridheight=1;
    	Layout.weighty = 1.0;
    	Layout.weightx = 1.0;
    	this.getContentPane().add (lbtitulo, Layout);
	    
	    lbNFactura = new JLabel("N° Factura: ");
	    Layout.gridx=0;
        Layout.gridy=1;
   	    Layout.gridwidth=1;
    	Layout.gridheight=1;
    	Layout.anchor = GridBagConstraints.CENTER;
    	this.getContentPane().add (lbNFactura, Layout);
	    
	    lbFeca = new JLabel("Fecha:");
	    Layout.gridx=0;
        Layout.gridy=2;
   	    Layout.gridwidth=1;
    	Layout.gridheight=1;
    	Layout.anchor = GridBagConstraints.CENTER;
    	this.getContentPane().add (lbFeca, Layout);
	    
	    lbFechaActual = new JLabel(calcularFecha());
	    Layout.gridx=1;
        Layout.gridy=2;
   	    Layout.gridwidth=1;
    	Layout.gridheight=1;
    	Layout.anchor = GridBagConstraints.CENTER;
    	this.getContentPane().add (lbFechaActual, Layout);
	    
	    txNFacturam = new JTextField(10);
	    Layout.gridx=1;
        Layout.gridy=1;
   	    Layout.gridwidth=1;
    	Layout.gridheight=1;
    	Layout.anchor = GridBagConstraints.CENTER;
    	this.getContentPane().add (txNFacturam, Layout);
	    
	    btCrear = new JButton("Crear");
	    btCrear.addActionListener(new accionBoton());
	    Layout.gridx=0;
        Layout.gridy=3;
   	    Layout.gridwidth=2;
    	Layout.gridheight=1;
    	Layout.anchor = GridBagConstraints.CENTER;
    	this.getContentPane().add (btCrear, Layout);
	    
    	}
		
	public String calcularFecha (){
		
        Calendar fechaActual = Calendar.getInstance();
		
		int Dia = fechaActual.get(Calendar.DAY_OF_MONTH);
		int Mes = fechaActual.get(Calendar.MONTH)+1;
		int Anio = fechaActual.get(Calendar.YEAR);
				
		fecha= String.valueOf(Dia)+"/"+String.valueOf(Mes)+"/"+String.valueOf(Anio);
		
		return fecha;}
	
    public class accionBoton implements ActionListener{

	    @Override
	    public void actionPerformed(ActionEvent arg0) {
		
		    NFactura = txNFacturam.getText();
		
		    if(NFactura.equals("")){
			   JOptionPane.showMessageDialog(null,"Por Favor Ingrese El Numero De La Factura");}
		    
		    else{
			FacturaN num = new FacturaN();
			dispose();}}}}