package grafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionEventos implements ActionListener {
	
	public static final String LOGIN="Login";
	public static final String SALIRLOGIN="SalirLogin";
	public static final String CLIENTE="Cliente";
	public static final String CREARCLIENTE= "CrearCliente";
	public static final String ELIMINARCLIENTE="EliminarCliente";
	public static final String BUSCARCLIENTE="BuscarCliente";
	public static final String LISTOBUSQUEDA= "ListoBusqueda";
	public static final String PELICULA = "Pelicula";
	public static final String CREARPELICULA ="CreaePelicula";
    public static final String BUSCARPELICULA= "BuscarPelicula";
	public static final String ELIMINARPELICULA="EliminarPelicula";
	public static final String MODIFICARUNO="ModificarUno";
	public static final String MODIFICARDOS="ModificarDos"; 
	public static final String MODIFICARTRES ="ModificarTres";
	public static final String MODIFICARCUATRO = "ModificarCuatro";
	public static final String ALQUILAR = "Alquilar";
	public static final String BUSCARCARRITO = "BuscarCarrito";
	public static final String AGREGARCARRITO = "AgregarCarrito";
	public static final String QUITARCARRITO = "QuitarCarrito";
    public static final String LISTOCARRITO ="listoCarrito";
	
	private VentanaPrincipal ventanaPrincipal;
	
	public GestionEventos(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal=ventanaPrincipal;}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals(LOGIN)) {
			ventanaPrincipal.login();
		}
		
		else if (e.getActionCommand().equals(SALIRLOGIN)) {
			ventanaPrincipal.Salirlogin();
		}
		
		else if (e.getActionCommand().equals(CLIENTE)) {
			ventanaPrincipal.Cliente();
		}
		
		else if (e.getActionCommand().equals(CREARCLIENTE)) {
			ventanaPrincipal.crearCliente();
		}
		
		
		
		else if (e.getActionCommand().equals(ELIMINARCLIENTE)) {
			ventanaPrincipal.eliminarCliente();
		}
		
		else if (e.getActionCommand().equals(BUSCARCLIENTE)) {
			ventanaPrincipal.buscarCliente();
		}
		
		else if (e.getActionCommand().equals(LISTOBUSQUEDA)) {
			ventanaPrincipal.listoBusqueda();
		}
		
		else if (e.getActionCommand().equals(PELICULA)) {
			ventanaPrincipal.pelicula();
		}
		
		else if (e.getActionCommand().equals(BUSCARPELICULA)) {
			ventanaPrincipal.buscarPelicula();
		}
		
		else if (e.getActionCommand().equals(ELIMINARPELICULA)) {
			ventanaPrincipal.eliminarPelicula();
		}
		
		
		else if (e.getActionCommand().equals(MODIFICARUNO)) {
			ventanaPrincipal.modificarUno();
		}
		
		else if (e.getActionCommand().equals(MODIFICARDOS)) {
			ventanaPrincipal.modificarDos();
		}
		
		else if (e.getActionCommand().equals(MODIFICARTRES)) {
			ventanaPrincipal.modificarTres();
		}
		
		else if (e.getActionCommand().equals(MODIFICARCUATRO)) {
			ventanaPrincipal.modificarCuatro();
		}

		else if (e.getActionCommand().equals(ALQUILAR)) {
			ventanaPrincipal.alquilar();
		}
		
		else if (e.getActionCommand().equals(BUSCARCARRITO)) {
			ventanaPrincipal.buscarCarrito();
		}
		
		else if (e.getActionCommand().equals(AGREGARCARRITO)) {
			ventanaPrincipal.agregarCarrito();
		}
		
		else if (e.getActionCommand().equals(QUITARCARRITO)) {
			ventanaPrincipal.quitarCarrito();
		}
		
		else if (e.getActionCommand().equals(LISTOCARRITO)) {
			ventanaPrincipal.listoCarrito();
		}
		
		else if (e.getActionCommand().equals(CREARPELICULA)) {
			ventanaPrincipal.crearPelicula();
		}
		
		
		
	}

}
