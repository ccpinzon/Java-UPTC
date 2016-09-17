

import java.awt.*;  
import java.awt.event.*;
import java.util.Calendar;

import javax.swing.*;

public class RegistrarPelicula extends JFrame {
	
	public static JLabel lbfecha;
	public static JLabel lbfechadeEntrega;
	public static String U, C,V,F,FE,CP;
		public JTextField txNombre, txEmail, txPuesto;

	public RegistrarPelicula() {
		
		setTitle("videoClub-Baka");
		setSize(450,250);
		setIconImage(new ImageIcon(getClass().getResource("Videoclub.png")).getImage());
		
		this.getContentPane().setLayout (new GridBagLayout());
		GridBagConstraints crear = new GridBagConstraints();
		
		JLabel lbtitulo = new JLabel("Alquilar Pelicula");
		lbtitulo.setFont(new java.awt.Font("Andalus", 0, 26));
		crear.gridx = 1; 
		crear.gridy = 0;
		crear.gridwidth = 2; 
		crear.gridheight = 1;
		this.getContentPane().add (lbtitulo, crear);
		
		JLabel lbNombre = new JLabel("Nombre Del Cliente:");
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
			
		JLabel lbEmail = new JLabel("Contrase�a Del Cliente:");
		lbEmail.setFont(new java.awt.Font("Andalus", 0, 15));
		crear.gridx = 1; 
		crear.gridy = 3;
		crear.gridwidth = 1; 
		crear.gridheight = 1;
		this.getContentPane().add (lbEmail, crear);
		
		JLabel lbPuesto = new JLabel("Codigo De la Pelicua:");
		lbPuesto.setFont(new java.awt.Font("Andalus", 0, 15));
		crear.gridx = 1; 
		crear.gridy = 4;
		crear.gridwidth = 1; 
		crear.gridheight = 1;
		this.getContentPane().add (lbPuesto, crear);
		
		txNombre = new JTextField(10);
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
		
		txEmail = new JTextField(10);
		crear.gridx = 2; 
		crear.gridy = 3;
		crear.gridwidth = 1; 
		crear.gridheight = 1;
		this.getContentPane().add (txEmail, crear);
		
		txPuesto = new JTextField(10);
		crear.gridx = 2; 
		crear.gridy = 4;
		crear.gridwidth = 1; 
		crear.gridheight = 1;
		this.getContentPane().add (txPuesto, crear);
		
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
				
				lbfecha = new JLabel(textofecha());
				lbfechadeEntrega = new JLabel(texto());

				String fecha = lbfecha.getText();
				String fechae = lbfechadeEntrega.getText();
				String Cop = txPuesto.getText();
				
				String UsuarioP = txNombre.getText();
				String ConP = txEmail.getText();
				String NomP = txPuesto.getText();
				U=UsuarioP;
				C=NomP;
				V="$2000";
				F=fecha;
				FE=fechae;
				CP =Cop;
				
				if(UsuarioP.equals("David") && ConP.equals("Feo")){
					
				JOptionPane.showMessageDialog(null,"La pelicula fue Alquilada, Tiene una Semana Para Entregar la pelicula ");}
				
				else if(UsuarioP.equals("Cristian") && ConP.equals("Gorro")){
					JOptionPane.showMessageDialog(null,"La pelicula fue Alquilada");}
				
				else {
					JOptionPane.showMessageDialog(null,"Porfavor Registre Al Cliente");}}}
		
		public class accionAtras implements ActionListener{

			@Override
			
			public void actionPerformed(ActionEvent e) {
				setVisible(false);}
			}

private String textofecha(){
		
		Calendar fecha = Calendar.getInstance();
		String texto;
		texto = String.valueOf(fecha.get(Calendar.DAY_OF_MONTH))+"-"+String.valueOf(fecha.get(Calendar.MONTH)+1)+"-"+String.valueOf(fecha.get(Calendar.YEAR));
				return(texto);
	}
private String texto(){
	
	Calendar fecha2 = Calendar.getInstance();
	String texto1;
	texto1 = String.valueOf(fecha2.get(Calendar.DAY_OF_MONTH)+7)+"-"+String.valueOf(fecha2.get(Calendar.MONTH)+1)+"-"+String.valueOf(fecha2.get(Calendar.YEAR));
			return(texto1);
}}
