package Gui;



import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class PanelIzquierdo extends JPanel {
	private JLabel lbGoku;
	private JButton btnReiniciar;
	private VentanaPrincipal ventanaPrincipal;

	public PanelIzquierdo(VentanaPrincipal ventanaPrincipal) {
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
		this.add(lbGoku);

	}

	private void inicializarComponentes() {
		// TODO Auto-generated method stub
		lbGoku = new JLabel();
		lbGoku.setIcon(new ImageIcon(getClass().getResource("/Recursos/Imagenes/Goku1.png")));
		btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.setActionCommand(GestionEventos.INICIAR);
		btnReiniciar.addActionListener(ventanaPrincipal.getGestionEventos());
	}

	public JLabel getLbGoku() {
		return lbGoku;
	}

	public void setLbGoku(JLabel lbGoku) {
		this.lbGoku = lbGoku;
	}

}
