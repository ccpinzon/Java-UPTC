package gui;

import java.util.ArrayList;


public class Hilo extends Thread {
	
	
	private VentanaPrincipal principal;
    
	public Hilo(VentanaPrincipal ventanaPrincipal){
		
		this.principal=ventanaPrincipal;
		
	}
	
	@Override
	public void run() {
		
        int limite = Integer.parseInt(principal.getBoton().getTxTexto().getText());
		
		for(int i=1; i<=limite;i++){
			
			
			
		
		principal.getBoton().getTxTexto().setEditable(false);
		principal.getBoton().getTxTexto().setText(String.valueOf(i));
		try {
			sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if (i==principal.invertirNumero(i)){
		
	          
	     
	     principal.getCentro().getTxCrapicua().append(String.valueOf(i)+"\n");			
	       
	     try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(principal.ValidarNumero(i)){
			
			principal.getCentro().getTxParSiete().append(String.valueOf(i)+"\n");
		}
		try {
			sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

}
	
}