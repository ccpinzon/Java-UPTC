package GUI;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VerLista extends JDialog{
	
	private JTable tabla;
	private DefaultTableModel modeloTabla;
	private VentanaPrincipal ventanaPrincipal;
	private JButton boton;
	
	
	public VerLista(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal=ventanaPrincipal;
	
		setTitle("Listado");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setIconImage(new ImageIcon(("recursos/imagenes/Icono.png")).getImage());
		setResizable(false);
		setLayout(new BorderLayout());
		
		String[ ] columnas = new String[ ]{ "Fecha", "Hora", "Numero", "Duracion", 
		"Costo"};
         modeloTabla = new DefaultTableModel( columnas, 0 );
          tabla = new JTable( modeloTabla );
           tabla.setEnabled(false);

        boton = new JButton("Listo");
        
       boton.setActionCommand(GestionEventos.LISTOVER);
       boton.addActionListener(ventanaPrincipal.getEventos());
        
        add(new JScrollPane(tabla),BorderLayout.CENTER);
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


	public VentanaPrincipal getVentanaPrincipal() {
		return ventanaPrincipal;
	}


	public void setVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}


	public JButton getBoton() {
		return boton;
	}


	public void setBoton(JButton boton) {
		this.boton = boton;
	}
	

}
