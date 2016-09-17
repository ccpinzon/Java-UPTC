import javax.swing.JOptionPane;


public class CentroNumerico {

	
	public static void main(String[] args) {
		int hasta = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero hasta el cual desea saber si hay centros numericos ","Centros numericos",3));
	
	
	
		for(int i=1;i<=hasta;i++){
			double cNumerico = (double) Math.sqrt((Math.pow(i, 2)+i)/2);
		
			
			if (cNumerico%1==0){
				
						
						
				JOptionPane.showMessageDialog(null, "el centro numerico es:"+cNumerico );
			}
		}}
				
						
			}
		

	


