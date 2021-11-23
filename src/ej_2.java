
public class ej_2 {

	public static void main(String[] args) {

		int num=0;
		System.out.println(menores100(num));
		
		
	}
	
	public static int menores100 (int x) {
		
		
		for (int i =100;i>0;i--) {
			if (i %2!=0 ) {
				System.out.println(i);
			}
		}
		
		
		return x;
	}
	
	
	
}
