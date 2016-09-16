package logic;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Pelota extends Figura {
	private int ancho = 20;
	private int alto = 10;
	private boolean direccion=true;

	public Pelota() {
		super();
		generarColor();
		
	}

	public Pelota(int posX, int posY) {
	
		super(posX,posY);
		setPosX(posX);
		setPosY(posY);
		generarColor();
		
	}
	

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public boolean getDireccion() {
		return direccion;
	}

	public void setDireccion(boolean direccion) {
		this.direccion = direccion;
	}

	public int getAncho() {
		return ancho;
	}

	public int getAlto() {
		return alto;
	}

	private void generarColor() {
     int rojo= new Random().nextInt(256);
     int verde= new Random().nextInt(256);
     int azul= new Random().nextInt(256);
     setColorPelota(new Color(azul,rojo,verde));

	}

	@Override
	public void dibujar(Graphics g) {
	g.setColor(this.getColorPelota());
	System.out.println("hhhh");
	g.fillOval(this.getPosX(),getPosY(), getAncho(), getAlto());

	}

}
