
public class ejercicio1 {

	public static void main(String[] args) {

		int suma = 0;
		int x = 0;
		System.out.println(numenteros(x,suma));
	}

	public static int numenteros (int x,int suma) {
		
		
		suma =0;
		
		for (int i=1;i<=10;i++) {
		 suma = i+suma;
		 System.out.println(suma);
			
		}
		
			return suma;
		
		
	}
	
}
