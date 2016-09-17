import javax.swing.JOptionPane;


public class PrimerEjercicioNumeroDeTarot {

	
	public static void main(String[] args) {
		
		int anio = Integer.parseInt(JOptionPane.showInputDialog(null,"Porfavor ingrese su año de nacimiento","Numero Del Tarot",3));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese el mes en el que nacio en numero"));
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Porfavor ingrese el dia en que nacio"));
		int contador=0;
		int contador2=0;
		int sumatoria= anio+mes+dia;
		
		for (int i=1;i<=4;i++){
			contador=contador+(sumatoria%10);
			sumatoria=sumatoria/10;
		}
		for(int n=1;n<=2;n++){
			contador2=contador2+(contador%10);
			contador=contador/10;
			
		}
		JOptionPane.showMessageDialog(null, "su numero del tarot es: "+contador2,"Numero De Taror",3);

	}

}
