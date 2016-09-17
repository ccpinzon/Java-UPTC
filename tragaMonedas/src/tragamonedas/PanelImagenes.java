package tragamonedas;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;

public class PanelImagenes extends JPanel{
	
	private VentanaPrincipal ventanaPrincipal;
	private JLabel lbImagenUno, lbImagenDos,lbImagenTres,lbSeparadorUno,lbSeparadorDos;
	
	public PanelImagenes(VentanaPrincipal ventanaPrincipal) {
		
		this.ventanaPrincipal=ventanaPrincipal;
		setLayout(new FlowLayout());
		setOpaque(false);
		inicializar();
		agregar();
		
		
		
	}

	private void inicializar() {
		
		lbImagenUno = new JLabel();
		lbImagenUno.setIcon(new ImageIcon(getClass().getResource("/recursos/imagenes/O"+(int)(Math.random()*((11-1)+1))+".png")));
		lbImagenUno.setBorder(new MatteBorder(4,4,4,4,Color.black));
		lbImagenUno.setOpaque(true);
		
		
		lbSeparadorUno = new JLabel("     ");
		
		lbImagenDos = new JLabel();
		lbImagenDos.setIcon(new ImageIcon(getClass().getResource("/recursos/imagenes/O"+(int)(Math.random()*((11-1)+1))+".png")));
		lbImagenDos.setBorder(new MatteBorder(4,4,4,4,Color.black));
		lbImagenDos.setOpaque(true);
		
		lbSeparadorDos = new JLabel("     ");
		
		lbImagenTres = new JLabel();
		lbImagenTres.setIcon(new ImageIcon(getClass().getResource("/recursos/imagenes/O"+(int)(Math.random()*((11-1)+1))+".png")));
		lbImagenTres.setBorder(new MatteBorder(4,4,4,4,Color.black));
		lbImagenTres.setOpaque(true);
		
	}

	private void agregar() {
		add(lbImagenUno);
		add(lbSeparadorUno);
		add(lbImagenDos);
		add(lbSeparadorDos);
		add(lbImagenTres);
		
		
	}

	public JLabel getLbImagenUno() {
		return lbImagenUno;
	}

	public void setLbImagenUno(JLabel lbImagenUno) {
		this.lbImagenUno = lbImagenUno;
	}

	public JLabel getLbImagenDos() {
		return lbImagenDos;
	}

	public void setLbImagenDos(JLabel lbImagenDos) {
		this.lbImagenDos = lbImagenDos;
	}

	public JLabel getLbImagenTres() {
		return lbImagenTres;
	}

	public void setLbImagenTres(JLabel lbImagenTres) {
		this.lbImagenTres = lbImagenTres;
	}
	
	
	

}
