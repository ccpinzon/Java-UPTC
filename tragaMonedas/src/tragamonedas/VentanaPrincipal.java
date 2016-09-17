package tragamonedas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends JFrame {
	
	private PanelFondo fondo;
	private PanelBotones boton;
	private GestionEventos eventos;
	private PanelIzquierdo izquierdo;
	private PanelImagenes imagenes;
	private PanelDerecho derecho;
	private Hilos hilo;
	private PanelMenu menu;
	private boolean m=false,n=false,o=false;

	
	
	public VentanaPrincipal() {
		
		
		setSize(600,300);
		setTitle("Tragamonedas");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setResizable(false);
		setIconImage(new ImageIcon(getClass().getResource("/recursos/imagenes/Icono.png")).getImage());
		
		
		
		inicializar();
		agregar();
		
	}


	private void inicializar() {
		
		eventos = new GestionEventos(this);
		hilo = new Hilos(this);
		fondo = new PanelFondo(this);
		imagenes = new PanelImagenes(this);
		izquierdo = new PanelIzquierdo(this);
		boton = new PanelBotones(this);
		derecho = new PanelDerecho(this);
		menu = new PanelMenu(this);
		
		
		
		
		
		
	}

	private void agregar() {
		
	
		izquierdo.add(imagenes);
		izquierdo.add(boton);
		
		fondo.add(izquierdo,BorderLayout.WEST);
		fondo.add(derecho,BorderLayout.EAST);
		
		
		this.add(menu,BorderLayout.NORTH);
		this.add(fondo,BorderLayout.CENTER);
		
		
		
		
	}

	public static void main(String[] args) {
		
		VentanaPrincipal principal = new VentanaPrincipal();
		principal.setVisible(true);
		
		
	
		
	}


	public void pararUno() {
		
		
		hilo.setMovimientoUno(false);
		boton.getBtPararUno().setEnabled(false);
		m=true;
		nuevo();
		
		
		
		
	}


	public void pararDos() {
		
		
		hilo.setMovimientoDos(false);
		boton.getBtPararDos().setEnabled(false);
		n=true;
		nuevo();
		
		
	}


	public void pararTres() {
		
		
		hilo.setMovimientosTres(false);
		boton.getBtPararTres().setEnabled(false);
		o=true;
		nuevo();
		
	}
	
public void Ejecutar() {
		
		
		
		
		if(derecho.getTxValorApuesta().getText().equals("")){
			JOptionPane.showMessageDialog(null,"Porfavor Ingrese El Valor a Apostar");
		}
		else{
			
			derecho.getBtApostar().setEnabled(false);
			derecho.getTxValorApuesta().setEnabled(false);
			boton.getBtPararUno().setEnabled(true);
			boton.getBtPararDos().setEnabled(true);
			boton.getBtPararTres().setEnabled(true);
			
		hilo.start();
		}
		
	}
	
	public void nuevo(){
	
		int apuesta = Integer.parseInt(derecho.getTxValorApuesta().getText());
		
		
		if (n==true && m == true && o==true) {
			
			derecho.getBtApostar().setEnabled(true);
			derecho.getTxValorApuesta().setText("");
			derecho.getTxValorApuesta().setEnabled(true);
			
			
			
			
			
			if(imagenes.getLbImagenUno().getIcon().toString().equals(imagenes.getLbImagenTres().getIcon().toString()) && imagenes.getLbImagenDos().getIcon().toString().equals(imagenes.getLbImagenTres().getIcon().toString())){
				
				JOptionPane.showMessageDialog(null,"FELICITACIONES ACERTO TRES \n Usted Aposto: "+apuesta+"\n Usted Gano: "+(apuesta*3));
			}
			
			else if(imagenes.getLbImagenUno().getIcon().toString().equals(imagenes.getLbImagenDos().getIcon().toString())){
				JOptionPane.showMessageDialog(null,"FELICITACIONES ACERTO DOS \n Usted Aposto: "+apuesta+"\n Usted Gano: "+(apuesta*2));
			}
			
			else if(imagenes.getLbImagenUno().getIcon().toString().equals(imagenes.getLbImagenTres().getIcon().toString())){
				JOptionPane.showMessageDialog(null,"FELICITACIONES ACERTO DOS \n Usted Aposto: "+apuesta+"\n Usted Gano: "+(apuesta*2));
			}
			
			else if(imagenes.getLbImagenDos().getIcon().toString().equals(imagenes.getLbImagenTres().getIcon().toString())){
				JOptionPane.showMessageDialog(null,"FELICITACIONES ACERTO DOS \n Usted Aposto: "+apuesta+"\n Usted Gano: "+(apuesta*2));
			}
			
			else {
				JOptionPane.showMessageDialog(null,"LO SENTIMOS PERDIO \n Usted Aposto: "+apuesta+"\n Usted Perdio Todo");
				
			}
			
			
			
			dispose();
			this.main(null);
			
		}
		
		
		
	}
	
	
	


	public GestionEventos getEventos() {
		return eventos;
	}


	public PanelFondo getFondo() {
		return fondo;
	}


	public void setFondo(PanelFondo fondo) {
		this.fondo = fondo;
	}


	public PanelBotones getBoton() {
		return boton;
	}


	public void setBoton(PanelBotones boton) {
		this.boton = boton;
	}


	public PanelIzquierdo getIzquierdo() {
		return izquierdo;
	}


	public void setIzquierdo(PanelIzquierdo izquierdo) {
		this.izquierdo = izquierdo;
	}


	public PanelImagenes getImagenes() {
		return imagenes;
	}


	public void setImagenes(PanelImagenes imagenes) {
		this.imagenes = imagenes;
	}


	public PanelDerecho getDerecho() {
		return derecho;
	}


	public void setDerecho(PanelDerecho derecho) {
		this.derecho = derecho;
	}


	public void setEventos(GestionEventos eventos) {
		this.eventos = eventos;
	}


	


	public void ayuda() {
		JOptionPane.showMessageDialog(null,"Hecho Por: Daniel Alcides Carvajal Patiño \nCodigo: 201210248 \nIngenieria De Sistemas-UPTC");
		
	}

	public void Salir() {
		dispose();
	}

	
	

}
