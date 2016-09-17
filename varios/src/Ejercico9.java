import javax.swing.JOptionPane;


public class Ejercico9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float pd;
		int n=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de articulos"));
		int i=1;
		while(i<=n){
		String nomart=JOptionPane.showInputDialog("Digite el nombre del articulo");
		int po=Integer.parseInt(JOptionPane.showInputDialog("Digite el precio del articulo"));
		int clave=Integer.parseInt(JOptionPane.showInputDialog("Digite la clave del articulo, 01 si son articulos y 02 sison perecederos"));
		do {
		}while (clave !=1&&clave !=2);
		if (clave ==0.1){
		pd=(float) (po*0.9);
		
		} else { pd=(float)(po*0.8);
		}
		JOptionPane.showMessageDialog(null, "La clave es"+String.valueOf(clave));
		JOptionPane.showMessageDialog(null, "El nombre del articulo es"+String.valueOf(nomart));
		JOptionPane.showMessageDialog(null, "El precio con descuento es"+String.valueOf(pd));
		JOptionPane.showMessageDialog(null, "El precio original es"+String.valueOf(po));
		i=i+1;
		}
		}
		}
