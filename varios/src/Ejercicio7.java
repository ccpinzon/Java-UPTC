import javax.swing.JOptionPane;


public class Ejercicio7 {

	
	public static void main(String[] args) {
		
		int sm=0, no=0, tp=0, he=0, ve=0, vn=0;
		int n =Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de obreros"));
		int i=1;
		while(i<=n){ int horas=Integer.parseInt(JOptionPane.showInputDialog("Digite las horas"));
		if(horas <=40){
		tp=horas*16000;
		} else{ he=horas-40;
		ve=he*20000;
		vn=40*16000;
		tp=vn+ve;
		}
		JOptionPane.showMessageDialog(null, "El total a pagar es "+String.valueOf(tp));
		sm=sm+tp;
		JOptionPane.showMessageDialog(null, "El salario mensual es"+String.valueOf(sm));
		no=no+sm;
		
		i=i+1;
		}
		JOptionPane.showMessageDialog(null, "La nomina en un mes es"+ String.valueOf(no));
		}
		}