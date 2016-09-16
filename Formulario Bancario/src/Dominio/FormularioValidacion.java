package Dominio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FormularioValidacion extends JPanel{
	
	
	private JLabel LbTitulo, LbUsuario, Lbcontrasena;
	private JTextField TxUsuario;
	private JPasswordField PsContrasena;
	private JButton BtAceptar, BtCancelar;
	
	public FormularioValidacion (){
		
		inicializarComponentes();
		agregarComponentes();		
	}
	
	private void inicializarComponentes (){
		
		LbTitulo = new JLabel("Sistema Bancario");
		LbUsuario = new JLabel("Usuario");
		Lbcontrasena = new JLabel("Contrase�a");
		
		TxUsuario = new JTextField(10);
		
		PsContrasena = new JPasswordField(10);
		
		BtAceptar = new JButton("Aceptar");
		BtAceptar.addActionListener(new accionAceptar());
		
		// accion boton aceptar
		
		
		BtCancelar = new JButton("Cancelar");}
	// accon boton cancelar
	
	private void agregarComponentes(){
		
		add(LbTitulo);
		add(LbUsuario);
		add(TxUsuario);
		add(Lbcontrasena);
		add(PsContrasena);
		add(BtAceptar);
		add(BtCancelar);
		
	}
	
	public class accionAceptar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			JFrame Baka = new JFrame();
			Baka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Baka.setBounds(300,300,300,300);
			
			FormularioPrestamo prestamo = new FormularioPrestamo();
			Baka.add(prestamo);
			Baka.setVisible(true);
			
		}}

}
