package logic;

import java.awt.Point;

public class rectangulo extends Figura {
	private double ancho;      //define variables para el alto y ancho del rectangulo
	private double alto;

	public rectangulo() {
		ancho =0.0;   //inicializa variables
		alto=0.0;
	}
	
	public rectangulo(Point punto,double ancho, double alto){
		super(punto);
		setAlto(alto);
		setAncho(ancho);
		
	}
	
	//crea el get y set decada vaiable
	public void setAlto(double alto) {this.alto = alto;}
	
	public double getAlto() {return alto;}
	
	public void setAncho(double ancho) {this.ancho = ancho;}

	public double getAncho() {return ancho;}

		

       //crea el metodo para calcular el area del rectangulo

	public double CalcularAreaC() {

		double areaR = (ancho * alto);
		return areaR;
	}

}
