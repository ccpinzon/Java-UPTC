package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class panelTabla extends JPanel {

	private VentanaPrincipal ventanaPrincipal;
	private DefaultTableModel modeloTabla;
	private JTable tablaEstudanites;

	public panelTabla(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
		this.setLayout(new FlowLayout());
		initComponets();
		agrComponets();
	}

	private void initComponets() {
		// Tabla1
		String[] columnas = new String[] { "Codigo", "Nombre", "Edad",
				"n� Semestre" };
		modeloTabla = new DefaultTableModel(columnas, 10);

		tablaEstudanites = new JTable(modeloTabla);
		tablaEstudanites.setEnabled(false);
		tablaEstudanites.setPreferredScrollableViewportSize(new Dimension(400,
				100));
	}

	private void agrComponets() {
		this.add(new JScrollPane(tablaEstudanites));
	}

	public DefaultTableModel getModeloTabla() {
		return modeloTabla;
	}

	public void setModeloTabla(DefaultTableModel modeloTabla) {
		this.modeloTabla = modeloTabla;
	}

	public JTable getTablaEstudanites() {
		return tablaEstudanites;
	}

	public void setTablaEstudanites(JTable tablaEstudanites) {
		this.tablaEstudanites = tablaEstudanites;
	}

}
