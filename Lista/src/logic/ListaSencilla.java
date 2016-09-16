package logic;

public class ListaSencilla {
	private String descripcion;
	private Nodo head;

	public ListaSencilla(String descripcion) {
		this.descripcion = descripcion;
		head = null;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean listaVacia() {

		return head == null;
	}

	public void agregarFinal(String codigo, String descripcion, double valor, int cantidad) {
		Nodo nuevo = new Nodo();
		Producto producto = new Producto();
		producto.setCodigo(codigo);
		producto.setDescripcion(descripcion);
		producto.setValor(valor);
		producto.setCantidad(cantidad);
		nuevo.setProducto(producto);

		if (listaVacia()) {
			head = nuevo;
		} else {
			Nodo aux = head;
			while (aux.getNext() != null) {
				aux = aux.getNext();
			}
			aux.setNext(nuevo);
		}
	}

	public void agregarPrincipio(String codigo, String descripcion, double valor, int cantidad) {
		Nodo nuevo = new Nodo();
		Producto producto = new Producto();
		producto.setCodigo(codigo);
		producto.setDescripcion(descripcion);
		producto.setValor(valor);
		producto.setCantidad(cantidad);
		nuevo.setProducto(producto);

		if (listaVacia()) {
			head = nuevo;
		} else {
			nuevo.setNext(head);
			head = nuevo;
		}
	}

	public void agregarOrden(String codigo, String descripcion, double valor, int cantidad) {
		Nodo nuevo = new Nodo();
		Nodo ante = null;
		Nodo actu = head;
		Producto producto = new Producto();
		producto.setCodigo(codigo);
		producto.setDescripcion(descripcion);
		producto.setValor(valor);
		producto.setCantidad(cantidad);
		nuevo.setProducto(producto);

		if (listaVacia()) {
			head = nuevo;
		} else {
			ante = null;
			actu = head;
			while (actu != null && actu.getProducto().getCodigo().compareTo(codigo) < 0) {
				ante = actu;
				actu = actu.getNext();
			}
			if (ante == null) {
				nuevo.setNext(head);
				head = nuevo;
			} else {
				nuevo.setNext(actu);
				ante.setNext(nuevo);
			}
		}
	}

	public String listarLista() throws Exception {
		if (!listaVacia()) {
			StringBuffer salida = new StringBuffer();
			Nodo aux = head;
			while (aux != null) { 
				salida.append(aux.getProducto() + "\n");
				aux = aux.getNext();
			}
			return salida.toString();
		}
		throw new Exception("No existen nodos en la lista");
	}

	public Nodo BuscarNodoCodigo(String cod) throws Exception {

		Nodo aux = head;
		if (!listaVacia()) {
			while (aux != null) {

				if (aux.getProducto().getCodigo().equals(cod)) {
					return aux;
				}
				aux = aux.getNext();
			}
			throw new Exception("el Elemento No Existe");

		} else
			throw new Exception("lista Se Encuntra Vacia");

	}

	public Nodo buscarNodoDescripcion(String desc) throws Exception {

		Nodo aux = head;
		if (!listaVacia()) {
			while (aux != null) {

				if (aux.getProducto().getDescripcion().equals(desc)) {
					return aux;
				}
				aux = aux.getNext();
			}
			throw new Exception("el Elemento No Existe");

		} else
			throw new Exception("lista Se Encuntra Vacia");
	}

	public boolean eliminarNodo(String codigo) {
		Nodo actu = head;
		Nodo ante = null;
		while (!listaVacia()) {
			if (actu.getProducto().getCodigo().equals(codigo)) {
				
				
				if (ante == null) { //Asumimos que esta en la cabeza
					head = head.getNext();
					if (actu.equals(ante)) { //Asumimos que solo hay un elemento en la lista
					ante = null;
					}
					return true;
					}
					else { // Asumimos que esta en los nodos interiores
					ante.setNext(actu.getNext());
					return true;
					}			
		
			}
			else{
				ante=actu;
				actu=actu.getNext();
			}
			
		}return false;
		
		}

}
