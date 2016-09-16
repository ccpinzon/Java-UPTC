package grafica;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import logic.Cliente;

public class Retirar extends JDialog {
	
	private JLabel lbTitulo, lbNumeroCuenta, lbVaorRetito,lbCliente;
	private JTextField txValrRetiro;
	private JComboBox cbCliente, cbCuenta;
	private JButton btRetirar, btSalir;
	private VentanaPrincipal ventanaPrincipal;
	
	public Retirar (VentanaPrincipal ventanaPrincipal){
		this.ventanaPrincipal=ventanaPrincipal;
		
		// Se crea y define un elemento de tipo GridBagLayout para poder más adelante utilizarlo en la organización de los elementos en la ventana.
		
		this.getContentPane().setLayout (new GridBagLayout());
		GridBagConstraints Layout = new GridBagConstraints();
		    	
		//Se defina el título, el tamaño, el icono que llevara, y el comportamiento de la ventana.
		     	 
		setTitle("Banco");
		setSize(220,220);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
		setResizable(false);
		
		lbTitulo = new JLabel("Retirar");
		lbTitulo.setFont(new java.awt.Font("Andalus", 0, 26)); // tipo y tamaño de letra
    	Layout.gridx=0;  // se ubique en la columna 0
        Layout.gridy=0;  // se ubica en la fila 0
   	    Layout.gridwidth=2; // tiene 2 posiciones de ancho 
    	Layout.gridheight=1; // tiene 1 posición de alto
    	Layout.weighty = 1.0;
    	Layout.weightx = 1.0;
    	this.getContentPane().add (lbTitulo, Layout); // Se agrega lbImagen al layout
    	
    	lbNumeroCuenta = new JLabel("Numero Cuenta");
    	lbNumeroCuenta.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	Layout.gridx=0;  // se ubique en la columna 0
        Layout.gridy=1;  // se ubica en la fila 1
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; // tiene 1 posición de alto
    	this.getContentPane().add (lbNumeroCuenta, Layout); // Se agrega lbImagen al layout
    	
    	lbCliente = new JLabel("Cliente");
    	lbCliente.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	Layout.gridx=0;  // se ubique en la columna 0
        Layout.gridy=2;  // se ubica en la fila 1
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; // tiene 1 posición de alto
    	this.getContentPane().add (lbCliente, Layout); // Se agrega lbImagen al layout
    	
    	lbVaorRetito = new JLabel("Valor Retiro");
    	lbVaorRetito.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	Layout.gridx=0;  // se ubique en la columna 0
        Layout.gridy=3;  // se ubica en la fila 3
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; // tiene 1 posición de alto
    	this.getContentPane().add (lbVaorRetito, Layout); // Se agrega lbImagen al layout
    	    	
    	txValrRetiro = new JTextField(8);
    	txValrRetiro.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	Layout.gridx=1;  // se ubique en la columna 1
        Layout.gridy=3;  // se ubica en la fila 2
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; // tiene 1 posición de alto
    	this.getContentPane().add (txValrRetiro, Layout); // Se agrega lbImagen al layout
    	
    	cbCliente = new JComboBox();
    	for(int i=0;i<ventanaPrincipal.getGestionCliente().getClientes().size();i++){
    		String n = ventanaPrincipal.getGestionCliente().getClientes().get(i).getDocumento(); 
    		
    		cbCliente.addItem(n);}
    	cbCliente.addActionListener(new accioncombo());  
    	cbCliente.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	Layout.gridx=1;  // se ubique en la columna 1
        Layout.gridy=2;  // se ubica en la fila 2
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; // tiene 1 posición de alto
    	this.getContentPane().add (cbCliente, Layout); // Se agrega lbImagen al layout
    	
    	
    	cbCuenta = new JComboBox();
    	cbCuenta.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	Layout.gridx=1;  // se ubique en la columna 1
        Layout.gridy=1;  // se ubica en la fila 2
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; // tiene 1 posición de alto
    	this.getContentPane().add (cbCuenta, Layout); // Se agrega lbImagen al layout
    	
    	
    	btRetirar = new JButton("Retirar");
    	btRetirar.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	Layout.gridx=0;  // se ubique en la columna 0
        Layout.gridy=4;  // se ubica en la fila 3
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; // tiene 1 posición de alto
    	btRetirar.addActionListener(new accionRetirar());
    	this.getContentPane().add (btRetirar, Layout); // Se agrega lbImagen al layout
    	
    	btSalir = new JButton("Salir");
    	btSalir.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	Layout.gridx=1;  // se ubique en la columna 0
        Layout.gridy=4;  // se ubica en la fila 3
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; // tiene 1 posición de alto
    	btSalir.addActionListener(new accionSalir());
    	this.getContentPane().add (btSalir, Layout); // Se agrega lbImagen al layout

		
	
 		
		
		
	}
	
	
	
	public JComboBox getCbCliente() {
		return cbCliente;
	}

	public void setCbCliente(JComboBox cbCliente) {
		this.cbCliente = cbCliente;
	}

	public JComboBox getCbCuenta() {
		return cbCuenta;
	}

	public void setCbCuenta(JComboBox cbCuenta) {
		this.cbCuenta = cbCuenta;
	}

	public class accioncombo implements ActionListener{

	   	 @Override
	   	 
			public void actionPerformed(ActionEvent arg0) {
	   		cbCuenta.removeAllItems(); 
           String n=(String)cbCliente.getSelectedItem();
          Cliente cli = ventanaPrincipal.getGestionCliente().BuscarCliente(n);
          
         
          for(int i=0;i<cli.getCuentas().size();i++){
        	 
       	   String numc =cli.getCuentas().get(i).getNumeroCuenta();
       	    	   
       	
       		   cbCuenta.addItem(numc);
       		 
           	                
          }
          
           
	   		
	   		
	   	 }}

	public class accionRetirar implements ActionListener{

	   	 @Override
			public void actionPerformed(ActionEvent arg0) {
				
	   		 //si los campos no estan todos llenos pide que los llene
	   		 
	   		 if(txValrRetiro.getText().length()==0 || cbCliente.getSelectedItem()==null || cbCuenta.getSelectedItem()==null){
			 	JOptionPane.showMessageDialog(null,"Porfavor llene todos los campos");}
	   		
	   		else {
	   			
	   			// los campos estan llenos crea el cliente y cierra la ventana
	   			String cliente =(String)cbCliente.getSelectedItem();
	   			
	   			String cuenta = (String)cbCuenta.getSelectedItem();
	   			
	   			
	   			double valorretira = new Double(txValrRetiro.getText());
	   			   			
	   			
	   	   			ventanaPrincipal.retirar(cliente, cuenta, valorretira);
	   	   		
	   	   		
	   			
				JOptionPane.showMessageDialog(null,"Retiro realizado");
				dispose();}
	   		
	   		
	   	 }}
	
	
	
	// se crea el método de la acción del boón crearCancelar
	
		public class accionSalir implements ActionListener{

		   	 @Override
				public void actionPerformed(ActionEvent arg0) {
					
	             // se cierra la ventana	
					dispose();}
		   		
		   		
		   	 }
	

}
