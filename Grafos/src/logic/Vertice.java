package logic;

import java.util.ArrayList;

public class Vertice {
	
	private ArrayList<Arista> aristas;
	private String nombre;
	private int posX, posY;
	
	
	public Vertice() {
		// TODO Auto-generated constructor stub
	} 
	
	
	public Vertice (String nombre, int posX, int posY) {
		this.aristas = new ArrayList<Arista>();
		this.nombre = nombre;
		this.posX = posX;
		this.posY = posY;
	}


	public ArrayList<Arista> getAristas() {
		return aristas;
	}


	public void setAristas(ArrayList<Arista> aristas) {
		this.aristas = aristas;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPosX() {
		return posX;
	}


	public void setPosX(int posX) {
		this.posX = posX;
	}


	public int getPosY() {
		return posY;
	}


	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	
	public void agregarArista(Arista arista){
		aristas.add(arista);
	}
	
	public Arista buscarArista(String nombre){
		for (int i = 0; i < aristas.size(); i++) {
			if (aristas.get(i).getNombre().equals(nombre)) {

				return aristas.get(i);
			}
			
		}
		return null;
	}
	

	@Override
	public String toString() {
		return "Vertice [aristas=" + aristas + ", nombre=" + nombre + ", posX="
				+ posX + ", posY=" + posY + "]";
	}
	
	

}
