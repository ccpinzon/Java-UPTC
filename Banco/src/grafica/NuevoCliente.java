package grafica;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.*;

import logic.EGenero;

// ventana para crear un nuevo usuario

public class NuevoCliente extends JDialog {

	// se crean los elementos de la ventana

	private JLabel lbTitulo, lbNombre, lbApellido, lbDocumento, lbGenero,lbFechaNacimiento, lbDireccion;
	private JTextField txNombre, txApellido, txDocumento, txDireccion;
	private JRadioButton rbMasculino, rbFemenino;
	private ButtonGroup bgGenero;
	private JDateChooser fechaNacimiento;
	private JButton btCrear, btCancelar;
	private Box genero;
	
	private VentanaPrincipal ventanaPrincipal;
	

	
	
	
	
	
	
	// Constructor

	

	public NuevoCliente( VentanaPrincipal ventanaPrincipal ) {
		this.ventanaPrincipal = ventanaPrincipal;
		
		 
		
		// Se crea y define un elemento de tipo GridBagLayout para poder m�s
		// adelante utilizarlo en la organizaci�n de los elementos en la
		// ventana.

		this.getContentPane().setLayout(new GridBagLayout());
		GridBagConstraints Layout = new GridBagConstraints();

		// Se defina el t�tulo, el tama�o, el icono que llevara, y el
		// comportamiento de la ventana.

		setTitle("Banco");
		setSize(320,300);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
		setResizable(false);

		// Se definen los distintos elementos de la ventana.
		// El GridBagLayout organiza los elementos de la ventana en una matriz,
		// se puede definir la posici�n del elemento en la matriz, la cantidad
		// de posiciones que ocupe en ancho o alto y el tama�o de dichas
		// posiciones.

	
		
		
		lbTitulo = new JLabel("Nuevo Cliente"); // se inicializa y se agrega el texto
		lbTitulo.setFont(new java.awt.Font("Andalus", 0, 26)); // tipo y tama�o de letra
		Layout.gridx = 0; // empiece en la columna 0
		Layout.gridy = 0; // empiece en al fila 0
		Layout.gridwidth = 2; // 2 posici�n de ancho
		Layout.gridheight = 1; // 1 posici�n de alto
		Layout.weighty = 1.0; // estirar colmunas
		Layout.weightx = 1.0; // estirar filas
		this.getContentPane().add(lbTitulo, Layout); // se agrega el elemento al layout

		lbNombre = new JLabel("Nombre"); // se inicializa y se agrega el texto
		lbNombre.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tama�o de letra
		Layout.gridx = 0; // empiece en la columna 0
		Layout.gridy = 1; // empiece en al fila 1
		Layout.gridwidth = 1; // 1 posici�n de ancho
		Layout.gridheight = 1; // 1 posici�n de alto
		this.getContentPane().add(lbNombre, Layout); // se agrega el elemento al layout

		lbApellido = new JLabel("Apellido"); // se inicializa y se agrega el  texto
		lbApellido.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tama�o de letra
		Layout.gridx = 0; // empiece en la columna 0
		Layout.gridy = 2; // empiece en al fila 2
		Layout.gridwidth = 1; // 1 posici�n de ancho
		Layout.gridheight = 1; // 1 posici�n de alto
		this.getContentPane().add(lbApellido, Layout); // se agrega el elemento al layout

		lbDocumento = new JLabel("Documento"); // se inicializa y se agrega el texto
		lbDocumento.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tama�o de letra
		Layout.gridx = 0; // empiece en la columna 0
		Layout.gridy = 3; // empiece en al fila 3
		Layout.gridwidth = 1; // 1 posici�n de ancho
		Layout.gridheight = 1; // 1 posici�n de alto
		this.getContentPane().add(lbDocumento, Layout); // se agrega el elemento al layout

		lbGenero = new JLabel("Genero"); // se inicializa y se agrega el texto
		lbGenero.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tama�o de letra
		Layout.gridx = 0; // empiece en la columna 0
		Layout.gridy = 6; // empiece en al fila 6
		Layout.gridwidth = 1; // 1 posici�n de ancho
		Layout.gridheight = 1; // 1 posici�n de alto
		this.getContentPane().add(lbGenero, Layout); // se agrega el elemento al layout

		lbFechaNacimiento = new JLabel("Fecha Nacimiento"); // se inicializa y se agrega el texto
		lbFechaNacimiento.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tama�o de letra
		Layout.gridx = 0; // empiece en la columna 0
		Layout.gridy = 5; // empiece en al fila 5
		Layout.gridwidth = 1; // 1 posici�n de ancho
		Layout.gridheight = 1; // 1 posici�n de alto
		this.getContentPane().add(lbFechaNacimiento, Layout); // se agrega el elemento al layout

		lbDireccion = new JLabel("Direccion"); // se inicializa y se agrega el texto
		lbDireccion.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo y tama�o de letra
		Layout.gridx = 0; // empiece en la columna 0
		Layout.gridy = 4; // empiece en al fila 4
		Layout.gridwidth = 1; // 1 posici�n de ancho
		Layout.gridheight = 1; // 1 posici�n de alto
		this.getContentPane().add(lbDireccion, Layout); // se agrega el elemento al layout

		txNombre = new JTextField(8); // se inicializa y se agrega el tama�o
		txNombre.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo de fuente y tama�o
		Layout.gridx = 1; // empiece en la columna 1
		Layout.gridy = 1; // empiece en al fila 1
		Layout.gridwidth = 1; // 1 posici�n de ancho
		Layout.gridheight = 1; // 1 posici�n de alto
		this.getContentPane().add(txNombre, Layout); // se agrega el elemento al layout

		txApellido = new JTextField(8); // se inicializa y se agrega el tama�o
		txApellido.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo de fuente y tama�o
		Layout.gridx = 1; // empiece en la columna 1
		Layout.gridy = 2; // empiece en al fila 2
		Layout.gridwidth = 1; // 1 posici�n de ancho
		Layout.gridheight = 1; // 1 posici�n de alto
		this.getContentPane().add(txApellido, Layout); // se agrega el elemento al layout

		txDocumento = new JTextField(8); // se inicializa y se agrega el tama�o
		txDocumento.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo de fuente y tama�o
		Layout.gridx = 1; // empiece en la columna 1
		Layout.gridy = 3; // empiece en al fila 3
		Layout.gridwidth = 1; // 1 posici�n de ancho
		Layout.gridheight = 1; // 1 posici�n de alto
		this.getContentPane().add(txDocumento, Layout); // se agrega el elemento al layout

		rbFemenino = new JRadioButton("Femenino"); // se incializa y se agraga el titulo
		rbFemenino.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo de fuente y tama�o

		rbMasculino = new JRadioButton("Masculino"); // se incializa y se agraga el titulo
		rbMasculino.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo de fuente y tama�o

		bgGenero = new ButtonGroup(); // se crea el grupo para agregarle femenino y masculino para que solo se pueda seleccionar 1 de ellos
		bgGenero.add(rbFemenino); // se agrega el radiobuton femenino al butongroup genero
		bgGenero.add(rbMasculino); // se agrega el radiobuton mascuino al butongroup

		genero = Box.createHorizontalBox(); // se crea una caja para guardar los radionbutton para poderlos mostrar mbos un una sola posici�n de la matriz
		Layout.gridx = 1; // empiece en la columna 1
		Layout.gridy = 6; // empiece en al fila 6
		Layout.gridwidth = 1; // 1 posici�n de ancho
		Layout.gridheight = 1; // 1 posici�n de alto
		genero.add(rbFemenino); // se agrega el radiobuton a la caja
		genero.add(rbMasculino); // se agrega el radiobuton a la caja
		this.getContentPane().add(genero, Layout); // se agrega el elemento al layout

		fechaNacimiento = new JDateChooser(Calendar.getInstance().getTime());
		System.out.println(Calendar.getInstance().getTime());
		Layout.gridx = 1; // empiece en la columna 1
		Layout.gridy = 5; // empiece en al fila 5
		Layout.gridwidth = 1; // 1 posici�n de ancho
		Layout.gridheight = 1; // 1 posici�n de alto
		Layout.fill = GridBagConstraints.VERTICAL; // ocupe toda la casilla verticalmente
		this.getContentPane().add(fechaNacimiento, Layout); // se agrega el elemento al layout
		Layout.fill = GridBagConstraints.NONE;

		txDireccion = new JTextField(8); // se inicializa y se agrega el tama�o
		txDireccion.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo de fuente y tama�o
		Layout.gridx = 1; // empiece en la columna 1
		Layout.gridy = 4; // empiece en al fila 4
		Layout.gridwidth = 1; // 1 posici�n de ancho
		Layout.gridheight = 1; // 1 posici�n de alto
		this.getContentPane().add(txDireccion, Layout); // se agrega el elemento al layout

		btCrear = new JButton("Crear"); // se inicializa y agrega el texto
		btCrear.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo de fuente
		Layout.gridx = 0; // empiece en la columna 0
		Layout.gridy = 7; // empiece en al fila 7
		Layout.gridwidth = 1; // 1 posici�n de ancho
		Layout.gridheight = 1; // 1 posici�n de alto
		Layout.anchor = GridBagConstraints.EAST; // se oriente al este
		btCrear.addActionListener(new accionCrear()); //accion del boton
		this.getContentPane().add(btCrear, Layout); // se agrega el elemento al layout

		btCancelar = new JButton("Cancelar"); // se inicializa y agrega el texto
		btCancelar.setFont(new java.awt.Font("Andalus", 0, 15)); // tipo de fuente
		Layout.gridx = 1; // empiece en la columna 1
		Layout.gridy = 7; // empiece en al fila 7
		Layout.gridwidth = 1; // 1 posici�n de ancho
		Layout.gridheight = 1; // 1 posici�n de alto
		btCancelar.addActionListener(new accionCancelar()); // accion del boton
		Layout.anchor = GridBagConstraints.WEST; // se oriente al oeste
		this.getContentPane().add(btCancelar, Layout); // se agrega el elemento al layout
		
	}
	
	// se crea el m�todo de la acci�n del bo�n crear



	public class accionCrear implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {

			// si los campos no estan todos llenos pide que los llene

			if (txApellido.getText().length() == 0 || txDireccion.getText().length() == 0 || txDocumento.getText().length() == 0 || txNombre.getText().length() == 0 || bgGenero.getSelection() == null){
				JOptionPane.showMessageDialog(null,"Porfavor llene todos los campos");
			}

			else {

				// los campos estan llenos crea el cliente y cierra la ventana
				
				String nombreTexto = txNombre.getText();
				String apellidoTexto = txApellido.getText();
				String documentoTexto = txDocumento.getText();
				String direccionTexto = txDireccion.getText();
				Calendar fechaNacimientoTexto = fechaNacimiento.getCalendar();
				EGenero generoTexto;

				if (rbMasculino.isSelected()) {

					generoTexto = EGenero.Masculino;
				}

				else {
					generoTexto = EGenero.Femenino;

				}
	
				ventanaPrincipal.agregarCliente(nombreTexto, apellidoTexto, documentoTexto,direccionTexto,fechaNacimientoTexto,generoTexto);			
			//	System.out.println( "tama�o despues "+ventanaPrincipal.getGestionCliente().getClientes().size());
				
                
                
				JOptionPane.showMessageDialog(null, "Se a Creado");
				dispose();
			}

		}
	}

	// se crea el m�todo de la acci�n del bo�n crearCancelar

	public class accionCancelar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {

			// se cierra la ventana
			dispose();
		}

	}

}
