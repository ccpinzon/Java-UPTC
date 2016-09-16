package Gui;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

import logic.Cell;
import logic.Goku;
import logic.Hilo;

public class VentanaPrincipal extends JFrame {
	private PanelIzquierdo panelIzquierdo;
	private PanelDerecho panelDerecho;
	private static PanelBotones panelBotones;
	private PanelFondo panelFondo;
	private static Cell cell;
	private static Goku goku;
	private Hilo hilo;
	private GestionEventos gestionEventos;
	private AudioInputStream audioinputStream;
	private InputStream audioSrc;
	private InputStream bufferedIn;
	private static Clip clip;

	public VentanaPrincipal() {
		super();

		setSize(600, 450);
		setResizable(false);
		setTitle("Saga de cell");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		inicializarComponentes();
		agregar();
	}

	private void inicializarComponentes() {
		// TODO Auto-generated method stub
		gestionEventos = new GestionEventos(this);
		panelFondo = new PanelFondo(this);
		panelIzquierdo = new PanelIzquierdo(this);
		panelDerecho = new PanelDerecho(this);
		panelBotones = new PanelBotones(this);
		hilo = new Hilo(this);
		cell = new Cell(hilo);
		goku = new Goku(hilo);
		
		try {

			audioSrc = getClass().getResourceAsStream(
					"/Recursos/Imagenes/Db.wav");
			
			bufferedIn = new BufferedInputStream(audioSrc);
			audioinputStream = AudioSystem.getAudioInputStream(bufferedIn);
			
			AudioFormat format = audioinputStream.getFormat();
			DataLine.Info info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(audioinputStream);
		}catch(Exception e){
			System.out.println(e);
		}
	}

	public void agregar() {
		panelFondo.add(panelIzquierdo, BorderLayout.WEST);
		panelFondo.add(panelDerecho, BorderLayout.EAST);
		panelFondo.add(panelBotones, BorderLayout.SOUTH);
		this.add(panelFondo, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
		ventanaPrincipal.setVisible(true);
		panelBotones.getBtnReiniciar().setEnabled(false);
		goku.start();
		cell.start();
		clip.loop(Clip.LOOP_CONTINUOUSLY);
	}

	public void Iniciar() {
		panelBotones.getBtnReiniciar().setEnabled(false);
		panelBotones.getBtnStop().setEnabled(true);
		goku.resume();
		cell.resume();
		clip.loop(Clip.LOOP_CONTINUOUSLY);
	}

	public void stop() {
		panelBotones.getBtnReiniciar().setEnabled(true);
		panelBotones.getBtnStop().setEnabled(false);
		cell.suspend();
		goku.suspend();
		clip.stop();
	}

	public GestionEventos getGestionEventos() {
		return gestionEventos;
	}

	public PanelIzquierdo getPanelIzquierdo() {
		return panelIzquierdo;
	}

	public PanelDerecho getPanelDerecho() {
		return panelDerecho;
	}
}
