package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionEventos implements ActionListener {

	private VentanaPrincipal ventanaPrincipal;
	public static final String AGREGAR = "Agregar";
	public static final String BUSCAR_CODIGO = "Buscar Codigo";
	public static final String ELIMINAR = "Eliminar";
	public static final String BUSCAR = "Buscar";
	public static final String INORDEN = "Inorden";
	public static final String PREORDEN = "Preorden";
	public static final String POSTORDEN = "Postorden";
	public static final String RAIZHOJAS = "raizhojas";
	public static final String HOJASRAIZ = "hojasraiz";
	public static final String ELIMINARCOD = "eliminar codigo";
	
	
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
		
		else if (e.getActionCommand().equals(BUSCAR)) {
			ventanaPrincipal.BtBuscarCodigo();
		}
		else if (e.getActionCommand().equals(INORDEN)) {
			ventanaPrincipal.Rinorden();
		}
		else if (e.getActionCommand().equals(PREORDEN)) {
			ventanaPrincipal.Rpreorden();
		}
		else if (e.getActionCommand().equals(POSTORDEN)) {
			ventanaPrincipal.Rpostorden();
		}
		else if (e.getActionCommand().equals(RAIZHOJAS)) {
			ventanaPrincipal.Rraizhojas();
		}
		else if (e.getActionCommand().equals(HOJASRAIZ)) {
			ventanaPrincipal.Rhojasraiz();
		}
		else if (e.getActionCommand().equals(ELIMINARCOD)) {
			ventanaPrincipal.EliminarCodigo();
		}
	}

}
