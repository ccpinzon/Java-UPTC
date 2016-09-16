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

public class GestionCliente extends JDialog {
	
	private VentanaPrincipal ventanaPrincipal;
	private GridBagConstraints Layout;
	private JLabel lbTitulo, lbConsultar, lbNombre, lbApellido, lbCedula, lbDireccion, lbGenero, lbTelefono;
	private JTextField txConsultar, txNombre, txApellido, txCedula, txDireccion, txTelefono;
	private JComboBox cbGenero;
	private JButton btCrear, btModificarUno, btModificarDos, btEliminar,btBuscar, btListo;
	private JPanel panelBusqueda;
	private JTable jtCliente;
	private DefaultTableModel mtCliente;
	private JSeparator p;
	
		
	public GestionCliente(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal=ventanaPrincipal;
		
		setTitle("Video Club Chaplin: Cliente");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setIconImage(new ImageIcon("recursos/imagenes/Icono.png").getImage());
		setSize(590,300);
		setResizable(false);
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
		
		btCrear = new JButton("Crear");
		btCrear.setBackground(Color.LIGHT_GRAY);
		btCrear.setForeground(Color.DARK_GRAY);
		btCrear.setFocusPainted(false);
		btCrear.setActionCommand(GestionEventos.CREARCLIENTE);
		btCrear.addActionListener(ventanaPrincipal.getEventos());
        Layout.gridx=0;
		Layout.gridy=7;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(btCrear,Layout );
		
	    txNombre = new JTextField(10);
        Layout.gridx=1;
		Layout.gridy=1;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(txNombre,Layout );
		
		txApellido = new JTextField(10);
        Layout.gridx=1;
		Layout.gridy=2;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(txApellido,Layout );
		
		txCedula = new JTextField(10);
		SoloNumeros(txCedula);
        Layout.gridx=1;
		Layout.gridy=3;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(txCedula,Layout );
		
		txDireccion = new JTextField(10);
        Layout.gridx=1;
		Layout.gridy=4;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(txDireccion,Layout );
		
		String [] genero = {"","Masculino","Femenino"};	
		cbGenero = new JComboBox<>(genero);
		cbGenero.setBackground(Color.LIGHT_GRAY);
		Layout.gridx=1;
		Layout.gridy=5;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(cbGenero,Layout );
		
		txTelefono= new JTextField(10);
		SoloNumeros(txTelefono);
		Layout.gridx=1;
		Layout.gridy=6;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(txTelefono,Layout);
		
		btModificarDos = new JButton("Modificar");
		btModificarDos.setBackground(Color.LIGHT_GRAY);
		btModificarDos.setForeground(Color.DARK_GRAY);
		btModificarDos.setFocusPainted(false);
		btModificarDos.setActionCommand(GestionEventos.MODIFICARDOS);
		btModificarDos.addActionListener(ventanaPrincipal.getEventos());
		btModificarDos.setEnabled(false);
		Layout.gridx=1;
		Layout.gridy=7;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(btModificarDos,Layout );
		
		lbConsultar = new JLabel("Consultar");
		lbConsultar.setFont(new Font("Andalus",0,23));
		Layout.gridx=3;
		Layout.gridy=0;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(lbConsultar,Layout);
		
		panelBusqueda = new JPanel();
		panelBusqueda.setLayout(new FlowLayout());
		txConsultar = new JTextField(10);
		
		btBuscar = new JButton();
		btBuscar.setIcon(new ImageIcon("recursos/imagenes/lupa.png"));
		btBuscar.setBackground(Color.LIGHT_GRAY);
		btBuscar.setForeground(Color.DARK_GRAY);
		btBuscar.setFocusPainted(false);
		btBuscar.setMargin(insets());
		btBuscar.setActionCommand(GestionEventos.BUSCARCLIENTE);
		btBuscar.addActionListener(ventanaPrincipal.getEventos());
		
		panelBusqueda.add(txConsultar);
		panelBusqueda.add(btBuscar);
		Layout.gridx=4;
		Layout.gridy=0;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(panelBusqueda,Layout );
		
		String[] columnas = {"Nombre", "Apellido", "Cedula"};
		mtCliente = new DefaultTableModel( columnas, 0 );
		jtCliente = new JTable( mtCliente );
		jtCliente.setPreferredScrollableViewportSize(new Dimension(300,125));
		Layout.gridx=3;
		Layout.gridy=1;
		Layout.gridwidth=2;
		Layout.gridheight=6;
		add(new JScrollPane(jtCliente),Layout );
		
		btEliminar = new JButton("Eliminar");
		Layout.anchor = GridBagConstraints.CENTER;
		btEliminar.setBackground(Color.LIGHT_GRAY);
		btEliminar.setForeground(Color.DARK_GRAY);
		btEliminar.setFocusPainted(false);
		btEliminar.setActionCommand(GestionEventos.ELIMINARCLIENTE);
		btEliminar.addActionListener(ventanaPrincipal.getEventos());
		Layout.gridx=3; 
		Layout.gridy=7;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(btEliminar,Layout );
		
		
		btModificarUno = new JButton("Modificar");
		Layout.anchor = GridBagConstraints.CENTER;
		btModificarUno.setBackground(Color.LIGHT_GRAY);
		btModificarUno.setForeground(Color.DARK_GRAY);
		btModificarUno.setFocusPainted(false);
		btModificarUno.setActionCommand(GestionEventos.MODIFICARUNO);
		btModificarUno.addActionListener(ventanaPrincipal.getEventos());
		Layout.gridx=4; 
		Layout.gridy=7;
		Layout.gridwidth=1;
		Layout.gridheight=1;
		add(btModificarUno,Layout );
		
		
		
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


	public JTextField getTxConsultar() {
		return txConsultar;
	}


	public void setTxConsultar(JTextField txConsultar) {
		this.txConsultar = txConsultar;
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


	public JComboBox getCbGenero() {
		return cbGenero;
	}


	public void setCbGenero(JComboBox cbGenero) {
		this.cbGenero = cbGenero;
	}


	public JButton getBtCrear() {
		return btCrear;
	}


	public void setBtCrear(JButton btCrear) {
		this.btCrear = btCrear;
	}


	public JButton getBtModificarUno() {
		return btModificarUno;
	}


	public void setBtModificarUno(JButton btModificarUno) {
		this.btModificarUno = btModificarUno;
	}


	public JButton getBtModificarDos() {
		return btModificarDos;
	}


	public void setBtModificarDos(JButton btModificarDos) {
		this.btModificarDos = btModificarDos;
	}


	public JButton getBtEliminar() {
		return btEliminar;
	}


	public void setBtEliminar(JButton btEliminar) {
		this.btEliminar = btEliminar;
	}


	public JButton getBtBuscar() {
		return btBuscar;
	}


	public void setBtBuscar(JButton btBuscar) {
		this.btBuscar = btBuscar;
	}


	public JButton getBtListo() {
		return btListo;
	}


	public void setBtListo(JButton btListo) {
		this.btListo = btListo;
	}


	public JPanel getPanelBusqueda() {
		return panelBusqueda;
	}


	public void setPanelBusqueda(JPanel panelBusqueda) {
		this.panelBusqueda = panelBusqueda;
	}


	public JTable getJtCliente() {
		return jtCliente;
	}


	public void setJtCliente(JTable jtCliente) {
		this.jtCliente = jtCliente;
	}


	public DefaultTableModel getMtCliente() {
		return mtCliente;
	}


	public void setMtCliente(DefaultTableModel mtCliente) {
		this.mtCliente = mtCliente;
	}


	public JSeparator getP() {
		return p;
	}


	public void setP(JSeparator p) {
		this.p = p;
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

	
}
