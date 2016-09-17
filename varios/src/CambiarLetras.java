import javax.swing.JOptionPane;


public class CambiarLetras {

	
	public static void main(String[] args) {
		String texto = JOptionPane.showInputDialog(null,"porfavor ingrese un texto");
	
           texto = texto.replace('a','k').replace('b','l').replace('c','m').replace('d','n').replace('e','o').replace('f','p').replace('g','q').replace('h','r')
        		                .replace('i','s').replace('j','t').replace('k','u').replace('l','v').replace('m','w').replace('n','x').replace('o','y').replace('p','z')
        		                .replace('q','a').replace('r','b').replace('s','c').replace('t','d').replace('u','e').replace('v','f').replace('w','g').replace('x','h')
        		                .replace('y','i').replace('z','j');	
           JOptionPane.showMessageDialog(null, "n: "+texto);
	}

}
