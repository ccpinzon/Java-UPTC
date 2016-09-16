package grafica;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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

public class GestionPelicula extends JDialog {
	
	private VentanaPrincipal ventanaPrincipal;
	private JLabel lbTitulo, lbNombre, lbGenero, lbFomato, lbCodigo, lbPrecio, lbConsulta;
	private JButton btCrear, btModificarTres, btModificarCuatro, btEliminaar, btBusqueda;
	private JTextField txNombre, txCodigo, txPrecio, txConsulta;
	private JComboBox cbFormato, cbGenero;
	private JTable jtPelicula;
	private DefaultTableModel mtPelicula;
	private JSeparator p;
	private GridBagConstraints Layout;
	private JPanel panel;
	
	public GestionPelicula(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal=ventanaPrincipal;
		
		setTitle("Video Club Chaplin: Pelicula");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setIconImage(new ImageIcon("recursos/imagenes/Icono.png").getImage());
		setSize(650,280);
		setResizable(false);
		setLayout(new GridBagLayout());
		
		Layout = new GridBagConstraints();
		
		lbTitulo = new JLabel("Pelicula");
		lbTitulo.setFont(new Font("Andalus",0,23));
		Layout.gridx=0;
		Layout.gridy=0;
		Layout.gridwidth=2;
		Layout.gridheight=1;
		Layout.weightx = 1.0;
		//Layout.weighty = 1.0;
		add(lbTitulo,Layout);
		
		lbNombre = new JLabel("Nombre");
		lbNombre.setFont(new Font("Andalus",0,15));
		Layout.gridx=0;
		Layout.gridy=1;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(lbNombre,Layout);
		
		lbGenero = new JLabel("Genero");
		lbGenero.setFont(new Font("Andalus",0,15));
		Layout.gridx=0;
		Layout.gridy=2;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(lbGenero,Layout);
		
		lbFomato = new JLabel("Formato");
		lbFomato.setFont(new Font("Andalus",0,15));
		Layout.gridx=0;
		Layout.gridy=3;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(lbFomato,Layout);
		
		lbCodigo = new JLabel("Codigo");
		lbCodigo.setFont(new Font("Andalus",0,15));
		Layout.gridx=0;
		Layout.gridy=4;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(lbCodigo,Layout);
		
		lbPrecio = new JLabel("Precion");
		lbPrecio.setFont(new Font("Andalus",0,15));
		Layout.gridx=0;
		Layout.gridy=5;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(lbPrecio,Layout);
		
		btCrear = new JButton("Crear");
		btCrear.setBackground(Color.LIGHT_GRAY);
		btCrear.setForeground(Color.DARK_GRAY);
		btCrear.setFocusPainted(false);
		btCrear.setActionCommand(GestionEventos.CREARPELICULA);
		btCrear.addActionListener(ventanaPrincipal.getEventos());
		Layout.gridx=0;
		Layout.gridy=6;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(btCrear,Layout);
		
		txNombre = new JTextField(10);
		Layout.gridx=1;
		Layout.gridy=1;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(txNombre,Layout);
		
		String genero[]={"","Accion","Comedia","Terror","Ciencia Ficcion","Drama","Documentales","Infantiles","Misterio","Clasico"};
		cbGenero = new JComboBox<>(genero);
		cbGenero.setBackground(Color.LIGHT_GRAY);
		Layout.gridx=1;
		Layout.gridy=2;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(cbGenero,Layout);
		
		String formato[]={"","CD","DVD","Blu-Ray","VH"};
		cbFormato = new JComboBox<>(formato);
		cbFormato.setBackground(Color.LIGHT_GRAY);
		Layout.gridx=1;
		Layout.gridy=3;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(cbFormato,Layout);
		
		txCodigo = new JTextField(10);
		Layout.gridx=1;
		Layout.gridy=4;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(txCodigo,Layout);
		
		txPrecio = new JTextField(10);
		SoloNumeros(txPrecio);
		Layout.gridx=1;
		Layout.gridy=5;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(txPrecio,Layout);
		
		btModificarCuatro = new JButton("Modificar");
		btModificarCuatro.setBackground(Color.LIGHT_GRAY);
		btModificarCuatro.setForeground(Color.DARK_GRAY);
		btModificarCuatro.setFocusPainted(false);
		btModificarCuatro.setActionCommand(GestionEventos.MODIFICARCUATRO);
		btModificarCuatro.addActionListener(ventanaPrincipal.getEventos());
		btModificarCuatro.setEnabled(false);
		Layout.gridx=1;
		Layout.gridy=6;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(btModificarCuatro,Layout);
		
		p = new  JSeparator(JSeparator.VERTICAL);
		Layout.gridx=2;
		Layout.gridy=0;
		Layout.gridwidth=1;
		Layout.gridheight=7;
		Layout.fill= GridBagConstraints.VERTICAL;
		add(p,Layout);
		Layout.fill= GridBagConstraints.NONE;
		
		lbConsulta = new JLabel("Consultar");
		lbConsulta.setFont(new Font("Andalus",0,23));
		Layout.gridx=3;
		Layout.gridy=0;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(lbConsulta,Layout);
		
		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		txConsulta = new JTextField(10);
		btBusqueda = new JButton();
		btBusqueda.setIcon(new ImageIcon("recursos/imagenes/lupa.png"));
		btBusqueda.setBackground(Color.LIGHT_GRAY);
		btBusqueda.setForeground(Color.DARK_GRAY);
		btBusqueda.setFocusPainted(false);
		btBusqueda.setMargin(insets());
		btBusqueda.setActionCommand(GestionEventos.BUSCARPELICULA);
		btBusqueda.addActionListener(ventanaPrincipal.getEventos());
		
		panel.add(txConsulta);
		panel.add(btBusqueda);
		Layout.gridx=4;
		Layout.gridy=0;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(panel,Layout);
		
		String[] columnas = {"Nombre", "Genero", "Foramto","Codigo","Precio","Disponible"};
		mtPelicula = new DefaultTableModel( columnas, 0 );
		jtPelicula = new JTable( mtPelicula );
		jtPelicula.setPreferredScrollableViewportSize(new Dimension(400,125));
		Layout.gridx=3;
		Layout.gridy=1;
		Layout.gridwidth=2;
		Layout.gridheight=5;
		add(new JScrollPane(jtPelicula),Layout );
		
		btEliminaar = new JButton("Eliminar");
		btEliminaar.setBackground(Color.LIGHT_GRAY);
		btEliminaar.setForeground(Color.DARK_GRAY);
		btEliminaar.setFocusPainted(false);
		btEliminaar.setActionCommand(GestionEventos.ELIMINARPELICULA);
		btEliminaar.addActionListener(ventanaPrincipal.getEventos());
		Layout.gridx=3;
		Layout.gridy=6;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(btEliminaar,Layout);
		
		btModificarTres = new JButton("Modificar");
		btModificarTres.setBackground(Color.LIGHT_GRAY);
		btModificarTres.setForeground(Color.DARK_GRAY);
		btModificarTres.setFocusPainted(false);
		btModificarTres.setActionCommand(GestionEventos.MODIFICARTRES);
		btModificarTres.addActionListener(ventanaPrincipal.getEventos());
		Layout.gridx=4;
		Layout.gridy=6;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(btModificarTres,Layout);
		
		
		
		
		
	}
	
	public void SoloNumeros(JTextField a) {
		a.addKeyListener(new KeyAdapter() {

			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();

				if (!Character.isDigit(c)) {
					getToolkit().beep();
					e.consume();
				}

			}
		});

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

	public JLabel getLbNombre() {
		return lbNombre;
	}

	public void setLbNombre(JLabel lbNombre) {
		this.lbNombre = lbNombre;
	}

	public JLabel getLbGenero() {
		return lbGenero;
	}

	public void setLbGenero(JLabel lbGenero) {
		this.lbGenero = lbGenero;
	}

	public JLabel getLbFomato() {
		return lbFomato;
	}

	public void setLbFomato(JLabel lbFomato) {
		this.lbFomato = lbFomato;
	}

	public JLabel getLbCodigo() {
		return lbCodigo;
	}

	public void setLbCodigo(JLabel lbCodigo) {
		this.lbCodigo = lbCodigo;
	}

	public JLabel getLbPrecio() {
		return lbPrecio;
	}

	public void setLbPrecio(JLabel lbPrecio) {
		this.lbPrecio = lbPrecio;
	}

	public JLabel getLbConsulta() {
		return lbConsulta;
	}

	public void setLbConsulta(JLabel lbConsulta) {
		this.lbConsulta = lbConsulta;
	}

	public JButton getBtCrear() {
		return btCrear;
	}

	public void setBtCrear(JButton btCrear) {
		this.btCrear = btCrear;
	}

	public JButton getBtModificarTres() {
		return btModificarTres;
	}

	public void setBtModificarTres(JButton btModificarTres) {
		this.btModificarTres = btModificarTres;
	}

	public JButton getBtModificarCuatro() {
		return btModificarCuatro;
	}

	public void setBtModificarCuatro(JButton btModificarCuatro) {
		this.btModificarCuatro = btModificarCuatro;
	}

	public JButton getBtEliminaar() {
		return btEliminaar;
	}

	public void setBtEliminaar(JButton btEliminaar) {
		this.btEliminaar = btEliminaar;
	}

	public JButton getBtBusqueda() {
		return btBusqueda;
	}

	public void setBtBusqueda(JButton btBusqueda) {
		this.btBusqueda = btBusqueda;
	}

	public JTextField getTxNombre() {
		return txNombre;
	}

	public void setTxNombre(JTextField txNombre) {
		this.txNombre = txNombre;
	}

	public JTextField getTxCodigo() {
		return txCodigo;
	}

	public void setTxCodigo(JTextField txCodigo) {
		this.txCodigo = txCodigo;
	}

	public JTextField getTxPrecio() {
		return txPrecio;
	}

	public void setTxPrecio(JTextField txPrecio) {
		this.txPrecio = txPrecio;
	}

	public JTextField getTxConsulta() {
		return txConsulta;
	}

	public void setTxConsulta(JTextField txConsulta) {
		this.txConsulta = txConsulta;
	}

	public JComboBox getCbFormato() {
		return cbFormato;
	}

	public void setCbFormato(JComboBox cbFormato) {
		this.cbFormato = cbFormato;
	}

	public JComboBox getCbGenero() {
		return cbGenero;
	}

	public void setCbGenero(JComboBox cbGenero) {
		this.cbGenero = cbGenero;
	}

	public JTable getJtPelicula() {
		return jtPelicula;
	}

	public void setJtPelicula(JTable jtPelicula) {
		this.jtPelicula = jtPelicula;
	}

	public DefaultTableModel getMtPelicula() {
		return mtPelicula;
	}

	public void setMtPelicula(DefaultTableModel mtPelicula) {
		this.mtPelicula = mtPelicula;
	}

	public JSeparator getP() {
		return p;
	}

	public void setP(JSeparator p) {
		this.p = p;
	}



	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}


}
