package grafica;


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import logic.*;

public class NuevaCuenta extends JDialog {
	
	// se crean los elmentos d ela ventana
	
	private JLabel lbTitulo, lbNumeroCuenta, lbtipoCuenta, lbSaldo,lbCliente;
	private JTextField txNumeroCuenta, txSaldo;
	private JComboBox cbTipoCuenta, cbCliente;
	private JButton btCrear, btCancelar;
	
	private VentanaPrincipal ventanaPrincipal;
	
	
	
	
	//Constructor
	
	public NuevaCuenta(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal =ventanaPrincipal;
		
		
		//El GridBagLayout organiza los elementos de la ventana en una matriz, se puede definir la posición del elemento en la matriz, la cantidad de posiciones que ocupe en ancho o alto y el tamaño de dichas posiciones.
		//se crea el elemento layout
		
		this.getContentPane().setLayout (new GridBagLayout());
    	GridBagConstraints Layout = new GridBagConstraints();
    	
    	//Se defina el título, el tamaño, el icono que llevara, y el comportamiento de la ventana.
     	 
    	setTitle("Banco");
    	setSize(300,300);
       	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    	setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
    	setResizable(false);
    	
    	// Se definen los distintos elementos de la ventana y se van agregando al layout    	    	
    
    
    
    	
    	
    	lbTitulo = new JLabel("Nueva Cuenta");
    	lbTitulo.setFont(new java.awt.Font("Andalus", 0, 26)); // tipo y tamaño de letra
    	Layout.gridx=0;  // se ubique en la columna 0
        Layout.gridy=0;  // se ubica en la fila 0
   	    Layout.gridwidth=2; // tiene 2 posiciones de ancho 
    	Layout.gridheight=1; //tiene 1 posición de alto
    	this.getContentPane().add (lbTitulo, Layout); // Se agrega al layout
		
    	lbNumeroCuenta = new JLabel("Numero Cuenta");
    	lbNumeroCuenta.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	Layout.gridx=0;  // se ubique en la columna 0
        Layout.gridy=1;  // se ubica en la fila 1
   	    Layout.gridwidth=1; //tiene 1 posiciones de ancho 
    	Layout.gridheight=1; //tiene 1 posición de alto
    	this.getContentPane().add (lbNumeroCuenta, Layout); // Se agrega al layout
    	
    	lbtipoCuenta = new JLabel("Tipo de Cuenta");
    	lbtipoCuenta.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	Layout.gridx=0;  // se ubique en la columna 0
        Layout.gridy=2;  // se ubica en la fila 2
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; //  tiene 1 posición de alto
    	this.getContentPane().add (lbtipoCuenta, Layout); // Se agrega al layout
    	
    	lbSaldo = new JLabel("Saldo Inicial");
    	lbSaldo.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	Layout.gridx=0;  // se ubique en la columna 0
        Layout.gridy=3;  // se ubica en la fila 3
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; // tiene 1 posición de alto
    	this.getContentPane().add (lbSaldo, Layout); // Se agrega al layout
    	
    	lbCliente = new JLabel("Cliente");
    	lbCliente.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	Layout.gridx=0;  // se ubique en la columna 0
        Layout.gridy=4;  // se ubica en la fila 4
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; // tiene 1 posición de alto
    	this.getContentPane().add (lbCliente, Layout); // Se agrega al layout
    	
    	txNumeroCuenta = new JTextField(8);
    	txNumeroCuenta.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	Layout.gridx=1;  // se ubique en la columna 1
        Layout.gridy=1;  // se ubica en la fila 1
   	    Layout.gridwidth=1; //tiene 1 posiciones de ancho 
    	Layout.gridheight=1; // tiene 1 posición de alto
    	this.getContentPane().add (txNumeroCuenta, Layout); // Se agrega al layout
    
    	String [] tipoCuenta = new String[]{"","Ahorro","Corriente"}; //arreglo para añadirlo al combo box de tipo de cuenta
    	    	
    	cbTipoCuenta = new JComboBox(tipoCuenta);
    	cbTipoCuenta.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	Layout.gridx=1;  // se ubique en la columna 1
        Layout.gridy=2;  // se ubica en la fila 2
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; // tiene 1 posición de alto
    	this.getContentPane().add (cbTipoCuenta, Layout); // Se agrega al layout
    	
    	txSaldo = new JTextField(8);
    	txSaldo.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	txSaldo.addKeyListener(new KeyAdapter() {
    		
    		public void keyTyped(KeyEvent e) {
    		char c = e.getKeyChar();
    		if (!(Character.isDigit(c) ||
    		(c == KeyEvent.VK_BACK_SPACE) ||
    		(c == KeyEvent.VK_DELETE))) {
    		getToolkit().beep();
    		e.consume();}}});
    	
    	Layout.gridx=1;  // se ubique en la columna 1
        Layout.gridy=3;  // se ubica en la fila 3
   	    Layout.gridwidth=1; //tiene 1 posiciones de ancho 
    	Layout.gridheight=1; //tiene 1 posición de alto
    	this.getContentPane().add (txSaldo, Layout); // Se agrega al layout
    	
    	cbCliente = new JComboBox();
    	
    	//agrega los docuemntos del cliente al combox
    	for(int i=0;i<ventanaPrincipal.getGestionCliente().getClientes().size();i++){
    		String n = ventanaPrincipal.getGestionCliente().getClientes().get(i).getDocumento(); 
    		
    		cbCliente.addItem(n);}
    	
    	cbCliente.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	Layout.gridx=1;  // se ubique en la columna 1
        Layout.gridy=4;  // se ubica en la fila 4
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; // tiene 1 posición de alto
    	this.getContentPane().add (cbCliente, Layout); // Se agrega al layout
    	    	
    	btCrear = new JButton("Crear");
    	btCrear.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	Layout.gridx=0;  // se ubique en la columna 0
        Layout.gridy=5;  // se ubica en la fila 5
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; //tiene 1 posición de alto
    	btCrear.addActionListener(new accionCrearCuenta()); // se agregar la acción al botón
    	this.getContentPane().add (btCrear, Layout); // Se agrega al layout
    	
    	btCancelar = new JButton("Cancelar");
    	btCancelar.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	Layout.gridx=1;  // se ubique en la columna 1
        Layout.gridy=5;  // se ubica en la fila 5
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; //tiene 1 posición de alto
    	btCancelar.addActionListener(new accionSalir()); // se agregar la acción al botón
    	this.getContentPane().add (btCancelar, Layout); // Se agrega al layout
    		
	}
	
	//Get & Set de los comboBox
	
	public JComboBox getCbCliente() {
		return cbCliente;
	}

	public void setCbCliente(JComboBox cbCliente) {
		this.cbCliente = cbCliente;
	}

	public JComboBox getCbTipoCuenta() {
		return cbTipoCuenta;
	}

	public void setCbTipoCuenta(JComboBox cbTipoCuenta) {
		this.cbTipoCuenta = cbTipoCuenta;
	}

	// accion del boton crear
	
	public JTextField getTxSaldo() {
		return txSaldo;
	}

	public void setTxSaldo(JTextField txSaldo) {
		this.txSaldo = txSaldo;
	}

	public class accionCrearCuenta implements ActionListener{

  	   	 @Override
  			public void actionPerformed(ActionEvent arg0) {
  			
  	   	
			double saldoTexto = new Double(txSaldo.getText());
			
            	 
	   		 if(txNumeroCuenta.getText().length()==0 || txSaldo.getText().length()==0 || cbTipoCuenta.getSelectedItem()== "" || cbCliente.getSelectedItem()==null){
	   			 
	   			 //si los campos no estan todos llenos pide que los llene
	   			 JOptionPane.showMessageDialog(null,"Porfavor llene todos los campos");}
	   		
	   		  
	   		 
	   		else {
	   			
	   			// los campos estan llenos crea el cliente y cierra la ventana
	   					
	   		         String cli = (String)cbCliente.getSelectedItem();
	   		     //    System.out.println(cli);
	   		         Cliente cliente = ventanaPrincipal.getGestionCliente().BuscarCliente(cli);
	   		       //  System.out.println(cliente);
	   		         
	   		         if(cbTipoCuenta.getSelectedItem()=="Ahorro" && saldoTexto>=ventanaPrincipal.getCuentaAhorro().getSALDO_MINIMO()){
	   		        	 
	   		        	String numeroCuentaTexto = "A"+txNumeroCuenta.getText();
	   		             ventanaPrincipal.agregarCuentaAhorro(numeroCuentaTexto, saldoTexto, cliente);
	   		             System.out.println(ventanaPrincipal.getGestionCliente().getClientes().toString());
	   		        	       	 
	   		        	 JOptionPane.showMessageDialog(null,"Se a Creado");
	   		        	 dispose();   		        	 }
	   		        	 
	   		         
	   		         
	   		         else if(cbTipoCuenta.getSelectedItem()=="Corriente" && saldoTexto>=ventanaPrincipal.getCuentaCorriente().getSALDO_MINIMO()){
	   		         
	   		        	String numeroCuentaTexto = "C"+txNumeroCuenta.getText();
	   		        	ventanaPrincipal.agregarCuentaCorriente(numeroCuentaTexto, saldoTexto, cliente);
	   		        	 
	   		           //  System.out.println( "tamaño despues "+ventanaPrincipal.getGestionCliente().toString());
	   		             JOptionPane.showMessageDialog(null,"Se a Creado");
		        		 dispose();    }
	   		         
	   		         else{
	   		        	 JOptionPane.showMessageDialog(null,"Saldo Insuficiente");
	   		        	
	   		         }
	   					
	   				
	   			}}}
  	   	 
  	   public class accionSalir implements ActionListener{

    	   	 @Override
    			public void actionPerformed(ActionEvent arg0) {
    			
     				dispose();}}
  	   
  	  
	
	}

