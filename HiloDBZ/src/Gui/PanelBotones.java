package Gui;

import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBotones extends JPanel {

	private VentanaPrincipal ventanaPrincipal;
	private JButton btnStop;
	private JButton btnReiniciar;
	
	
	public PanelBotones(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
		
		this.setOpaque(false);
		inicializarComponentes();
		agregarComponentes();
		
	}


	private void agregarComponentes() {
	
		this.add(btnReiniciar);
		this.add(btnStop);

	}

	private void inicializarComponentes() {
		btnStop = new JButton("Parar");
		btnStop.setActionCommand(GestionEventos.PARAR);
		btnStop.addActionListener(ventanaPrincipal.getGestionEventos());
		
		btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.setActionCommand(GestionEventos.INICIAR);
		btnReiniciar.addActionListener(ventanaPrincipal.getGestionEventos());
	}


	public JButton getBtnStop() {
		return btnStop;
	}


	public void setBtnStop(JButton btnStop) {
		this.btnStop = btnStop;
	}


	public JButton getBtnReiniciar() {
		return btnReiniciar;
	}


	public void setBtnReiniciar(JButton btnReiniciar) {
		this.btnReiniciar = btnReiniciar;
	}

	
}
