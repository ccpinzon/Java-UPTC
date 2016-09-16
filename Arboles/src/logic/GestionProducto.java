package logic;

import java.util.ArrayList;

public class GestionProducto {
	private ArbolBinario arbolBinario;
	private NodoArbol resBus;

	public GestionProducto() {
		arbolBinario = new ArbolBinario();
		
	}

	public boolean agregarProducto(String codigo, String descripcion,
			double valor, int cantidad) {
		Producto producto = null;
		if (!arbolBinario.arbolVacio()) {
			NodoArbol nodoProducto = arbolBinario.buscarNodo(codigo);
			if (producto == null) {
				producto = new Producto(codigo, descripcion, valor, cantidad);
				arbolBinario.agregarNodo(producto);
				return true;
			} else {
				return false;
			}
		}
		producto = new Producto(codigo, descripcion, valor, cantidad);
		arbolBinario.agregarNodo(producto);
		return true;
	}

	public NodoArbol buscarProducto(String codigo) {
		NodoArbol resBus = arbolBinario.buscarNodo(codigo);
		return resBus;
	}

	public ArrayList<Producto> listarProductosPreorden() {

		if (!arbolBinario.arbolVacio()) {
			Lista colaProductos = arbolBinario.listarPreorden(arbolBinario
					.getRaiz());
			ArrayList<Producto> productos = new ArrayList<Producto>();
			NodoArbol nodo;
			while ((nodo = colaProductos.sacarCola()) != null) {
				productos.add(nodo.getProducto());
			}
			return productos;
		}
		return null;
	}

	public ArrayList<Producto> listarProductosInorden() {

		if (!arbolBinario.arbolVacio()) {
			Lista colaProductos = arbolBinario.listarInorden(arbolBinario
					.getRaiz());
			ArrayList<Producto> productos = new ArrayList<Producto>();
			NodoArbol nodo;
			while ((nodo = colaProductos.sacarCola()) != null) {
				productos.add(nodo.getProducto());
			}
			return productos;
		}
		return null;
	}

	public ArrayList<Producto> listarProductosPostorden() {

		if (!arbolBinario.arbolVacio()) {
			Lista colaProductos = arbolBinario.listarPostorden(arbolBinario
					.getRaiz());
			ArrayList<Producto> productos = new ArrayList<Producto>();
			NodoArbol nodo;
			while ((nodo = colaProductos.sacarCola()) != null) {
				productos.add(nodo.getProducto());
			}
			return productos;
		}
		return null;
	}
	
	public byte numeroHijos(NodoArbol nodo){
		byte grado=arbolBinario.getGradoNodo(resBus);
		return grado;
	}
	public NodoArbol padre(NodoArbol nodo){
		NodoArbol padreNodo=arbolBinario.buscarPadre(resBus);
		return padreNodo;
	}

	public boolean eliminarProducto(String codigo) {
		
		
		NodoArbol nArbol = arbolBinario.buscarNodo(codigo);

		byte grado = arbolBinario.getGradoNodo(nArbol);
		
		if (grado == 0){
			System.out.println("Paila tiene grado 0 no hay metodo");
			return true;
		}
		else if (grado==1){
			arbolBinario.eliminarNodoConHijo(nArbol);
			return true;
			
		}
		
		else if (grado==2){
			arbolBinario.eliminarNodoConHijos(nArbol);
			return true;
		}
		System.out.println("xd");
	
		return false;

	}

	public ArrayList<Producto> listarAmplitudRaizHojas() throws Exception {
		if (!arbolBinario.arbolVacio()) {
			ArrayList<Producto> productos = new ArrayList<Producto>();
			Lista lista = arbolBinario.listarAmplitudRaizHojas();
			NodoArbol nodo = null;
			while ((nodo = lista.sacarCola()) != null) {
				productos.add(nodo.getProducto());
			}
			return productos;
		}
		throw new Exception("Arbol vacio");
	}

}
