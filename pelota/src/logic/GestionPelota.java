package logic;

import java.awt.Graphics;

import Util.Hilo;

import gui.VentanaPrincipal;

public class GestionPelota {
	//Falta asociacion

	private VentanaPrincipal ventanaPrincipal;
	
	public GestionPelota(VentanaPrincipal ventanaPrincipa){

		this.ventanaPrincipal = ventanaPrincipa;

	}

	public void dibujarPelota(Pelota pelota) {
		System.out.println("hiiuygf");
		Graphics g = ventanaPrincipal.getPanelDibujo().getGraphics();
		pelota.dibujar(g);


	}

	public void moverPelota(Pelota pelota, boolean movimiento,boolean direccion) {

		
			
			
			
			
			if(pelota.getDireccion()){
				
			if(movimiento){
				
				if(pelota.getPosX()<ventanaPrincipal.getWidth()-pelota.getAncho()){
					pelota.setPosX(pelota.getPosX()+10);
				}
				else{
			            pelota.setDireccion(!(pelota.getDireccion()));
				}
				
			}
			else{
				if(pelota.getPosY()<ventanaPrincipal.getHeight()-pelota.getAlto()){
					pelota.setPosY(pelota.getPosY()+10);
				}
				else{
			            pelota.setDireccion(!(pelota.getDireccion()));
			            
				}				
			}				
	}
			else{
				if(movimiento){
					if(pelota.getPosX()>pelota.getAncho()){
						pelota.setPosX(pelota.getPosX()-10);
					}
					else{
						pelota.setDireccion(!(pelota.getDireccion()));
						
					}
					
				}
				else{
					if(pelota.getPosY()>pelota.getAlto()){
						pelota.setPosY(pelota.getPosY()-10);
					}
					else{
						pelota.setDireccion(!(pelota.getDireccion()));
					}
				}
				
			}
	
	
	
	
	
	
	
	}
}