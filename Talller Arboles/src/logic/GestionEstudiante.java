package logic;

import java.util.ArrayList;

public class GestionEstudiante {
	private ArbolBinario arbolBinario;
	private NodoArbol resBus;

	public GestionEstudiante() {
		arbolBinario = new ArbolBinario();
		
	}

	public boolean agregarEstudiante(String codigo, String nombre,
			int edad, int semestre) {
		Estudiante estudiante= null;
		if (!arbolBinario.arbolVacio()) {
			NodoArbol nodoProducto = arbolBinario.buscarNodo(codigo);
			if (estudiante == null) {
				estudiante = new Estudiante(codigo, nombre, edad, semestre);
				arbolBinario.agregarNodo(estudiante);
				return true;
			} else {
				return false;
			}
		}
		estudiante = new Estudiante(codigo, nombre, edad, semestre);
		arbolBinario.agregarNodo(estudiante);
		return true;
	}

	public NodoArbol buscarEstudiante(String codigo) {
		NodoArbol resBus = arbolBinario.buscarNodo(codigo);
		return resBus;
	}

	public ArrayList<Estudiante> listarEstudiantesPreorden() {

		if (!arbolBinario.arbolVacio()) {
			Lista colaEstudiantes = arbolBinario.listarPreorden(arbolBinario
					.getRaiz());
			ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
			NodoArbol nodo;
			while ((nodo = colaEstudiantes.sacarCola()) != null) {
				estudiantes.add(nodo.getEstudiante());
			}
			return estudiantes;
		}
		return null;
	}

	public ArrayList<Estudiante> listarEstudiantesInorden() {

		if (!arbolBinario.arbolVacio()) {
			Lista colaEstudiantes= arbolBinario.listarInorden(arbolBinario
					.getRaiz());
			ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
			NodoArbol nodo;
			while ((nodo = colaEstudiantes.sacarCola()) != null) {
				estudiantes.add(nodo.getEstudiante());
			}
			return estudiantes;
		}
		return null;
	}

	public ArrayList<Estudiante> listarEstudiantesPostorden() {

		if (!arbolBinario.arbolVacio()) {
			Lista colaEstudiantes = arbolBinario.listarPostorden(arbolBinario
					.getRaiz());
			ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
			NodoArbol nodo;
			while ((nodo = colaEstudiantes.sacarCola()) != null) {
				estudiantes.add(nodo.getEstudiante());
			}
			return estudiantes;
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

	public boolean eliminarEstudiante(String codigo) {
		
		
		NodoArbol nArbol = arbolBinario.buscarNodo(codigo);

		byte grado = arbolBinario.getGradoNodo(nArbol);
		
		if (grado == 0){
			arbolBinario.eliminarHoja(nArbol);
			
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

	public ArrayList<Estudiante> listarAmplitudRaizHojas() throws Exception {
		if (!arbolBinario.arbolVacio()) {
			ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
			Lista lista = arbolBinario.listarAmplitudRaizHojas();
			NodoArbol nodo = null;
			while ((nodo = lista.sacarCola()) != null) {
				estudiantes.add(nodo.getEstudiante());
			}
			return estudiantes;
		}
		throw new Exception("Arbol vacio");
	}
	public ArrayList<Estudiante> listarAmplitudHojasRaiz() throws Exception {
		if (!arbolBinario.arbolVacio()) {
			ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
			Lista lista = arbolBinario.listarAmplitudHojasRaiz();
			NodoArbol nodo = null;
			while ((nodo = lista.sacarPila()) != null) {
				estudiantes.add(nodo.getEstudiante());
			}
			return estudiantes;
		}
		throw new Exception("Arbol vacio");
	}
}
