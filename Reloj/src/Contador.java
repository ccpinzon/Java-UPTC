import javax.annotation.processing.RoundEnvironment;


public class Contador implements Runnable {
	
	private String descripcion;
	
	Contador(String descripcion){
		
		
		this.descripcion= descripcion;
		
	}
	
	public void run(){
		
		for(int i=1; i<=20;i++){
			
			System.out.println(descripcion+"-->"+i);
			try {
				Thread.sleep(Math.round(Math.random()*1000));
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}

}
