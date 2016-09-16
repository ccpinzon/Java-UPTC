package gui;

import java.awt.Font;
import java.util.Calendar;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelReloj extends JPanel{
	
	private JLabel reloj;
	
	public PanelReloj() {
		
		
		inicilaizar();
		agregar();
		
		
		
		
	}

	private void inicilaizar() {
		
		reloj = new JLabel();
		reloj.setFont(new Font(Font.SANS_SERIF,Font.BOLD,24));
		//
		new Thread(new Runnable() {
			Calendar actual;
			public void run() {
				while(true){
				actual = Calendar.getInstance();
				String aux = actual.get(Calendar.HOUR) + ":"
						+ actual.get(Calendar.MINUTE) + ":"
						+ actual.get(Calendar.SECOND);
				reloj.setText(aux);
				
				try {
					Thread.sleep(1000);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}
	
			}
		}).start();
	}

	private void agregar() {
		
		this.add(reloj);
		
	}

	

}
