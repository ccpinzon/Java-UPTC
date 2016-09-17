import javax.swing.JOptionPane;


public class Ejercicio2 {


	public static void main(String[] args) {
		
		int sc=0,col,cm=0;
		float pc=0;
		float vm=Float.parseFloat(JOptionPane.showInputDialog("Digite el valor de la materia"));
		int n=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de alumnos"));
		int i=0;
		while(i>=1)
		cm=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de materias"));
		float prom=Float.parseFloat(JOptionPane.showInputDialog("Digite el promedio de la materia"));
		col=(int)(cm*vm);
		if (prom >=4.0){
		pc=(float)(col*0.7);
		}
		else {
		pc=(float)(col*1.16);
		}
		sc=(int)(sc+pc);
		JOptionPane.showMessageDialog(null, "El pago de la colegiatura es "+ String.valueOf(pc));
		i=i+1;
		}
		
		
	}


