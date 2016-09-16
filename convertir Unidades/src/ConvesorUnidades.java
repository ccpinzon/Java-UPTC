
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConvesorUnidades extends JPanel {
	
	private  JLabel lbMensaje, lbPesos, lbDolar;
	private JTextField txPesos, txDolares;
	private JButton btCalcular;

	
	public ConvesorUnidades () {
		
		setPreferredSize(new Dimension(139,180));
		
		lbMensaje = new JLabel ("Conversor Pesos-Dolares");
		lbPesos = new JLabel ("Ingrese el valor en pesos");
		
		txPesos = new JTextField(10);
		
		btCalcular = new JButton("Convertir");
		btCalcular.addActionListener(new accionBoton());
		
		lbDolar = new JLabel("Dolares");
		txDolares = new JTextField(10);
		
		
		add(lbMensaje);
		add(lbPesos);
		add(txPesos);
		add(btCalcular);
		add(lbDolar);
		add(txDolares);
		
		
	}
	
	private class accionBoton implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			
			float pesosTemp, DolarTemp;
			
			String text = txPesos.getText();
			pesosTemp=Float.parseFloat(text);
			
			DolarTemp=(pesosTemp/1800);
			
			txDolares.setText(Float.toString(DolarTemp));
			
			
		}
		
		
		
		
	}
}
