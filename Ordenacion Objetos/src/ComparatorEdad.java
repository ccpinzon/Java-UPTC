import java.util.Comparator;


public class ComparatorEdad implements Comparator<Estudiante> {

	@Override
	public int compare(Estudiante estUno, Estudiante estDos) {
				
		return estUno.getEdad()-estDos.getEdad();
	}

}
