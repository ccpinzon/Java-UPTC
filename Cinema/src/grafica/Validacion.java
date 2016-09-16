package grafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.image.ImageObserver;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Validacion extends JDialog {
	
	private VentanaPrincipal ventanaPrincipal;
	private JLabel lbTitulo, lbImagen, lbUsuario, lbPassword;
	private JTextField txUsuario;
	private JPasswordField txPassword;
	private JButton btAceptar, btSalir;
	private GridBagConstraints contLayout;
	
	public Validacion(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal=ventanaPrincipal;
		
		setTitle("Video Club Chaplin");
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setSize(380,200);
		setResizable(false);
		setIconImage(new ImageIcon("recursos/imagenes/Icono.png").getImage());
		setLayout(new GridBagLayout());
		
		contLayout = new GridBagConstraints();
		
		lbImagen = new JLabel();
		lbImagen.setIcon(new ImageIcon("recursos/imagenes/validar.png"));
		contLayout.gridx = 0; // El área de texto empieza en la columna cero.
		contLayout.gridy = 0; // El área de texto empieza en la fila 1
		contLayout.gridwidth = 1; // El área de texto ocupa 1 columnas.
		contLayout.gridheight = 4; // El área de texto ocupa 3 filas.
		contLayout.weightx = 1.0;
		contLayout.weighty = 1.0;
		add (lbImagen,contLayout);
		
		lbTitulo = new JLabel("¡Bienvenido!");
		lbTitulo.setFont(new Font("Andalus",2,23));
		contLayout.gridx = 1; 
		contLayout.gridy = 0; 
		contLayout.gridwidth = 3; 
		contLayout.gridheight = 1;
		add (lbTitulo,contLayout);
		
		lbUsuario = new JLabel("Usuario");
		lbUsuario.setFont(new Font("Andalus",0,15));
		contLayout.gridx = 1; 
		contLayout.gridy = 1; 
		contLayout.gridwidth = 1; 
		contLayout.gridheight = 1; 
		add (lbUsuario,contLayout);
		
		lbPassword = new JLabel("Contraseña");
		lbPassword.setFont(new Font("Andalus",0,15));
		contLayout.gridx = 1; 
		contLayout.gridy = 2; 
		contLayout.gridwidth = 1; 
		contLayout.gridheight = 1; 
		add (lbPassword,contLayout);
		
		txUsuario = new JTextField(10);
		contLayout.gridx = 2; 
		contLayout.gridy = 1; 
		contLayout.gridwidth = 1; 
		contLayout.gridheight = 1; 
		add (txUsuario,contLayout);
		
		txPassword = new JPasswordField(10);
		contLayout.gridx = 2; 
		contLayout.gridy = 2; 
		contLayout.gridwidth = 1; 
		contLayout.gridheight = 1; 
		add (txPassword,contLayout);
		
		btAceptar = new JButton("Ingresar");
		btAceptar.setActionCommand(GestionEventos.LOGIN);
		btAceptar.addActionListener(ventanaPrincipal.getEventos());
		btAceptar.setBackground(Color.LIGHT_GRAY);
		btAceptar.setForeground(Color.DARK_GRAY);
		btAceptar.setBorderPainted(false);
		btAceptar.setFocusPainted(false);
		contLayout.gridx = 1; 
		contLayout.gridy = 3; 
		contLayout.gridwidth = 1; 
		contLayout.gridheight = 1; 
		add (btAceptar,contLayout);
		
		btSalir = new JButton("Salir");
		btSalir.setActionCommand(GestionEventos.SALIRLOGIN);
		btSalir.addActionListener(ventanaPrincipal.getEventos());
		btSalir.setBackground(Color.LIGHT_GRAY);
		btSalir.setForeground(Color.DARK_GRAY);
		btSalir.setBorderPainted(false);
		btSalir.setFocusPainted(false);
		contLayout.gridx = 2; 
		contLayout.gridy = 3; 
		contLayout.gridwidth = 1; 
		contLayout.gridheight = 1; 
		add (btSalir,contLayout);
		
		
		
		
		
		
	}

	public VentanaPrincipal getVentanaPrincipal() {
		return ventanaPrincipal;
	}

	public void setVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}

	public JLabel getLbTitulo() {
		return lbTitulo;
	}

	public void setLbTitulo(JLabel lbTitulo) {
		this.lbTitulo = lbTitulo;
	}

	public JLabel getLbImagen() {
		return lbImagen;
	}

	public void setLbImagen(JLabel lbImagen) {
		this.lbImagen = lbImagen;
	}

	public JLabel getLbUsuario() {
		return lbUsuario;
	}

	public void setLbUsuario(JLabel lbUsuario) {
		this.lbUsuario = lbUsuario;
	}

	public JLabel getLbPassword() {
		return lbPassword;
	}

	public void setLbPassword(JLabel lbPassword) {
		this.lbPassword = lbPassword;
	}

	public JTextField getTxUsuario() {
		return txUsuario;
	}

	public void setTxUsuario(JTextField txUsuario) {
		this.txUsuario = txUsuario;
	}

	public JPasswordField getTxPassword() {
		return txPassword;
	}

	public void setTxPassword(JPasswordField txPassword) {
		this.txPassword = txPassword;
	}

	public JButton getBtAceptar() {
		return btAceptar;
	}

	public void setBtAceptar(JButton btAceptar) {
		this.btAceptar = btAceptar;
	}

	public JButton getBtSalir() {
		return btSalir;
	}

	public void setBtSalir(JButton btSalir) {
		this.btSalir = btSalir;
	}

	public GridBagConstraints getContLayout() {
		return contLayout;
	}

	public void setContLayout(GridBagConstraints contLayout) {
		this.contLayout = contLayout;
	}

}
