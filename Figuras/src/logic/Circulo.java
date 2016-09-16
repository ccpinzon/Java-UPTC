package logic;    

import java.awt.Point;

public class Circulo extends Figura {
	
	private double radio;  // Crea una variable de tipo double, para despues en ella guardar el valor del radio del circulo para poder hallar ell area.
	
	public Circulo() {    // Constructor
		
		radio= 0.0;   // iguala la variable a cero.
	}
	
	public Circulo(Point punto,double radio){
		super(punto);        // se llama el constructor de la clase figura
		setRadio(radio);
	}

	//Crear Gets and sets
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

  //cre el metodo para calcular el area del crculo, despues retornamos la variable resultado para que pueda ser utilizda en la clase runner
	@Override
	public double CalcularAreaC() {

		double areaC = (radio * radio) * (Math.PI);
		return areaC;
	}

}
