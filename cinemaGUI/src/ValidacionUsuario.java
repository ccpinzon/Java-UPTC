
import java.awt.*;   
import java.awt.event.*;
import java.awt.font.*;
import javax.swing.*;

public class ValidacionUsuario extends JFrame {
	
	private JLabel lbTitulo, lbUsuario, lbContrasena,lbMal;
	private JTextField txUsuario;
	private JPasswordField psContrasena;
	private JButton btAceptar;
	public static String Usuario;
	public static String Contrasena;
		
	public ValidacionUsuario (){
		
		setTitle("videoClub-Baka");
		setSize(220,170);
		setIconImage(new ImageIcon(getClass().getResource("Videoclub.png")).getImage());
				
		this.getContentPane().setLayout (new GridBagLayout());
		GridBagConstraints validar = new GridBagConstraints();
		
		lbTitulo = new JLabel("Ingrese Sus Datos");
		lbTitulo.setFont(new java.awt.Font("Andalus", 0, 20));
		validar.gridx =0;
		validar.gridy=0;
		validar.gridwidth=2;
		validar.gridheight=1;
		this.getContentPane().add (lbTitulo,validar);
		
		lbUsuario = new JLabel("Usuario");	
		lbUsuario.setFont(new java.awt.Font("Andalus", 0, 15));
		validar.gridx=0;
		validar.gridy=1;
		validar.gridwidth=1;
		validar.gridheight=1;
		this.getContentPane().add (lbUsuario,validar);
		
		txUsuario = new JTextField(10);
		validar.gridx=1;
		validar.gridy=1;
		validar.gridwidth=1;
		validar.gridheight=1;
		this.getContentPane().add (txUsuario,validar);
		
		lbMal = new JLabel();
		lbMal.setFont(new java.awt.Font("Andalus", 0, 15));
		validar.gridx=0;
		validar.gridy=4;
		validar.gridwidth=2;
		validar.gridheight=1;
		this.getContentPane().add (lbMal,validar);
		
		lbContrasena = new JLabel("Contrase�a ");
		lbContrasena.setFont(new java.awt.Font("Andalus", 0, 15));
		psContrasena = new JPasswordField(8);
		validar.gridx=0;
		validar.gridy=2;
		validar.gridwidth=1;
		validar.gridheight=1;
		this.getContentPane().add (lbContrasena,validar);
		
		psContrasena = new JPasswordField(10);
		validar.gridx=1;
		validar.gridy=2;
		validar.gridwidth=1;
		validar.gridheight=1;
		this.getContentPane().add (psContrasena,validar);
				
		btAceptar =  new JButton("Aceptar");
		btAceptar.addActionListener(new accionAceptar());
		validar.gridx=0;
		validar.gridy=3;
		validar.gridwidth=2;
		validar.gridheight=1;
		this.getContentPane().add (btAceptar,validar);}
		
	public class accionAceptar implements ActionListener{

		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			Usuario = txUsuario.getText();
		    Contrasena = new String(psContrasena.getPassword());
		   
			if(Usuario.equals("Daniel") && Contrasena.equals("Baka")){				
				
				PrresentacionEmpleado empleado = new PrresentacionEmpleado();
				empleado.setVisible(true);
				txUsuario.setText("");
				psContrasena.setText("");}
			
			else if(Usuario.equals("David") && Contrasena.equals("Feo")){
				
				PresentacionCliente cliente = new PresentacionCliente();
				cliente.setVisible(true);
				txUsuario.setText("");
				psContrasena.setText("");}
			
           else if(Usuario.equals("Cristian") && Contrasena.equals("Gorro")){
				
				PresentacionCliente1 cliente1 = new PresentacionCliente1();
				cliente1.setVisible(true);
				txUsuario.setText("");
				psContrasena.setText("");}
			
			else 
			{lbMal.setText("Usuario o Contrase�a Incorrectos");}
			return;}}}