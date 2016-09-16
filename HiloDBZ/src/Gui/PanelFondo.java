package Gui;

import java.awt.*;
import java.io.*;
import java.net.URL;

import javax.imageio.*;
import javax.swing.*;

public class PanelFondo extends JPanel {

	private Image imagen;
	private VentanaPrincipal ventanaPrincipal;

	public PanelFondo(VentanaPrincipal ventanaPrincipal) {

		this.ventanaPrincipal = ventanaPrincipal;

		this.setLayout(new FlowLayout());

		 new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				while (true) {

					try {
						imagen = ImageIO.read(getClass().getResource("/Recursos/Imagenes/escena"
								+ (int) Math.floor(Math.random() * (7 - 1 + 1)
										+ 1) + ".jpg"));
						
						repaint();
					} catch (IOException e) {
						e.printStackTrace();
					}

					try {
						Thread.sleep((int) Math.floor(Math.random()
								* (700 - 100 + 1) + 100));
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
				}
			}

		}).start();;
		
	}

	public void paintComponent(Graphics g) {
		int width = this.getSize().width;
		int height = this.getSize().height;
		super.paintComponent(g);
		g.drawImage(imagen, 0, 0, width, height, this);
		setOpaque(false);
	}
	
}