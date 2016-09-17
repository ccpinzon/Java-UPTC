
import java.awt.*;     
import java.awt.event.*;
import javax.swing.*;

public class PresentacionCliente extends JFrame{

	private JLabel jlImagen, jltitulo;
	private JTextArea infPersonal;
	private JButton btCatalogo, btInforme, btRegistrar;
	
	public PresentacionCliente() {
		
		setTitle("VideoClub-Baka");
		setSize(400,270);
		setIconImage(new ImageIcon(getClass().getResource("Videoclub.png")).getImage());
		
		this.getContentPane().setLayout (new GridBagLayout());
		GridBagConstraints PresEmpleado = new GridBagConstraints();
		
		jlImagen = new JLabel();
		jlImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("David.png")));
		PresEmpleado.gridx=0;
		PresEmpleado.gridy=0;
		PresEmpleado.gridwidth=1;
		PresEmpleado.gridheight=5;
		PresEmpleado.weightx = 1.0;
		this.getContentPane().add (jlImagen, PresEmpleado);
		PresEmpleado.weightx = 0.0;
				
		jltitulo = new JLabel("  BIENVENIDO");
		jltitulo.setFont(new java.awt.Font("Andalus", 0, 15));
		PresEmpleado.gridx=1;
		PresEmpleado.gridy=0;
		PresEmpleado.gridwidth=1;
		PresEmpleado.gridheight=2;
		PresEmpleado.anchor = GridBagConstraints.NORTH;
		this.getContentPane().add (jltitulo, PresEmpleado);
		 
		infPersonal = new JTextArea("\nNombre:     David Gutierrez \nIdentificacion:      1'678.456 \nE-mail:    David@Baka.com\nPuesto:                    Cliente \nDireccion:      Cll 8 N�3-14 \nCiudad:    Sogamoso-Boyaca");
		infPersonal.setFont(new java.awt.Font("Andalus", 0, 15));
		infPersonal.setOpaque(false);
		infPersonal.setEditable(false);
		PresEmpleado.gridx=1;
		PresEmpleado.gridy=1;
		PresEmpleado.gridwidth=2;
		PresEmpleado.gridheight=2;
		this.getContentPane().add (infPersonal, PresEmpleado);
		
		btCatalogo = new JButton("Peliculas");
		btCatalogo.addActionListener(new accionCatalogo());
		PresEmpleado.gridx=1;
		PresEmpleado.gridy=3;
		PresEmpleado.gridwidth=1;
		PresEmpleado.gridheight=1;
		PresEmpleado.anchor = GridBagConstraints.NORTHEAST;
		this.getContentPane().add (btCatalogo, PresEmpleado);}	
	
	public class accionCatalogo implements ActionListener{

		@Override
		
		public void actionPerformed(ActionEvent e) {
							
            Catalogo estudianteUno = new Catalogo();				
			estudianteUno.setVisible(true);}}}