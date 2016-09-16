

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcularArea extends JPanel {
	
	private JLabel lbMensaje, lbArea, lbBase, lbAltura;
	private JTextField txArea, txBase, txAltura;
	private JButton btCalcular;
	
	public CalcularArea () {
		
		setPreferredSize(new Dimension(100,200));
		
		lbMensaje = new JLabel("Area Del Rectangulo");
		lbBase = new JLabel ("Base");
		lbAltura = new  JLabel ("Altura");
		
		txBase = new JTextField(10);
		txAltura = new JTextField(10);
		
		btCalcular = new JButton("Calcular");
		btCalcular.addActionListener(new accionBoton());
		
		lbArea = new JLabel("Area");
		txArea = new JTextField(10);
		
		add(lbMensaje);
		add(lbAltura);
		add(txAltura);
		add(lbBase);
		add(txBase);
		add(btCalcular);
		add(lbArea);
		add(txArea);
		
		
		
	}
	
	private class accionBoton implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			
			float AlturaTemp, BaseTemp,AreaTemp;
			
			String text = txAltura.getText();
			AlturaTemp=Float.parseFloat(text);
			
			String text1 = txBase.getText();
			BaseTemp=Float.parseFloat(text1);
			
          AreaTemp=(BaseTemp*AlturaTemp);
			
			txArea.setText(Float.toString(AreaTemp));
			
		}
		
		
	}
	

}
