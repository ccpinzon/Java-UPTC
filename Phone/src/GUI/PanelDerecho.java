package GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PanelDerecho extends JPanel {
	
	private JTable tabla;
	private DefaultTableModel modeloTabla;
	private VentanaPrincipal ventanaPrincipal;
	private JButton boton;
	
	public PanelDerecho(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal=ventanaPrincipal;
	
		
		
		setLayout(new BorderLayout());
		inicializar();
		agregar();
		
			}


	private void inicializar() {
		
			
		
		String[ ] columnas = new String[ ]{ "Fecha", "Hora", "Numero", "Duracion", 
				"Costo"};
		modeloTabla = new DefaultTableModel( columnas, 0 );
		tabla = new JTable( modeloTabla );
		tabla.setEnabled(false);
		
		boton = new JButton("Listo");
		boton.setEnabled(false);
		boton.setActionCommand(GestionEventos.LISTO);
		boton.addActionListener(ventanaPrincipal.getEventos());
		
	}

	
	
	public JButton getBoton() {
		return boton;
	}


	public void setBoton(JButton boton) {
		this.boton = boton;
	}


	private void agregar() {
		add( new JScrollPane( tabla ) );
		add(boton,BorderLayout.SOUTH);
		
	}


	public JTable getTabla() {
		return tabla;
	}


	public void setTabla(JTable tabla) {
		this.tabla = tabla;
	}


	public DefaultTableModel getModeloTabla() {
		return modeloTabla;
	}


	public void setModeloTabla(DefaultTableModel modeloTabla) {
		this.modeloTabla = modeloTabla;
	}

	
	
	
}
