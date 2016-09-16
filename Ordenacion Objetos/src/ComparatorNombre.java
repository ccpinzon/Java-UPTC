import java.util.Comparator;


public class ComparatorNombre implements Comparator<Estudiante> {

	@Override
	public int compare(Estudiante est1, Estudiante est2) {
		
		
		return est1.getNombres().length()-est2.getNombres().length();
	}

}
