package POO_5;

public class Biblioteca {
	

	public static boolean espar (int n) {
		if(n %2==0) {
			return true;
		}else {
			return false;
		}
	}

	public static double cantidaddigitos(int n) {
		 do{
	            System.out.print("Introduce un número entero: ");
	            n = (int) Console.readDouble();
	            int cifras = 0;    //esta variable es el contador de cifras
	            while(n!=0){             //mientras a n le queden cifras
	                    n = n/10;         //le quitamos el último dígito
	                   cifras++;          //sumamos 1 al contador de cifras
	            }
		 	}
	

		}
	
}
