package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GestionEventos implements ActionListener {

	
	private VentanaPrincipal ventanaPrincipal;
	public static final String LISTA_DESORDENADA ="ListaDesordenada";
	public static final String LISTA_ORDENADA="ListaOrdenada";
	public static final String AGREGAR_FINAL="AgregarFinal";
	public static final String AGREGAR_PRINCIPIO ="AgregarPrincipio";
	public static final String AGREGAR_ORDEN="AgregarOrden";
	public static final String BUSACR ="Buscar";
	public static final String ACEPTAR ="Aceptar";
	public static final String ELIMININAR ="Eliminar";
	
	public GestionEventos(VentanaPrincipal ventanaPrincipal) {
		// TODO Auto-generated constructor stub
	            this.ventanaPrincipal=ventanaPrincipal;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getActionCommand().equals(LISTA_DESORDENADA)){
			ventanaPrincipal.listaDesordenada();
		}
		
		if (arg0.getActionCommand().equals(LISTA_ORDENADA)){
			ventanaPrincipal.listaOrdenada();
		}
		
		if (arg0.getActionCommand().equals(AGREGAR_FINAL)){
			ventanaPrincipal.AgregarFinal();
		}
		
		if (arg0.getActionCommand().equals(AGREGAR_PRINCIPIO)){
			ventanaPrincipal.AgregarPrincipio();
		}
	
		if (arg0.getActionCommand().equals(AGREGAR_ORDEN)){
			try {
				ventanaPrincipal.AgregarOrden();
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if (arg0.getActionCommand().equals(BUSACR)){
				ventanaPrincipal.Buscar();		
		}
		if (arg0.getActionCommand().equals(ACEPTAR)){
			ventanaPrincipal.Aceptar();
		}
		if (arg0.getActionCommand().equals(ELIMININAR)){
			ventanaPrincipal.Eliminar();
		}
		
	}


	

}
