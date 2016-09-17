package logic;
public class Lista {
	private NodoLista cabeza;
	public Lista() {
		cabeza = null;
	}
	
	public boolean listaVacia() {
		return cabeza == null;
	}
	public void agregarPila(NodoArbol nodo) {
		NodoLista nuevo = new NodoLista();
		nuevo.setInfo(nodo);
		if(listaVacia()){
			cabeza = nuevo;
		}else{
			nuevo.setNext(cabeza);
			cabeza = nuevo;
		}
	}
	public NodoArbol sacarPila()  {
		if (!listaVacia()) {
			NodoLista aux = cabeza;
			cabeza = aux.getNext();
			return aux.getInfo();
		} else {
			return null;
		}
	}
	public void agregarCola(NodoArbol nodo) {
		NodoLista nuevo = new NodoLista();
		nuevo.setInfo(nodo);
		if (!listaVacia()){
			NodoLista aux=cabeza;
			while (aux.getNext()!=null) {
				aux=aux.getNext();
			}
			aux.setNext(nuevo);
		}else{
			cabeza=nuevo;
		}
	}
	public NodoArbol sacarCola() {
		if (!listaVacia()) {
			NodoLista aux = cabeza;
			cabeza = aux.getNext();
			return aux.getInfo();
		} else {
			return null;
		}
	}

	@Override
	public String toString() {
		return "cabeza=" + cabeza + "]";
	}
	
	
}