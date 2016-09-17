

import java.awt.*;  
import java.awt.event.*;

import javax.swing.*;

public class Informe extends JFrame{
	
	public JTextField Nombre1,Pelicula1,FechaA1,FechaE1,Valor1;
	public String C1;
	
	public Informe() {
		
		String U1 = RegistrarPelicula.U;
		C1 = RegistrarPelicula.C;
		String V1 = RegistrarPelicula.V;
		String F1 = RegistrarPelicula.F;
		String FE1 = RegistrarPelicula.FE;
		
		
	setTitle("videoClub-Baka");
	setSize(635,240);
	setIconImage(new ImageIcon(getClass().getResource("Videoclub.png")).getImage());
		
	this.getContentPane().setLayout (new GridBagLayout());
	GridBagConstraints Informe = new GridBagConstraints();		
		
	JLabel lbTitulo = new JLabel("Informe");
	lbTitulo.setFont(new java.awt.Font("Andalus", 0, 26));	
	Informe.gridx = 0; 
	Informe.gridy = 0;
	Informe.gridwidth = 5; 
	Informe.gridheight = 1;
	this.getContentPane().add (lbTitulo, Informe);
	
	JLabel lbNombre = new JLabel("Nombre");
	lbNombre.setFont(new java.awt.Font("Andalus", 0, 15));
	Informe.gridx = 0; 
	Informe.gridy = 1;
	Informe.gridwidth = 1; 
	Informe.gridheight = 1;
	this.getContentPane().add (lbNombre, Informe);
	
	JLabel lbPelicula = new JLabel("Pelicula");
	lbPelicula.setFont(new java.awt.Font("Andalus", 0, 15));
	Informe.gridx = 1; 
	Informe.gridy = 1;
	Informe.gridwidth = 1; 
	Informe.gridheight = 1;
	this.getContentPane().add (lbPelicula, Informe);
	
	JLabel lbfecha1 = new JLabel("Fecha De Alquiler");
	lbfecha1.setFont(new java.awt.Font("Andalus", 0, 15));
	Informe.gridx = 2; 
	Informe.gridy = 1;
	Informe.gridwidth = 1; 
	Informe.gridheight = 1;
	this.getContentPane().add (lbfecha1, Informe);
	
	JLabel lbfecha2 = new JLabel("Fecha De Entrega");
	lbfecha2.setFont(new java.awt.Font("Andalus", 0, 15));
	Informe.gridx = 3; 
	Informe.gridy = 1;
	Informe.gridwidth = 1; 
	Informe.gridheight = 1;
	this.getContentPane().add (lbfecha2, Informe);
	
	JLabel lbValor = new JLabel("Valor");
	lbValor.setFont(new java.awt.Font("Andalus", 0, 15));
	Informe.gridx = 4; 
	Informe.gridy = 1;
	Informe.gridwidth = 1; 
	Informe.gridheight = 1;
	this.getContentPane().add (lbValor, Informe);
	
	Nombre1 = new JTextField(U1,10);
	Informe.gridx = 0; 
	Informe.gridy = 2;
	Informe.gridwidth = 1; 
	Informe.gridheight = 1;
	this.getContentPane().add (Nombre1, Informe);
	
	JTextField Nombre2 = new JTextField(10);
	Informe.gridx = 0; 
	Informe.gridy = 3;
	Informe.gridwidth = 1; 
	Informe.gridheight = 1;
	this.getContentPane().add (Nombre2, Informe);
	
	JTextField Nombre3 = new JTextField(10);
	Informe.gridx = 0; 
	Informe.gridy = 4;
	Informe.gridwidth = 1; 
	Informe.gridheight = 1;
	this.getContentPane().add (Nombre3, Informe);
	
	JTextField Nombre4 = new JTextField(10);
	Informe.gridx = 0; 
	Informe.gridy = 5;
	Informe.gridwidth = 1; 
	Informe.gridheight = 1;
	this.getContentPane().add (Nombre4, Informe);
	
	JTextField Nombre5 = new JTextField(10);
	Informe.gridx = 0; 
	Informe.gridy = 6;
	Informe.gridwidth = 1; 
	Informe.gridheight = 1;
	this.getContentPane().add (Nombre5, Informe);
	
	Pelicula1 = new JTextField(C1,10);
	Informe.gridx = 1; 
	Informe.gridy = 2;
	Informe.gridwidth = 1; 
	Informe.gridheight = 1;
	this.getContentPane().add (Pelicula1, Informe);
	
	JTextField Pelicula2 = new JTextField(10);
	Informe.gridx = 1; 
	Informe.gridy = 3;
	Informe.gridwidth = 1; 
	Informe.gridheight = 1;
	this.getContentPane().add (Pelicula2, Informe);
	
	JTextField Pelicula3 = new JTextField(10);
	Informe.gridx = 1; 
	Informe.gridy = 4;
	Informe.gridwidth = 1; 
	Informe.gridheight = 1;
	this.getContentPane().add (Pelicula3, Informe);
	
	JTextField Pelicula4 = new JTextField(10);
	Informe.gridx = 1; 
	Informe.gridy = 5;
	Informe.gridwidth = 1; 
	Informe.gridheight = 1;
	this.getContentPane().add (Pelicula4, Informe);
	
	JTextField Pelicula5 = new JTextField(10);
	Informe.gridx = 1; 
	Informe.gridy = 6;
	Informe.gridwidth = 1; 
	Informe.gridheight = 1;
	this.getContentPane().add (Pelicula5, Informe);
	
	FechaA1 = new JTextField(F1,10);
	Informe.gridx = 2; 
	Informe.gridy = 2;
	Informe.gridwidth = 1; 
	Informe.gridheight = 1;
	this.getContentPane().add (FechaA1, Informe);
	
	JTextField FechaA2 = new JTextField(10);
	Informe.gridx = 2; 
	Informe.gridy = 3;
	Informe.gridwidth = 1; 
	Informe.gridheight = 1;
	this.getContentPane().add (FechaA2, Informe);
	
	JTextField FechaA3 = new JTextField(10);
	Informe.gridx = 2; 
	Informe.gridy = 4;
	Informe.gridwidth = 1; 
	Informe.gridheight = 1;
	this.getContentPane().add (FechaA3, Informe);
	
	JTextField FechaA4 = new JTextField(10);
	Informe.gridx = 2; 
	Informe.gridy = 5;
	Informe.gridwidth = 1; 
	Informe.gridheight = 1;
	this.getContentPane().add (FechaA4, Informe);
	
	JTextField FechaA5 = new JTextField(10);
	Informe.gridx = 2; 
	Informe.gridy = 6;
	Informe.gridwidth = 1; 
	Informe.gridheight = 1;
	this.getContentPane().add (FechaA5, Informe);
	
	FechaE1 = new JTextField(FE1,10);
	Informe.gridx = 3; 
	Informe.gridy = 2;
	Informe.gridwidth = 1; 
	Informe.gridheight = 1;
	this.getContentPane().add (FechaE1, Informe);
	
	JTextField FechaE2 = new JTextField(10);
	Informe.gridx = 3; 
	Informe.gridy = 3;
	Informe.gridwidth = 1; 
	Informe.gridheight = 1;
	this.getContentPane().add (FechaE2, Informe);
	
	JTextField FechaE3 = new JTextField(10);
	Informe.gridx = 3; 
	Informe.gridy = 4;
	Informe.gridwidth = 1; 
	Informe.gridheight = 1;
	this.getContentPane().add (FechaE3, Informe);
	
	JTextField FechaE4 = new JTextField(10);
	Informe.gridx = 3; 
	Informe.gridy = 5;
	Informe.gridwidth = 1; 
	Informe.gridheight = 1;
	this.getContentPane().add (FechaE4, Informe);
	
	JTextField FechaE5 = new JTextField(10);
	Informe.gridx = 3; 
	Informe.gridy = 6;
	Informe.gridwidth = 1; 
	Informe.gridheight = 1;
	this.getContentPane().add (FechaE5, Informe);
	
	Valor1 = new JTextField(V1,10);
	Informe.gridx = 4; 
	Informe.gridy = 2;
	Informe.gridwidth = 1; 
	Informe.gridheight = 1;
	this.getContentPane().add (Valor1, Informe);
	
	JTextField Valor2 = new JTextField(10);
	Informe.gridx = 4; 
	Informe.gridy = 3;
	Informe.gridwidth = 1; 
	Informe.gridheight = 1;
	this.getContentPane().add (Valor2, Informe);
	
	JTextField Valor3 = new JTextField(10);
	Informe.gridx = 4; 
	Informe.gridy = 4;
	Informe.gridwidth = 1; 
	Informe.gridheight = 1;
	this.getContentPane().add (Valor3, Informe);
	
	JTextField Valor4 = new JTextField(10);
	Informe.gridx = 4; 
	Informe.gridy = 5;
	Informe.gridwidth = 1; 
	Informe.gridheight = 1;
	this.getContentPane().add (Valor4, Informe);
	
	JTextField Valor5 = new JTextField(10);
	Informe.gridx = 4; 
	Informe.gridy = 6;
	Informe.gridwidth = 1; 
	Informe.gridheight = 1;
	this.getContentPane().add (Valor5, Informe);
	
	JButton btDevolucion = new JButton("Devlocuion");
	btDevolucion.addActionListener(new accionDevolucion());
	Informe.gridx=3;
	Informe.gridy=7;
	Informe.gridwidth=1;
	Informe.gridheight=1;
	this.getContentPane().add (btDevolucion, Informe);
	
	JButton btAtras = new JButton("Atras");
	btAtras.addActionListener(new accionAtras()); 
	Informe.gridx = 1; 
	Informe.gridy = 7;
	Informe.gridwidth = 1; 
	Informe.gridheight = 1;
	this.getContentPane().add (btAtras, Informe);
	
	}
	
	public class accionAtras implements ActionListener{

		@Override
		
		public void actionPerformed(ActionEvent e) {
			setVisible(false);}}
	public class accionDevolucion implements ActionListener{

		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			String codigo;
			codigo=JOptionPane.showInputDialog("Porfavor Ingrese el codigo de la pelicula que desean devolver");
			
	if(codigo.equals(C1)){
			
		Nombre1.setText("");
		Pelicula1.setText("");
		FechaA1.setText("");
		FechaE1.setText("");
		Valor1.setText("");
		
		
			JOptionPane.showMessageDialog(null,"la devolucion se a realisado con exito");}
		
	else {
						
					JOptionPane.showMessageDialog(null,"la devolucion no se a logrado ingese bien el codigo");}		}	}}
