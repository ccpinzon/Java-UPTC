//import java.awt.FlowLayout;
//
//import javax.swing.JButton;
//import javax.swing.JPanel;
//
//
//public class PanelBotones extends JPanel {
//	
//	private JButton btSuma, btResta, btDivision, btMultiplicacion, btL;
//	private VentanaPrincipal ventana;
//	
//	public PanelBotones( VentanaPrincipal ventana ) {
//		
//		
//		this.ventana = ventana;
//		setLayout( new FlowLayout( ) );
//		inicializar( );
//		agregar( );
//	}
//
//	private void inicializar() {
//		btSuma = new JButton( "Suimar" );
//		btSuma.setActionCommand( GestionEventos.SUMAR );
//		btSuma.addActionListener( ventana.getEventos( ) );
//	}
//
//	private void agregar() {
//		
//		add(btSuma);
//		
//	}
//	
//}


import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBotones extends JPanel {
	private MenuCalculadora ventana;
	private JButton btmas, btmenos, btdividir, btmultiplicar, btlimpiar;

	public PanelBotones(MenuCalculadora ventana) {

		this.ventana = ventana;
		this.setLayout(new FlowLayout());
		initComponentes();
		agreComponentes();
	}

	private void initComponentes() {
		// botones

		btmas = new JButton("+");
		btmas.setActionCommand(GestioEventos.SUMAR);
		btmas.addActionListener(ventana.getGestioEventos());
		btmenos = new JButton("-");
		btmenos.setActionCommand(GestioEventos.MENOS);
		btmenos.addActionListener(ventana.getGestioEventos());
		btdividir = new JButton("/");
		btdividir.setActionCommand(GestioEventos.DIVIDIR);
		btdividir.addActionListener(ventana.getGestioEventos());
		btmultiplicar = new JButton("*");
		btmultiplicar.setActionCommand(GestioEventos.MULTIPLICAR);
		btmultiplicar.addActionListener(ventana.getGestioEventos());
		btlimpiar = new JButton("ele");
		btlimpiar.setActionCommand(GestioEventos.LIMPIAR);
		btlimpiar.addActionListener(ventana.getGestioEventos());

	}

	private void agreComponentes() {
		add(btmas);
		add(btmenos);
		add(btdividir);
		add(btmultiplicar);
		add(btlimpiar);

	}
}
