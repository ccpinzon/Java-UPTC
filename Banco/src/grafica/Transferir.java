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

public class Transferir extends JDialog {
	
	private JLabel lbTitulo, lbTituloUno,lbTituloDos, lbClienteOrigen, lbCuentaOrigen, lbClienteDestino,lbCuentaDestino, lbValor;
    private JComboBox cbClienteOrigen, cbCuentaOrigen, cbClienteDestino, cbCuentaDestino;
    private JButton btTransferir, btSalir;
    private JTextField txValor;
    private VentanaPrincipal ventanaPrincipal;
    
    public Transferir (VentanaPrincipal ventanaPrincipal){
    	this.ventanaPrincipal=ventanaPrincipal;
    	
    	// Se crea y define un elemento de tipo GridBagLayout para poder más adelante utilizarlo en la organización de los elementos en la ventana.
		
    	this.getContentPane().setLayout (new GridBagLayout());
    	GridBagConstraints Layout = new GridBagConstraints();
    			    	
    	//Se defina el título, el tamaño, el icono que llevara, y el comportamiento de la ventana.
    			     	 
    	setTitle("Banco");
    	setSize(320,320);
    	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    	setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
    	setResizable(false);
    	
    	lbTitulo = new JLabel("Transferencia");
		lbTitulo.setFont(new java.awt.Font("Andalus", 0, 26)); // tipo y tamaño de letra
    	Layout.gridx=0;  // se ubique en la columna 0
        Layout.gridy=0;  // se ubica en la fila 0
   	    Layout.gridwidth=2; // tiene 2 posiciones de ancho 
    	Layout.gridheight=1; // tiene 1 posición de alto
    	this.getContentPane().add (lbTitulo, Layout); // Se agrega lbImagen al layout
    	
    	lbTituloUno = new JLabel("Transferir De");
		lbTituloUno.setFont(new java.awt.Font("Andalus", 0, 14)); // tipo y tamaño de letra
    	Layout.gridx=0;  // se ubique en la columna 0
        Layout.gridy=1;  // se ubica en la fila 1
   	    Layout.gridwidth=2; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; // tiene 1 posición de alto
    	this.getContentPane().add (lbTituloUno, Layout); // Se agrega lbImagen al layout
    	
    	lbClienteOrigen = new JLabel("   Cliente");
		lbClienteOrigen.setFont(new java.awt.Font("Andalus", 0, 13)); // tipo y tamaño de letra
    	Layout.gridx=0;  // se ubique en la columna 0
        Layout.gridy=2;  // se ubica en la fila 1
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; // tiene 1 posición de alto
    	this.getContentPane().add (lbClienteOrigen, Layout); // Se agrega lbImagen al layout
    	
    	lbCuentaOrigen = new JLabel("   Cuenta");
		lbCuentaOrigen.setFont(new java.awt.Font("Andalus", 0, 13)); // tipo y tamaño de letra
    	Layout.gridx=0;  // se ubique en la columna 0
        Layout.gridy=3;  // se ubica en la fila 1
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; // tiene 1 posición de alto
    	this.getContentPane().add (lbCuentaOrigen, Layout); // Se agrega lbImagen al layout
    	
    	lbTituloDos = new JLabel("Transferir A:");
		lbTituloDos.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	Layout.gridx=0;  // se ubique en la columna 0
        Layout.gridy=4;  // se ubica en la fila 4
   	    Layout.gridwidth=2; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; // tiene 1 posición de alto
    	this.getContentPane().add (lbTituloDos, Layout); // Se agrega lbImagen al layout
    	
    	lbClienteDestino = new JLabel("   Cliente");
		lbClienteDestino.setFont(new java.awt.Font("Andalus", 0, 13)); // tipo y tamaño de letra
    	Layout.gridx=0;  // se ubique en la columna 0
        Layout.gridy=5;  // se ubica en la fila 1
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; // tiene 1 posición de alto
    	this.getContentPane().add (lbClienteDestino, Layout); // Se agrega lbImagen al layout
    	
    	lbCuentaDestino = new JLabel("   Cuenta");
		lbCuentaDestino.setFont(new java.awt.Font("Andalus", 0, 13)); // tipo y tamaño de letra
    	Layout.gridx=0;  // se ubique en la columna 0
        Layout.gridy=6;  // se ubica en la fila 1
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; // tiene 1 posición de alto
    	this.getContentPane().add (lbCuentaDestino, Layout); // Se agrega lbImagen al layout
    	
    	cbClienteOrigen = new JComboBox();
    	for(int i=0;i<ventanaPrincipal.getGestionCliente().getClientes().size();i++){
    		String n = ventanaPrincipal.getGestionCliente().getClientes().get(i).getDocumento(); 
    		
    		cbClienteOrigen.addItem(n);}
    	cbClienteOrigen.addActionListener(new accionComboOrigen());
		cbClienteOrigen.setFont(new java.awt.Font("Andalus", 0, 13)); // tipo y tamaño de letra
    	Layout.gridx=1;  // se ubique en la columna 0
        Layout.gridy=2;  // se ubica en la fila 1
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; // tiene 1 posición de alto
    	this.getContentPane().add (cbClienteOrigen, Layout); // Se agrega lbImagen al layout
    	
    	cbCuentaOrigen = new JComboBox();
		cbCuentaOrigen.setFont(new java.awt.Font("Andalus", 0, 13)); // tipo y tamaño de letra
    	Layout.gridx=1;  // se ubique en la columna 1
        Layout.gridy=3;  // se ubica en la fila 3
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; // tiene 1 posición de alto
    	this.getContentPane().add (cbCuentaOrigen, Layout); // Se agrega lbImagen al layout
    	
    	cbClienteDestino = new JComboBox();
    	for(int i=0;i<ventanaPrincipal.getGestionCliente().getClientes().size();i++){
    		String n = ventanaPrincipal.getGestionCliente().getClientes().get(i).getDocumento(); 
    		
    		cbClienteDestino.addItem(n);}
    	cbClienteDestino.addActionListener(new accionComboDestino());
		cbClienteDestino.setFont(new java.awt.Font("Andalus", 0, 13)); // tipo y tamaño de letra
    	Layout.gridx=1;  // se ubique en la columna 1
        Layout.gridy=5;  // se ubica en la fila 5
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; // tiene 1 posición de alto
    	this.getContentPane().add (cbClienteDestino, Layout); // Se agrega lbImagen al layout
    	
    	cbCuentaDestino = new JComboBox();
		cbCuentaDestino.setFont(new java.awt.Font("Andalus", 0, 13)); // tipo y tamaño de letra
    	Layout.gridx=1;  // se ubique en la columna 1
        Layout.gridy=6;  // se ubica en la fila 6
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; // tiene 1 posición de alto
    	this.getContentPane().add (cbCuentaDestino, Layout); // Se agrega lbImagen al layout
    	
    	lbValor = new JLabel("Valor");
	    lbValor.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	Layout.gridx=0;  // se ubique en la columna 1
        Layout.gridy=7;  // se ubica en la fila 6
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; // tiene 1 posición de alto
    	this.getContentPane().add (lbValor, Layout); // Se agrega lbImagen al layout
    	
    	txValor = new JTextField(8);
	    txValor.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	Layout.gridx=1;  // se ubique en la columna 1
        Layout.gridy=7;  // se ubica en la fila 6
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; // tiene 1 posición de alto
    	this.getContentPane().add (txValor, Layout); // Se agrega lbImagen al layout
    	
    	btTransferir = new JButton("Transferir");
	    btTransferir.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
	    btTransferir.addActionListener(new accionTransferir());
    	Layout.gridx=0;  // se ubique en la columna 1
        Layout.gridy=8;  // se ubica en la fila 6
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; // tiene 1 posición de alto
    	this.getContentPane().add (btTransferir, Layout); // Se agrega lbImagen al layout
    	
    	btSalir = new JButton("Salir");
    	btSalir.addActionListener(new accionSalir());
	    btSalir.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	Layout.gridx=1;  // se ubique en la columna 1
        Layout.gridy=8;  // se ubica en la fila 6
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; // tiene 1 posición de alto
    	this.getContentPane().add (btSalir, Layout); // Se agrega lbImagen al layout
    	
    	
    }

	public JComboBox getCbClienteOrigen() {
		return cbClienteOrigen;
	}

	public void setCbClienteOrigen(JComboBox cbClienteOrigen) {
		this.cbClienteOrigen = cbClienteOrigen;
	}

	public JComboBox getCbCuentaOrigen() {
		return cbCuentaOrigen;
	}

	public void setCbCuentaOrigen(JComboBox cbCuentaOrigen) {
		this.cbCuentaOrigen = cbCuentaOrigen;
	}

	public JComboBox getCbClienteDestino() {
		return cbClienteDestino;
	}

	public void setCbClienteDestino(JComboBox cbClienteDestino) {
		this.cbClienteDestino = cbClienteDestino;
	}

	public JComboBox getCbCuentaDestino() {
		return cbCuentaDestino;
	}

	public void setCbCuentaDestino(JComboBox cbCuentaDestino) {
		this.cbCuentaDestino = cbCuentaDestino;
	}
    
	public class accionComboOrigen implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			cbCuentaOrigen.removeAllItems(); 
	           String n=(String)cbClienteOrigen.getSelectedItem();
	          Cliente cli = ventanaPrincipal.getGestionCliente().BuscarCliente(n);
	          
	         
	          for(int i=0;i<cli.getCuentas().size();i++){
	        	 
	       	   String numc =cli.getCuentas().get(i).getNumeroCuenta();
	       	    	   
	       	
	       		   cbCuentaOrigen.addItem(numc);
	       		 
	           	                
	          }
		}
		
    
}
	public class accionComboDestino implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			 
			
			 cbCuentaDestino.removeAllItems(); 
	           String n=(String)cbClienteDestino.getSelectedItem();
	          Cliente cli = ventanaPrincipal.getGestionCliente().BuscarCliente(n);
	          
	         
	          for(int i=0;i<cli.getCuentas().size();i++){
	        	 
	       	   String numc =cli.getCuentas().get(i).getNumeroCuenta();
	       	    	   
	       	
	       		   cbCuentaDestino.addItem(numc);
	       		 
	                     
	          }
		}
		
	
}
	
	public class accionTransferir implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(txValor.getText().length()==0 || cbClienteOrigen.getSelectedItem()==null || cbCuentaOrigen.getSelectedItem()==null|| cbClienteDestino.getSelectedItem()==null || cbCuentaDestino.getSelectedItem()==null){
			 	JOptionPane.showMessageDialog(null,"Porfavor llene todos los campos");}
			else{
			String clienteOrigen = (String)cbClienteOrigen.getSelectedItem();
			String cuentaOrigen =(String)cbCuentaOrigen.getSelectedItem();
			String clienteDestino = (String)cbClienteDestino.getSelectedItem();
			String cuentaDestino = (String)cbCuentaDestino.getSelectedItem();
			double slado = new Double(txValor.getText());
			
			ventanaPrincipal.transferir(clienteOrigen, cuentaOrigen, clienteDestino, cuentaDestino, slado);			
			JOptionPane.showMessageDialog(null,"Transferencia realizada");
			dispose();
			
		}
		
		}
}
	
	public class accionSalir implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
		
	
}
	
}
