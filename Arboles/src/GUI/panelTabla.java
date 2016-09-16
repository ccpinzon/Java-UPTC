package GUI;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class panelTabla extends JPanel {
	private DefaultTableModel modeloTablaPeliculas;

	private JTable tablaProductos;
	private VentanaPrincipal ventanaPrincipal;

	public panelTabla(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
		this.setLayout(new FlowLayout());
		initComponets();
		agrComponets();
	}

	private void initComponets() {
		// Tabla1
		String[] columnas = new String[] { "Codigo", "Descripcion", "Valor",
				"Existencias" };
		modeloTablaPeliculas = new DefaultTableModel(columnas, 10);
		tablaProductos = new JTable(modeloTablaPeliculas);
		// tablaPeliculas.setEnabled(false);
		tablaProductos.setPreferredScrollableViewportSize(new Dimension(400,
				100));
	}

	private void agrComponets() {
this.add(new JScrollPane(tablaProductos));
	}
}
