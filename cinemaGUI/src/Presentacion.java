

import java.awt.*;     
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Presentacion extends JFrame{

	private JLabel jlImagen, jltitulo,jlTexto1, jlTexto2, jlTexto3, jlTexto4;
	private JButton btContinuar;
	public static Presentacion presentacion;	
	
	public Presentacion(){
		
	setTitle("videoClub-Baka");
	setSize(490,430);
	setIconImage(new ImageIcon(getClass().getResource("Videoclub.png")).getImage());
	setVisible(true);
		
	this.getContentPane().setLayout (new GridBagLayout());
	GridBagConstraints LayoutPresentacion = new GridBagConstraints();
		
     	jlImagen = new JLabel();
		LayoutPresentacion.gridx=0;
		LayoutPresentacion.gridy=0;
		LayoutPresentacion.gridwidth=1;
		LayoutPresentacion.gridheight=1;
		this.getContentPane().add (jlImagen, LayoutPresentacion);
		jlImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("Videoclub1.png")));
		
	    jltitulo = new JLabel("Bienvenidos Al VideoClub-Baka");
		jltitulo.setFont(new java.awt.Font("Andalus", 0, 26));
		LayoutPresentacion.gridx=0;
		LayoutPresentacion.gridy=1;
		LayoutPresentacion.gridwidth=1;
		LayoutPresentacion.gridheight=1;
		this.getContentPane().add (jltitulo, LayoutPresentacion);
				 
		jlTexto1 = new JLabel("Te damos la bienvenida a nuestro sistema.",JLabel.CENTER);
		jlTexto1.setFont(new java.awt.Font("Andalus", 0, 15));
		LayoutPresentacion.gridx=0;
		LayoutPresentacion.gridy=2;
		LayoutPresentacion.gridwidth=1;
		LayoutPresentacion.gridheight=1;
		this.getContentPane().add (jlTexto1, LayoutPresentacion);
		 
		jlTexto2 = new JLabel("aqui podras conocer las peliculas disponibles, su clasificaion, su g�nero, etc.",JLabel.CENTER);
		jlTexto2.setFont(new java.awt.Font("Andalus", 0, 15));
		LayoutPresentacion.gridx=0;
		LayoutPresentacion.gridy=3;
		LayoutPresentacion.gridwidth=1;
		LayoutPresentacion.gridheight=1;
		this.getContentPane().add (jlTexto2, LayoutPresentacion);
	
		jlTexto1 = new JLabel("Para continuar has Click en el boton bienvenido e ingresa tus datos.",JLabel.CENTER);
		jlTexto1.setFont(new java.awt.Font("Andalus", 0, 15));
		LayoutPresentacion.gridx=0;
		LayoutPresentacion.gridy=4;
		LayoutPresentacion.gridwidth=1;
		LayoutPresentacion.gridheight=1;
		LayoutPresentacion.anchor = GridBagConstraints.NORTH;
		this.getContentPane().add (jlTexto1, LayoutPresentacion);
			
		jlTexto1 = new JLabel("si no est�s registrado pide ayuda a alguno de nuestros empleados.",JLabel.CENTER);
		jlTexto1.setFont(new java.awt.Font("Andalus", 0, 15));
		LayoutPresentacion.gridx=0;
		LayoutPresentacion.gridy=5;
		LayoutPresentacion.gridwidth=1;
		LayoutPresentacion.gridheight=1;
		LayoutPresentacion.anchor = GridBagConstraints.NORTH;
		this.getContentPane().add (jlTexto1, LayoutPresentacion);
		
		btContinuar = new JButton("Bienvenidos");
		LayoutPresentacion.gridx=0;
		LayoutPresentacion.gridy=6;
		LayoutPresentacion.gridwidth=1;
		LayoutPresentacion.gridheight=1;
		this.getContentPane().add (btContinuar, LayoutPresentacion);
		btContinuar.addActionListener(new accionBienvenidos());}	
	
	public static void main(String[] args) {presentacion = new Presentacion();
	
	//TimerTask Informe1 = new TimerTask(){
	
      //  public void run() {
	
          // Informe inf = new Informe();
           //inf.setVisible(true);}};
	
       //Timer timer = new Timer();
       // timer.scheduleAtFixedRate(Informe1, 0, 43200000);
	}
	
		public class accionBienvenidos implements ActionListener{

		@Override
		
		public void actionPerformed(ActionEvent e) {
			
			ValidacionUsuario validacion = new ValidacionUsuario();
			validacion.setVisible(true);
			presentacion.setVisible(false);}}}