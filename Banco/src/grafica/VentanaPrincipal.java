package grafica;

import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;

import javax.swing.*;
import javax.swing.plaf.SliderUI;

import logic.Cliente;
import logic.Cuenta;
import logic.CuentaAhorro;
import logic.CuentaCorriente;
import logic.EGenero;
import logic.GestionCliente;

// Ventana principal del programa

public class VentanaPrincipal extends JFrame{

	//Se crean los elementos de la ventana

	private JLabel lbImagen;
	private JButton btCrearCuenta, btCrearCliente, btRetirar, btConsignar, btTransferir, btConsultar;
	private GestionCliente gestionCliente;
	private Cliente cliente;
	private CuentaAhorro cuentaAhorro;
	private CuentaCorriente cuentaCorriente;
	
	


	//Constructor

	public VentanaPrincipal(){

		// Se crea y define un elemento de tipo GridBagLayout para poder más adelante utilizarlo en la organización de los elementos en la ventana.

		this.getContentPane().setLayout (new GridBagLayout());
		GridBagConstraints Layout = new GridBagConstraints();

		//Se defina el título, el tamaño, el icono que llevara, y el comportamiento de la ventana.


		setTitle("Banco");
		setSize(380,430); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
		setResizable(false);

		// Se definen los distintos elementos de la ventana.
		//El GridBagLayout organiza los elementos de la ventana en una matriz, se puede definir la posición del elemento en la matriz, la cantidad de posiciones que ocupe en ancho o alto y el tamaño de dichas posiciones.

		gestionCliente = new GestionCliente();
		cliente = new Cliente();
        cuentaAhorro = new CuentaAhorro();
        cuentaCorriente = new CuentaCorriente();

		lbImagen = new JLabel();
		Layout.gridx=0;  // lbImagen se ubique en la columna 0
		Layout.gridy=0;  // lbImagen se ubica en la fila 0
		Layout.gridwidth=3; // lbImagen tiene 3 posiciones de ancho 
		Layout.gridheight=1; // lbImagen tiene 1 posición de alto
		Layout.weighty = 1.0;
		Layout.weightx = 1.0;
		this.getContentPane().add (lbImagen, Layout); // Se agrega lbImagen al layout
		lbImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("BancoDonJose.png"))); // al label se le agrega una imagen en vez de algún texto

		btCrearCliente = new JButton("Crear Cliente");
		btCrearCliente.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
		Layout.gridx=0;  //se ubique en la columna 0
		Layout.gridy=1;  //se ubica en la fila 1
		Layout.gridwidth=1; // tiene 1 posiciones de ancho 
		Layout.gridheight=1; // lbImagen tiene 1 posicón de alto
		btCrearCliente.addActionListener(new accionCrearCliente( this )); // se agregar la acción al botón
		this.getContentPane().add (btCrearCliente, Layout); // se agregar al layout

		btCrearCuenta = new JButton("Crear Cuenta");
		btCrearCuenta.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
		Layout.gridx=1;  //se ubique en la columna 1
		Layout.gridy=1;  //se ubica en la fila 1
		Layout.gridwidth=1; // tiene 1 posiciones de ancho 
		Layout.gridheight=1; // lbImagen tiene 1 posición de alto
		btCrearCuenta.addActionListener(new accionCrearCuenta(this)); // se agregar la acción al botón
		this.getContentPane().add (btCrearCuenta, Layout); // se agregar al layout

		btConsultar = new JButton("Consultar");
		btConsultar.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
		Layout.gridx=2;  //se ubique en la columna 2
		Layout.gridy=1;  //se ubica en la fila 1
		Layout.gridwidth=1; // tiene 1 posiciones de ancho 
		Layout.gridheight=1; // lbImagen tiene 1 posicón de alto
		btConsultar.addActionListener(new accionConsultar(this)); // se agregar la acción al botón
		this.getContentPane().add (btConsultar, Layout); // se agregar al layout

		btRetirar = new JButton("Retirar");
		btRetirar.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
		Layout.gridx=0;  //se ubique en la columna 0
		Layout.gridy=2;  //se ubica en la fila 2
		Layout.gridwidth=1; // tiene 1 posiciones de ancho 
		Layout.gridheight=1; // lbImagen tiene 1 posición de alto
		btRetirar.addActionListener(new accionRetiro(this)); // se agregar la acción al botón
		this.getContentPane().add (btRetirar, Layout); // se agregar al layout

		btConsignar = new JButton("Consignar");
		btConsignar.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
		Layout.gridx=1;  //se ubique en la columna 1
		Layout.gridy=2;  //se ubica en la fila 2
		Layout.gridwidth=1; // tiene 1 posiciones de ancho 
		Layout.gridheight=1; // lbImagen tiene 1 posición de alto
		btConsignar.addActionListener(new accionConsignar(this)); // se agregar la acción al botón
		this.getContentPane().add (btConsignar, Layout); // se agregar al layout

		btTransferir = new JButton("Transferir");
		btTransferir.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tamaño de letra
		Layout.gridx=2;  //se ubique en la columna 2
		Layout.gridy=2;  //se ubica en la fila 2
		Layout.gridwidth=1; // tiene 1 posiciones de ancho 
		Layout.gridheight=1; // lbImagen tiene 1 posición de alto
		btTransferir.addActionListener(new accionTransferir(this)); // se agregar la acción al botón
		this.getContentPane().add (btTransferir, Layout); // se agregar al layout

	}



	public GestionCliente getGestionCliente() {
		return gestionCliente;
	}


	public void setGestionCliente(GestionCliente gestionCliente) {
		this.gestionCliente = gestionCliente;
	}






	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public CuentaAhorro getCuentaAhorro() {
		return cuentaAhorro;
	}



	public void setCuentaAhorro(CuentaAhorro cuentaAhorro) {
		this.cuentaAhorro = cuentaAhorro;
	}



	public CuentaCorriente getCuentaCorriente() {
		return cuentaCorriente;
	}



	public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
		this.cuentaCorriente = cuentaCorriente;
	}



	public void agregarCliente(String nombre, String Apellido,String documento, String direccion, Calendar fecha, EGenero genero){
		Cliente cli = new Cliente();
		cli.setNombre(nombre);
		cli.setApellido(Apellido);
		cli.setDocumento(documento);
		cli.setDireccion(direccion);
		cli.setFechaNacimiento(fecha);
		cli.setGenero(genero);		
		gestionCliente.agregarCliente(cli);


	}

	public void agregarCuentaCorriente(String numeroCuenta,double saldo,Cliente cliente){

		CuentaCorriente cuentaCorrente = new CuentaCorriente();
     	cuentaCorrente.setNumeroCuenta(numeroCuenta);
		cuentaCorrente.setSaldo(saldo-cuentaCorriente.SALDO_MINIMO);
		cliente.agregarCuenta(cuentaCorrente);
		

	}

	public void agregarCuentaAhorro(String numeroCuenta,double saldo,Cliente cliente){


		CuentaAhorro cuentaAhorro = new CuentaAhorro();
		cuentaAhorro.setNumeroCuenta(numeroCuenta);
		cuentaAhorro.setSaldo(saldo-cuentaAhorro.SALDO_MINIMO);
		cliente.agregarCuenta(cuentaAhorro);
		
	}

	public void retirar(String cliente,String cuenta,double valor){
		
		Cliente cli =gestionCliente.BuscarCliente(cliente);
		Cuenta cuentab = cli.BuscarCuenta(cuenta);
				
				cuentab.Retirar(valor);
				
	}
	
public void consignar(String cliente,String cuenta,double valor){
		
		Cliente cli =gestionCliente.BuscarCliente(cliente);
		Cuenta cuentab = cli.BuscarCuenta(cuenta);
				
				cuentab.Consignar(valor);
				
	}
	
public void transferir(String clienteorigen, String cuentaorigen, String clienteDestino, String cuentadestino,double saldo){
	
	Cliente cliOr =gestionCliente.BuscarCliente(clienteorigen);
	Cuenta cuenOr =cliOr.BuscarCuenta(cuentaorigen);
	
	Cliente cliDes = gestionCliente.BuscarCliente(clienteDestino);
	Cuenta cuenDes = cliDes.BuscarCuenta(cuentadestino);
	
	
	cuenOr.Transferir(saldo, cuenDes);
	}
	


	public class accionCrearCliente implements ActionListener{
		private VentanaPrincipal ventanaPrincipal;
		

		public accionCrearCliente( VentanaPrincipal ventanaPrincipal ) {
			this.ventanaPrincipal = ventanaPrincipal;
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {

			// se crea un elemento de la ventana a llamar para cuando la acción sea ejecutada se llame y abra dicha ventana
			//System.out.println( "tamaño antes "+gestionCliente.getClientes().size( ) ) ;
			NuevoCliente clie = new NuevoCliente( ventanaPrincipal );
			clie.setVisible(true);
		}}


	public class accionCrearCuenta implements ActionListener{
		private VentanaPrincipal ventanaPrincipal2;
		
		public accionCrearCuenta(VentanaPrincipal ventanaPrincipal) {
			this.ventanaPrincipal2=ventanaPrincipal;
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {

			// se crea un elemento de la ventana a llamar para cuando la acción sea ejecutada se llame y abra dicha ventana
			//System.out.println( "tamaño antes "+cliente.getCuentas().size() ) ;
			NuevaCuenta nuev = new NuevaCuenta(ventanaPrincipal2);
			nuev.setVisible(true);}}

	public class accionRetiro implements ActionListener{
		
		private VentanaPrincipal ventanaPrincipal;
		
		

		public accionRetiro(VentanaPrincipal ventanaPrincipal) {
			
			this.ventanaPrincipal = ventanaPrincipal;
		}



		@Override
		public void actionPerformed(ActionEvent arg0) {

			// se crea un elemento de la ventana a llamar para cuando la acción sea ejecutada se llame y abra dicha ventana
			Retirar ret = new Retirar(ventanaPrincipal);
			ret.setVisible(true);
		}}

	public class accionConsultar implements ActionListener{

		private VentanaPrincipal ventanaPrincipal3;
					
		public accionConsultar(VentanaPrincipal ventanaPrincipal3) {
			
			this.ventanaPrincipal3 = ventanaPrincipal3;
		}
		@Override
		public void actionPerformed(ActionEvent arg0) {

			// se crea un elemento de la ventana a llamar para cuando la acción sea ejecutada se llame y abra dicha ventana
			Consultar consul = new Consultar(ventanaPrincipal3);
			consul.setVisible(true);}}

	public class accionConsignar implements ActionListener{
		
		private VentanaPrincipal ventanaPrincipal;
		
		

		public accionConsignar(VentanaPrincipal ventanaPrincipal) {
			
			this.ventanaPrincipal = ventanaPrincipal;
		}



		@Override
		public void actionPerformed(ActionEvent arg0) {

			// se crea un elemento de la ventana a llamar para cuando la acción sea ejecutada se llame y abra dicha ventana
			Consignar consin = new Consignar(ventanaPrincipal);
			consin.setVisible(true);}}

	public class accionTransferir implements ActionListener{
		private VentanaPrincipal ventanaPrincipal;
		
		

		public accionTransferir(VentanaPrincipal ventanaPrincipal) {
			
			this.ventanaPrincipal = ventanaPrincipal;
		}



		@Override
		public void actionPerformed(ActionEvent arg0) {

			// se crea un elemento de la ventana a llamar para cuando la acción sea ejecutada se llame y abra dicha ventana
			Transferir trans = new Transferir(ventanaPrincipal);
			trans.setVisible(true);}}


	public static void main(String[] args) {

		// se inicializa la ventana principal

		VentanaPrincipal ven = new VentanaPrincipal();
		ven.setVisible(true);}
	
	
	
}