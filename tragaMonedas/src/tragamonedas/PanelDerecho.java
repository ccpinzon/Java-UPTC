package tragamonedas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelDerecho extends JPanel {
	
	
	private VentanaPrincipal ventanaPrincipal;
	private JTextField txValorApuesta;
	private JButton btApostar;
	private JLabel lbTitulo,lbs,lbs2;
	
	public PanelDerecho(VentanaPrincipal ventanaPrincipal) {
		
		this.ventanaPrincipal=ventanaPrincipal;
		
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		
		setEnabled(false);
		setSize(100,100);
		setOpaque(false);
		inicializar();
		agregar();
		
		
	}

	private void inicializar() {
		
		lbTitulo = new JLabel("Valor a Apostar:");
		lbTitulo.setFont(new Font(Font.SANS_SERIF,Font.BOLD,14));
		lbTitulo.setForeground(Color.WHITE);
				
		txValorApuesta = new JTextField();
		txValorApuesta.setAlignmentX(Component.CENTER_ALIGNMENT);
		txValorApuesta.addKeyListener(ventanaPrincipal.getEventos());
		
		
		lbs = new JLabel(" ");
		lbs2 = new JLabel(" ");
		
		btApostar = new JButton();
		btApostar.setActionCommand(GestionEventos.EJECUTAR);
		btApostar.addActionListener(ventanaPrincipal.getEventos());
		btApostar.setIcon(new ImageIcon(getClass().getResource("/recursos/imagenes/apostar.png")));
		btApostar.setBorderPainted(false);
	    btApostar.setMargin(insets());
	}
	

	private void agregar() {
		
		add(lbTitulo);
		add(lbs);
		add(txValorApuesta);
		add(lbs2);
		add(btApostar);
		
	}

	public JTextField getTxValorApuesta() {
		return txValorApuesta;
	}

	public void setTxValorApuesta(JTextField txValorApuesta) {
		this.txValorApuesta = txValorApuesta;
	}

	public JButton getBtApostar() {
		return btApostar;
	}

	public void setBtApostar(JButton btApostar) {
		this.btApostar = btApostar;
	}
	
	

}
