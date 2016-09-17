import java.util.Scanner;

public class Piramide {

	public static void main(String[] args) {
		Scanner Baka = new Scanner(System.in);
		int numerofilas = 0, numerocol = 0, antes = 0, despues = 0, num = 0, primernum = 0;
		System.out.println("Digite la cantidad de filas");
		numerofilas = Baka.nextInt();
		numerocol = numerofilas * 2 - 1;
		antes = numerofilas;
		despues = numerofilas;
		for (int fila = 1; fila <= numerofilas; fila++) 
		{num = primernum + 1;

			for (int col = 1; col <= numerocol; col++) {
				if (col < antes) {
				System.out.print(" ");
				continue;}

				else if (col > despues) {
				System.out.print(" ");
				continue;}
				
				else {
				if (num < 0)
					num = 9;
				if (num > 9)
					num = 0;
				if (col == antes)
					primernum = num;
				System.out.print(num);}
				
				if (col < numerofilas)
					num++;
				else
					num--;
			}
			System.out.println("");
			antes--;
			despues++;
		}}}