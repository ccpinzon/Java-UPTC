package tragamonedas;

import java.awt.*; 
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class PanelFondo extends JPanel {
	
	private Image imagen;
	private VentanaPrincipal ventanaPrincipal;
	
	 
    public PanelFondo(VentanaPrincipal ventanaPrincipal) {
    	
    	this.ventanaPrincipal = ventanaPrincipal;
    	
 
   this.setLayout(new FlowLayout()); 
    
      this.setBounds(0, 0, 600, 300);
 
 try {
      imagen=ImageIO.read(getClass().getResource("/recursos/imagenes/FondoSiete.jpg"));
 }
catch (IOException e) {
  e.printStackTrace();
 }

 }

public void paintComponent(Graphics g){
 
    super.paintComponent(g);
    g.drawImage(imagen, 0, 0,600,300, this);
    setOpaque(false);
}

}
