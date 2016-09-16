//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//
//public class GestionEventos implements ActionListener {
//
//	public static final String SUMAR = "Sumar";
//	private VentanaPrincipal ventana;
//		
//	
//	public GestionEventos( VentanaPrincipal ventana) {
//		this.ventana = ventana;
//	}
//	
//	
//	
//	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		if ( e.getActionCommand().equals( SUMAR) ){
//			ventana.sumar();
//		}
//	}
//
//	
//	
//	
//
//}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GestioEventos implements ActionListener,KeyListener {

	public static final String SUMAR = "Sumar";
	public static final String MENOS = "Menos";
	public static final String DIVIDIR = "Dividir";
	public static final String MULTIPLICAR = "Multiplicar";
	public static final String LIMPIAR = "Limpiar";
	public static final String SALIR= "Salir";

	private MenuCalculadora ventana;

	public GestioEventos(MenuCalculadora ventana) {
		this.ventana = ventana;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals(SUMAR)) {
			ventana.sumar();
		}

		else if (e.getActionCommand().equals(MENOS)) {
			ventana.menos();
		} else if (e.getActionCommand().equals(DIVIDIR)) {
			ventana.dividir();
		} else if (e.getActionCommand().equals(MULTIPLICAR)) {
			ventana.multiplicar();
		} else if (e.getActionCommand().equals(LIMPIAR)) {
			ventana.limpiar();
		}
		else if (e.getActionCommand().equals(SALIR)) {
			ventana.Salir();
			}
	}

	@Override
	public void keyPressed(KeyEvent e) {
	
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
		int codigo =(int)e.getKeyChar();
		if(codigo <48 || codigo>57){
			e.consume();
		}
		
	}

}
