package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GestionEventos implements ActionListener,KeyListener {
	
	public static final String EJECUTAR = "ejecutar";

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
		// TODO Auto-generated method stub
        int codigo =(int) arg0.getKeyChar(); 
		
		if(codigo<48 || codigo>57){
			arg0.consume();	
			
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if ( e.getActionCommand().equals(EJECUTAR) ){
			ventanaPrincipal.ejecutar();
		}
		
	}

	

}
