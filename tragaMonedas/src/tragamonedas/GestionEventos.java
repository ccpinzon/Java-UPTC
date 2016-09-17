package tragamonedas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GestionEventos implements ActionListener,KeyListener {

	public static final String PARARUNO = "pararUno";
	public static final String PARARDOS = "pararDos";
	public static final String PARARTRES = "pararTres";
	public static final String EJECUTAR = "ejecutar";
	public static final String SALIR = "salir";
	public static final String AYUDA = "ayuda";
	
	private VentanaPrincipal ventanaPrincipal;
	
   public GestionEventos(VentanaPrincipal ventanaPrincipal) {
   
	   this.ventanaPrincipal=ventanaPrincipal;
   
   }
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		int codigo =(int)arg0.getKeyChar();
		if(codigo <48 || codigo>57){
			arg0.consume();
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getActionCommand().equals(PARARUNO)) {
			ventanaPrincipal.pararUno();
		}
		if (arg0.getActionCommand().equals(PARARDOS)) {
			ventanaPrincipal.pararDos();
		}
		if (arg0.getActionCommand().equals(PARARTRES)) {
			ventanaPrincipal.pararTres();
		}
		if (arg0.getActionCommand().equals(EJECUTAR)) {
			ventanaPrincipal.Ejecutar();
		}
		if (arg0.getActionCommand().equals(SALIR)) {
			ventanaPrincipal.Salir();
		}
		if (arg0.getActionCommand().equals(AYUDA)) {
			ventanaPrincipal.ayuda();
		}
	}

}
