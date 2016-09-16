package logic;

import java.util.ArrayList;

public class GestionGrafo {

	ArrayList<Arista> aristaGrafo;
	ArrayList<Vertice> vertciGrafo;

	public GestionGrafo(ArrayList<Arista> aristaGrafo,
			ArrayList<Vertice> vertciGrafo) {
		super();
		this.aristaGrafo = aristaGrafo;
		this.vertciGrafo = vertciGrafo;
	}

	public GestionGrafo() {
		aristaGrafo = new ArrayList<Arista>();
		vertciGrafo = new ArrayList<Vertice>();
	}

	public ArrayList<Arista> getAristaGrafo() {
		return aristaGrafo;
	}

	public void setAristaGrafo(ArrayList<Arista> aristaGrafo) {
		this.aristaGrafo = aristaGrafo;
	}

	public ArrayList<Vertice> getVertciGrafo() {
		return vertciGrafo;
	}

	public void setVertciGrafo(ArrayList<Vertice> vertciGrafo) {
		this.vertciGrafo = vertciGrafo;
	}

	public void agregarArista(String Vini, String Vfin, String nombre, int peso) {

		Vertice verticeini = buscarVertice(Vini);
		Vertice verticefin = buscarVertice(Vfin);
		verticefin.agregarArista(new Arista(Vini, Vfin, nombre, peso));
		verticeini.agregarArista(new Arista(Vini, Vfin, nombre, peso));
		aristaGrafo.add(new Arista(Vini, Vfin, nombre, peso));
	}

	public void agregarVertice(String nombre, int posX, int posY) {
		vertciGrafo.add(new Vertice(nombre, posX, posY));
	}

	public Vertice buscarVertice(String nombre) {

		for (int i = 0; i < vertciGrafo.size(); i++) {
			if (vertciGrafo.get(i).getNombre().equals(nombre)) {
				return vertciGrafo.get(i);
			}
		}
		return null;
	}
	
	
	public Arista buscarArista(String nombre) {

		for (int i = 0; i < aristaGrafo.size(); i++) {
			if (aristaGrafo.get(i).getNombre().equals(nombre)) {
				return aristaGrafo.get(i);
			}
		}
		return null;
	}
	

	public int[][] matrizIncidencia() {

		int[][] matriz = new int[vertciGrafo.size()][aristaGrafo.size()];

		for (int i = 0; i < vertciGrafo.size(); i++) {
			for (int j = 0; j < aristaGrafo.size(); j++) {

				String nombre = aristaGrafo.get(j).getNombre();
				int cont = 0;
				for (int k = 0; k < vertciGrafo.get(i).getAristas().size(); k++) {

					if (vertciGrafo.get(i).getAristas().get(k).getNombre()
							.equals(nombre)) {
						cont++;
					}
					matriz[i][j] = (int) (cont);
				}

			}
		}
		return matriz;
	}

	public int[][] matrizAdyacencia() {
		int[][] matriz = new int[vertciGrafo.size()][vertciGrafo.size()];

		for (int i = 0; i < vertciGrafo.size(); i++) {

			String nombreini = vertciGrafo.get(i).getNombre();

			for (int j = 0; j < vertciGrafo.size(); j++) {

				String nombrefin = vertciGrafo.get(j).getNombre();
				int cont = 0;

				for (int k = 0; k < aristaGrafo.size(); k++) {

					if (aristaGrafo.get(k).getVerticeFinal().equals(nombrefin)
							&& aristaGrafo.get(k).getVerticeInicial()
									.equals(nombreini)
							|| aristaGrafo.get(k).getVerticeFinal()
									.equals(nombreini)
							&& aristaGrafo.get(k).getVerticeInicial()
									.equals(nombrefin)) {

						if (aristaGrafo.get(k).getVerticeInicial()
								.equals(aristaGrafo.get(k).getVerticeFinal())) {
							cont++;
						}
						cont++;
					}

					matriz[i][j] = (int) (cont);
				}

			}
		}
		return matriz;
	}

	public int[][] matrizpesos() {
		int[][] matriz = new int[vertciGrafo.size()][vertciGrafo.size()];

		for (int i = 0; i < vertciGrafo.size(); i++) {

			String nombreini = vertciGrafo.get(i).getNombre();

			for (int j = 0; j < vertciGrafo.size(); j++) {

				String nombrefin = vertciGrafo.get(j).getNombre();

				for (int k = 0; k < aristaGrafo.size(); k++) {

					if (aristaGrafo.get(k).getVerticeFinal().equals(nombrefin)
							&& aristaGrafo.get(k).getVerticeInicial()
									.equals(nombreini)
							|| aristaGrafo.get(k).getVerticeFinal()
									.equals(nombreini)
							&& aristaGrafo.get(k).getVerticeInicial()
									.equals(nombrefin)) {

						matriz[i][j] = (int) (aristaGrafo.get(k).getPeso());
						k = aristaGrafo.size() + 1;
					}

				}
			}
		}

		return matriz;

	}

	public ArrayList<Vertice> dispositivoCentral() {
		ArrayList<Vertice> vertice = new ArrayList<>();
		vertice.clear();
		int may = 0;
		int pos = 0;
		for (int i = 0; i < vertciGrafo.size(); i++) {
			if (vertciGrafo.get(i).getAristas().size() > may) {
				may = vertciGrafo.get(i).getAristas().size();
				pos = i;
			}
		}
		for (int i = 0; i < vertciGrafo.size(); i++) {
			if (vertciGrafo.get(i).getAristas().size() == vertciGrafo.get(pos)
					.getAristas().size()) {
				vertice.add(vertciGrafo.get(i));
			}
		}
		return vertice;
	}
	public ArrayList<Vertice> dSinconexion() {
		ArrayList<Vertice> vertice = new ArrayList<>();
		vertice.clear();

		for (int i = 0; i < vertciGrafo.size(); i++) {
			if (vertciGrafo.get(i).getAristas().size() == 0) {
				vertice.add(vertciGrafo.get(i));
			}
		}

		return vertice;
	}

	public ArrayList<Vertice> dTerminal() {
		ArrayList<Vertice> vertice = new ArrayList<>();
		vertice.clear();

		for (int i = 0; i < vertciGrafo.size(); i++) {
			if (vertciGrafo.get(i).getAristas().size() == 1) {
				vertice.add(vertciGrafo.get(i));
			}
		}

		return vertice;
	}

	@Override
	public String toString() {
		return "GestionGrafo [aristaGrafo=" + aristaGrafo + ", vertciGrafo="
				+ vertciGrafo + "]";
	}

}
