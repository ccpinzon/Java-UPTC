import java.util.Scanner;
public class PrimerEjercicio {

	public static void main(String[] args) {
		Scanner Baka = new Scanner (System.in);
		int resultado=1;
		boolean salir=true;
		
		while(salir){
		System.out.println("Aplicacion UPTC \n 1. Anno Biciesto \n 2. Factorial \n 3. Suma De Enteros \n 4. Consumo De Gasolina \n 5. salir");
        int opcion = Baka.nextInt();
        
        switch (opcion){
        
        case 1: 
        {
			System.out.println("Porfavor Ingrese el anno el caul desea saber si es biciesto");
            int anno = Baka.nextInt();
            int biciesto=0;
            for(int i=1;i<=anno;i++)
			{
				resultado=i*4;
                if(resultado==anno)
                {
                 biciesto=resultado;
                }
                if(biciesto==anno)
                { 
                 System.out.println("el anno es biciesto"); 
                }
                if(biciesto!=anno)
                {
                 System.out.println("el anno no es biciesto");
                }
             }
		 }
		break;
        
        case 2:
        { 
			System.out.println("Porfavor ingrese el numero al que desea sacarle el factoral");
        	int factorial = Baka.nextInt();
        	for(int i=1;i<=factorial;i++)
        	{
				resultado=resultado*i;
			}
        	System.out.println("el factorial es: "+resultado);
        }
        break;
        
        case 3:
        {
        	System.out.println("porfavor ingrese la cantidad de la sumatoria");
        	int numero = Baka.nextInt();
        	int sumatoria=0;
        	for(int i=1;i<=numero;i++)
        	{
        	    sumatoria=sumatoria+i;
        	}
        	    System.out.println("la sumatoria es: "+sumatoria);
        }
        break;
        
        case 4:{
        	System.out.println("porfavor ingrese el numero de kilometros que va a recorrer");
        	    int kilometros = Baka.nextInt();
        	    resultado =(kilometros/40);
        	    int precio=resultado*9000;
        	    System.out.println("el numero de galones que utilisara es: "+resultado+"\n el precioes: "+precio);}
        break;
        
        case 5: salir=false;
        break;
        }
	}}}
