package logic;

import java.awt.Point;

import javax.management.StringValueExp;

public class Triangulo extends Figura {
	
	private String nombre;                        // define una variable string para guardar el tipo de triangulo que se utiliza
	private double ladoUno, ladoDos, ladoTres,p,areaT; //crea las variables para los datos de cada lado del triangulo
	
	public Triangulo() {         //constructor
		
		ladoUno= 0.0;              //inicializa variables
		ladoDos=0.0;
		ladoTres=0.0;		
	}
	
	public Triangulo (Point punto,double ladoUno,double ladodos, double ladoTres,String nombre) throws Exception{
		//super(punto);
		//setLadoUno(ladoUno);
		//setLadoDos(ladodos);
		//setLadoTres(ladoTres);
		//setNombre(nombre);	
		
		
		if (ladoUno==0 && ladoDos==0 && ladoTres==0){
			throw new Exception("no");
		}
		
		
		
	}
	
	// crea el Get and set de cada variable
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getLadoUno() {
		return ladoUno;
	}

	public void setLadoUno(double ladoUno) {
		this.ladoUno = ladoUno;
	}

	public double getLadoDos() {
		return ladoDos;
	}

	public void setLadoDos(double ladoDos) {
		this.ladoDos = ladoDos;
	}

	public double getLadoTres() {
		return ladoTres;
	}

	public void setLadoTres(double ladoTres) {
		this.ladoTres = ladoTres;
	}

	//crea el metodo para calcular el area del triangulo y retornamos la variable resultado
	@Override
	public double CalcularAreaC() {
		
		
		p=(ladoUno+ladoDos+ladoTres)/2;
		areaT= Math.sqrt(p*(p-ladoUno)*(p-ladoDos)*(p-ladoTres));
		
		
		return areaT;
	}

	
	}


