package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import logic.GestionGrafo;

public class VentanaPrincipal extends JFrame {
	
	private PanelDibujo panelDibujo;
	private JPanel panelBotones;
	private JButton btAgregarArista;
	private JButton btGenerar;
	private GestionEventos gestionEventos;
	private VentanaMatrices ventanaMatrices;
	private GestionGrafo gestionGrafo;
	private AgregarArista agregarArista;

	public VentanaPrincipal() {

		this.setTitle("..GRAFOS..");
		this.setLayout(new BorderLayout());
		this.setBounds(200, 200, 800, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		inicializar();
		agregar();

	}

	private void inicializar() {

		gestionEventos = new GestionEventos(this);
		agregarArista = new AgregarArista(this);
		gestionGrafo = new GestionGrafo();
		ventanaMatrices = new VentanaMatrices(this);
		panelDibujo = new PanelDibujo(this);
		panelBotones = new JPanel();
		panelBotones.setLayout(new FlowLayout());

		btAgregarArista = new JButton("Agregar Arista");
		btAgregarArista.setActionCommand(GestionEventos.BT_AGREGAR_ARISTA);
		btAgregarArista.addActionListener(getGestionEventos());
		btAgregarArista.setEnabled(false);

		btGenerar = new JButton("Generar");
		btGenerar.setActionCommand(GestionEventos.BT_GENERAR);
		btGenerar.addActionListener(getGestionEventos());

	}

	public GestionEventos getGestionEventos() {
		return gestionEventos;
	}

	private void agregar() {

		panelBotones.add(btAgregarArista);
		panelBotones.add(btGenerar);

		this.add(panelDibujo, BorderLayout.CENTER);
		this.add(panelBotones, BorderLayout.SOUTH);

	}

	public static void main(String[] args) {

		VentanaPrincipal v = new VentanaPrincipal();
		v.setVisible(true);
	}

	public void btnGenerar() {

		ventanaMatrices.getTxtMatrizPesos().setText("");
		ventanaMatrices.getTxtMatrizAdyacencia().setText("");
		ventanaMatrices.getTxtMatrizIncidencia().setText("");
		ventanaMatrices.setVisible(true);
		ventanaMatrices.getLbDispSinConexion().setText("");
		ventanaMatrices.getLbDispCentral().setText("");
		ventanaMatrices.getLbDispTerminal().setText("");
		int[][] matriz = gestionGrafo.matrizIncidencia();
		ventanaMatrices.getTxtMatrizIncidencia().append("    ");
		for (int i = 0; i < gestionGrafo.getAristaGrafo().size(); i++) {
			ventanaMatrices.getTxtMatrizIncidencia().append(
					"   " + gestionGrafo.getAristaGrafo().get(i).getNombre());
		}
		ventanaMatrices.getTxtMatrizIncidencia().append("\n");
		for (int i = 0; i < gestionGrafo.getVertciGrafo().size(); i++) {
			ventanaMatrices.getTxtMatrizIncidencia().append(
					gestionGrafo.getVertciGrafo().get(i).getNombre() + "   ");
			for (int j = 0; j < gestionGrafo.getAristaGrafo().size(); j++) {
				ventanaMatrices.getTxtMatrizIncidencia().append(
						"   " + matriz[i][j]);
			}
			ventanaMatrices.getTxtMatrizIncidencia().append("\n");
		}

		int[][] matriz1 = gestionGrafo.matrizAdyacencia();

		ventanaMatrices.getTxtMatrizAdyacencia().append("    ");

		for (int i = 0; i < gestionGrafo.getVertciGrafo().size(); i++) {
			ventanaMatrices.getTxtMatrizAdyacencia().append(
					"   " + gestionGrafo.getVertciGrafo().get(i).getNombre());
		}
		ventanaMatrices.getTxtMatrizAdyacencia().append("\n");
		for (int i = 0; i < gestionGrafo.getAristaGrafo().size(); i++) {
			ventanaMatrices.getTxtMatrizAdyacencia().append(
					gestionGrafo.getAristaGrafo().get(i).getNombre() + "   ");
			for (int j = 0; j < gestionGrafo.getVertciGrafo().size(); j++) {

				ventanaMatrices.getTxtMatrizAdyacencia().append(
						"   " + matriz1[i][j]);
			}
			ventanaMatrices.getTxtMatrizAdyacencia().append("\n");
		}
		int[][] matriz2 = gestionGrafo.matrizpesos();

		ventanaMatrices.getTxtMatrizPesos().append("    ");
		for (int i = 0; i < gestionGrafo.getVertciGrafo().size(); i++) {
			ventanaMatrices.getTxtMatrizPesos().append(
					"   " + gestionGrafo.getVertciGrafo().get(i).getNombre());
		}
		ventanaMatrices.getTxtMatrizPesos().append("\n");

		for (int i = 0; i < gestionGrafo.getAristaGrafo().size(); i++) {

			ventanaMatrices.getTxtMatrizPesos().append(
					gestionGrafo.getAristaGrafo().get(i).getNombre() + "   ");

			for (int j = 0; j < gestionGrafo.getVertciGrafo().size(); j++) {

				ventanaMatrices.getTxtMatrizPesos().append(
						"   " + matriz2[i][j]);

			}
			ventanaMatrices.getTxtMatrizPesos().append("\n");
		}

		// dispositivo central
		String txtRes1 = "";
		for (int i = 0; i < gestionGrafo.dispositivoCentral().size(); i++) {

			txtRes1 = txtRes1
					+ gestionGrafo.dispositivoCentral().get(i).getNombre()
					+ ", ";

		}
		if (txtRes1.equals("")) {
			txtRes1 = "No hay dispositivos";
		}
		ventanaMatrices.getLbDispCentral().setText(txtRes1);

		// dispositivo sin conexion

		String txtRes2 = "";
		for (int i = 0; i < gestionGrafo.dSinconexion().size(); i++) {

			txtRes2 = txtRes2 + gestionGrafo.dSinconexion().get(i).getNombre()
					+ ", ";

		}
		if (txtRes2.equals("")) {
			txtRes2 = "No hay dispositivos";
		}
		ventanaMatrices.getLbDispSinConexion().setText(txtRes2);

		// dispositivo terminal

		String txtRes3 = "";
		for (int i = 0; i < gestionGrafo.dTerminal().size(); i++) {

			txtRes3 = txtRes3 + gestionGrafo.dTerminal().get(i).getNombre()
					+ ", ";

		}

		if (txtRes3.equals("")) {
			txtRes3 = "No hay dispositivos";
		}

		ventanaMatrices.getLbDispTerminal().setText(txtRes3);
	}

	public void btnAgregarArista() {
		agregarArista.setVisible(true);
		agregarArista.getBoxDesde().removeAllItems();
		agregarArista.getBoxHasta().removeAllItems();

		for (int i = 0; i < gestionGrafo.getVertciGrafo().size(); i++) {

			agregarArista.getBoxDesde().addItem(
					gestionGrafo.getVertciGrafo().get(i).getNombre());
			agregarArista.getBoxHasta().addItem(
					gestionGrafo.getVertciGrafo().get(i).getNombre());

		}
	}

	public void btnVer() {

		JOptionPane.showMessageDialog(null, "v1a2v4a4v5 \n Peso: 80");

	}

	public void crearVertice(Graphics g, int x, int y) {

		String n = JOptionPane.showInputDialog("Digite el nombre");

		if (n == null || n.equals("")) {
			JOptionPane.showMessageDialog(null, "No puede ser vacio");
		} else {

			if (gestionGrafo.buscarVertice(n) == null) {
				gestionGrafo.agregarVertice(n, x, y);

				g.drawString(n, x, y);
				g.setColor(Color.BLUE);
				g.fillOval(x, y, 30, 30);
				btAgregarArista.setEnabled(true);
			} else {
				JOptionPane.showMessageDialog(null, "Ya existe");
			}
		}
	}

	public void crearlinea(Graphics g, int x1, int y1, int x2, int y2,
			String nombre) {

		g.drawString(nombre, (x1 + x2) / 2, (y1 + y2) / 2);
		g.setColor(Color.BLUE);
		g.drawLine(x1 + 11, y1 + 20, x2 + 11, y2 + 20);

	}

	public void crearCuadrado(Graphics g, int x, int y, String nombre) {

		g.drawString(nombre, x - 28, y + 20);
		g.setColor(Color.BLUE);
		g.drawRect(x - 15, y, 30, 30);
	}

	public PanelDibujo getPanelDibujo() {
		return panelDibujo;
	}

	public void setPanelDibujo(PanelDibujo panelDibujo) {
		this.panelDibujo = panelDibujo;
	}

	public GestionGrafo getGestionGrafo() {
		return gestionGrafo;
	}

	public void setGestionGrafo(GestionGrafo gestionGrafo) {
		this.gestionGrafo = gestionGrafo;
	}

}
