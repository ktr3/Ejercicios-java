package POO_2;

public class Multiplicador {

	private int num1;
	private int num2;
	
	
	public Multiplicador(int num1, int num2) {
		System.out.println("dame primer numero");
		this.num1=Console.readInt();
		System.out.println("Dame segundo numero");
		this.num2=Console.readInt();
	}
	
	public void escribir() {
		System.out.println(num1*num2);
		
	}
	
		
	
}
