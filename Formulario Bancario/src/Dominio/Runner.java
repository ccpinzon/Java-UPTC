package Dominio;

import javax.swing.JFrame;

public class Runner {
	
	public static void main(String[] args) {
		
		JFrame Baka = new JFrame();
		Baka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Baka.setBounds(300,300,300,300);
		FormularioValidacion formularioInicial = new FormularioValidacion();
		Baka.add(formularioInicial);
		Baka.setVisible(true);
		
	}

}
