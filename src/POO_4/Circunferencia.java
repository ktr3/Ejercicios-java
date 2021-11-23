package POO_4;

public class Circunferencia {
	
	 double radio;
	String color;
	
	double pi;
	double a;
public Circunferencia (double p, String c, double r) {
	
	this.pi = p;
	this.color = c;
	this.radio = r;
	
}
public double area() {
			System.out.println("El area es: "+  (this.pi*this.radio*this.radio));
			return radio;
	
}

public void printPerimeter() {
	System.out.println("El perimetro es: " + ( 2*this.pi*this.radio)+" y color : "+color);
}

public boolean isBig() {
	if(this.area()<20) {
		return false;
	}
	else {
		return true;}
	}
		
	
	
public boolean esigual(Circunferencia C2) {
	if(this.color == C2.color && this.radio == C2.radio ) 
	{
		return true;
	
	}else {return false;}
	
	
}

public void show() {
	System.out.println("El radio de la circunferencia es: " + this.radio);
	System.out.println("el color de la circunferencia es : " + this.color);
}
 


}



