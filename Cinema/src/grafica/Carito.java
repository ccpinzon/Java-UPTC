package grafica;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Carito extends JDialog {
	
	private VentanaPrincipal ventanaPrincipal;
	private GridBagConstraints Layout;
	private JLabel lbTitulo, lbCliente, lbNombre, lbCedula, lbPeliculas, lbCarrito, lbTotal, lbFechaEntrega;
	private JTextField txConsulta, txNombre, txCedula, txTotal, txFecha;
	private JButton btBusqueda, btAgregar, btQuitar, btFinalizar;
	private JTable jtPelicula,jtAlquiler;
	private DefaultTableModel mtPelicula,mtAlquiler;
	private JSeparator sp1, sp2;
	private JPanel panelBusqueda;
	
	 
	
	public Carito(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal =ventanaPrincipal;
		
		setTitle("Video Club Chaplin: ALquiler");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setIconImage(new ImageIcon("recursos/imagenes/Icono.png").getImage());
		setSize(520,590);
		//setResizable(false);
		setLayout(new GridBagLayout());
		
		Layout = new GridBagConstraints();
		
		lbTitulo = new JLabel("Carrito De Alquiler");
        lbTitulo.setFont(new Font("Andalus",0,23));	
        Layout.gridx=0;
		Layout.gridy=0;
		Layout.gridwidth=3;
		Layout.gridheight=1;
		Layout.weightx = 1.0;
		Layout.weighty = 1.0;
		add(lbTitulo,Layout);
		
		lbCliente = new JLabel("Cliente");
		lbCliente.setFont(new Font("Andalus",0,15));
		Layout.gridx=0;
		Layout.gridy=1;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(lbCliente,Layout);
		
		lbNombre = new JLabel("Nombre");
		lbNombre.setFont(new Font("Andalus",0,15));
		Layout.gridx=0;
		Layout.gridy=2;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(lbNombre,Layout);
				
		lbCedula = new JLabel("Cedula");
		lbCedula.setFont(new Font("Andalus",0,15));
		Layout.gridx=0;
		Layout.gridy=3;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(lbCedula,Layout);
		
		lbPeliculas = new JLabel("Peliculas");
		lbPeliculas.setFont(new Font("Andalus",0,23));
		Layout.gridx=0;
		Layout.gridy=5;
		Layout.gridwidth=3;
		Layout.gridheight=1;
		add(lbPeliculas,Layout);
		
		sp1 = new JSeparator();
		Layout.gridx=0;
		Layout.gridy=4;
		Layout.gridwidth=3;
		Layout.gridheight=1;
		Layout.fill=GridBagConstraints.HORIZONTAL;
		add(sp1,Layout);
		Layout.fill=GridBagConstraints.NONE;
		
		panelBusqueda = new JPanel();
		txConsulta = new JTextField(10);
		btBusqueda = new JButton();
		
		btBusqueda.setIcon(new ImageIcon("recursos/imagenes/lupa.png"));
		btBusqueda.setBackground(Color.LIGHT_GRAY);
		btBusqueda.setForeground(Color.DARK_GRAY);
		btBusqueda.setFocusPainted(false);
		btBusqueda.setMargin(insets());
		btBusqueda.setActionCommand(GestionEventos.BUSCARCARRITO);
		btBusqueda.addActionListener(ventanaPrincipal.getEventos());
		
		panelBusqueda.add(txConsulta);
		panelBusqueda.add(btBusqueda);
		Layout.gridx=1;
		Layout.gridy=1;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(panelBusqueda,Layout);
		
		txNombre = new JTextField(10);
		txNombre.setEditable(false);
		Layout.gridx=1;
		Layout.gridy=2;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(txNombre,Layout);
		
		txCedula = new JTextField(10);
		txCedula.setEditable(false);
		Layout.gridx=1;
		Layout.gridy=3;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(txCedula,Layout);
		
		String[] columnas = {"Nombre", "Genero", "Foramto","Codigo","Precio","Disponible"};
		mtPelicula = new DefaultTableModel( columnas, 0 );
		jtPelicula = new JTable( mtPelicula );
		jtPelicula.setPreferredScrollableViewportSize(new Dimension(400,125));
		Layout.gridx=0;
		Layout.gridy=6;
		Layout.gridwidth=2;
		Layout.gridheight=3;
		add(new JScrollPane(jtPelicula),Layout );
		
		btAgregar = new JButton();
		
		btAgregar.setIcon(new ImageIcon("recursos/imagenes/agregar.png"));
		btAgregar.setBackground(Color.LIGHT_GRAY);
		btAgregar.setForeground(Color.DARK_GRAY);
		btAgregar.setFocusPainted(false);
		btAgregar.setBorderPainted(false);
		btAgregar.setMargin(insets());
		btAgregar.setActionCommand(GestionEventos.AGREGARCARRITO);
		btAgregar.addActionListener(ventanaPrincipal.getEventos());
		
		Layout.gridx=2;
		Layout.gridy=7;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(btAgregar,Layout);
		
		sp2 = new JSeparator();
		Layout.gridx=0;
		Layout.gridy=9;
		Layout.gridwidth=3;
		Layout.gridheight=1;
		Layout.fill = GridBagConstraints.HORIZONTAL;
		add(sp2,Layout);
		Layout.fill=GridBagConstraints.NONE;
		
		lbCarrito = new JLabel("Carrito De Alquiler");
		lbCarrito.setFont(new Font("Andalus",0,23));
		Layout.gridx=0;
		Layout.gridy=10;
		Layout.gridwidth=3;
		Layout.gridheight=1;
		add(lbCarrito,Layout);
		
		String[] columnas1 = {"Nombre", "Genero", "Foramto","Codigo","Precio"};
		mtAlquiler = new DefaultTableModel( columnas1, 0 );
		jtAlquiler = new JTable( mtAlquiler );
		jtAlquiler.setPreferredScrollableViewportSize(new Dimension(350,125));
		Layout.gridx=0;
		Layout.gridy=11;
		Layout.gridwidth=3;
		Layout.gridheight=5;
		add(new JScrollPane(jtAlquiler),Layout );
		
		lbTotal = new JLabel("Total");
		lbTotal.setFont(new Font("Andalus",0,15));
		Layout.gridx=0;
		Layout.gridy=16;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(lbTotal,Layout);
		
		lbFechaEntrega = new JLabel("Fecha De Entrega");
		lbFechaEntrega.setFont(new Font("Andalus",0,15));
		Layout.gridx=0;
		Layout.gridy=17;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(lbFechaEntrega,Layout);
		
		txTotal = new JTextField(10);
		txTotal.setEditable(false);
		Layout.gridx=1;
		Layout.gridy=16;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(txTotal,Layout);
		
		txFecha = new JTextField(10);
		txFecha.setEditable(false);
		Layout.gridx=1;
		Layout.gridy=17;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(txFecha,Layout);
		
		btQuitar = new JButton();
		btQuitar.setIcon(new ImageIcon("recursos/imagenes/remover.png"));
		btQuitar.setBackground(Color.LIGHT_GRAY);
		btQuitar.setForeground(Color.DARK_GRAY);
		btQuitar.setFocusPainted(false);
		btQuitar.setBorderPainted(false);
		btQuitar.setMargin(insets());
		btQuitar.setActionCommand(GestionEventos.QUITARCARRITO);
		btQuitar.addActionListener(ventanaPrincipal.getEventos());
		
		Layout.gridx=2;
		Layout.gridy=12;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(btQuitar,Layout);
		
		btFinalizar = new JButton();
		btFinalizar.setIcon(new ImageIcon("recursos/imagenes/listo.png"));
		btFinalizar.setBackground(Color.LIGHT_GRAY);
		btFinalizar.setForeground(Color.DARK_GRAY);
		btFinalizar.setFocusPainted(false);
		btFinalizar.setBorderPainted(false);
		btFinalizar.setMargin(insets());
		btFinalizar.setActionCommand(GestionEventos.LISTOCARRITO);
		btFinalizar.addActionListener(ventanaPrincipal.getEventos());
		
		Layout.gridx=2;
		Layout.gridy=16;
		Layout.gridwidth=1;
		Layout.gridheight=2;
		add(btFinalizar,Layout);
		
		
		
		
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



	public JLabel getLbCliente() {
		return lbCliente;
	}



	public void setLbCliente(JLabel lbCliente) {
		this.lbCliente = lbCliente;
	}



	public JLabel getLbNombre() {
		return lbNombre;
	}



	public void setLbNombre(JLabel lbNombre) {
		this.lbNombre = lbNombre;
	}



	public JLabel getLbCedula() {
		return lbCedula;
	}



	public void setLbCedula(JLabel lbCedula) {
		this.lbCedula = lbCedula;
	}



	public JLabel getLbPeliculas() {
		return lbPeliculas;
	}



	public void setLbPeliculas(JLabel lbPeliculas) {
		this.lbPeliculas = lbPeliculas;
	}



	public JLabel getLbCarrito() {
		return lbCarrito;
	}



	public void setLbCarrito(JLabel lbCarrito) {
		this.lbCarrito = lbCarrito;
	}



	public JLabel getLbTotal() {
		return lbTotal;
	}



	public void setLbTotal(JLabel lbTotal) {
		this.lbTotal = lbTotal;
	}



	public JLabel getLbFechaEntrega() {
		return lbFechaEntrega;
	}



	public void setLbFechaEntrega(JLabel lbFechaEntrega) {
		this.lbFechaEntrega = lbFechaEntrega;
	}



	public JTextField getTxConsulta() {
		return txConsulta;
	}



	public void setTxConsulta(JTextField txConsulta) {
		this.txConsulta = txConsulta;
	}



	public JTextField getTxNombre() {
		return txNombre;
	}



	public void setTxNombre(JTextField txNombre) {
		this.txNombre = txNombre;
	}



	public JTextField getTxCedula() {
		return txCedula;
	}



	public void setTxCedula(JTextField txCedula) {
		this.txCedula = txCedula;
	}



	public JTextField getTxTotal() {
		return txTotal;
	}



	public void setTxTotal(JTextField txTotal) {
		this.txTotal = txTotal;
	}



	public JTextField getTxFecha() {
		return txFecha;
	}



	public void setTxFecha(JTextField txFecha) {
		this.txFecha = txFecha;
	}



	public JButton getBtBusqueda() {
		return btBusqueda;
	}



	public void setBtBusqueda(JButton btBusqueda) {
		this.btBusqueda = btBusqueda;
	}



	public JButton getBtAgregar() {
		return btAgregar;
	}



	public void setBtAgregar(JButton btAgregar) {
		this.btAgregar = btAgregar;
	}



	public JButton getBtQuitar() {
		return btQuitar;
	}



	public void setBtQuitar(JButton btQuitar) {
		this.btQuitar = btQuitar;
	}



	public JButton getBtFinalizar() {
		return btFinalizar;
	}



	public void setBtFinalizar(JButton btFinalizar) {
		this.btFinalizar = btFinalizar;
	}



	public JTable getJtPelicula() {
		return jtPelicula;
	}



	public void setJtPelicula(JTable jtPelicula) {
		this.jtPelicula = jtPelicula;
	}



	public JTable getJtAlquiler() {
		return jtAlquiler;
	}



	public void setJtAlquiler(JTable jtAlquiler) {
		this.jtAlquiler = jtAlquiler;
	}



	public DefaultTableModel getMtPelicula() {
		return mtPelicula;
	}



	public void setMtPelicula(DefaultTableModel mtPelicula) {
		this.mtPelicula = mtPelicula;
	}



	public DefaultTableModel getMtAlquiler() {
		return mtAlquiler;
	}



	public void setMtAlquiler(DefaultTableModel mtAlquiler) {
		this.mtAlquiler = mtAlquiler;
	}



	public JSeparator getSp1() {
		return sp1;
	}



	public void setSp1(JSeparator sp1) {
		this.sp1 = sp1;
	}



	public JSeparator getSp2() {
		return sp2;
	}



	public void setSp2(JSeparator sp2) {
		this.sp2 = sp2;
	}



	public JPanel getPanelBusqueda() {
		return panelBusqueda;
	}



	public void setPanelBusqueda(JPanel panelBusqueda) {
		this.panelBusqueda = panelBusqueda;
	}
	

}
