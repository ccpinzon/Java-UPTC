package Gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionEventos implements ActionListener {
	public static final String INICIAR = "iniciar";
	public static final String PARAR = "parar";
	private VentanaPrincipal ventanaPrincipal;

	public GestionEventos(VentanaPrincipal ventanaPrincipal) {
		super();
		this.ventanaPrincipal = ventanaPrincipal;
	}



	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getActionCommand().equals(INICIAR)) {
			ventanaPrincipal.Iniciar();
		} else if (arg0.getActionCommand().equals(PARAR)) {
			ventanaPrincipal.stop();
		}

	}
}
