package recursividad;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class serieFibonacci {
	public static int FiboRecursivo(int n){
		if(n==0 || n==1)
		 {
		   return n;
		 }
		 
		 else
		 {			  
		   return (FiboRecursivo(n-2)+FiboRecursivo(n-1));
		   
		  }		
		 }
		
public static void main(String[] args) {

	serieFibonacci recur = new serieFibonacci();
	System.out.println(recur.FiboRecursivo(6));
}



}
