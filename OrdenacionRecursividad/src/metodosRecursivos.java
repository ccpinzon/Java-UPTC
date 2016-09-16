
public class metodosRecursivos {
	
	public static int factorial (int n){
		if (n==0 || n==1){
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}
	public static int multiplicar (int n , int m){
		if (n==0||m==0){
			return 0;
		}
		else {
			return n+multiplicar(n,m-1);
		}
	}
	public static int calcuclarPotencia (int n , int m){
		if (m==0){
			return 1;
		}
		else if (m==1){
			return n;
		}
		else{
		return n*calcuclarPotencia(n, m-1);
		}
	}
	public static int dividir(int n, int m){
		if (n<m){
			return 0;
		}
		else{
		return dividir(n-m,m)+1;
		}
	}
	public static int calcularNumeroCifras(int n){
		
	
		
	if (n<10 && n>=0){			
			
			return 1;	}
		
		else {
			
			return 1+calcularNumeroCifras(n/10);
		}
		
	}
	
	public static int calcularMCD (int n, int m){
		
		if(n%m==0){
			
			return m;
		}
		
		else{
			return calcularMCD(m, n%m);		}
		
		
		
	}
	
	public static int sumatoria(int n){
		
		if(n==1){
			return 1;
			
		}
		
		else{
			return n+sumatoria(n-1);
		}
	}
	
	public static int fibonacci(int n){
		
		if(n<=2){
			
			return 1;
		}
		
		else {
			
			return fibonacci(n-1)+fibonacci(n-2);
		}
		
		
	}
	
	private static int movimientos=0;
	public static void TorresdeHanoi(int n, int a, int b, int c){
		
		if(n==1){
			  System.out.println("mover disco de " + a + " a " + c);}
			  else{
				  			 
			     TorresdeHanoi(n-1, a,c,b);
			     System.out.println("mover disco de "+ a + " a " + c);
			     TorresdeHanoi(n-1, b,a,c);
			     movimientos++;
			   }
			 }
		
	

	
	public static void main (String[]args){
		int n=5, m=1,a=1,b=2,c=3;
		
		System.out.println("El Factorial De "+n+" Es: "+factorial(n));
		System.out.println("La Multiplicacion Entre "+n+" y "+m+" Es: "+multiplicar(n, m));
		System.out.println(calcuclarPotencia(n,m));
		System.out.println(dividir(n, m));
		System.out.println(calcularNumeroCifras(n));
		System.out.println(calcularMCD(n, m));
		System.out.println(sumatoria(n));
		System.out.println(fibonacci(n));
		TorresdeHanoi(n, a, b, c);
		System.out.println("numero de movimeintos:"+movimientos);	}
}
