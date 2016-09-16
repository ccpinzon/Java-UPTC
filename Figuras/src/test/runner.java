package test;

import java.awt.Point; 
import logic.Circulo;
import logic.Figura;
import logic.Triangulo;
import logic.rectangulo;

public class runner {

	
	public static void main(String[] args) throws Exception {
		
		Figura CirculoUno = new Circulo(new Point(10,10),15);  // crea un objueto de tipo circulo y agregamos los datos del criculo, puntos en x y y, y radio
		
		rectangulo rectanguloUno = new rectangulo(new Point(5,5),12,18); //crea un objeto de tipo rectangulo y agragamos sus cordenadas y las medidas del ancho y alto
		
		Triangulo trianguloUno = new Triangulo(new Point(4,5),0,0,0,"Equilatero"); // crea un objeto de tipo rectangulo y agragamos cordenadas, las medidas de los tres lados, y el tipo de triangulo		
		MostrarArea(CirculoUno);      //al metodo mostrararea se le agrega cada uno delos objetos creados anteriormente
		MostrarArea(rectanguloUno);
		MostrarArea(trianguloUno);
		
	
		                      	
	}
	
	public static void MostrarArea (Figura figura) {
		
		System.out.println("El area del "+figura.getClass()+" es "+figura.CalcularAreaC());  // se crea un syso para que muestre el resulado de las areas de cada fugira
		
	}

}
