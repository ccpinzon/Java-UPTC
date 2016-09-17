import javax.swing.JOptionPane;


public class Ejercicio6 {

	
	public static void main(String[] args) {
		int sd=0,vp=0, sp=0;
		float d=0;
		int n=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de personas "));
		int i=1;
		while(i<=n){ int compra=Integer.parseInt(JOptionPane.showInputDialog("Digite su compra")); if
		(compra>100000){
		d=(float)(compra*0.2);
		vp=(int)(compra-d);
		sp=(int)(sd+d);
		}
		else{
		vp=compra;
		}
		JOptionPane.showMessageDialog(null, "El valor del pago es "+String.valueOf(vp));
		i=i+1;
		}
		JOptionPane.showMessageDialog(null, "El sueldo a pagar es "+String.valueOf(sp));
		}
		}


	
