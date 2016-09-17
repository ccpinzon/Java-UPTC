package logic;



public class ArbolBinario {
	private NodoArbol nodoArbol;
	private NodoArbol raiz;
	private Lista lista;

	public ArbolBinario() {
		nodoArbol = new NodoArbol();
		lista = new Lista();
	}

	public void agregarNodo(Estudiante estudiante) {
		NodoArbol nuevo = new NodoArbol();
		nuevo.setEstudiante(estudiante);
		if (arbolVacio()) {
			raiz = nuevo;
		} else {
			NodoArbol aux = new NodoArbol();
			aux = raiz;
			NodoArbol ant = new NodoArbol();
			ant = null;
			while (aux != null) {
				ant = aux;
				if (aux.getEstudiante().getCodigo()
						.compareTo(estudiante.getCodigo()) > 0) {
					aux = aux.getLeft();
				} else {
					aux = aux.getRigth();
				}
			}
			if (ant.getEstudiante().getCodigo().compareTo(estudiante.getCodigo()) > 0) {
				ant.setLeft(nuevo);
			} else {
				ant.setRigth(nuevo);
			}
		}
	}

	public boolean arbolVacio() {

		return raiz == null;

	}

	public NodoArbol buscarNodo(String codigo) {
		NodoArbol aux = raiz;
		while (aux != null) {
			if (aux.getEstudiante().getCodigo().equals(codigo)) {
				return aux;
			}
			if (aux.getEstudiante().getCodigo().compareTo(codigo) > 0) {
				aux = aux.getLeft();
			} else {
				aux = aux.getRigth();
			}
		}
		return null;
	}

	public int calcularProfundidad() {

		return 0;
	}

	public int calcularAlturaNodo(NodoArbol a) {
		return 0;

	}

	public byte getGradoNodo(NodoArbol nodo) {
		if(nodo.getLeft()==null && nodo.getRigth()==null){
			return 0;
		}else if(nodo.getLeft()!=null && nodo.getRigth()!=null){
			return 2;
		}
		return 1;
	}
	public Lista  listarInorden(NodoArbol nodo) {
		if (nodo == null) {
			return lista;
		} else {
			
			listarInorden(nodo.getLeft());
			lista.agregarCola(nodo);
			listarInorden(nodo.getRigth());
		}
		return lista;

	}

	
	//nodo por raiz 
	
	public Lista listarPreorden(NodoArbol nodo) {
		if (nodo == null) {
			return lista;
		} else {
			lista.agregarCola(nodo);
			listarPreorden(nodo.getLeft());
			listarPreorden(nodo.getRigth());
		}
		return lista;

	}

	public Lista listarPostorden(NodoArbol nodo) {
		if (nodo == null) {
			return lista;
		} else {
			
			listarPostorden(nodo.getLeft());
			listarPostorden(nodo.getRigth());
			lista.agregarCola(nodo);
			
		}
		return lista;

	}

	public String listarProfundidadRaiz() {
		return null;

	}

	public String listarProfundidadHojas() {
		return null;

	}

	public NodoArbol eliminarHoja(NodoArbol nodo){
		NodoArbol padre=buscarPadre(nodo);
		if(padre==null){
			raiz=null;
		}else{
			if(padre.getLeft()==nodo){
				padre.setLeft(null);
			}else{
				padre.setRigth(null);
			}
		}
		return nodo;
	}

	public NodoArbol eliminarNodoConHijo(NodoArbol nodo) {
		if (nodo == raiz) {
			if (nodo.getLeft() != null) {
				raiz = nodo.getLeft();
			} else {
				raiz = nodo.getRigth();
			}
		} else {
			NodoArbol padre = buscarPadre(nodo);
			if (padre.getLeft() != null) {
				if (nodo.getLeft() != null) {
					padre.setLeft(nodo.getLeft());
				} else {
					padre.setLeft(nodo.getRigth());
				}
			} else {
				if (nodo.getLeft() != null) {
					padre.setRigth(nodo.getLeft());
				} else {
					padre.setRigth(nodo.getRigth());
				}
			}
		}

		return null;

	}

	public NodoArbol eliminarNodoConHijos(NodoArbol nodo) {

			NodoArbol padre=null;
			if (nodo!=raiz) {
				padre=buscarPadre(nodo);
			}
			NodoArbol sustituto=nodo.getRigth();
			NodoArbol padreSustituto=null;
			while (sustituto.getLeft()!=null) {
				padreSustituto=sustituto;
				sustituto=sustituto.getLeft();
			}
			if (padreSustituto!=null) {
				padreSustituto.setLeft(sustituto.getRigth());
				sustituto.setRigth(nodo.getRigth());
			}
			sustituto.setLeft(nodo.getLeft());
			if (padre!=null) {
				if (padre.getLeft()==nodo) {
					padre.setLeft(sustituto);
				}
				else {
					padre.setRigth(sustituto);
				}
			}
			else {
				raiz=sustituto;
			}
			return nodo;
			
		}
	

	public NodoArbol getRaiz() {
		return raiz;
	}

	public void setRaiz(NodoArbol raiz) {
		this.raiz = raiz;
	}

	public Lista listarAmplitudRaizHojas() throws Exception {
		if (!arbolVacio()) {
			Lista colaAux = new Lista();
			colaAux.agregarCola(raiz);
			Lista colaListar = new Lista();
			NodoArbol aux = null;

			while (!colaAux.listaVacia()) {
				aux = colaAux.sacarCola();
				if (aux.getLeft() != null) {
					colaAux.agregarCola(aux.getLeft());
				}
				if (aux.getRigth() != null) {
					colaAux.agregarCola(aux.getRigth());
				}
				colaListar.agregarCola(aux);
			}
			
			return colaListar;
		}
		else{
			throw new Exception("arbol vacio");
		}

	}

	public Lista listarAmplitudHojasRaiz() throws Exception {
		if(!arbolVacio()){
		Lista pilaAux = new Lista();
		pilaAux.agregarPila(raiz);
		NodoArbol aux = null;
		Lista pilaListar = new Lista();
//		pilaListar = null;

		while (!pilaAux.listaVacia()) {
			aux = pilaAux.sacarPila();
			if (aux.getLeft() != null) {
				pilaAux.agregarPila(aux.getLeft());
			}
			if (aux.getRigth() != null) {
				pilaAux.agregarPila(aux.getRigth());
			}
			pilaListar.agregarPila(aux);

		}
		return pilaListar;
		}
		else{
			throw new Exception("arbol vacio");
		}
	}

	public NodoArbol buscarPadre(NodoArbol nodo) {
		if(nodo==null){
				return null;
			}else{
				NodoArbol aux=raiz;
				while(true){
					if(aux.getLeft()==nodo||aux.getRigth()==nodo){
						return aux;
					}else {
						if(aux.getEstudiante().getCodigo().compareTo(nodo.getEstudiante().getCodigo())>0){
							aux=aux.getLeft();
						}else{
							aux=aux.getRigth();
						}
					}
				}
			}
	}
}