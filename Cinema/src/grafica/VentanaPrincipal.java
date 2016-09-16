package grafica;

import java.awt.Color; 
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.naming.LimitExceededException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import logica.*;

public class VentanaPrincipal extends JFrame {
	
	private Validacion validar;
	private GestionEventos eventos;
	private GestionCliente cliente;
	private ConsultaCliente consulta;
	private GestionPelicula pelicula;
	private Carito carrito;
	private GestionVideoClub video;
	private String cedula,codigo,busq;
	private int pos3;

	
	
	private JLabel lbTitulo, lbImagen;
	private JButton btCliente, btPelicula, btAlquilar;
	private GridBagConstraints contLayout;
	
	public VentanaPrincipal() {
		
		setTitle("Video Club Chaplin: Principal");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());
		setIconImage(new ImageIcon("recursos/imagenes/Icono.png").getImage());
		setSize(530,450);
		setResizable(false);
	
		eventos = new GestionEventos(this);
		validar = new Validacion(this);
		cliente = new GestionCliente(this);
		consulta = new ConsultaCliente(this);
		pelicula = new GestionPelicula(this);
		carrito = new Carito(this);
		video =new GestionVideoClub();
		//cedula = new String();
		
		contLayout = new GridBagConstraints();
		
		lbTitulo = new JLabel("Video Club Chaplin");
		lbTitulo.setFont(new Font("Andalus",0,23));
		contLayout.gridx = 0; 
		contLayout.gridy = 0; 
		contLayout.gridwidth = 3; 
		contLayout.gridheight = 1; 
		contLayout.weightx = 1.0;
		contLayout.weighty = 1.0;
		add (lbTitulo,contLayout);
		
		lbImagen = new JLabel();
		lbImagen.setIcon(new ImageIcon("recursos/imagenes/ventana.png"));
		contLayout.gridx = 0; 
		contLayout.gridy = 1; 
		contLayout.gridwidth = 3; 
		contLayout.gridheight = 1; 
		add (lbImagen,contLayout);
		
		btCliente = new JButton("Cliente");
		btCliente.setBackground(Color.LIGHT_GRAY);
		btCliente.setForeground(Color.DARK_GRAY);
		btCliente.setFocusPainted(false);
		btCliente.setActionCommand(GestionEventos.CLIENTE);
		btCliente.addActionListener(getEventos());
		contLayout.gridx = 0; 
		contLayout.gridy = 2; 
		contLayout.gridwidth = 1; 
		contLayout.gridheight = 1; 
		contLayout.fill = GridBagConstraints.BOTH;
		add (btCliente,contLayout);
		
		btPelicula = new JButton("Pelicula");
	
		btPelicula.setBackground(Color.LIGHT_GRAY);
		btPelicula.setForeground(Color.DARK_GRAY);
		btPelicula.setFocusPainted(false);
		btPelicula.setActionCommand(GestionEventos.PELICULA);
		btPelicula.addActionListener(getEventos());
		contLayout.gridx = 1; 
		contLayout.gridy = 2; 
		contLayout.gridwidth = 1; 
		contLayout.gridheight = 1; 
		add (btPelicula,contLayout);
	
		btAlquilar= new JButton("  Alquilar");
		btAlquilar.setIcon(new ImageIcon("recursos/imagenes/carrito1.png"));
		btAlquilar.setBackground(Color.LIGHT_GRAY);
		btAlquilar.setForeground(Color.DARK_GRAY);
		btAlquilar.setFocusPainted(false);
		btAlquilar.setActionCommand(GestionEventos.ALQUILAR);
		btAlquilar.addActionListener(getEventos());		
		contLayout.gridx = 2; 
		contLayout.gridy = 2; 
		contLayout.gridwidth = 1; 
		contLayout.gridheight = 1; 
		add (btAlquilar,contLayout);
		
		
	}
	
	
	
	public Validacion getValidar() {
		return validar;
	}



	public void setValidar(Validacion validar) {
		this.validar = validar;
	}



	public GestionEventos getEventos() {
		return eventos;
	}



	public void setEventos(GestionEventos eventos) {
		this.eventos = eventos;
	}



	public String getCedula() {
		return cedula;
	}



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public int getPos3() {
		return pos3;
	}



	public void setPos3(int pos3) {
		this.pos3 = pos3;
	}



	



	public void setCedula(String cedula) {
		this.cedula = cedula;
	}



	public GestionCliente getCliente() {
		return cliente;
	}



	public void setCliente(GestionCliente cliente) {
		this.cliente = cliente;
	}



	public ConsultaCliente getConsulta() {
		return consulta;
	}



	public void setConsulta(ConsultaCliente consulta) {
		this.consulta = consulta;
	}



	public GestionPelicula getPelicula() {
		return pelicula;
	}



	public void setPelicula(GestionPelicula pelicula) {
		this.pelicula = pelicula;
	}



	public Carito getCarrito() {
		return carrito;
	}



	public void setCarrito(Carito carrito) {
		this.carrito = carrito;
	}



	public GestionVideoClub getVideo() {
		return video;
	}



	public void setVideo(GestionVideoClub video) {
		this.video = video;
	}



	public String getBusq() {
		return busq;
	}



	public void setBusq(String busq) {
		this.busq = busq;
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



	public JButton getBtCliente() {
		return btCliente;
	}



	public void setBtCliente(JButton btCliente) {
		this.btCliente = btCliente;
	}



	public JButton getBtPelicula() {
		return btPelicula;
	}



	public void setBtPelicula(JButton btPelicula) {
		this.btPelicula = btPelicula;
	}



	public JButton getBtAlquilar() {
		return btAlquilar;
	}



	public void setBtAlquilar(JButton btAlquilar) {
		this.btAlquilar = btAlquilar;
	}



	public GridBagConstraints getContLayout() {
		return contLayout;
	}



	public void setContLayout(GridBagConstraints contLayout) {
		this.contLayout = contLayout;
	}



	public static void main(String[] args) {
		VentanaPrincipal ven = new VentanaPrincipal();
		ven.getValidar().setVisible(true);
	}



	public void login() {
	
		if(validar.getTxUsuario().getText().equals("chaplin")&&validar.getTxPassword().getText().equals("1234")){
	          validar.dispose();	
	          this.setVisible(true);}
		else{
			JOptionPane.showMessageDialog(null, "PorFavor Ingrese Bien El Usuario", "Mensaje", 2);}
		}

	public void Salirlogin() {
		validar.dispose();}

	public void Cliente() {
		
		llenarTabla();
		cliente.getTxNombre().setText("");
		cliente.getTxApellido().setText("");
		cliente.getTxCedula().setText("");
		cliente.getTxConsultar().setText("");
		cliente.getTxDireccion().setText("");
		cliente.getTxTelefono().setText("");
		cliente.getCbGenero().setSelectedItem("");
		
		cliente.setVisible(true);
		
	}



	public void crearCliente() {	
		
		
		
		if(cliente.getTxNombre().getText().equals("") || cliente.getTxApellido().getText().equals("") || cliente.getTxCedula().getText().equals("")|| cliente.getTxDireccion().getText().equals("")|| cliente.getTxTelefono().getText().equals("")|| cliente.getCbGenero().getSelectedItem().toString().equals("")){
			
			JOptionPane.showMessageDialog(null,"Por Favor Llene Todos Los Campos Para Poder Crear El cliente", "Mensaje",2);
		}
		
		else{
			
			Cliente clienteUno = new Cliente();
			String nombreUno = cliente.getTxNombre().getText();
			String apellidoUno = cliente.getTxApellido().getText();
			String cedulaUno = cliente.getTxCedula().getText();
			String direccionUno = cliente.getTxDireccion().getText();
			String generoUno = cliente.getCbGenero().getSelectedItem().toString();
			EgeneroCliente generoDos=null;
			
			if(generoUno.equals(generoDos.Masculino.toString())){
				generoDos = EgeneroCliente.Masculino;
			}
			else{
				generoDos = EgeneroCliente.Femenino;
			}
			
			String telefonoUno = cliente.getTxTelefono().getText();
			
			clienteUno.setNombres(nombreUno);
			clienteUno.setApellidos(apellidoUno);
			clienteUno.setDocumento(cedulaUno);
			clienteUno.setDireccion(direccionUno);
			clienteUno.setGenero(generoDos);
			clienteUno.setTelefono(telefonoUno);
			
			
			video.agregarCleinte(clienteUno);
			llenarTabla();
			
			
			cliente.getTxNombre().setText("");
			cliente.getTxApellido().setText("");
			cliente.getTxCedula().setText("");
			cliente.getTxDireccion().setText("");
			cliente.getTxTelefono().setText("");
			cliente.getCbGenero().setSelectedItem("");
			
			
		}
	
		
	}



	public void modificarUno() {

		int pos =cliente.getJtCliente().getSelectedRow();
		
	   
		
		
			if(pos!=-1 ){
				
				
				cliente.getTxCedula().setEditable(false);
				cliente.getBtCrear().setEnabled(false);
			     cliente.getBtModificarDos().setEnabled(true);
			     cliente.getBtEliminar().setEnabled(false);
	    
	         setCedula(video.getClientes().get(pos).getDocumento().toString());
	         
	          cliente.getTxNombre().setText(video.getClientes().get(pos).getNombres());
	          cliente.getTxApellido().setText(video.getClientes().get(pos).getApellidos());
	          cliente.getTxCedula().setText(video.getClientes().get(pos).getDocumento());
	          cliente.getTxDireccion().setText(video.getClientes().get(pos).getDireccion());
	          cliente.getCbGenero().setSelectedItem(String.valueOf(video.getClientes().get(pos).getGenero()));
	          cliente.getTxTelefono().setText(video.getClientes().get(pos).getTelefono());
	         // video.modificarCliente(cedula, Apellidos, nombres, Direccion, Telefono, genero)
	        
			
	    }
			else{
				JOptionPane.showMessageDialog(null,"Seleccione Un Cliente Para Modificar", "Mesaje", 2);
			}
		
	}

	public void modificarDos() {
		
		
		String Apellidos = cliente.getTxApellido().getText();
		String nombres = cliente.getTxNombre().getText();
		String Direccion = cliente.getTxDireccion().getText();
		String Telefono = cliente.getTxTelefono().getText();
		String generoe = cliente.getCbGenero().getSelectedItem().toString();
		EgeneroCliente genero=null;
		
		if(generoe.equals(genero.Masculino.toString())){
			genero = EgeneroCliente.Masculino;
		}
		else{
			genero = EgeneroCliente.Femenino;
		}
		
		
     video.modificarCliente(cedula, Apellidos, nombres, Direccion, Telefono, genero);
     llenarTabla();
     cliente.getBtModificarDos().setEnabled(false);
     cliente.getBtCrear().setEnabled(true);
     cliente.getBtEliminar().setEnabled(true);
     cliente.getTxCedula().setEditable(true);
     
     cliente.getTxNombre().setText("");
     cliente.getTxApellido().setText("");
     cliente.getTxCedula().setText("");
     cliente.getTxDireccion().setText("");
     cliente.getTxTelefono().setText("");
     cliente.getCbGenero().setSelectedItem("");
     
		
	}



	public void eliminarCliente() {

		int pos =cliente.getJtCliente().getSelectedRow();
		
		if(pos!=-1){
			ArrayList<Pelicula> m =video.getClientes().get(pos).getPeliculas();
			if(m.size()==0){
			
   String cedula = video.getClientes().get(pos).getDocumento();
    video.eliminarCliente(cedula);
    llenarTabla();}
			else{JOptionPane.showMessageDialog(null,"No se peude eliminar","Mensaje", 2);}
			
		}
		else{
			JOptionPane.showMessageDialog(null,"Seleccione Un Cliente Para eliminar", "Mesaje", 2);
		}
		
	}



	public void buscarCliente() {
		
		
		
		if(cliente.getTxConsultar().getText().equals("")){
			JOptionPane.showMessageDialog(null,"Porfavor Ingrese Cedula Para Poder Realizar La Busqueda","Mensaje",2);
		}
		
		else{
			
			listoConsulta();
			
			
			String consultapre = cliente.getTxConsultar().getText();
			
		
			
			Cliente m = video.buscarCliente(consultapre);
			if(m!=null){
				
			consulta.getTxNombre().setText(m.getNombres());
			consulta.getTxApellido().setText(m.getApellidos());
			consulta.getTxCedula().setText(m.getDocumento());
			consulta.getTxDireccion().setText(m.getDireccion());
			consulta.getTxGenero().setText(m.getGenero().toString());
			consulta.getTxTelefono().setText(m.getTelefono());
			
			
			for(int p=0;p<m.getPeliculas().size();p++){
				
				String nombre = m.getPeliculas().get(p).getNombre();
				String genero = String.valueOf(m.getPeliculas().get(p).getGenero());
				String formato = String.valueOf(m.getPeliculas().get(p).getFormato());
				String codigo = m.getPeliculas().get(p).getCodigo();
				String precio = String.valueOf(m.getPeliculas().get(p).getPrecio());
				String fechaEntrega = m.getPeliculas().get(p).getFecha();
				
         		Object c [] ={nombre, genero,formato,codigo,precio,fechaEntrega};
				consulta.getMtPeliculas().insertRow(p,c);
				
			}
			
			
			
				
			consulta.setVisible(true);
			}
			else{
				JOptionPane.showMessageDialog(null,"El Cliente no se encuentra","Mensaje",2);
			}
		}
		
	}
	
	



	public void listoBusqueda() {
		
		
		consulta.dispose();
		
	}



	public void pelicula() {
		
		llenarTablaPelicula();
		pelicula.getTxCodigo().setText("");
		pelicula.getTxConsulta().setText("");
		pelicula.getTxNombre().setText("");
		pelicula.getTxPrecio().setText("");
		pelicula.getCbFormato().setSelectedItem("");
		pelicula.getCbGenero().setSelectedItem("");
		pelicula.getBtCrear().setEnabled(true);
		pelicula.getBtModificarTres().setEnabled(true);
		pelicula.getBtEliminaar().setEnabled(true);
		pelicula.setVisible(true);
		
	}
	
	public void crearPelicula() {
		if(pelicula.getTxNombre().getText().equals("") || pelicula.getTxCodigo().getText().equals("") || pelicula.getTxPrecio().getText().equals("")|| pelicula.getCbGenero().getSelectedItem().toString().equals("") || pelicula.getCbFormato().getSelectedItem().toString().equals("") ){
			JOptionPane.showMessageDialog(null,"Porfavor Llene Todos Los Campos","Mensaje", 2);
		}
		else{
			Pelicula pel =new Pelicula();
			pel.setNombre(pelicula.getTxNombre().getText());
			pel.setCodigo(pelicula.getTxCodigo().getText());
			pel.setDisponible(true);
			pel.setPrecio(Double.parseDouble(pelicula.getTxPrecio().getText()));
			
			String genero = pelicula.getCbGenero().getSelectedItem().toString();
		    String formato = pelicula.getCbFormato().getSelectedItem().toString();
		    
			Egenero egenero=null;
			Eformato eformato =null;
			
			if(genero.equals("Accion")){egenero = Egenero.Accion;}
			
			else if(genero.equals("Comedia")){egenero = Egenero.Comedia;}
			
			else if(genero.equals("Terror")){egenero = Egenero.Terror;}
			
			else if(genero.equals("Ciencia Ficcion")){egenero = Egenero.CienciaFiccion;}
			
			else if(genero.equals("Drama")){egenero = Egenero.Drama;}
			
			else if(genero.equals("Documentales")){egenero = Egenero.Documentales;}
			
			else if(genero.equals("Infantiles")){egenero = Egenero.Infantiles;}
			
			else if(genero.equals("Misterio")){egenero = Egenero.Misterio;}
			
			else if(genero.equals("Clasico")){egenero = Egenero.Clasico;}
			
						
			pel.setGenero(egenero);
			
			
			if(formato.equals("CD")){eformato = Eformato.CD;}
			
			else if(formato.equals("DVD")){eformato = Eformato.DVD;}
			
			else if(formato.equals("Blu-Ray")){eformato = Eformato.Bluray;}
			
			if(formato.equals("VH")){eformato = Eformato.VH;}
			
			pel.setFormato(eformato);
			
			
				video.agregarPelicula(pel);
				
				llenarTablaPelicula();
				
			
			pelicula.getTxNombre().setText("");
			pelicula.getTxCodigo().setText("");
			pelicula.getTxPrecio().setText("");
			pelicula.getCbGenero().setSelectedItem("");
			pelicula.getCbFormato().setSelectedItem("");
			
			
		}
		
		
	}



	public void buscarPelicula() {
		if(pelicula.getTxConsulta().getText().equals("")){
			JOptionPane.showMessageDialog(null,"Porfavor Agrege El Codigo De La Pelicula Para Realizar La Busqueda", "Mensaje",2);
		}
		else{
			String codigo = pelicula.getTxConsulta().getText();
			Pelicula p = video.buscarPelicula(codigo);
			
			if(p!=null){
				listoPelicula();
				pelicula.getTxConsulta().setText("");

				
				String nombre = p.getNombre();
				String genero = p.getGenero().toString();
				String formato = p.getFormato().toString();
				String codigow = p.getCodigo();
				String precio = String.valueOf(p.getPrecio());
				String disponible = null;
				
				if(p.getDisponible()==true){disponible="Disponible";}
				else{disponible="No Disponible";}
				
				
				Object o[] = {nombre,genero, formato, codigow,precio,disponible};
				pelicula.getMtPelicula().insertRow(0,o);
				pelicula.getBtCrear().setEnabled(false);
				pelicula.getBtEliminaar().setEnabled(false);
				pelicula.getBtModificarCuatro().setEnabled(false);
				pelicula.getBtModificarTres().setEnabled(false);
				
								
				
			}
			else{
				JOptionPane.showMessageDialog(null,"No se encuentra la pelicula", "Mensaje",2);
			}
			
		}

	}



	public void eliminarPelicula() { 
		
   int pos =pelicula.getJtPelicula().getSelectedRow();
		
		if(pos!=-1){
			
		boolean m =video.getPeliculas().get(pos).getDisponible();
			if(m==true){
    
   String codigo = video.getPeliculas().get(pos).getCodigo();
    video.eliminarPelicula(codigo);
    llenarTablaPelicula();}
			else{
				JOptionPane.showMessageDialog(null,"No se puede eliminar","Mensaje",2);
			}	
		}
		else{
			JOptionPane.showMessageDialog(null,"Seleccione Una Pelicula Para eliminar", "Mesaje", 2);
		}
		
	}



	public void modificarTres() {
		
        int pos = pelicula.getJtPelicula().getSelectedRow();
		
		pelicula.getTxCodigo().setEditable(false);
	     
			
			if(pos!=-1){
				 pelicula.getBtCrear().setEnabled(false);
			     pelicula.getBtModificarCuatro().setEnabled(true);
			     pelicula.getBtEliminaar().setEnabled(false);
	    
	         setCodigo(video.getPeliculas().get(pos).getCodigo().toString());
	         
         
	          pelicula.getTxNombre().setText(video.getPeliculas().get(pos).getNombre());
	          pelicula.getTxPrecio().setText(String.valueOf(video.getPeliculas().get(pos).getPrecio()));
	          pelicula.getCbGenero().setSelectedItem(String.valueOf(video.getPeliculas().get(pos).getGenero()));
	          pelicula.getCbFormato().setSelectedItem(String.valueOf(video.getPeliculas().get(pos).getFormato()));
	          pelicula.getTxCodigo().setText(video.getPeliculas().get(pos).getCodigo());
	    }
			else{
				JOptionPane.showMessageDialog(null,"Seleccione Una Pelicula Para Modificar", "Mesaje", 2);
			}
		
	}



	public void modificarCuatro() {
		
		String nombre = pelicula.getTxNombre().getText();
		double precio = Double.parseDouble(pelicula.getTxPrecio().getText());
		String generoprre = pelicula.getCbGenero().getSelectedItem().toString();
		Egenero genero =null;
		String formatoprre = pelicula.getCbFormato().getSelectedItem().toString();
		Eformato formaro=null;
		
		if(generoprre.equals("Accion")){genero=Egenero.Accion;}
		
		else if(generoprre.equals("Comedia")){genero=Egenero.Comedia;}
		
		else if(generoprre.equals("Terror")){genero=Egenero.Terror;}
		
		else if(generoprre.equals("Ciencia Ficcion")){genero=Egenero.CienciaFiccion;}
		
		else if(generoprre.equals("Drama")){genero=Egenero.Drama;}
		
		else if(generoprre.equals("Documentales")){genero=Egenero.Documentales;}
		
		else if(generoprre.equals("Infantiles")){genero=Egenero.Infantiles;}
		
		else if(generoprre.equals("Clasicp")){genero=Egenero.Clasico;}
	
		if(formatoprre.equals("CD")){formaro=Eformato.CD;}
		
		else if (formatoprre.equals("DVD")){formaro=Eformato.DVD;}
		
		else if (formatoprre.equals("Blu-Ray")){formaro=Eformato.Bluray;}
		
		else if (formatoprre.equals("VH")){formaro=Eformato.VH;}
	

		
		video.modificarPelicula(codigo, nombre, precio, genero, formaro);
	
     llenarTablaPelicula();
		
     pelicula.getBtModificarCuatro().setEnabled(false);
     pelicula.getBtCrear().setEnabled(true);
     pelicula.getBtEliminaar().setEnabled(true);
     pelicula.getTxCodigo().setEditable(true);
     
     pelicula.getTxCodigo().setText("");
     pelicula.getTxNombre().setText("");
     pelicula.getTxPrecio().setText("");
     pelicula.getCbGenero().setSelectedItem("");
     pelicula.getCbFormato().setSelectedItem("");

		
	}



	public void alquilar() {
		
		llenarTablaPeliculacarrito();
		carrito.getTxCedula().setText("");
		carrito.getTxConsulta().setText("");
		carrito.getTxFecha().setText("");
		carrito.getTxNombre().setText("");
		carrito.getTxTotal().setText("");
		carrito.getBtAgregar().setEnabled(false);
		carrito.getBtFinalizar().setEnabled(false);
		carrito.getBtQuitar().setEnabled(false);
		carrito.getBtFinalizar().setEnabled(true);
		carrito.getTxConsulta().setEditable(true);
		listoAquilercarrito();
		
		carrito.setVisible(true);
		
	}

	


	public void buscarCarrito() {
		
	setBusq(carrito.getTxConsulta().getText());
	
	if(video.buscarCliente(busq)!=null){	
	carrito.getTxNombre().setText(video.buscarCliente(busq).getNombres());
	carrito.getTxCedula().setText(video.buscarCliente(busq).getDocumento());
	carrito.getBtAgregar().setEnabled(true);
	carrito.getBtFinalizar().setEnabled(true);
	carrito.getBtQuitar().setEnabled(true);
	carrito.getTxConsulta().setEditable(false);
	}
	else{
		JOptionPane.showMessageDialog(null,"No se encuentra el cliente","Mensaje",2);
	}
	}



	public void agregarCarrito() {
		
		setPos3(carrito.getJtPelicula().getSelectedRow());
		
	if(pos3!=-1){
		
	   String nombre= video.getPeliculas().get(pos3).getNombre();
	   String genero = video.getPeliculas().get(pos3).getGenero().toString();
	   String formato = video.getPeliculas().get(pos3).getFormato().toString();
	   String codigo = video.getPeliculas().get(pos3).getCodigo();
	   String precio = String.valueOf(video.getPeliculas().get(pos3).getPrecio());
		boolean disponible = video.getPeliculas().get(pos3).getDisponible();	
		
	     Object m [] ={nombre,genero,formato,codigo,precio};
	     
	     if(disponible != false){
	    
	    for(int i =0;i<1;i++){
	    
	    carrito.getMtAlquiler().insertRow(i, m);
	    
	    video.getPeliculas().get(pos3).setDisponible(false);
	    llenarTablaPeliculacarrito();
	    }
	   
	     }
	   
	    
	     
	   
	} 
	else{JOptionPane.showMessageDialog(null,"Seleccion Pelicula","Mensaje",2);}  
	}



	public void quitarCarrito() {
		
		int pos = carrito.getJtAlquiler().getSelectedRow();
		if(pos==-1){
			JOptionPane.showMessageDialog(null,"Porfavor seleccion una peliculapara quitar del carrito", "Mensaje", 2);
		}
		else{
		
	
			
	    String bus = carrito.getJtAlquiler().getValueAt(pos, 3).toString();
	    video.buscarPelicula(bus).setDisponible(true);
	    llenarTablaPeliculacarrito();
		
		carrito.getMtAlquiler().removeRow(pos);
		}	
	}



	public void listoCarrito() {
		carrito.getBtFinalizar().setEnabled(false);
		
		double total=0;
		for(int d=0;d<carrito.getJtAlquiler().getRowCount();d++){
	
			
		String codigo =carrito.getMtAlquiler().getValueAt(d,3).toString();
		double p =Double.parseDouble(carrito.getMtAlquiler().getValueAt(d, 4).toString());
		String fecha = fecha();
		
		total=total+p;
		video.buscarCliente(busq).agregarPelicula(video.buscarPelicula(codigo));
		video.getPeliculas().get(d).setDisponible(false);
		carrito.getTxTotal().setText(String.valueOf(total));
		carrito.getTxFecha().setText(fecha);
		video.getPeliculas().get(d).setFecha(fecha);
		
	    
		}
	}
	
	public void llenarTabla(){
	
		listo();
		
				
		for(int g=0; g<video.getClientes().size();g++){
			
			String nombre = video.getClientes().get(g).getNombres();
			String apellido = video.getClientes().get(g).getApellidos();
			String cedula = video.getClientes().get(g).getDocumento();
		
			
			Object co [] = {nombre,apellido,cedula};
			
		    cliente.getMtCliente().insertRow(g,co);
		}
		
		
		
	}
	
	public void llenarTablaPelicula(){
		
		listoPelicula();
		
		for(int f =0;f<video.getPeliculas().size();f++){
			
			String nombre = video.getPeliculas().get(f).getNombre();
			String genero = video.getPeliculas().get(f).getGenero().toString();
			String formato = video.getPeliculas().get(f).getFormato().toString();
			String codigo = video.getPeliculas().get(f).getCodigo().toString();
			String precio = String.valueOf(video.getPeliculas().get(f).getPrecio());
			String disponible =null;
			
		  if(video.getPeliculas().get(f).getDisponible()==true){
			  disponible="Disponible";
		  }
		  else{
			  disponible="No Disponible";
		  }
			
			
			
			Object p []={nombre,genero,formato,codigo,precio,disponible};
			pelicula.getMtPelicula().insertRow(f, p);
			
		}
		
		
	}
	
	public void listo() {

		while (cliente.getMtCliente().getRowCount() != 0) {
			cliente.getMtCliente().removeRow(0);
		}
		}
	public void listoConsulta() {

		while (consulta.getMtPeliculas().getRowCount() != 0) {
			consulta.getMtPeliculas().removeRow(0);
		}
		}
	
	public void listoPelicula() {

		while (pelicula.getMtPelicula().getRowCount() != 0) {
			pelicula.getMtPelicula().removeRow(0);
		}
		}



	
	public void llenarTablaPeliculacarrito(){
		
		listoPeliculacarrito();
		
		for(int f =0;f<video.getPeliculas().size();f++){
			
			String nombre = video.getPeliculas().get(f).getNombre();
			String genero = video.getPeliculas().get(f).getGenero().toString();
			String formato = video.getPeliculas().get(f).getFormato().toString();
			String codigo = video.getPeliculas().get(f).getCodigo().toString();
			String precio = String.valueOf(video.getPeliculas().get(f).getPrecio());
			String disponible =null;
			
		  if(video.getPeliculas().get(f).getDisponible()==true){
			  disponible="Disponible";
		  }
		  else{
			  disponible="No Disponible";
		  }
			
			
			
			Object p []={nombre,genero,formato,codigo,precio,disponible};
			carrito.getMtPelicula().insertRow(f, p);
			
		}
		
		
	}
	
	public void listoPeliculacarrito() {

		while (carrito.getMtPelicula().getRowCount() != 0) {
			carrito.getMtPelicula().removeRow(0);
		}
		}
	
	
public String fecha(){
	
	Calendar fecha= new GregorianCalendar();
	int dia = fecha.get(Calendar.DAY_OF_MONTH);
	String g = ((dia+7)+"/"+fecha.get(Calendar.MONTH)+"/"+fecha.get(Calendar.YEAR));
	
	
	return g ;
	
}
public void listoAquilercarrito() {

	while (carrito.getMtAlquiler().getRowCount() != 0) {
		carrito.getMtAlquiler().removeRow(0);
	}
	}

	




}
