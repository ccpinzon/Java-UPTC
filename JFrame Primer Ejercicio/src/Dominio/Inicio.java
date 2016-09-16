package Dominio;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import Dominio.EvaluacionLabel;

public class Inicio {
       public static void main(String[] args) {
		
		JFrame Baka = new JFrame("Programacion");
		Baka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		EvaluacionLabel Formulario = new EvaluacionLabel();
        Baka.getContentPane().add(Formulario);
        Baka.pack();
        Baka.setVisible(true);
        
        
       
        
        
        

}}
