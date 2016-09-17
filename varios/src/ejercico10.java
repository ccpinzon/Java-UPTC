import javax.swing.JOptionPane;


public class ejercico10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float tp=0;
		int n=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad"));
		int i=1;
		while(i<=n){
		int cc=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de camisas"));
		int vc=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de la camisa"));
		if (cc>=3){
		tp=(float)((vc*cc)*0.8);
		}
		else {
		tp=(float)((vc*cc)*0.9);
		}
		JOptionPane.showMessageDialog(null, "El total a pagar es "+String.valueOf(tp));
		i=i+1;
		}
		}
		}
