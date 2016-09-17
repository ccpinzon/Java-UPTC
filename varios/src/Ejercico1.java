import javax.swing.JOptionPane;

public class Ejercico1 {

	public static void main(String[] args) {
		int n=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de clientes"));
		float cp=0, in, tp=0;
		int i=1;
		while(i<=n){
		int monto=Integer.parseInt(JOptionPane.showInputDialog("Digite el monto"));
		if(monto>=500000){
		cp=(float)(monto*0.1);
		}
		else{
		in=(float)(monto*0.15);
		}
		in=(float)( monto*0.015);
		tp=cp+in;
		JOptionPane.showMessageDialog(null, "El total a pagar es "+String.valueOf(tp));
		i=i+1;
		}
		}


	}


