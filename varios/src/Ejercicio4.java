import javax.swing.JOptionPane;


public class Ejercicio4 {

	
	public static void main(String[] args) {
		
		float cf, sm=0, aho=0;
		int n=Integer.parseInt(JOptionPane.showInputDialog("Diigte la cantidad de trabajadores"));
		int i=1;
		while(i<=n){
		int sal=Integer.parseInt(JOptionPane.showInputDialog("Digite el salario"));
		String op;
		do{
		op=JOptionPane.showInputDialog("Digite cf=cuota fija y p= porcentaje");
		}while(!op.equals("cf")&&!op.equals("p"));
		
		if(op.equals("cf")){
		float a=Integer.parseInt(JOptionPane.showInputDialog("Digite el ahorro"));
		sm=sal-a;
		}
		else{
		float p=Float.parseFloat(JOptionPane.showInputDialog("Digite el porcentaje"));
		aho=(float)(sal*p);
		sm=sal-aho;
		}
		JOptionPane.showMessageDialog(null, "El salario mensual es "+String.valueOf(sm));
		JOptionPane.showMessageDialog(null, "El ahorro es "+String.valueOf(aho));
		i=i+1;
		}
		
		
	}

}
