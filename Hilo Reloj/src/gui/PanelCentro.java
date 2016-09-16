package gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PanelCentro extends JPanel {
	
	private VentanaPrincipal ventanaPrincipal;
	private JTextArea txCrapicua, txParSiete;
	
	
	
	public PanelCentro(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal=ventanaPrincipal;
		
		
		this.setLayout(new GridLayout(1,2));
		
		inicializa();
		agrega();
		
		
		
	}



	private void inicializa() {
	
		
		
		txCrapicua = new JTextArea();
	    txCrapicua.setEditable(false);
		txParSiete = new JTextArea();
		txParSiete.setEditable(false);
		
		
		
		
	}


	private void agrega() {
		
		
	
	   	this.add(new JScrollPane(txCrapicua));
		this.add(new JScrollPane(txParSiete));
	   	
		
	}
	
	public JTextArea getTxCrapicua() {
		return txCrapicua;
	}


	public void setTxCrapicua(JTextArea txCrapicua) {
		this.txCrapicua = txCrapicua;
	}


	public JTextArea getTxParSiete() {
		return txParSiete;
	}


	public void setTxParSiete(JTextArea txParSiete) {
		this.txParSiete = txParSiete;
	}

	

}
