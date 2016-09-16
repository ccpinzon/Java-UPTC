package Gui;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelDerecho extends JPanel{
	private JLabel lbCell;
	private JButton btnStop;
	private VentanaPrincipal ventanaPrincipal;

	public PanelDerecho(VentanaPrincipal ventanaPrincipal) {
		super();
		
		// TODO Auto-generated constructor stub
		this.ventanaPrincipal=ventanaPrincipal;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setOpaque(false);
		 setSize(300, 500);
		inicializarComponentes();
		agregarComponentes();
	}
	private void agregarComponentes() {
		// TODO Auto-generated method stub
		this.add(lbCell);
	}
	private void inicializarComponentes() {
		// TODO Auto-generated method stub
		lbCell= new JLabel();
		lbCell.setIcon(new ImageIcon(getClass().getResource("/Recursos/Imagenes/Cell1.png")));
		btnStop = new JButton("Parar");
		btnStop.setActionCommand(GestionEventos.PARAR);
		btnStop.addActionListener(ventanaPrincipal.getGestionEventos());
	}
	public JLabel getLbCell() {
		return lbCell;
	}
	public void setLbCell(JLabel lbCell) {
		this.lbCell = lbCell;
	}
	
}
