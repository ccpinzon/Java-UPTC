package gui;

import java.awt.BorderLayout; 
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

import logic.GestionPelota;
import logic.Pelota;
import Util.Hilo;

public class VentanaPrincipal extends JFrame {
	
	private GestionPelota gestionPelota;
	private GestionEventos gestionEventos;
	private PanelDibujo panelDibujo;
	public VentanaPrincipal() {



		this.setVisible(true);
	
		this.setSize(300,200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Pelotica");
		this.setLayout(new BorderLayout());
		//this.setResizable(false);
		inicializarComponentes();
		agregarComponentes();

	}

	public GestionPelota getGestionPelota() {
		return gestionPelota;
	}

	public void setGestionPelota(GestionPelota gestionPelota) {
		this.gestionPelota = gestionPelota;
	}

	public PanelDibujo getPanelDibujo() {
		return panelDibujo;
	}


	public GestionEventos getGestionEventos() {
		return gestionEventos;
	}

	public void setGestionEventos(GestionEventos gestionEventos) {
		this.gestionEventos = gestionEventos;
	}

	private void inicializarComponentes() {
		gestionEventos = new GestionEventos(this);
		panelDibujo = new PanelDibujo(this);
		gestionPelota = new GestionPelota(this);
	}


	private void agregarComponentes() {
		this.add(panelDibujo,BorderLayout.CENTER);

	}

	public void dibujarPelota(Pelota pelota){
		System.out.println("dibujar");
		gestionPelota.dibujarPelota(pelota);

		//System.out.println("ola ke ase dibujando o ke ase");

	}

	public void moverPelota(Pelota pelota,boolean movimiento,boolean direccion){

       actualizar();
       gestionPelota.moverPelota(pelota, movimiento,direccion);

	}

	public void crearPelota(int posx,int posy){


		Pelota pelota = new Pelota(posx,posy);
		System.out.println("CREAR");
		Hilo hilo = new Hilo(this,pelota);
		hilo.start();


	}
	
	public void Pain(Graphics g){
		
		
		super.paint(g);
		actualizar();
		
	}
	
	public void reapint(){
		super.repaint();
		actualizar();
	}
	
	public void actualizar(){
		
		Graphics g = panelDibujo.getGraphics();
		g.setColor(Color.WHITE);
		g.fillRect(0,0,this.getWidth(),this.getWidth());
	}
	
	public static void main(String[] args) {

		VentanaPrincipal ventanapro = new VentanaPrincipal();

	}

}
