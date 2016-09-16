package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.StringTokenizer;



import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import logic.ListaSencilla;
import logic.Nodo;

public class VentanaPrincipal extends JFrame {

	private JPanel panelDerecho;
	private JPanel panelIzquierdo;
	private JPanel panelBotones;
	private JPanel panelBuscar;
	private JPanel panelTextos;
	private JPanel panelTablas;
	private JLabel lbCodigo;
	private JLabel lbDescripcion;
	private JLabel lbValor;
	private JLabel lbCantidad;
	private JTextField txCodigo;
	private JTextField txDescripcion;
	private JTextField txValor;
	private JTextField txCantidad;
	private JTextField txBuscar;
	private JButton btAgregarPrincipio;
	private JButton btAgregarFinal;
	private JButton btAgregarOrden;
	private JButton btEliminar;
	private JButton btBucar;
	private JButton btAceptar;
	private JRadioButton rbListaOrdenada;
	private JRadioButton rbListaDesordenada;
	private ButtonGroup bgListas;
	private JComboBox<String> cbBusqueda;
	private DefaultTableModel dmTablaDesoredenada;
	private DefaultTableModel dmTablaOrdenada;
	private JTable tbOrdenada;
	private JTable tbDesordenada;
	private GestionEventos eventos;
	private ListaSencilla listaDesordenada;
	private ListaSencilla listaOrdenada;

	public VentanaPrincipal() {
		// TODO Auto-generated constructor stub

		setTitle("Progra III-Taller 1-(Listas)");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setSize(910, 290);
		setResizable(false);

		inicializar();
		agregar();
	}

	private void inicializar() {
		// TODO Auto-generated method stub

		eventos = new GestionEventos(this);

		listaDesordenada = new ListaSencilla("ListaDesordenada");
		listaOrdenada = new ListaSencilla("ListaOrdenada");

		panelDerecho = new JPanel();
		panelDerecho.setLayout(new BoxLayout(panelDerecho, BoxLayout.Y_AXIS));

		panelTextos = new JPanel();
		panelTextos.setBorder(new TitledBorder("Agregar-Eliminar"));
		panelTextos.setLayout(new GridLayout(5, 2));

		lbCodigo = new JLabel("Codigo");
		txCodigo = new JTextField(10);
		
		

		lbDescripcion = new JLabel("Descripcion");
		txDescripcion = new JTextField(10);
		lbValor = new JLabel("Valor");
		txValor = new JTextField(10);
		SoloNumeros(txValor);

		lbCantidad = new JLabel("Cantidad");
		txCantidad = new JTextField(10);
		SoloNumeros(txCantidad);

		btAceptar = new JButton("Aceptar");
		btAceptar.setActionCommand(eventos.ACEPTAR);
		btAceptar.addActionListener(this.getEventos());

		btEliminar = new JButton("Eliminar");
		btEliminar.setActionCommand(eventos.ELIMININAR);
		btEliminar.addActionListener(this.getEventos());

		panelTextos.add(lbCodigo);
		panelTextos.add(txCodigo);
		panelTextos.add(lbDescripcion);
		panelTextos.add(txDescripcion);
		panelTextos.add(lbValor);
		panelTextos.add(txValor);
		panelTextos.add(lbCantidad);
		panelTextos.add(txCantidad);
		panelTextos.add(btAceptar);
		panelTextos.add(btEliminar);

		panelBuscar = new JPanel();
		panelBuscar.setBorder(new TitledBorder("Buscar"));
		panelBuscar.setLayout(new BoxLayout(panelBuscar, BoxLayout.PAGE_AXIS));

		String[] busqueda = new String[] { "Codigo", "Descripcion" };
		cbBusqueda = new JComboBox<>(busqueda);
		txBuscar = new JTextField(10);
		btBucar = new JButton("Buscar");
		btBucar.setActionCommand(eventos.BUSACR);
		btBucar.addActionListener(this.getEventos());

		panelBuscar.add(cbBusqueda);
		panelBuscar.add(txBuscar);
		panelBuscar.add(btBucar);

		panelDerecho.add(panelTextos);
		panelDerecho.add(panelBuscar);

		panelIzquierdo = new JPanel();
		panelIzquierdo.setLayout(new BorderLayout());

		panelBotones = new JPanel();
		panelBotones.setLayout(new GridLayout());

		btAgregarFinal = new JButton("Agregar Final");
		btAgregarFinal.setActionCommand(eventos.AGREGAR_FINAL);
		btAgregarFinal.addActionListener(this.getEventos());

		btAgregarPrincipio = new JButton("Agregar Principio");
		btAgregarPrincipio.setActionCommand(eventos.AGREGAR_PRINCIPIO);
		btAgregarPrincipio.addActionListener(this.getEventos());

		btAgregarOrden = new JButton("Agregar Orden");
		btAgregarOrden.setActionCommand(eventos.AGREGAR_ORDEN);
		btAgregarOrden.addActionListener(this.getEventos());

		panelBotones.add(btAgregarPrincipio);
		panelBotones.add(btAgregarFinal);
		panelBotones.add(btAgregarOrden);

		panelTablas = new JPanel();
		panelTablas.setLayout(new FlowLayout());
		panelTablas.setBorder(new TitledBorder("Listas"));

		String[] m = new String[] { "Codigo", "Descripcion", "Valor",
				"Cantidad" };
		dmTablaDesoredenada = new DefaultTableModel(m, 120);
		tbDesordenada = new JTable(dmTablaDesoredenada);
		tbDesordenada
				.setPreferredScrollableViewportSize(new Dimension(300, 150));

		String[] p = new String[] { "Codigo", "Descripcion", "Valor",
				"Cantidad" };
		dmTablaOrdenada = new DefaultTableModel(p, 120);
		tbOrdenada = new JTable(dmTablaOrdenada);
		tbOrdenada.setPreferredScrollableViewportSize(new Dimension(300, 150));

		rbListaDesordenada = new JRadioButton(
				"Lista Desordenada                                                               ");
		rbListaDesordenada.setActionCommand(eventos.LISTA_DESORDENADA);
		rbListaDesordenada.addActionListener(this.getEventos());

		rbListaOrdenada = new JRadioButton("Lista Ordenda");
		rbListaOrdenada.setActionCommand(eventos.LISTA_ORDENADA);
		rbListaOrdenada.addActionListener(this.getEventos());

		bgListas = new ButtonGroup();
		bgListas.add(rbListaDesordenada);
		bgListas.add(rbListaOrdenada);

		panelTablas.add(new JScrollPane(tbDesordenada));
		panelTablas.add(new JScrollPane(tbOrdenada));
		panelTablas.add(rbListaDesordenada);
		panelTablas.add(rbListaOrdenada);

		panelIzquierdo.add(panelTablas, BorderLayout.CENTER);
		panelIzquierdo.add(panelBotones, BorderLayout.SOUTH);

	}

	private void agregar() {
		// TODO Auto-generated method stub
		add(panelDerecho, BorderLayout.EAST);
		add(panelIzquierdo, BorderLayout.CENTER);
	}

	public static void main(String[] args) {

		VentanaPrincipal ventana = new VentanaPrincipal();
		ventana.setVisible(true);

		ventana.getTbOrdenada().setEnabled(false);
		ventana.getTbDesordenada().setEnabled(false);
		ventana.getBtAgregarFinal().setEnabled(false);
		ventana.getBtAgregarOrden().setEnabled(false);
		ventana.getBtAgregarPrincipio().setEnabled(false);
		ventana.getBtAceptar().setEnabled(false);
		ventana.getBtEliminar().setEnabled(false);
		ventana.getBtBucar().setEnabled(false);
	}

	public GestionEventos getEventos() {
		return eventos;
	}

	public void setEventos(GestionEventos eventos) {
		this.eventos = eventos;
	}

	
	



	public JButton getBtAgregarPrincipio() {
		return btAgregarPrincipio;
	}

	public void setBtAgregarPrincipio(JButton btAgregarPrincipio) {
		this.btAgregarPrincipio = btAgregarPrincipio;
	}

	public JButton getBtAgregarFinal() {
		return btAgregarFinal;
	}

	public void setBtAgregarFinal(JButton btAgregarFinal) {
		this.btAgregarFinal = btAgregarFinal;
	}

	public JButton getBtAgregarOrden() {
		return btAgregarOrden;
	}

	public void setBtAgregarOrden(JButton btAgregarOrden) {
		this.btAgregarOrden = btAgregarOrden;
	}

	public JButton getBtEliminar() {
		return btEliminar;
	}

	public void setBtEliminar(JButton btEliminar) {
		this.btEliminar = btEliminar;
	}

	public JButton getBtBucar() {
		return btBucar;
	}

	public void setBtBucar(JButton btBucar) {
		this.btBucar = btBucar;
	}

	public JButton getBtAceptar() {
		return btAceptar;
	}

	public void setBtAceptar(JButton btAceptar) {
		this.btAceptar = btAceptar;
	}

	public JTable getTbOrdenada() {
		return tbOrdenada;
	}

	public void setTbOrdenada(JTable tbOrdenada) {
		this.tbOrdenada = tbOrdenada;
	}

	public JTable getTbDesordenada() {
		return tbDesordenada;
	}

	public void setTbDesordenada(JTable tbDesordenada) {
		this.tbDesordenada = tbDesordenada;
	}

	public void listaDesordenada() {
		// TODO Auto-generated method stub
		btAgregarOrden.setEnabled(false);
		btAgregarFinal.setEnabled(true);
		btAgregarPrincipio.setEnabled(true);
		btBucar.setEnabled(true);

	}

	public void listaOrdenada() {
		// TODO Auto-generated method stub
		btAgregarFinal.setEnabled(false);
		btAgregarOrden.setEnabled(true);
		btAgregarPrincipio.setEnabled(false);
		this.btBucar.setEnabled(true);

	}

	public void AgregarFinal() {
		// TODO Auto-generated method stub
		String codigo = txCodigo.getText().replace(" ", "-");
		String descripcion = txDescripcion.getText().replace(" ", "-");
		String valor = txValor.getText();
		String cantidad = txCantidad.getText();
		
		if (codigo.equals("") || descripcion.equals("") || cantidad.equals("")
				|| valor.equals("")) {

			JOptionPane.showMessageDialog(null,
					"Porfavor Llene Los Campos Para Poder Agregar A La Lista");

		}else{
		
		try {
			
			if(!listaDesordenada.listaVacia()){
				if(codigo.equals(listaDesordenada.BuscarNodoCodigo(codigo).getProducto().getCodigo())){
					JOptionPane.showMessageDialog(null,"El Elemento Ya Se Encuentra En La Lista");
					}
				
			}else{

				double valor1 = Double.parseDouble(valor);
				int cantidad1 = Integer.parseInt(cantidad);

				listaDesordenada.agregarFinal(codigo, descripcion, valor1, cantidad1);

				actualizarListaDesordeda();
			
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			double valor1 = Double.parseDouble(valor);
			int cantidad1 = Integer.parseInt(cantidad);

			listaDesordenada.agregarFinal(codigo, descripcion, valor1, cantidad1);

			actualizarListaDesordeda();
			
		}  


				
		}
		
		

		txCodigo.setText("");
		txDescripcion.setText("");
		txValor.setText("");
		txCantidad.setText("");

	}

	public void AgregarPrincipio() {
		// TODO Auto-generated method stub

		String codigo = txCodigo.getText().replace(" ", "-");
		String descripcion = txDescripcion.getText().replace(" ", "-");
		String valor = txValor.getText();
		String cantidad = txCantidad.getText();
		
		if (codigo.equals("") || descripcion.equals("") || cantidad.equals("")
				|| valor.equals("")) {

			JOptionPane.showMessageDialog(null,
					"Porfavor Llene Los Campos Para Poder Agregar A La Lista");

		}else{
		
		try {
			
			if(!listaDesordenada.listaVacia()){
				if(codigo.equals(listaDesordenada.BuscarNodoCodigo(codigo).getProducto().getCodigo())){
					JOptionPane.showMessageDialog(null,"El Elmeto Ya Se Encuentra En La Lista");
					}
				
			}else{

				double valor1 = Double.parseDouble(valor);
				int cantidad1 = Integer.parseInt(cantidad);

				listaDesordenada.agregarPrincipio(codigo, descripcion, valor1, cantidad1);

				actualizarListaDesordeda();
			
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			double valor1 = Double.parseDouble(valor);
			int cantidad1 = Integer.parseInt(cantidad);

			listaDesordenada.agregarPrincipio(codigo, descripcion, valor1, cantidad1);

			actualizarListaDesordeda();
			
		}  }
		

		txCodigo.setText("");
		txDescripcion.setText("");
		txValor.setText("");
		txCantidad.setText("");

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
	


	public void AgregarOrden() {

		// TODO Auto-generated method stub
		String codigo = txCodigo.getText().replace(" ", "-");
		String descripcion = txDescripcion.getText().replace(" ", "-");
		String valor = txValor.getText();
		String cantidad = txCantidad.getText();
		
		if (codigo.equals("") || descripcion.equals("") || cantidad.equals("")
				|| valor.equals("")) {

			JOptionPane.showMessageDialog(null,
					"Porfavor Llene Los Campos Para Ppoder Agregar A La Lista");

		}else{
		
		try {
			
			if(!listaOrdenada.listaVacia()){
				if(codigo.equals(listaOrdenada.BuscarNodoCodigo(codigo).getProducto().getCodigo())){
					JOptionPane.showMessageDialog(null,"El Elmeto Ya Se Encuentra En La Lista");
					}
				
			}else{

				double valor1 = Double.parseDouble(valor);
				int cantidad1 = Integer.parseInt(cantidad);

				listaOrdenada.agregarOrden(codigo, descripcion, valor1, cantidad1);

				actualizarListaOrdenada();
			
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			double valor1 = Double.parseDouble(valor);
			int cantidad1 = Integer.parseInt(cantidad);

			listaOrdenada.agregarOrden(codigo, descripcion, valor1, cantidad1);

			actualizarListaOrdenada();
			
		} } 	

		txCodigo.setText("");
		txDescripcion.setText("");
		txValor.setText("");
		txCantidad.setText("");
	}
	
	

	public void Buscar() {
		// TODO Auto-generated method stub

		String busqueda = txBuscar.getText().replace(" ", "-");
		Nodo busqeuda23 = null;

		if (busqueda.equals("") || bgListas.getSelection() == null) {

			JOptionPane.showMessageDialog(null,	"Porfavor Ingrese El Codigo o La Descripcion Para Realizar La Busqueda \n O Seleccione Una Lista En La Cual Buscar");
			
		} else {

			if (rbListaDesordenada.isSelected()
					&& !listaDesordenada.listaVacia()) {

				if (cbBusqueda.getSelectedItem().toString().equals("Codigo")) {

					try {
						busqeuda23 = listaDesordenada
								.BuscarNodoCodigo(busqueda);
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null,
								"el elemento no existe");
					}

					if (busqeuda23 != null) {

						btAgregarFinal.setEnabled(false);
						btAgregarOrden.setEnabled(false);
						btAgregarPrincipio.setEnabled(false);
						btAceptar.setEnabled(true);
						btEliminar.setEnabled(true);
						btBucar.setEnabled(false);

						txBuscar.setEnabled(false);
						this.txBuscar.setText("");
						this.cbBusqueda.setEnabled(false);
						this.rbListaDesordenada.setEnabled(false);
						this.rbListaOrdenada.setEnabled(false);

						txCodigo.setText(
								busqeuda23.getProducto().getCodigo());
						txCodigo.setEditable(false);
						txDescripcion.setText(
								busqeuda23.getProducto().getDescripcion());
						txDescripcion.setEditable(false);
						txValor.setText(
								String.valueOf(busqeuda23.getProducto()
										.getValor()));
						txValor.setEditable(false);
						txCantidad.setText(
								String.valueOf(busqeuda23.getProducto()
										.getCantidad()));
						txCantidad.setEditable(false);
					}

				}

				else {

					try {
						busqeuda23 = listaDesordenada
								.buscarNodoDescripcion(busqueda);
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null,
								"el elemento no existe");
					}

					if (busqeuda23 != null) {

						btAgregarFinal.setEnabled(false);
						btAgregarOrden.setEnabled(false);
						btAgregarPrincipio.setEnabled(false);
						btAceptar.setEnabled(true);
						btEliminar.setEnabled(true);
						btBucar.setEnabled(false);

						txBuscar.setEnabled(false);
						this.txBuscar.setText("");
						this.cbBusqueda.setEnabled(false);
						this.rbListaDesordenada.setEnabled(false);
						this.rbListaOrdenada.setEnabled(false);

						txCodigo.setText(
								busqeuda23.getProducto().getCodigo());
						txCodigo.setEditable(false);
						txDescripcion.setText(
								busqeuda23.getProducto().getDescripcion());
						txDescripcion.setEditable(false);
						txValor.setText(
								String.valueOf(busqeuda23.getProducto()
										.getValor()));
						txValor.setEditable(false);
						txCantidad.setText(
								String.valueOf(busqeuda23.getProducto()
										.getCantidad()));
						txCantidad.setEditable(false);
					}

				}

			} else if (rbListaOrdenada.isSelected()
					&& !listaOrdenada.listaVacia()) {

				if (cbBusqueda.getSelectedItem().toString().equals("Codigo")) {

					try {
						busqeuda23 = listaOrdenada.BuscarNodoCodigo(busqueda);
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null,
								"el elemento no existe");
					}

					if (busqeuda23 != null) {

						btAgregarFinal.setEnabled(false);
						btAgregarOrden.setEnabled(false);
						btAgregarPrincipio.setEnabled(false);
						btAceptar.setEnabled(true);
						btEliminar.setEnabled(true);
						btBucar.setEnabled(false);

						txBuscar.setEnabled(false);
						this.txBuscar.setText("");
						this.cbBusqueda.setEnabled(false);
						this.rbListaDesordenada.setEnabled(false);
						this.rbListaOrdenada.setEnabled(false);

						txCodigo.setText(
								busqeuda23.getProducto().getCodigo());
						txCodigo.setEditable(false);
						txDescripcion.setText(
								busqeuda23.getProducto().getDescripcion());
						txDescripcion.setEditable(false);
						txValor.setText(
								String.valueOf(busqeuda23.getProducto()
										.getValor()));
						txValor.setEditable(false);
						txCantidad.setText(
								String.valueOf(busqeuda23.getProducto()
										.getCantidad()));
						txCantidad.setEditable(false);
					}

				}

				else {

					try {
						busqeuda23 = listaOrdenada
								.buscarNodoDescripcion(busqueda);
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null,
								"el elemento no existe");
					}

					if (busqeuda23 != null) {

						btAgregarFinal.setEnabled(false);
						btAgregarOrden.setEnabled(false);
						btAgregarPrincipio.setEnabled(false);
						btAceptar.setEnabled(true);
						btEliminar.setEnabled(true);
						btBucar.setEnabled(false);

						txBuscar.setEnabled(false);
						this.txBuscar.setText("");
						this.cbBusqueda.setEnabled(false);
						this.rbListaDesordenada.setEnabled(false);
						this.rbListaOrdenada.setEnabled(false);

						txCodigo.setText(
								busqeuda23.getProducto().getCodigo());
						txCodigo.setEditable(false);
						txDescripcion.setText(
								busqeuda23.getProducto().getDescripcion());
						txDescripcion.setEditable(false);
						txValor.setText(
								String.valueOf(busqeuda23.getProducto()
										.getValor()));
						txValor.setEditable(false);
						txCantidad.setText(
								String.valueOf(busqeuda23.getProducto()
										.getCantidad()));
						txCantidad.setEditable(false);
					}

				}

			} else {
				JOptionPane.showMessageDialog(null,
						"La Lista Se Encuentra Vacia");
			}
		}
	}

	public void Aceptar() {
		// TODO Auto-generated method stub
		
		bgListas.clearSelection();
		txCodigo.setEditable(true);
		txCodigo.setText("");
		txDescripcion.setText("");
		txDescripcion.setEditable(true);
		txValor.setText("");
		txValor.setEditable(true);
		txCantidad.setEditable(true);
		txCantidad.setText("");
		btAceptar.setEnabled(false);
		btEliminar.setEnabled(false);

		cbBusqueda.setEnabled(true);
		txBuscar.setEnabled(true);
		btBucar.setEnabled(true);

		this.rbListaDesordenada.setEnabled(true);
		this.rbListaOrdenada.setEnabled(true);
	}

	public void Eliminar() {
		// TODO Auto-generated method stub

		String codigo = txCodigo.getText().replace(" ", "-");

		if (rbListaDesordenada.isSelected()) {

			try {
				listaDesordenada.eliminarNodo(codigo);
				// this.getDmTablaDesoredenada().removeRow(0);
				dmTablaDesoredenada.removeRow(0);
				actualizarListaDesordeda();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		else {
			try {
				listaOrdenada.eliminarNodo(codigo);
				// this.getDmTablaDesoredenada().removeRow(0);
				dmTablaOrdenada.removeRow(0);
				actualizarListaOrdenada();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		btEliminar.setEnabled(false);

	}

	public void actualizarListaDesordeda() {

		try {

			String lista = listaDesordenada.listarLista();
			StringTokenizer st = new StringTokenizer(lista);
			int con = 0;
			int i = 0;
			while (st.hasMoreTokens()) {

				dmTablaDesoredenada
						.setValueAt(st.nextToken(), i, con);
				

				con = con + 1;
				if (con == 4) {
					con = 0;
					i = i + 1;
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "La Lista Ha Quedado Vacia");
		}

	}

	public void actualizarListaOrdenada() {

		try {

			String lista2 = listaOrdenada.listarLista();
			StringTokenizer st = new StringTokenizer(lista2);
			int con = 0;
			int i = 0;
			while (st.hasMoreTokens()) {

				dmTablaOrdenada.setValueAt(st.nextToken(), i, con);
				

				con = con + 1;
				if (con == 4) {
					con = 0;
					i = i + 1;
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "La Lista Ha Quedado Vacia");
		}

	}

}
