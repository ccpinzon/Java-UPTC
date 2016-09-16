package logic;

import java.awt.Point;

public abstract class Figura {
	
	private Point punto;        // define una variable point para las cordenadas de las figuras

	public Figura() {}  //constructor
	
	public Figura(Point punto){this.punto=punto;}

	//Getts ans sett
	
	public Point getPunto() {return punto;}

	public void setPunto(Point punto) {
		this.punto = punto;
	}
 // se inicia el metodo calcular area para implementarlo en las otras clases
	
	public abstract double CalcularAreaC();

}
