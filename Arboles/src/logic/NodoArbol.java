package logic;

public class NodoArbol {
	private Producto producto;
	private NodoArbol rigth;
	private NodoArbol left;

	public NodoArbol() {
	
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public NodoArbol getRigth() {
		return rigth;
	}

	public void setRigth(NodoArbol rigth) {
		this.rigth = rigth;
	}

	public NodoArbol getLeft() {
		return left;
	}

	public void setLeft(NodoArbol left) {
		this.left = left;
	}

	@Override
	public String toString() {
		return "NodoArbol [producto=" + producto + "]";
	}
	
	
}
