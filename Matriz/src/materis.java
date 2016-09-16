import javax.swing.JOptionPane;

public class materis {

	public static void main(String[] args) {
		
		
		int n,m;
		n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tama�o de las filas"));
		m = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas"));
		
		int matriz[][] = new int[n][m];
		
		for(int i= 0;i<n;i++){
			for (int j=0;j<m;j++){
				matriz[i][j]= Integer.parseInt(JOptionPane.showInputDialog("ingrese datos de cada posision"));
			}
		}
		
		
		//ordenar
		
		for (int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				for(int x=0;x<n;x++){
					for (int y=0;y<m;y++){
						if(matriz[i][j]>matriz[x][y]){
							int t = matriz[i][j];
							matriz[i][j]=matriz[x][y];
							matriz[x][y]=t;
							
						}
					}
				}
			}
		}
		
		for (int i=matriz.length-1;i>=0;i--){
			for (int j=matriz.length-1;j>=0;j--){
				
				JOptionPane.showMessageDialog(null,matriz[i][j]);
				
			}
			
		}
		
		
		for(int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				JOptionPane.showMessageDialog(null,matriz[i][j]);
			}
		}
		
	}
}
