package POO_3;

public class NumberStatics {
	
	private int [] numeros= new int [16];
	private int cantidadnumeros;
	
	
	public void addnumber(int n){
		
		this.numeros[cantidadnumeros]=n;
		cantidadnumeros++;
	}
	
	public void imprimir(){
		System.out.println("Estos son la cantidad de numeros: ");
		System.out.println(cantidadnumeros);
	}
	
	public void vernum() {
	 	int promedio=0;
		
		
		for(int i=0;i<cantidadnumeros;i++){
			promedio=promedio+numeros[i];
			
		}
		
		promedio= promedio / cantidadnumeros;
		System.out.println("El promedio es : " +(promedio));
	
	}
	
}
