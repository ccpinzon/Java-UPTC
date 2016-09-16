import java.awt.Font;
import java.awt.GridLayout;
import java.util.Calendar;

import javax.swing.*;


public class reloj extends JFrame {
	
	private JLabel hora,nombre;
	
	public reloj (){
		
		setSize(200,200);
		setTitle("Reloj");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(1,2));

		inicializarComponentes();
		agregarComponentes();
		nombre.setText("Daniel");
			
		
	}

   private void inicializarComponentes(){

          hora = new JLabel();
          hora.setFont(new Font("Arial",Font.BOLD,24));
          nombre = new JLabel();
  		
          

}
   private void agregarComponentes(){
	 
	   
	   add(hora);
	   add(nombre);
	   
	   
	   new Thread(new Runnable() {
		
		@Override
		public void run() {
			
			Calendar actual;
			while (true){
			
			actual = Calendar.getInstance();
			 String aux=actual.get(Calendar.HOUR)+":"+actual.get(Calendar.MINUTE)+":"+actual.get(Calendar.SECOND);
			 hora.setText(aux);
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		}}
	}).start();
	   
	 
		   
	   }
	  
	 
	   
   }
	


