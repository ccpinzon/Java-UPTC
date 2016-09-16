package logic;

import javax.swing.JOptionPane;

public class Runner {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		
		ListaSencilla listaDesordenada = new ListaSencilla("lista desordenada");
		
		listaDesordenada.agregarFinal("2215", "tv LCD", 55600, 22);
		listaDesordenada.agregarPrincipio("2216", "dvd Sony", 5500, 40);
		listaDesordenada.agregarPrincipio("2117", "HP-PC", 6660, 16);
		
		
		
		try {
			System.out.println(listaDesordenada.listarLista());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("1".compareTo("2"));
		String codigo = JOptionPane.showInputDialog("codigo a buscar");
		Nodo nodo = listaDesordenada.BuscarNodoCodigo(codigo);
		if (nodo != null){
			System.out.println(nodo.getProducto());
		}
		else 
			System.out.println("no existe");
		
		
		String desc = JOptionPane.showInputDialog("eliminar");
		listaDesordenada.eliminarNodo(desc);
		
		System.out.println("\n"+listaDesordenada.listarLista());

	}
	
}
