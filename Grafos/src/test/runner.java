package test;

import logic.GestionGrafo;

public class runner {
	public static void main(String[] args) {
		GestionGrafo grafo = new GestionGrafo();

		grafo.agregarVertice("v1", 0, 0);
		grafo.agregarVertice("v2", 0, 0);
		grafo.agregarVertice("v3", 0, 0);
		grafo.agregarVertice("v4", 0, 0);
		grafo.agregarVertice("v5", 0, 0);

		grafo.agregarArista("v1", "v2", "a1", 10);
		grafo.agregarArista("v2", "v1", "a7", 5);
		grafo.agregarArista("v2", "v3", "a2", 3);
		grafo.agregarArista("v4", "v3", "a3", 2);
		grafo.agregarArista("v1", "v4", "a4", 12);
		grafo.agregarArista("v1", "v3", "a5", 15);
		grafo.agregarArista("v4", "v4", "a6", 6);


		int[][] matriz = grafo.matrizpesos();
		System.out.print("    ");
		for (int i = 0; i < grafo.getVertciGrafo().size(); i++) {
			System.out.print("  " + grafo.getVertciGrafo().get(i).getNombre());
		}
		System.out.println();
		System.out.println();
		
		for (int i = 0; i < grafo.getVertciGrafo().size(); i++) {
			System.out.print(grafo.getVertciGrafo().get(i).getNombre() + "  ");
			for (int j = 0; j < grafo.getVertciGrafo().size(); j++) {

				System.out.print("   " + matriz[i][j]);
			}
			System.out.println();
		}
		for (int i = 0; i < grafo.dTerminal().size(); i++) {
			System.out.println(grafo.dTerminal().get(i).getNombre());
		}
		//CopyRigth@Pros:copias xD
	}
}