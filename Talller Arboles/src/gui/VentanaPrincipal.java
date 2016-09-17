package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

import logic.ArbolBinario;
import logic.Estudiante;
import logic.GestionEstudiante;
import logic.NodoArbol;

public class VentanaPrincipal extends JFrame {

	private panelTabla pTabla;
	private panelRadios pRadios;
	private panelBotones pBotones;
	private JPanel panelIzquierdo;
	private GestionEventos gestionEventos;
	private Buscador VBuscador;
	private GestionEstudiante gestion;
	private Eliminador VEliminador;
	private ArbolBinario arbol;
	private NodoArbol resBusca;

	public VentanaPrincipal() {

		this.setLayout(new FlowLayout());
		this.setTitle("GESTION DE ESTUDIANTES ");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(600, 400);
		this.setResizable(false);
		initComponets();
		agrComponets();
	}

	private void initComponets() {

		gestionEventos = new GestionEventos(this);
		pTabla = new panelTabla(this);
		VBuscador = new Buscador(this);
		VEliminador = new Eliminador(this);
		arbol = new ArbolBinario();
		pRadios = new panelRadios(this);
		pRadios.setBorder(new TitledBorder("LISTAR Por :"));
		gestion = new GestionEstudiante();
		pBotones = new panelBotones(this);
		pBotones.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
		panelIzquierdo = new JPanel();
		panelIzquierdo.setBorder(new TitledBorder("Estudiantes: "));
		panelIzquierdo.setLayout(new GridLayout(2, 1));
		
		SoloNumeros(pBotones.getTxCod());
		SoloNumeros(pBotones.gettxEdad());
		SoloNumeros(pBotones.gettxSemestre());
		

	}

	private void agrComponets() {
		panelIzquierdo.add(pTabla);
		panelIzquierdo.add(pBotones);

		this.add(panelIzquierdo);
		this.add(pRadios);

	}

	public GestionEventos getGestionEventos() {
		return gestionEventos;
	}

	public panelTabla getpTabla() {
		return pTabla;
	}

	public void setpTabla(panelTabla pTabla) {
		this.pTabla = pTabla;
	}

	public panelRadios getpRadios() {
		return pRadios;
	}

	public void setpRadios(panelRadios pRadios) {
		this.pRadios = pRadios;
	}

	public panelBotones getpBotones() {
		return pBotones;
	}

	public void setpBotones(panelBotones pBotones) {
		this.pBotones = pBotones;
	}

	public JPanel getPanelIzquierdo() {
		return panelIzquierdo;
	}

	public void setPanelIzquierdo(JPanel panelIzquierdo) {
		this.panelIzquierdo = panelIzquierdo;
	}

	public Buscador getVBuscador() {
		return VBuscador;
	}

	public void setVBuscador(Buscador vBuscador) {
		VBuscador = vBuscador;
	}

	public void setGestionEventos(GestionEventos gestionEventos) {
		this.gestionEventos = gestionEventos;
	}

	public static void main(String[] args) {
		VentanaPrincipal v = new VentanaPrincipal();
		v.setVisible(true);

	}

	public void BtAgregar() {
		
		if (pBotones.getTxCod().getText().equals("")
				|| pBotones.gettxSemestre().getText().equals("")
				|| pBotones.gettxNombre().equals("")
				|| pBotones.gettxEdad().getText().equals("")) {
			JOptionPane.showMessageDialog(null,
					"Por favor llene todos los campos", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else {
			String cod = pBotones.getTxCod().getText();
			String nom = pBotones.gettxNombre().getText();
			int edad = Integer.parseInt(pBotones.gettxEdad().getText());
			int sem = Integer.parseInt(pBotones.gettxSemestre().getText());

			double valorEst = Double.parseDouble(cod);
			resBusca = gestion.buscarEstudiante(cod);
			if (resBusca == null) {
				gestion.agregarEstudiante(cod, nom, edad, sem);
			} else {
				JOptionPane.showMessageDialog(null, "ya existe", "Error",
						JOptionPane.ERROR_MESSAGE);

			}

			pBotones.getTxCod().setText("");
			pBotones.gettxEdad().setText("");
			pBotones.gettxNombre().setText("");
			pBotones.gettxSemestre().setText("");

			listo();
			pRadios.getRadioInOrden().setSelected(true);
			llenarTablaInorden();
		}

	}

	public void llenarTablaHojasRaiz() throws Exception {
		listo();

		ArrayList<Estudiante> estudianteshojasRaiz = gestion
				.listarAmplitudHojasRaiz();
		if (estudianteshojasRaiz != null) {
			for (int i = 0; i < estudianteshojasRaiz.size(); i++) {

				String cod = estudianteshojasRaiz.get(i).getCodigo();
				String nom = estudianteshojasRaiz.get(i).getNombre();
				String edad = String.valueOf(estudianteshojasRaiz.get(i)
						.getEdad());
				String sem = String.valueOf(estudianteshojasRaiz.get(i)
						.getSemestre());
				Object co[] = { cod, nom, edad, sem };

				pTabla.getModeloTabla().insertRow(i, co);

			}

		}

	}

	public void llenarTablaRaizhojas() throws Exception {
		listo();

		ArrayList<Estudiante> estudiantesRaizhojas = gestion
				.listarAmplitudRaizHojas();
		if (estudiantesRaizhojas != null) {
			for (int i = 0; i < estudiantesRaizhojas.size(); i++) {

				String cod = estudiantesRaizhojas.get(i).getCodigo();
				String nom = estudiantesRaizhojas.get(i).getNombre();
				String edad = String.valueOf(estudiantesRaizhojas.get(i)
						.getEdad());
				String sem = String.valueOf(estudiantesRaizhojas.get(i)
						.getSemestre());
				Object co[] = { cod, nom, edad, sem };

				pTabla.getModeloTabla().insertRow(i, co);

			}

		}

	}

	public void llenarTablaInorden() {
		listo();
		ArrayList<Estudiante> estudiantesInroden = gestion
				.listarEstudiantesInorden();
		if (estudiantesInroden != null) {
			for (int i = 0; i < estudiantesInroden.size(); i++) {

				String cod = estudiantesInroden.get(i).getCodigo();
				String nom = estudiantesInroden.get(i).getNombre();
				String edad = String.valueOf(estudiantesInroden.get(i)
						.getEdad());
				String sem = String.valueOf(estudiantesInroden.get(i)
						.getSemestre());
				Object co[] = { cod, nom, edad, sem };

				pTabla.getModeloTabla().insertRow(i, co);

			}

		}

	}

	public void llenarTablaPreorden() {
		listo();
		ArrayList<Estudiante> estudiantesPreorden = gestion
				.listarEstudiantesPreorden();
		if (estudiantesPreorden != null) {

			for (int i = 0; i < estudiantesPreorden.size(); i++) {
				String cod = estudiantesPreorden.get(i).getCodigo();
				String nom = estudiantesPreorden.get(i).getNombre();
				String edad = String.valueOf(estudiantesPreorden.get(i)
						.getEdad());
				String sem = String.valueOf(estudiantesPreorden.get(i)
						.getSemestre());
				Object co[] = { cod, nom, edad, sem };
				pTabla.getModeloTabla().insertRow(i, co);
			}

		}

	}

	public void llenarTablaPostorden() {
		listo();
		ArrayList<Estudiante> estudiantesPostorden = gestion
				.listarEstudiantesPostorden();
		if (estudiantesPostorden != null) {
			for (int i = 0; i < estudiantesPostorden.size(); i++) {
				String cod = estudiantesPostorden.get(i).getCodigo();
				String nom = estudiantesPostorden.get(i).getNombre();
				String edad = String.valueOf(estudiantesPostorden.get(i)
						.getEdad());
				String sem = String.valueOf(estudiantesPostorden.get(i)
						.getSemestre());
				Object co[] = { cod, nom, edad, sem };
				pTabla.getModeloTabla().insertRow(i, co);

			}
		}
	}

	public void listo() {

		while (pTabla.getTablaEstudanites().getRowCount() != 0) {
			pTabla.getModeloTabla().removeRow(0);
		}
	}

	public void BtBuscar() {
		VBuscador.setVisible(true);
		VBuscador.setResizable(false);

	}

	public void BtEliminar() {
		VEliminador.setVisible(true);
		VBuscador.setResizable(false);

	}

	public void BtBuscarCodigo() {

		if (VBuscador.getTxBuscarCodigo().getText().equals("")) {
			JOptionPane.showMessageDialog(null,
					"Por favor llene todos los campos", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else {

			
			String resbuscadr1 = VBuscador.getTxBuscarCodigo().getText();

			resBusca = gestion.buscarEstudiante(resbuscadr1);
			if (resBusca != null) {

				
				gestion.buscarEstudiante(resbuscadr1);
				JOptionPane.showMessageDialog(null, resBusca.getEstudiante()
				+ "\nGrado: " + arbol.getGradoNodo(resBusca));

			} else {
				JOptionPane.showMessageDialog(null, "no existe", "Error",
						JOptionPane.ERROR_MESSAGE);

			}

//			String resBusq = VBuscador.getTxBuscarCodigo().getText();
//			NodoArbol result = gestion.buscarEstudiante(resBusq);
//
//			gestion.buscarEstudiante(resBusq);
//
//			JOptionPane.showMessageDialog(null, result.getEstudiante()
//					+ "\nGrado: " + arbol.getGradoNodo(result));

			VBuscador.getTxBuscarCodigo().setText("");

		}

	}

	public void EliminarCodigo() {
		if (VEliminador.getTxBuscarEliminar().getText().equals("")) {
			JOptionPane.showMessageDialog(null,
					"Por favor llene todos los campos", "Error",
					JOptionPane.ERROR_MESSAGE);
		} else {

			String resEliminar = VEliminador.getTxBuscarEliminar().getText();

			resBusca = gestion.buscarEstudiante(resEliminar);
			if (resBusca != null) {

				listo();
				gestion.eliminarEstudiante(resEliminar);
				llenarTablaInorden();

			} else {
				JOptionPane.showMessageDialog(null, "no existe", "Error",
						JOptionPane.ERROR_MESSAGE);

			}

			VEliminador.getTxBuscarEliminar().setText("");
			VEliminador.dispose();
		}
	}

	public void Rinorden() {
		listo();
		llenarTablaInorden();

	}

	public void Rpreorden() {
		listo();
		llenarTablaPreorden();
	}

	public void Rpostorden() {
		listo();
		llenarTablaPostorden();

	}

	public void Rraizhojas() {
		listo();
		try {
			llenarTablaRaizhojas();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
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
	

	public void Rhojasraiz() {
		listo();
		try {
			llenarTablaHojasRaiz();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
