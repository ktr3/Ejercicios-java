package POO_4;

public class Prueba {

	public static void main(String[] args) {

		Circunferencia n1= new Circunferencia(3.1416,"verde",6);
		Circunferencia n2 = new Circunferencia(3.1416,"verde",6);	
		
		n1.area();
		
		n1.printPerimeter();
		n1.show();
	
		
		System.out.println(n1.esigual(n2));
	}

}
