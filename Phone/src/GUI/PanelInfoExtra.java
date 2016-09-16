package GUI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class PanelInfoExtra extends JPanel{
	
	private JLabel lbTitulo, lbNumMayLlamada, lbNumMenLlamada, lbNumeroUno, lbNumeroDos,lbCantidad, lbDuracion, lbLlamadaMayDura, lbLlamadaMenDura,lbfecha,lbCantidadDos,lbfechaCuando;
    private JTextField txNumeroUno, txNumeroDos, txNumeroTres, txNumeroCuatro, txCantidadUno, txCantidadDos, txDuracionUno, txDuracionDos, txfecha, txCantidad;
    private VentanaPrincipal ventanaPrincipal;
    private JButton btboton;
    
    public PanelInfoExtra(VentanaPrincipal ventanaPrincipal) {
    	
    	this.ventanaPrincipal=ventanaPrincipal;
	
    	setLayout(new GridBagLayout());
    	GridBagConstraints gbc=new GridBagConstraints();
    	
    	lbTitulo = new JLabel("Informacion Extra");
    	lbTitulo.setFont(new java.awt.Font("Andalus", 0, 23));
    	gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=3;
		gbc.gridheight=1;
		add(lbTitulo, gbc);
		
		lbNumeroUno = new JLabel("Numero");
    	lbNumeroUno.setFont(new java.awt.Font("Andalus", 0, 15));
    	gbc.gridx=1;
		gbc.gridy=1;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		add(lbNumeroUno, gbc);
		
		lbCantidad = new JLabel("Cantidad");
    	lbCantidad.setFont(new java.awt.Font("Andalus", 0, 15));
    	gbc.gridx=2;
		gbc.gridy=1;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		add(lbCantidad, gbc);
		
		lbNumMayLlamada = new JLabel(" N° Con Mayor Frecuencia De Llamadas");
    	lbNumMayLlamada.setFont(new java.awt.Font("Andalus", 0, 13));
    	gbc.gridx=0;
		gbc.gridy=2;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		add(lbNumMayLlamada, gbc);
		
		txNumeroUno = new JTextField(8);
    	txNumeroUno.setEditable(false);
    	gbc.gridx=1;
		gbc.gridy=2;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		add(txNumeroUno, gbc);
		
		txCantidadUno = new JTextField(8);
    	txCantidadUno.setEditable(false);
    	gbc.gridx=2;
		gbc.gridy=2;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		add(txCantidadUno, gbc);
		
		lbNumMenLlamada = new JLabel(" N° Con Menor Frecuencia De Llamadas");
		lbNumMenLlamada.setFont(new java.awt.Font("Andalus", 0, 13));
    	gbc.gridx=0;
		gbc.gridy=3;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		add(lbNumMenLlamada, gbc);
		
		txNumeroDos = new JTextField(8);
    	txNumeroDos.setEditable(false);
    	gbc.gridx=1;
		gbc.gridy=3;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		add(txNumeroDos, gbc);
		
		txCantidadDos = new JTextField(8);
    	txCantidadDos.setEditable(false);
    	gbc.gridx=2;
		gbc.gridy=3;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		add(txCantidadDos, gbc);
		
		lbNumeroDos = new JLabel("Numero");
		lbNumeroDos.setFont(new java.awt.Font("Andalus", 0, 15));
		gbc.gridx=1;
		gbc.gridy=4;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		add(lbNumeroDos, gbc);
		
		lbDuracion = new JLabel("Duracion");
		lbDuracion.setFont(new java.awt.Font("Andalus", 0, 15));
		gbc.gridx=2;
		gbc.gridy=4;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		add(lbDuracion, gbc);
		
		lbLlamadaMayDura = new JLabel("Llamada Con Mayor Duracion");
		lbLlamadaMayDura.setFont(new java.awt.Font("Andalus", 0, 13));
		gbc.gridx=0;
		gbc.gridy=5;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		add(lbLlamadaMayDura, gbc);
		
		txNumeroTres = new JTextField(8);
		txNumeroTres.setEditable(false);
		gbc.gridx=1;
		gbc.gridy=5;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		add(txNumeroTres, gbc);
		
		txDuracionUno = new JTextField(8);
		txDuracionUno.setEditable(false);
		gbc.gridx=2;
		gbc.gridy=5;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		add(txDuracionUno, gbc);
		
		lbLlamadaMenDura = new JLabel("Llamada Con Menor Duracion");
		lbLlamadaMenDura.setFont(new java.awt.Font("Andalus", 0, 13));
		gbc.gridx=0;
		gbc.gridy=6;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		add(lbLlamadaMenDura, gbc);
		
		txNumeroCuatro = new JTextField(8);
		txNumeroCuatro.setEditable(false);
		gbc.gridx=1;
		gbc.gridy=6;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		add(txNumeroCuatro, gbc);
		
		txDuracionDos = new JTextField(8);
		txDuracionDos.setEditable(false);
		gbc.gridx=2;
		gbc.gridy=6;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		add(txDuracionDos, gbc);
		
		lbfecha = new JLabel("Fecha");
		lbfecha.setFont(new java.awt.Font("Andalus", 0, 15));
		gbc.gridx=1;
		gbc.gridy=7;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		add(lbfecha, gbc);
		
		lbCantidadDos = new JLabel("Cantidad");
		lbCantidadDos.setFont(new java.awt.Font("Andalus", 0, 15));
		gbc.gridx=2;
		gbc.gridy=7;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		add(lbCantidadDos, gbc);
		
		lbfechaCuando = new JLabel("Fecha Con Mayor Numero De Llamadas");
		lbfechaCuando.setFont(new java.awt.Font("Andalus", 0, 13));
		gbc.gridx=0;
		gbc.gridy=8;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		add(lbfechaCuando, gbc);
		
		txfecha = new JTextField(8);
		txfecha.setEditable(false);
		gbc.gridx=1;
		gbc.gridy=8;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		add(txfecha, gbc);
		
		txCantidad = new JTextField(8);
		txCantidad.setEditable(false);
		gbc.gridx=2;
		gbc.gridy=8;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		add(txCantidad, gbc);
		
		btboton = new JButton("Ver Listado"); 
		btboton.setEnabled(false);
		btboton.setActionCommand(GestionEventos.VERLISTA);
		btboton.addActionListener(ventanaPrincipal.getEventos());
		gbc.gridx=0;
		gbc.gridy=9;
		gbc.gridwidth=3;
		gbc.gridheight=1;
		add(btboton, gbc);
		
        
    	
	}


	public JTextField getTxNumeroUno() {
		return txNumeroUno;
	}


	public void setTxNumeroUno(JTextField txNumeroUno) {
		this.txNumeroUno = txNumeroUno;
	}


	public JTextField getTxNumeroDos() {
		return txNumeroDos;
	}


	public void setTxNumeroDos(JTextField txNumeroDos) {
		this.txNumeroDos = txNumeroDos;
	}


	public JTextField getTxNumeroTres() {
		return txNumeroTres;
	}


	public void setTxNumeroTres(JTextField txNumeroTres) {
		this.txNumeroTres = txNumeroTres;
	}


	public JTextField getTxNumeroCuatro() {
		return txNumeroCuatro;
	}


	public void setTxNumeroCuatro(JTextField txNumeroCuatro) {
		this.txNumeroCuatro = txNumeroCuatro;
	}


	public JTextField getTxCantidadUno() {
		return txCantidadUno;
	}


	public void setTxCantidadUno(JTextField txCantidadUno) {
		this.txCantidadUno = txCantidadUno;
	}


	public JTextField getTxCantidadDos() {
		return txCantidadDos;
	}


	public void setTxCantidadDos(JTextField txCantidadDos) {
		this.txCantidadDos = txCantidadDos;
	}


	public JTextField getTxDuracionUno() {
		return txDuracionUno;
	}


	public void setTxDuracionUno(JTextField txDuracionUno) {
		this.txDuracionUno = txDuracionUno;
	}


	public JTextField getTxDuracionDos() {
		return txDuracionDos;
	}


	public void setTxDuracionDos(JTextField txDuracionDos) {
		this.txDuracionDos = txDuracionDos;
	}


	public JTextField getTxfecha() {
		return txfecha;
	}


	public void setTxfecha(JTextField txfecha) {
		this.txfecha = txfecha;
	}


	public JTextField getTxCantidad() {
		return txCantidad;
	}


	public void setTxCantidad(JTextField txCantidad) {
		this.txCantidad = txCantidad;
	}


	public JButton getBtboton() {
		return btboton;
	}


	public void setBtboton(JButton btboton) {
		this.btboton = btboton;
	}



    
}
