

import javax.swing.JFrame;

public class Runner {
	
	public static void main(String[] args) {
		JFrame Baka = new JFrame("Pesos-Dolares");
		Baka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ConvesorUnidades Convertir = new ConvesorUnidades();
		 Baka.getContentPane().add(Convertir);
	        Baka.pack();
	        Baka.setVisible(true);
	}

}
