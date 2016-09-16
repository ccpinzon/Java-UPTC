package grafica;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import logic.Cliente;
import logic.Cuenta;
import logic.EGenero;
import logic.GestionCliente;

public class Consultar extends JFrame{
	
	private JLabel  lbTitulo, lbTipo,lbBusqueda;
	private JComboBox cbBusqueda;
	private JTextField txBusqueda;
	private JButton btBuscar, btCancelar;
	private VentanaPrincipal ventanaPrincipal;
	
	public Consultar(VentanaPrincipal ventanaPrincipal){
		this.ventanaPrincipal = ventanaPrincipal;
		
		this.getContentPane().setLayout (new GridBagLayout());
    	GridBagConstraints Layout = new GridBagConstraints();
    	
    	//Se defina el título, el tamaño, el icono que llevara, y el comportamiento de la ventana.
     	 
    	setTitle("Banco");
    	setSize(230,180);
       	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    	setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
    	setResizable(false);
    	
    	
    	
    	lbTitulo = new JLabel("Consulta");
    	lbTitulo.setFont(new java.awt.Font("Andalus", 0, 26)); // tipo y tamaño de letra
    	Layout.gridx=0;  // se ubique en la columna 0
        Layout.gridy=0;  // se ubica en la fila 0
   	    Layout.gridwidth=2; // tiene 2 posiciones de ancho 
    	Layout.gridheight=1; //tiene 1 posición de alto
    	Layout.weighty = 1.0;
    	Layout.weightx = 1.0;
    	this.getContentPane().add (lbTitulo, Layout); // Se agrega al layout
    	

    	lbTipo = new JLabel("Tipo De Buqueda");
    	lbTipo.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	Layout.gridx=0;  // se ubique en la columna 0
        Layout.gridy=1;  // se ubica en la fila 1
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; //tiene 1 posición de alto
    	this.getContentPane().add (lbTipo, Layout); // Se agrega al layout
    	
    	lbBusqueda = new JLabel("Buscar");
    	lbBusqueda.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	Layout.gridx=0;  // se ubique en la columna 0
        Layout.gridy=2;  // se ubica en la fila 2
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; //tiene 1 posición de alto
    	this.getContentPane().add (lbBusqueda, Layout); // Se agrega al layout
    	

    	txBusqueda = new JTextField(8);
    	txBusqueda.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	Layout.gridx=1;  // se ubique en la columna 1
        Layout.gridy=2;  // se ubica en la fila 2
   	    Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; //tiene 1 posición de alto
    	this.getContentPane().add (txBusqueda, Layout); // Se agrega al layout
    	
    	String [] Busqueda = new String []{" ", "Documento","Cuenta"};
    	
    	cbBusqueda = new JComboBox(Busqueda);
    	cbBusqueda.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	Layout.gridx=1;  // se ubique en la columna 1
        Layout.gridy=1;  // se ubica en la fila 1   	    
        Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; //tiene 1 posición de alto
    	this.getContentPane().add (cbBusqueda, Layout); // Se agrega al layout
		
    	btBuscar = new JButton("Buscar");
    	btBuscar.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	Layout.gridx=0;  // se ubique en la columna 0
        Layout.gridy=3;  // se ubica en la fila 3   	    
        Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; //tiene 1 posición de alto
    	btBuscar.addActionListener(new accionBuscar());
    	this.getContentPane().add (btBuscar, Layout); // Se agrega al layout
    	
    	btCancelar = new JButton("Salir");
    	btCancelar.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
    	Layout.gridx=1;  // se ubique en la columna 1
        Layout.gridy=3;  // se ubica en la fila 2   	    
        Layout.gridwidth=1; // tiene 1 posiciones de ancho 
    	Layout.gridheight=1; //tiene 1 posición de alto
    	btCancelar.addActionListener(new accionSalir());
    	this.getContentPane().add (btCancelar, Layout); // Se agrega al layout
		
		
	}
	
	public class accionBuscar implements ActionListener{

 	   	 @Override
 			public void actionPerformed(ActionEvent arg0) {
 			
//si los campos no estan todos llenos pide que los llene
	   		 
	   		 if(txBusqueda.getText().length()==0 && cbBusqueda.getSelectedItem()=="" ) {
			 	JOptionPane.showMessageDialog(null,"Porfavor especifique el de busqueda");}
	   		
	   		else {
	   			
	   			// los campos estan llenos crea el cliente y cierra la ventana
	   			
	   			String busqueda = txBusqueda.getText();
	   			String tipobusqueda = (String)cbBusqueda.getSelectedItem();
	   			
	   			Cliente resultado=ventanaPrincipal.getGestionCliente().BuscarCliente(busqueda);
	   			
	   			
	   			if(tipobusqueda.equals("Documento")&& resultado!=null){
	   			   			
	   			VisualisaBusqueda busq = new VisualisaBusqueda();
	   			
	   			busq.getTxNombre().setText(resultado.getNombre());
	   			busq.getTxApellido().setText(resultado.getApellido());
	   			busq.getTxDocumento().setText(resultado.getDocumento());
	   			busq.getTxDireccion().setText(resultado.getDireccion());
	   			
	   			Calendar fecha = resultado.getFechaNacimiento();
	   			String aux = fecha.get(Calendar.DAY_OF_MONTH)+"/"+(fecha.get(Calendar.MONTH)+1)+"/"+fecha.get(Calendar.YEAR);
	   			busq.getTxFechaNacimiento().setText(aux);
	   			
	   			
	   			
	   			EGenero genero = resultado.getGenero();
	   			if(genero==EGenero.Femenino){
	   				
	   				busq.getTxGenero().setText("Femenino");
	   				
	   			}
	   			else{
	   				busq.getTxGenero().setText("Masculino");	   				
	   			}
	   			
	   			
	   	   		for(int i=0;i<resultado.getCuentas().size();i++){
	   	   			
	   	   			String nm = resultado.getCuentas().get(i).getNumeroCuenta();
	   	   		    double sa = resultado.getCuentas().get(i).getSaldo();
	   	   		    
	   	   		   
	   	   		 
	   	   		 busq.getModeltablaCuentas().setValueAt(nm, i, 0);
	   	   		 busq.getModeltablaCuentas().setValueAt(sa,i,2);
	   	   		 
	   	   		 char primera = nm.charAt(0);
	   	   		 String primeral = ""+primera;
	   	   
	   	   		
	   	   		if(primeral.equals("A")){
	   	   			busq.getModeltablaCuentas().setValueAt("Ahorro",i,1);
	   	   			busq.getModeltablaCuentas().setValueAt("10000",i,3);
	   	   			
	   	   		}
	   	   		else{
	   	   		busq.getModeltablaCuentas().setValueAt("Corrienre",i,1);
	   	     	busq.getModeltablaCuentas().setValueAt("20000",i,3);
	   	   			
	   	   		}
	   	   		
	   	   		
				
	   				
	   			}busq.setVisible(true);
	   			}
	   		else if(tipobusqueda.equals("Cuenta")){
	   				
	   				VisualisaBusqueda busq = new VisualisaBusqueda();
	   				
	   				for(int i=0;i<=20;i++){
	   			  
	   			if(ventanaPrincipal.getGestionCliente().getClientes().size()!=0){
	   				try{
	   				if(ventanaPrincipal.getGestionCliente().getClientes().get(i).getCuentas().size()!=0){
	   				 if(ventanaPrincipal.getGestionCliente().getClientes().get(i).BuscarCuenta(busqueda)!=null){
	   					 
	   					Cuenta cuenta = ventanaPrincipal.getGestionCliente().getClientes().get(i).BuscarCuenta(busqueda);
	   					String num =cuenta.getNumeroCuenta();
	   					double sal = new Double(cuenta.getSaldo());
	   					
	   				busq.getModeltablaCuentas().setValueAt(num, 0, 0);
	   	   	   		 busq.getModeltablaCuentas().setValueAt(sal,0,2);
	   	   	   		 
	   	   	   		 char primera = num.charAt(0);
	   	   	   		 String primeral = ""+primera;
	   	   	   
	   	   	   		
	   	   	   		if(primeral.equals("A")){
	   	   	   			busq.getModeltablaCuentas().setValueAt("Ahorro",0,1);
	   	   	   			busq.getModeltablaCuentas().setValueAt("10000",0,3);
	   	   	   			
	   	   	   		}
	   	   	   		else{
	   	   	   		busq.getModeltablaCuentas().setValueAt("Corrienre",0,1);
	   	   	     	busq.getModeltablaCuentas().setValueAt("20000",0,3);
	   	   	   			
	   	   	   		}
	   	   	   		
	   	   	   		
	   				busq.setVisible(true);
	   					
	   					 
	   					 
	   					 
	   					 
	   				 }
	   				 
	   					
	   					
	   					
	   					
	   				}}catch(IndexOutOfBoundsException Index){
	   					System.out.println("no se encuntra");
	   					
		   			}
	   				
	   				
	   				
	   			}
	   			
	   			else{
	   				
	   				JOptionPane.showMessageDialog(null,"no sea encontrado");
	   			} 				
	   						
	   				
	   				
	   			}	
		   	   			
	   	
					
					
					
	   			}
	   			
	   			
	   			
	   			
	   			
	   			
	   			
	   			else{
	   				JOptionPane.showMessageDialog(null,"No se ensuentra ingrese bien los datos");
	   				
	   			}
	   			
	   			
	   			
				
 	   	 }}
	}
 	   public class accionSalir implements ActionListener{

   	   	 @Override
   			public void actionPerformed(ActionEvent arg0) {
   			
    				dispose();
   	   	 }}

}
