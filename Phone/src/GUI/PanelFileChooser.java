package GUI;

import java.awt.Frame; 
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;


import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

 
public class PanelFileChooser extends JPanel {
	
	private JButton btAbrir, btMostrar;
	private JTextField txEnlace;
	private JLabel lbMostrar, lbTitulo, lbAbrir,lbVacio;
	private JComboBox cbMuestra;
	private JFileChooser flExaminar;
	
		
	
	private VentanaPrincipal ventanaPrincipal;
	
	public PanelFileChooser(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal=ventanaPrincipal;
		
		setLayout(new GridBagLayout());
		GridBagConstraints gbc=new GridBagConstraints();
		
		flExaminar = new JFileChooser();
		
		FileFilter filtro = new FileNameExtensionFilter("*.csv'/'*.txt ", new String[] { "TXT","CSV" });
		flExaminar.setFileFilter(filtro);
		
		lbTitulo = new JLabel("Telefonia Baka");
		lbTitulo.setFont(new java.awt.Font("Andalus", 0, 23));
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=2;
		gbc.gridheight=1;
		add(lbTitulo, gbc);
		
		lbAbrir = new JLabel("Seleccionar Archivo");
		lbAbrir.setFont(new java.awt.Font("Andalus", 0, 15));
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridwidth=2;
		gbc.gridheight=1;
		add(lbAbrir, gbc);
		
		txEnlace = new JTextField(30);
		txEnlace.setEditable(false);
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		add(txEnlace, gbc);
		
		btAbrir = new JButton("Abrir");
		btAbrir.setActionCommand(GestionEventos.ABRIR);
		btAbrir.addActionListener(ventanaPrincipal.getEventos());
		gbc.gridx=1;
		gbc.gridy=2;
		gbc.gridwidth=2;
		gbc.gridheight=1;
		add(btAbrir, gbc);
		
		lbMostrar = new JLabel("Mostrar Por");
		lbMostrar.setFont(new java.awt.Font("Andalus", 0, 15));
		gbc.gridx=0;
		gbc.gridy=3;
		gbc.gridwidth=2;
		gbc.gridheight=1;
		add(lbMostrar, gbc);
		
		btMostrar = new JButton("Mostrar");
		btMostrar.setEnabled(false);
		btMostrar.setActionCommand(GestionEventos.MOSTRAR);
		btMostrar.addActionListener(ventanaPrincipal.getEventos());
		gbc.gridx=1;
		gbc.gridy=4;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		add(btMostrar, gbc);
		
		String[ ] seleccion = new String[ ]{ " ","Todo","Fecha", "Hora", "Numero", "Duracion", 
		"Costo"};
		
		cbMuestra = new JComboBox(seleccion);
		cbMuestra.setEnabled(false);
		gbc.gridx=0;
		gbc.gridy=4;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		add(cbMuestra, gbc);
		
		lbVacio= new JLabel("   ");
		gbc.gridx=0;
		gbc.gridy=5;
		gbc.gridwidth=2;
		gbc.gridheight=1;
		add(lbVacio, gbc);
		
	}

	public JTextField getTxEnlace() {
		return txEnlace;
	}
	
	

	public JFileChooser getFlExaminar() {
		return flExaminar;
	}

	public void setFlExaminar(JFileChooser flExaminar) {
		this.flExaminar = flExaminar;
	}

	public void setTxEnlace(JTextField txEnlace) {
		this.txEnlace = txEnlace;
	}

	public JButton getBtAbrir() {
		return btAbrir;
	}

	public void setBtAbrir(JButton btAbrir) {
		this.btAbrir = btAbrir;
	}

	public JButton getBtMostrar() {
		return btMostrar;
	}

	public void setBtMostrar(JButton btMostrar) {
		this.btMostrar = btMostrar;
	}

	public JLabel getLbMostrar() {
		return lbMostrar;
	}

	public void setLbMostrar(JLabel lbMostrar) {
		this.lbMostrar = lbMostrar;
	}

	public JLabel getLbTitulo() {
		return lbTitulo;
	}

	public void setLbTitulo(JLabel lbTitulo) {
		this.lbTitulo = lbTitulo;
	}

	public JLabel getLbAbrir() {
		return lbAbrir;
	}

	public void setLbAbrir(JLabel lbAbrir) {
		this.lbAbrir = lbAbrir;
	}

	public JLabel getLbVacio() {
		return lbVacio;
	}

	public void setLbVacio(JLabel lbVacio) {
		this.lbVacio = lbVacio;
	}

	public JComboBox getCbMuestra() {
		return cbMuestra;
	}

	public void setCbMuestra(JComboBox cbMuestra) {
		this.cbMuestra = cbMuestra;
	}

	public VentanaPrincipal getVentanaPrincipal() {
		return ventanaPrincipal;
	}

	public void setVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}
		

	
	

	
}
