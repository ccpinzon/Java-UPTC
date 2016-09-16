

import javax.swing.JFrame;

public class Inicio {

	
	public static void main(String[] args) {
		
		JFrame Baka = new JFrame("Calculo De Area");
		Baka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CalcularArea Promedio = new CalcularArea();
        Baka.getContentPane().add(Promedio);
        Baka.pack();
        Baka.setVisible(true);
		
		
		
		
	}

}
