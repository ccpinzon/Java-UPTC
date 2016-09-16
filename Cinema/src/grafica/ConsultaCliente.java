package grafica;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ConsultaCliente extends JDialog {
	
	private VentanaPrincipal ventanaPrincipal;
	private GridBagConstraints Layout;
	private JLabel lbTitulo, lbConsultar, lbNombre, lbApellido, lbCedula, lbDireccion, lbGenero, lbTelefono;
	private JTextField txNombre, txApellido, txCedula, txDireccion, txTelefono,txGenero;
	private JButton btListo;
	private JTable jtPeliculas;
	private DefaultTableModel mtPeliculas;
	private JSeparator p;
	
	public ConsultaCliente(VentanaPrincipal  ventanaPrincipal) {
		this.ventanaPrincipal=ventanaPrincipal;
		
		setTitle("Video Club Chaplin: Resultado Busqueda");
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setIconImage(new ImageIcon("recursos/imagenes/Icono.png").getImage());
		setSize(1100,280);
		//setResizable(false);
		setLayout(new GridBagLayout());
		
		Layout = new GridBagConstraints();
		
		p = new JSeparator(JSeparator.VERTICAL);
		Layout.gridx=2; 
		Layout.gridy=0;
		Layout.gridwidth=1;
		Layout.gridheight=8;
		Layout.fill= GridBagConstraints.VERTICAL;
		add(p,Layout);
		Layout.fill= GridBagConstraints.NONE;
		
		lbTitulo = new JLabel("Cliente");
		lbTitulo.setFont(new Font("Andalus",0,23));
		Layout.gridx=0;
		Layout.gridy=0;
		Layout.gridwidth=2;
		Layout.gridheight=1;
		Layout.weightx = 1.0;
		Layout.weighty = 1.0;
		add(lbTitulo,Layout );
		
		lbNombre = new JLabel("Nombre");
        lbNombre.setFont(new Font("Andalus",0,15));
        Layout.gridx=0;
		Layout.gridy=1;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(lbNombre,Layout );

		lbApellido = new JLabel("Apellido");
        lbApellido.setFont(new Font("Andalus",0,15));
        Layout.gridx=0;
		Layout.gridy=2;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(lbApellido,Layout );
		
		lbCedula = new JLabel("Cedula");
        lbCedula.setFont(new Font("Andalus",0,15));
        Layout.gridx=0;
		Layout.gridy=3;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(lbCedula,Layout );
		
		lbDireccion = new JLabel("Direccion");
        lbDireccion.setFont(new Font("Andalus",0,15));
        Layout.gridx=0;
		Layout.gridy=4;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(lbDireccion,Layout );
		
		lbGenero = new JLabel("Genero");
        lbGenero.setFont(new Font("Andalus",0,15));
        Layout.gridx=0;
		Layout.gridy=5;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(lbGenero,Layout );
		
		lbTelefono = new JLabel("Telefono");
        lbTelefono.setFont(new Font("Andalus",0,15));
        Layout.gridx=0;
		Layout.gridy=6;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(lbTelefono,Layout );
		
	
		
	    txNombre = new JTextField(10);
	    txNombre.setEditable(false);
        Layout.gridx=1;
		Layout.gridy=1;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(txNombre,Layout );
		
		txApellido = new JTextField(10);
		txApellido.setEditable(false);
        Layout.gridx=1;
		Layout.gridy=2;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(txApellido,Layout );
		
		txCedula = new JTextField(10);
		txCedula.setEditable(false);
        Layout.gridx=1;
		Layout.gridy=3;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(txCedula,Layout );
		
		txDireccion = new JTextField(10);
		txDireccion.setEditable(false);
        Layout.gridx=1;
		Layout.gridy=4;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(txDireccion,Layout );
		
		txGenero = new JTextField(10);
		txGenero.setEditable(false);
		Layout.gridx=1;
		Layout.gridy=5;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(txGenero,Layout );
		
		txTelefono= new JTextField(10);
		txTelefono.setEditable(false);
		Layout.gridx=1;
		Layout.gridy=6;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(txTelefono,Layout);
		
	
		lbConsultar = new JLabel("Peliculas En Estado De Alquiler");
		lbConsultar.setFont(new Font("Andalus",0,23));
		Layout.gridx=3;
		Layout.gridy=0;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(lbConsultar,Layout);
		
		String[] columnas = {"Nombre", "Genero", "Formato","Codigo","Precio","Fecha De Entrega"};
		mtPeliculas = new DefaultTableModel( columnas, 0 );
		jtPeliculas = new JTable( mtPeliculas );
		jtPeliculas.setPreferredScrollableViewportSize(new Dimension(800,125));
		Layout.gridx=3;
		Layout.gridy=1;
		Layout.gridwidth=2;
		Layout.gridheight=6;
		add(new JScrollPane(jtPeliculas),Layout );
		
		btListo = new JButton("Listo");
		btListo.setBackground(Color.LIGHT_GRAY);
		btListo.setForeground(Color.DARK_GRAY);
		btListo.setFocusPainted(false);
		btListo.setActionCommand(GestionEventos.LISTOBUSQUEDA);
		btListo.addActionListener(ventanaPrincipal.getEventos());
		Layout.gridx=0;
		Layout.gridy=8;
		Layout.gridwidth=4;
		Layout.gridheight=1;
		Layout.fill=GridBagConstraints.BOTH;
		Layout.anchor=GridBagConstraints.SOUTH;
		
		add(btListo,Layout);
		
		
		
		
		
		
	}

	public VentanaPrincipal getVentanaPrincipal() {
		return ventanaPrincipal;
	}

	public void setVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}

	

	public JLabel getLbTitulo() {
		return lbTitulo;
	}

	public void setLbTitulo(JLabel lbTitulo) {
		this.lbTitulo = lbTitulo;
	}

	public JLabel getLbConsultar() {
		return lbConsultar;
	}

	public void setLbConsultar(JLabel lbConsultar) {
		this.lbConsultar = lbConsultar;
	}

	public JLabel getLbNombre() {
		return lbNombre;
	}

	public void setLbNombre(JLabel lbNombre) {
		this.lbNombre = lbNombre;
	}

	public JLabel getLbApellido() {
		return lbApellido;
	}

	public void setLbApellido(JLabel lbApellido) {
		this.lbApellido = lbApellido;
	}

	public JLabel getLbCedula() {
		return lbCedula;
	}

	public void setLbCedula(JLabel lbCedula) {
		this.lbCedula = lbCedula;
	}

	public JLabel getLbDireccion() {
		return lbDireccion;
	}

	public void setLbDireccion(JLabel lbDireccion) {
		this.lbDireccion = lbDireccion;
	}

	public JLabel getLbGenero() {
		return lbGenero;
	}

	public void setLbGenero(JLabel lbGenero) {
		this.lbGenero = lbGenero;
	}

	public JLabel getLbTelefono() {
		return lbTelefono;
	}

	public void setLbTelefono(JLabel lbTelefono) {
		this.lbTelefono = lbTelefono;
	}

	public JTextField getTxNombre() {
		return txNombre;
	}

	public void setTxNombre(JTextField txNombre) {
		this.txNombre = txNombre;
	}

	public JTextField getTxApellido() {
		return txApellido;
	}

	public void setTxApellido(JTextField txApellido) {
		this.txApellido = txApellido;
	}

	public JTextField getTxCedula() {
		return txCedula;
	}

	public void setTxCedula(JTextField txCedula) {
		this.txCedula = txCedula;
	}

	public JTextField getTxDireccion() {
		return txDireccion;
	}

	public void setTxDireccion(JTextField txDireccion) {
		this.txDireccion = txDireccion;
	}

	public JTextField getTxTelefono() {
		return txTelefono;
	}

	public void setTxTelefono(JTextField txTelefono) {
		this.txTelefono = txTelefono;
	}

	public JTextField getTxGenero() {
		return txGenero;
	}

	public void setTxGenero(JTextField txGenero) {
		this.txGenero = txGenero;
	}

	public JButton getBtListo() {
		return btListo;
	}

	public void setBtListo(JButton btListo) {
		this.btListo = btListo;
	}

	public JTable getJtPeliculas() {
		return jtPeliculas;
	}

	public void setJtPeliculas(JTable jtPeliculas) {
		this.jtPeliculas = jtPeliculas;
	}

	public DefaultTableModel getMtPeliculas() {
		return mtPeliculas;
	}

	public void setMtPeliculas(DefaultTableModel mtPeliculas) {
		this.mtPeliculas = mtPeliculas;
	}

	public JSeparator getP() {
		return p;
	}

	public void setP(JSeparator p) {
		this.p = p;
	}
	

}
