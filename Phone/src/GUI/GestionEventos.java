package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

public class GestionEventos implements ActionListener {

	public static final String ABRIR="Abrir";
	public static final String MOSTRAR="Mostrar";
	public static final String GENERAR="Generar";
	public static final String TODO = "Todo";
	public static final String FECHA = "Fecha";
	public static final String HORA = "Hora";
	public static final String NUMERO="Numero";
	public static final String DURACION = "Duracion";
	public static final String COSTO =  "Costo";
	public static final String SALIR = "Salir";
	//public static final String HISTOGRAMA = "Histograma";
	public static final String AYUDA = "Ayuda";
	public static final String LISTO = "Listo";
	public static final String VERLISTA = "VerLista";
	public static final String LISTOVER = "Ver";
	public static final String ACEPTAR = "Aceptar"; 
	
	private VentanaPrincipal ventanaPrincipal;
	
	public GestionEventos(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal=ventanaPrincipal;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if (e.getActionCommand().equals(ABRIR)) {
			try {
				ventanaPrincipal.abrir();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}		
		}
		
		if (e.getActionCommand().equals(MOSTRAR)) {
			try {
				ventanaPrincipal.mostrar();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		else if (e.getActionCommand().equals(AYUDA)) {
			ventanaPrincipal.ayuda();
		}
		
		else if (e.getActionCommand().equals(SALIR) ){
			ventanaPrincipal.salir();
		}
		
		else if (e.getActionCommand().equals(LISTO) ){
			ventanaPrincipal.listo();
		}
		
		else if (e.getActionCommand().equals(TODO) ){
			ventanaPrincipal.todo();
		}
		
		else if (e.getActionCommand().equals(FECHA) ){
			ventanaPrincipal.fecha();
		}
		
		else if (e.getActionCommand().equals(HORA) ){
			ventanaPrincipal.hora();
		}
		
		else if (e.getActionCommand().equals(NUMERO) ){
			ventanaPrincipal.numero();
		}
		
		else if (e.getActionCommand().equals(DURACION) ){
			ventanaPrincipal.duracion();
		}
		
		else if (e.getActionCommand().equals(COSTO)){
			ventanaPrincipal.costo();
		}
		
		else if (e.getActionCommand().equals(VERLISTA)){
			ventanaPrincipal.verLista();
		}
		else if (e.getActionCommand().equals(LISTOVER)){
			ventanaPrincipal.ver();
		}
		else if (e.getActionCommand().equals(GENERAR)){
			ventanaPrincipal.generar();
		}
		
		else if (e.getActionCommand().equals(ACEPTAR)){
			ventanaPrincipal.acpetar();
		}
		
		
		
	}

}
