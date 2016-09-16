package logic;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Figura {

	private  Color colorPelota;
	private int posX;
	
	
	
	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	private int posY;
	
	public Figura() {
		
		
		
		// TODO Auto-generated constructor stub
	}

	public Figura(int posX, int posY) {
		super();
		this.posX = posX;
		this.posY = posY;
	}

	public Color getColorPelota() {
		return colorPelota;
	}

	public void setColorPelota(Color colorPelota) {
		this.colorPelota = colorPelota;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}
	
public abstract void dibujar(Graphics g);
}
