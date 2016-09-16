package gui;

import java.awt.BorderLayout;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends JFrame {
	
 

	
	private PanelReloj reloj;
	private PanelCentro centro;
	private PanelBoton boton;
	private GestionEventos eventos;
	private Hilo hilo;
	
	
	
	public VentanaPrincipal() {
		
		setSize(300,300);
		//setResizable(false);
		setTitle("Parcial");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		inicialisa();
		agrega();
		
		
		
	}
	
	

	private void inicialisa() {
		
		eventos = new GestionEventos(this);
		reloj = new  PanelReloj();
		centro = new PanelCentro(this);
		boton = new PanelBoton(this);
		hilo = new Hilo(this);
	}


	private void agrega() {
		
		this.add(reloj,BorderLayout.NORTH);
		this.add(centro,BorderLayout.CENTER);
		this.add(boton,BorderLayout.SOUTH);
	}





	public GestionEventos getEventos() {
		return eventos;
	}



	public void setEventos(GestionEventos eventos) {
		this.eventos = eventos;
	}



	public static void main(String[] args) {
		VentanaPrincipal principal = new VentanaPrincipal();
		principal.setVisible(true);

	}



	public void ejecutar() {
		
		
		String numero = boton.getTxTexto().getText();
		
		int numerito= Integer.parseInt(numero);
		
		
		if(numero.equals("")){

         JOptionPane.showMessageDialog(null,"Porfavor Ingrese Numero");
		}
		
		else{
						
			
			
			hilo.start();
			
			
		}
		
		
		
		
		
	}




	


	public PanelReloj getReloj() {
		return reloj;
	}



	public void setReloj(PanelReloj reloj) {
		this.reloj = reloj;
	}



	public PanelCentro getCentro() {
		return centro;
	}



	public void setCentro(PanelCentro centro) {
		this.centro = centro;
	}



	public PanelBoton getBoton() {
		return boton;
	}



	public void setBoton(PanelBoton boton) {
		this.boton = boton;
	}
	
public int invertirNumero(int numero){
		
		int invertido=0;
		int aux = numero;
		
		while(aux>=1){
			
			int r=aux%10;
			invertido=invertido*10+r;
			aux/=10;
			
		}
		
		
		
		
		
		return invertido;
	}
	
	public boolean ValidarNumero(int numero){
		
		return numero%2==0 && 	numero%7==0;
		
	}

 
}
