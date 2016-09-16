package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class VentanaMatrices extends JFrame {

	private JPanel panelArriba;
	private JPanel panelCentro;
	private JPanel panelAbajo;
	private JPanel pn1,pn2;
	
	private JTextArea txtMatrizIncidencia;
	private JTextArea txtMatrizAdyacencia;
	private JTextArea txtMatrizPesos;
	
	
	private JLabel lb4;
	private JLabel lb5;
	private JLabel lb6;
	
	private JLabel lbDispCentral;
	private JLabel lbDispSinConexion;
	private JLabel lbDispTerminal;
	
	private JLabel lbCamino;
	private JLabel lbCamino2;
	
	private JTextField txtVertice1;
	private JTextField txtVertice2;
	
	private JButton btVer;
	
	private VentanaPrincipal ventanaPrincipal;
	
	
	
	
	public VentanaMatrices(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
		this.setTitle("..Matrices..");
		this.setBounds(200, 200, 750, 360);
		this.setSize(700, 450);
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		
		inicializar();
		agregar();
		
		
		
		
	}




	private void inicializar() {
		//ventanaPrincipal = new VentanaPrincipal();
		panelArriba = new JPanel();
		panelArriba.setLayout(new FlowLayout());
		panelArriba.setForeground(Color.WHITE);
		
		txtMatrizIncidencia = new JTextArea(5,10);
		txtMatrizIncidencia.setBackground(Color.BLACK);
		txtMatrizIncidencia.setBorder(new TitledBorder(null, "Matriz De Incidencia", 2, 2, null, Color.WHITE));
		txtMatrizIncidencia.setForeground(Color.WHITE);
		txtMatrizIncidencia.setFont(new Font("Andalus", 0, 24));
	
		
		txtMatrizAdyacencia = new JTextArea(5,10);
		txtMatrizAdyacencia.setBorder(new TitledBorder(null, "Matriz De Adyacencia", 2, 2, null, Color.WHITE));
		txtMatrizAdyacencia.setBackground(Color.BLACK);
		txtMatrizAdyacencia.setForeground(Color.WHITE);
		txtMatrizAdyacencia.setFont(new Font("Andalus", 0, 24));

		


		txtMatrizPesos = new JTextArea(5,10);
		txtMatrizPesos.setBorder(new TitledBorder(null, "Matriz De Pesos", 2, 2, null, Color.WHITE));
		txtMatrizPesos.setBackground(Color.BLACK);
		txtMatrizPesos.setForeground(Color.WHITE);
		txtMatrizPesos.setFont(new Font("Andalus", 0, 24));


		
		panelCentro = new JPanel();
		panelCentro.setLayout(new FlowLayout());
		
		pn1 = new JPanel();
		pn1.setLayout(new BoxLayout(pn1, BoxLayout.Y_AXIS));
		pn2 = new JPanel();
		pn2.setLayout(new BoxLayout(pn2, BoxLayout.Y_AXIS));


		lb4 = new JLabel("Dispositivo Central ");
		lb5 = new JLabel("Dispositivo sin conexion ");
		lb6 = new JLabel("Dispositivo terminal ");
		
		lbDispCentral = new JLabel();
		lbDispSinConexion = new JLabel();
		lbDispTerminal = new JLabel();
		
		panelAbajo = new JPanel();
		panelAbajo.setLayout(new FlowLayout());
		panelAbajo.setBorder(new TitledBorder(""));
		
		lbCamino = new JLabel("El camino entre el vertice: ");
		txtVertice1 = new JTextField(2);
		lbCamino2 = new JLabel("y el vertice: ");
		txtVertice2 = new JTextField(2);
		btVer = new JButton("VER");
		btVer.setActionCommand(GestionEventos.BT_VER);
		btVer.addActionListener(ventanaPrincipal.getGestionEventos());

		



		
	}




	private void agregar() {
		
		panelArriba.add(new JScrollPane(txtMatrizIncidencia));
		panelArriba.add(new JScrollPane(txtMatrizAdyacencia));
		panelArriba.add(new JScrollPane(txtMatrizPesos));
		
		pn1.add(lb4);
		pn1.add(lb5);
		pn1.add(lb6);
		
		pn2.add(lbDispCentral);
		pn2.add(lbDispSinConexion);
		pn2.add(lbDispTerminal);
		
		
		panelCentro.add(pn1);
		panelCentro.add(pn2);
		
		panelAbajo.add(lbCamino);
		panelAbajo.add(txtVertice1);
		panelAbajo.add(lbCamino2);
		panelAbajo.add(txtVertice2);
		panelAbajo.add(btVer);
		
		this.add(panelArriba);
		this.add(panelCentro);
		this.add(panelAbajo);
		
	}
	public JTextArea getTxtMatrizIncidencia() {
		return txtMatrizIncidencia;
	}




	public void setTxtMatrizIncidencia(JTextArea txtMatrizIncidencia) {
		this.txtMatrizIncidencia = txtMatrizIncidencia;
	}




	public JTextArea getTxtMatrizAdyacencia() {
		return txtMatrizAdyacencia;
	}




	public void setTxtMatrizAdyacencia(JTextArea txtMatrizAdyacencia) {
		this.txtMatrizAdyacencia = txtMatrizAdyacencia;
	}




	public JTextArea getTxtMatrizPesos() {
		return txtMatrizPesos;
	}




	public void setTxtMatrizPesos(JTextArea txtMatrizPesos) {
		this.txtMatrizPesos = txtMatrizPesos;
	}




	public JTextField getTxtVertice1() {
		return txtVertice1;
	}




	public void setTxtVertice1(JTextField txtVertice1) {
		this.txtVertice1 = txtVertice1;
	}




	public JTextField getTxtVertice2() {
		return txtVertice2;
	}




	public void setTxtVertice2(JTextField txtVertice2) {
		this.txtVertice2 = txtVertice2;
	}




	public JLabel getLbDispCentral() {
		return lbDispCentral;
	}




	public void setLbDispCentral(JLabel lbDispCentral) {
		this.lbDispCentral = lbDispCentral;
	}




	public JLabel getLbDispSinConexion() {
		return lbDispSinConexion;
	}




	public void setLbDispSinConexion(JLabel lbDispSinConexion) {
		this.lbDispSinConexion = lbDispSinConexion;
	}




	public JLabel getLbDispTerminal() {
		return lbDispTerminal;
	}




	public void setLbDispTerminal(JLabel lbDispTerminal) {
		this.lbDispTerminal = lbDispTerminal;
	}
	
}
