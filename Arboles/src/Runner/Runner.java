package Runner;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import logic.ArbolBinario;
import logic.GestionProducto;
import logic.NodoArbol;
import logic.Producto;

public class Runner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArbolBinario arbol = new ArbolBinario();
		GestionProducto gestion = new GestionProducto();

		gestion.agregarProducto("35", "jugo", 2000, 20);
		gestion.agregarProducto("50", "gaseosa", 500, 30);
		gestion.agregarProducto("08", "agua", 1000, 50);
		gestion.agregarProducto("12", "pan", 200, 100);
		gestion.agregarProducto("69", "galletas", 700, 10);
		gestion.agregarProducto("84", "chocorramo", 800, 5);
		gestion.agregarProducto("25", "gala", 1200, 40);
		gestion.agregarProducto("75", "gala", 1200, 40);
		gestion.agregarProducto("93", "gala", 1200, 40);
		gestion.agregarProducto("16", "gala", 1200, 40);

		
		
		String codBusq = JOptionPane.showInputDialog("elimine");

	 gestion.eliminarProducto(String.valueOf(codBusq));
		
		ArrayList<Producto> pro = gestion.listarProductosPreorden();
		ArrayList<Producto> pro1 = gestion.listarProductosInorden();
		ArrayList<Producto> pro2 = gestion.listarProductosPostorden();

		if (pro != null) {
			System.out.println("Listar Productos Preorden");
			for (int i = 0; i < pro.size(); i++) {

				System.out.print(pro.get(i) + "\n");
			}
		}

		if (pro1 != null) {
			System.out.println("inorden");

			for (int i = 0; i < pro1.size(); i++) {
				System.out.print(pro1.get(i) + "\n");

			}
		}

		if (pro2 != null) {
			System.out.println("postorden");

			for (int i = 0; i < pro2.size(); i++) {
				System.out.print(pro2.get(i) + "\n");

			}
		}

		// BUSCAR

//		System.out.println("Ingrese codigo a buscar");
//
//		int codBusq = sc.nextInt();
//
//		NodoArbol result = gestion.buscarProducto(String.valueOf(codBusq));
//		System.out.println(result.getProducto());
//		System.out.println(arbol.getGradoNodo(result));


		// ELIMINAR

		
//		String codBusq = JOptionPane.showInputDialog("elimine");
//
//	 gestion.eliminarProducto(String.valueOf(codBusq));
	 


		// try {
		// System.out.println(arbol.listarAmplitudRaizHojas());
		// } catch (Exception e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

	}
}
