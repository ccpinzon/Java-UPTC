package logic;

public class NodoArbol {
	private Estudiante estudiante;
	private NodoArbol rigth;
	private NodoArbol left;

	public NodoArbol() {
	
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



	public Estudiante getEstudiante() {
		return estudiante;
	}



	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	
}
