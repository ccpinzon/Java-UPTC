package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionEventos implements ActionListener {

	private VentanaPrincipal ventanaPrincipal;
	public static final String AGREGAR = "Agregar";
	public static final String BUSCAR_CODIGO = "Buscar Codigo";
	public static final String ELIMINAR = "Eliminar";

	public GestionEventos(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals(AGREGAR)) {
			ventanaPrincipal.BtAgregar();

		} else if (e.getActionCommand().equals(BUSCAR_CODIGO)) {
			ventanaPrincipal.BtBuscar();
		}

		else if (e.getActionCommand().equals(ELIMINAR)) {
			ventanaPrincipal.BtEliminar();
		}
	}

}
