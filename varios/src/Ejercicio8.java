import javax.swing.JOptionPane;


public class Ejercicio8 {

	public static void main(String[] args) {
		int n=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de numeros"));
		int i=1;
		while(i<=n){
		int n1=Integer.parseInt(JOptionPane.showInputDialog("Digite numero 1"));
		int n2=Integer.parseInt(JOptionPane.showInputDialog("Digite numero 2"));
		if (n1>n2){
		int n2n1;
		JOptionPane.showMessageDialog(null, "El numero en forma accedente es " + String.valueOf(n1) + " y "
		+String.valueOf(n2));
		}
		else{
		int n1n2;
		JOptionPane.showMessageDialog(null, "El numero en forma descendente es " + String.valueOf(n2)+ " y " +
		String.valueOf(n1));
		}
		i=i+1;
		}
		}
		}
