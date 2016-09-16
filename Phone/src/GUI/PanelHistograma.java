package GUI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelHistograma extends JPanel {
	
	private JLabel lbTitulo;

	private JButton btGenerar;
	private VentanaPrincipal ventanaPrincipal;
	
	public PanelHistograma(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal=ventanaPrincipal;
		
		setLayout(new GridBagLayout());
    	GridBagConstraints gbc=new GridBagConstraints();
		
		lbTitulo = new JLabel("Histograma");
		lbTitulo.setFont(new java.awt.Font("Andalus", 0, 23));
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=3;
		gbc.gridheight=1;
		gbc.weightx = 1.0;
		add(lbTitulo, gbc);
		
		
		
		btGenerar = new JButton("Generar");
		btGenerar.setEnabled(false);
		btGenerar.setActionCommand(GestionEventos.GENERAR);
		btGenerar.addActionListener(ventanaPrincipal.getEventos());
		gbc.gridx=2;
		gbc.gridy=1;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		add(btGenerar, gbc);
		
	}



	public JButton getBtGenerar() {
		return btGenerar;
	}

	public void setBtGenerar(JButton btGenerar) {
		this.btGenerar = btGenerar;
	}
	
}
