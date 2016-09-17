package tragamonedas;

import java.awt.Color; 
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class PanelBotones extends JPanel {

	private JButton btPararUno, btPararDos, btPararTres;
    private JLabel lbSeparadorUno, lbSeJLabelDos;
	private VentanaPrincipal ventanaPrincipal;
	private ImageIcon icon;
	
	public PanelBotones(VentanaPrincipal ventanaPrincipal) {
		
		this.ventanaPrincipal=ventanaPrincipal;
		setLayout(new FlowLayout());
		setOpaque(false);
		inicilizar();
		agrega();
		
	}

	private void inicilizar() {
		
		
		lbSeparadorUno = new JLabel("                         ");
		lbSeJLabelDos = new JLabel("                         ");
		
		btPararUno = new JButton();
		btPararUno.setEnabled(false);
		btPararUno.setActionCommand(GestionEventos.PARARUNO);
		btPararUno.addActionListener(ventanaPrincipal.getEventos());
		btPararUno.setIcon(new ImageIcon(getClass().getResource("/recursos/imagenes/stop.png")));
	  	btPararUno.setBorderPainted(false);
	    btPararUno.setMargin(insets());
		
		btPararDos = new JButton();
		btPararDos.setEnabled(false);
		btPararDos.setActionCommand(GestionEventos.PARARDOS);
		btPararDos.addActionListener(ventanaPrincipal.getEventos());
		btPararDos.setIcon(new ImageIcon(getClass().getResource("/recursos/imagenes/stop.png")));
	  	btPararDos.setBorderPainted(false);
	    btPararDos.setMargin(insets());
	    
	    btPararTres = new JButton();
		btPararTres.setEnabled(false);
	    btPararTres.setActionCommand(GestionEventos.PARARTRES);
		btPararTres.addActionListener(ventanaPrincipal.getEventos());
		btPararTres.setIcon(new ImageIcon(getClass().getResource("/recursos/imagenes/stop.png")));
	  	btPararTres.setBorderPainted(false);
	    btPararTres.setMargin(insets());
	}
		
	
	private void agrega() {
		
		this.add(btPararUno);
		this.add(lbSeparadorUno);
		this.add(btPararDos);
		this.add(lbSeJLabelDos);
		this.add(btPararTres);
		
		
	}

	public JButton getBtPararUno() {
		return btPararUno;
	}

	public void setBtPararUno(JButton btPararUno) {
		this.btPararUno = btPararUno;
	}

	public JButton getBtPararDos() {
		return btPararDos;
	}

	public void setBtPararDos(JButton btPararDos) {
		this.btPararDos = btPararDos;
	}

	public JButton getBtPararTres() {
		return btPararTres;
	}

	public void setBtPararTres(JButton btPararTres) {
		this.btPararTres = btPararTres;
	}
	
	
	
}
