import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConvertirFarenheit extends JPanel {

	private JLabel lbmensaje, lbFarenheit, lbREsultado;
	
	private JTextField txFarenheit, txResultado;
	private JButton btCalcular;
	
	public ConvertirFarenheit (){
		
		setPreferredSize(new Dimension(200,250));
	
	lbmensaje = new JLabel ("Farenheit-Celsius");
	lbFarenheit = new JLabel ("Farenheit");
		
	txFarenheit = new JTextField(10);
		
	btCalcular = new JButton ("Convertir");
	btCalcular.addActionListener(new accionBoton());
	
	lbREsultado = new JLabel("Celsius");
	txResultado = new JTextField(10);
	
	add(lbmensaje);
	add(lbFarenheit);
	add(txFarenheit);
	add(btCalcular);
	add(lbREsultado);
	add(txResultado);
	

	
	
	}
	private class accionBoton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			float farenheitTemp,  resultadoTemp;
			String text = txFarenheit.getText();
			farenheitTemp=Float.parseFloat(text);
			
			
			
			resultadoTemp= (float) ((farenheitTemp-32)*(0.5555555556));
			
			txResultado.setText(Float.toString(resultadoTemp));
			
			
		}}
}
