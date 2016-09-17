

import java.awt.*;   
import java.awt.event.*;
import javax.swing.*;

public class CrearUsuario extends JFrame {
	
	public CrearUsuario() {
	
	setTitle("videoClub-Baka");
	setSize(450,250);
	setIconImage(new ImageIcon(getClass().getResource("Videoclub.png")).getImage());
	
	this.getContentPane().setLayout (new GridBagLayout());
	GridBagConstraints crear = new GridBagConstraints();
	
	JLabel lbImagen = new JLabel();
	lbImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("CrearUsuario.png")));
	crear.gridx = 0; 
	crear.gridy = 0;
	crear.gridwidth = 1; 
	crear.gridheight = 8;
	this.getContentPane().add (lbImagen, crear);
	
	JLabel lbtitulo = new JLabel("Crear Usuario");
	lbtitulo.setFont(new java.awt.Font("Andalus", 0, 26));
	crear.gridx = 1; 
	crear.gridy = 0;
	crear.gridwidth = 2; 
	crear.gridheight = 1;
	this.getContentPane().add (lbtitulo, crear);
	
	JLabel lbNombre = new JLabel("Nombre:");
	lbNombre.setFont(new java.awt.Font("Andalus", 0, 15));
	crear.gridx = 1; 
	crear.gridy = 1;
	crear.gridwidth = 1; 
	crear.gridheight = 1;
	this.getContentPane().add (lbNombre, crear);
	
	JLabel lbIdentificacion = new JLabel("Identificacion:");
	lbIdentificacion.setFont(new java.awt.Font("Andalus", 0, 15));
	crear.gridx = 1; 
	crear.gridy = 2;
	crear.gridwidth = 1; 
	crear.gridheight = 1;
	this.getContentPane().add (lbIdentificacion, crear);
		
	JLabel lbEmail = new JLabel("Email:");
	lbEmail.setFont(new java.awt.Font("Andalus", 0, 15));
	crear.gridx = 1; 
	crear.gridy = 3;
	crear.gridwidth = 1; 
	crear.gridheight = 1;
	this.getContentPane().add (lbEmail, crear);
	
	JLabel lbPuesto = new JLabel("Puesto:");
	lbPuesto.setFont(new java.awt.Font("Andalus", 0, 15));
	crear.gridx = 1; 
	crear.gridy = 4;
	crear.gridwidth = 1; 
	crear.gridheight = 1;
	this.getContentPane().add (lbPuesto, crear);
	
	JLabel lbDireccion = new JLabel("Direccion:");
	lbDireccion.setFont(new java.awt.Font("Andalus", 0, 15));
	crear.gridx = 1; 
	crear.gridy = 5;
	crear.gridwidth = 1; 
	crear.gridheight = 1;
	this.getContentPane().add (lbDireccion, crear);
	
	JLabel lbCiudad = new JLabel("Ciudad:");
	lbCiudad.setFont(new java.awt.Font("Andalus", 0, 15));
	crear.gridx = 1; 
	crear.gridy = 6;
	crear.gridwidth = 1; 
	crear.gridheight = 1;
	this.getContentPane().add (lbCiudad, crear);
	
	JTextField txNombre = new JTextField(10);
	crear.gridx = 2; 
	crear.gridy = 1;
	crear.gridwidth = 1; 
	crear.gridheight = 1;
	this.getContentPane().add (txNombre, crear);
	
	JTextField txIdentificacion = new JTextField(10);
	crear.gridx = 2; 
	crear.gridy = 2;
	crear.gridwidth = 1; 
	crear.gridheight = 1;
	this.getContentPane().add (txIdentificacion, crear);
	
	JTextField txEmail = new JTextField(10);
	crear.gridx = 2; 
	crear.gridy = 3;
	crear.gridwidth = 1; 
	crear.gridheight = 1;
	this.getContentPane().add (txEmail, crear);
	
	JTextField txPuesto = new JTextField(10);
	crear.gridx = 2; 
	crear.gridy = 4;
	crear.gridwidth = 1; 
	crear.gridheight = 1;
	this.getContentPane().add (txPuesto, crear);
	
	JTextField txDireccion = new JTextField(10);
	crear.gridx = 2; 
	crear.gridy = 5;
	crear.gridwidth = 1; 
	crear.gridheight = 1;
	this.getContentPane().add (txDireccion, crear);
	
	JTextField txCiudad = new JTextField(10);
	crear.gridx = 2; 
	crear.gridy = 6;
	crear.gridwidth = 1; 
	crear.gridheight = 1;
	this.getContentPane().add (txCiudad, crear);
	
	JButton btCrear = new JButton("Crear");
	btCrear.addActionListener(new accionCrear());
	crear.gridx = 1; 
	crear.gridy = 7;
	crear.gridwidth = 1; 
	crear.gridheight = 1;
	this.getContentPane().add (btCrear, crear);
	
	JButton btAtras = new JButton("Atras");
	btAtras.addActionListener(new accionAtras()); 
	crear.gridx = 2; 
	crear.gridy = 7;
	crear.gridwidth = 1; 
	crear.gridheight = 1;
	this.getContentPane().add (btAtras, crear);}
	
	public class accionCrear implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			JOptionPane.showMessageDialog(null,"Su Usuaro A Sido Creado");}}
	
	public class accionAtras implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			setVisible(false);}}}