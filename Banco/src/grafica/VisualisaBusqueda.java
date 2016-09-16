package grafica;

import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.*;

import logic.Cliente;
import logic.Cuenta;
import logic.GestionCliente;

public class VisualisaBusqueda extends JDialog{
	
	private JLabel lbTitulo, lbNombre, lbDireccion, lbApelldo, lbGenero, lbFechaNacimiento, lbDocumento;
	private JTextField txNombre, txApellido, txDocumento, txGenero, txFechaNacimiento, txDireccion;
    private JButton btAceptaer;
    private JTable JtablaCuentas;
    private DefaultTableModel modeltablaCuentas;
	private JScrollPane jScrollCuentas;	
	
	
	
    
    public VisualisaBusqueda(){
    	
    	this.getContentPane().setLayout (new GridBagLayout());
    	GridBagConstraints Layout = new GridBagConstraints();
    	
    	//Se defina el título, el tamaño, el icono que llevara, y el comportamiento de la ventana.
     	 
    	setTitle("Banco");
    	setSize(600,800);
       	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    	setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
    	setResizable(false);
    	
    
    	
    	lbTitulo = new JLabel("Resultado");
    	lbTitulo.setFont(new java.awt.Font("Andalus", 0, 26)); // tipo y tamaño de letra
    	Layout.gridx=0;  // se ubique en la columna 0
        Layout.gridy=0;  // se ubica en la fila 0
   	    Layout.gridwidth=2; // tiene 2 posiciones de ancho 
    	Layout.gridheight=1; //tiene 1 posición de alto
    	this.getContentPane().add (lbTitulo, Layout); // Se agrega al layout
    	
    	lbNombre = new JLabel("Nombre");
    	lbNombre.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	Layout.gridx=0;  // se ubique en la columna 0
        Layout.gridy=1;  // se ubica en la fila 1
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; //tiene 1 posición de alto
    	this.getContentPane().add (lbNombre, Layout); // Se agrega al layout
    	
    	lbApelldo = new JLabel("Apellido");
    	lbApelldo.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	Layout.gridx=0;  // se ubique en la columna 0
        Layout.gridy=2;  // se ubica en la fila 2
   	    Layout.gridwidth=1; // tiene 2 posiciones de ancho 
    	Layout.gridheight=1; //tiene 1 posición de alto
    	this.getContentPane().add (lbApelldo, Layout); // Se agrega al layout
    	
    	lbDocumento = new JLabel("Documento");
    	lbDocumento.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	Layout.gridx=0;  // se ubique en la columna 0
        Layout.gridy=3;  // se ubica en la fila 3
   	    Layout.gridwidth=1; // tiene 2 posiciones de ancho 
    	Layout.gridheight=1; //tiene 1 posición de alto
    	this.getContentPane().add (lbDocumento, Layout); // Se agrega al layout
    	
    	lbDireccion = new JLabel("Direccion");
    	lbDireccion.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	Layout.gridx=0;  // se ubique en la columna 0
        Layout.gridy=4;  // se ubica en la fila 4
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; //tiene 1 posición de alto
    	this.getContentPane().add (lbDireccion, Layout); // Se agrega al layout
    	
    	lbFechaNacimiento = new JLabel("Fecha Nacimiento");
    	lbFechaNacimiento.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	Layout.gridx=0;  // se ubique en la columna 0
        Layout.gridy=5;  // se ubica en la fila 5
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; //tiene 1 posición de alto
    	this.getContentPane().add (lbFechaNacimiento, Layout); // Se agrega al layout
    	
    	lbGenero = new JLabel("Genero");
    	lbGenero.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	Layout.gridx=0;  // se ubique en la columna 0
        Layout.gridy=6;  // se ubica en la fila 6
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; //tiene 1 posición de alto
    	this.getContentPane().add (lbGenero, Layout); // Se agrega al layout
    	
    	    	
    	txNombre = new JTextField(8);
    	txNombre.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	txNombre.setEditable(false);
    	Layout.gridx=1;  // se ubique en la columna 1
        Layout.gridy=1;  // se ubica en la fila 1
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; //tiene 1 posición de alto
    	this.getContentPane().add (txNombre, Layout); // Se agrega al layout
    	
    	txApellido = new JTextField(8);
        txApellido.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
        txApellido.setEditable(false);
        Layout.gridx=1;  // se ubique en la columna 1
        Layout.gridy=2;  // se ubica en la fila 2
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; //tiene 1 posición de alto
    	this.getContentPane().add (txApellido, Layout); // Se agrega al layout
    	
    	txDocumento = new JTextField(8);
        txDocumento.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
        txDocumento.setEditable(false);
    	Layout.gridx=1;  // se ubique en la columna 1
        Layout.gridy=3;  // se ubica en la fila 3
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; //tiene 1 posición de alto
    	this.getContentPane().add (txDocumento, Layout); // Se agrega al layout
    	
    	txDireccion = new JTextField(8);
        txDireccion.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
        txDireccion.setEditable(false);
    	Layout.gridx=1;  // se ubique en la columna 1
        Layout.gridy=4;  // se ubica en la fila 4
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; //tiene 1 posición de alto
    	this.getContentPane().add (txDireccion, Layout); // Se agrega al layout

    	txFechaNacimiento = new JTextField(8);
        txFechaNacimiento.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
        txFechaNacimiento.setEditable(false);
    	Layout.gridx=1;  // se ubique en la columna 1
        Layout.gridy=5;  // se ubica en la fila 5
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; //tiene 1 posición de alto
    	this.getContentPane().add (txFechaNacimiento, Layout); // Se agrega al layout
    	
    	txGenero = new JTextField(8);
        txGenero.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
        txGenero.setEditable(false);
    	Layout.gridx=1;  // se ubique en la columna 1
        Layout.gridy=6;  // se ubica en la fila 6
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; //tiene 1 posición de alto
    	this.getContentPane().add (txGenero, Layout); // Se agrega al layout
    	
    	String [] columna = new String [] {"Numero Cuenta","Tipo Cuenta","Saldo","Saldo Minimo"};
    	
    	 modeltablaCuentas = new DefaultTableModel(columna,20);
    	 JtablaCuentas = new JTable(modeltablaCuentas);
    	 JtablaCuentas.setEnabled(false);
    	 jScrollCuentas = new JScrollPane(JtablaCuentas);
    	 Layout.gridx=0;
    	 Layout.gridy=7;
    	 Layout.gridwidth=2;
    	 Layout.gridheight=1;
    	 Layout.anchor = GridBagConstraints.CENTER;
    	 this.getContentPane().add (jScrollCuentas, Layout);
    	
    	 btAceptaer = new JButton("Aceptar");
    	 btAceptaer.addActionListener(new accionAceptar());
         btAceptaer.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
         Layout.gridx=0;  // se ubique en la columna 1
         Layout.gridy=8;  // se ubica en la fila 6
    	 Layout.gridwidth=2; // tiene 1 posiciones de ancho 
     	 Layout.gridheight=1; //tiene 1 posición de alto
     	 this.getContentPane().add (btAceptaer, Layout); // Se agrega al layout
    	
        	
    	
    	
    }




	public JTextField getTxNombre() {
		return txNombre;
	}




	public void setTxNombre(JTextField txNombre) {
		this.txNombre = txNombre;
	}




	public JTextField getTxApellido() {
		return txApellido;
	}




	public void setTxApellido(JTextField txApellido) {
		this.txApellido = txApellido;
	}




	public JTextField getTxDocumento() {
		return txDocumento;
	}




	public void setTxDocumento(JTextField txDocumento) {
		this.txDocumento = txDocumento;
	}




	public JTextField getTxGenero() {
		return txGenero;
	}




	public void setTxGenero(JTextField txGenero) {
		this.txGenero = txGenero;
	}




	public JTextField getTxFechaNacimiento() {
		return txFechaNacimiento;
	}




	public void setTxFechaNacimiento(JTextField txFechaNacimiento) {
		this.txFechaNacimiento = txFechaNacimiento;
	}




	public JTextField getTxDireccion() {
		return txDireccion;
	}




	public void setTxDireccion(JTextField txDireccion) {
		this.txDireccion = txDireccion;
	}




	public DefaultTableModel getModeltablaCuentas() {
		return modeltablaCuentas;
	}




	public void setModeltablaCuentas(DefaultTableModel modeltablaCuentas) {
		this.modeltablaCuentas = modeltablaCuentas;
	}




	public JTable getJtablaCuentas() {
		return JtablaCuentas;
	}




	public void setJtablaCuentas(JTable jtablaCuentas) {
		JtablaCuentas = jtablaCuentas;
	}


	  public class accionAceptar implements ActionListener{

	   	   	 @Override
	   			public void actionPerformed(ActionEvent arg0) {
	   			
	    				dispose();
	   	   	 }}
		
	
    
    
}
