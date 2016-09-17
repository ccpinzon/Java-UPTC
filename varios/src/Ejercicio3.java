import javax.swing.JOptionPane;


public class Ejercicio3 {

	public static void main(String[] args) {
		
		float cm=0;
		long sd=0;
		int n=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de personas"));
		int i=1;
		while(i<=n){
		int ing=Integer.parseInt(JOptionPane.showInputDialog("Digite el ingreso"));
		String ccasa=JOptionPane.showInputDialog("Digite el comprador de la casa");
		int cas=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de la casa"));
		if(ing>=800000){
		sd=(long)(cas*0.15);
		float vtc=(float)(cas-sd);
		cm=(float)(vtc/120);
		}
		else{
		sd=(long)(cas*0.3);
		float vtc=(float)(cas-sd);
		cm=(float)(vtc/84);
		}
		JOptionPane.showMessageDialog(null, "señor(ar) " + ccasa + " las cuotas mensuales es: "+ String.valueOf(cm));
		JOptionPane.showMessageDialog(null, "señor(ar) " + ccasa + " el subsidio es: "+ String.valueOf(sd));
		i=i+1;
		}
		}
		

	}


