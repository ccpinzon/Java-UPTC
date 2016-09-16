import javax.swing.JFrame;

public class Inicu {

	public static void main(String[] args) {
		
		JFrame Baka = new JFrame("Calculo De Notas");
	Baka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    CalculoNotas Promedio = new CalculoNotas();
        Baka.getContentPane().add(Promedio);
        Baka.pack();
        Baka.setVisible(true);
		
	}

}
