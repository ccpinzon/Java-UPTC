import javax.swing.JOptionPane;


public class Ejercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		float psp, pso,psc;
		int tp=0,to=0,tc=0,cp = 0,co = 0,cc = 0;
		int n=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de personas"));
		int i=1;
		while(i<=n){
		int sup=Integer.parseInt(JOptionPane.showInputDialog("Digite la superficie del area de m2"));
		if(sup>1000000){
		psp=(float )(sup*0.7);
		pso=(float)(sup*0.2);
		psc=(float)(sup*0.1);
		}
		else{
		psp=(float)(sup*0.5);
		pso=(float)(sup*0.3);
		psc=(float)(sup*0.2);
		}
		cp=(int)(psp*8)/10;
		co=(int)(pso*15)/15;
		cc=(int)(psc*18)/18;
		JOptionPane.showMessageDialog(null, "La cantidad de pinos es"+String.valueOf(cp));
		JOptionPane.showMessageDialog(null, "La cantidad de oyameles es "+String.valueOf(co));
		JOptionPane.showMessageDialog(null, "La cantidad de cedro es" +String.valueOf(cc));
		i=i+1;
		
		}
		}
		}
	