
import javax.swing.JFrame;

public class Inicio {

	
	public static void main(String[] args) {

		JFrame Baka = new JFrame("Farenheit-Celsius");
		Baka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ConvertirFarenheit Celsius = new ConvertirFarenheit();
        Baka.getContentPane().add(Celsius);
        Baka.pack();
        Baka.setVisible(true);

	}

}
