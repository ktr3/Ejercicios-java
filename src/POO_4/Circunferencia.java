package POO_4;

public class Circunferencia {
	
	double radio;
	String color;
	
	double pi = 3.1416;

public Circunferencia (double r, String c, double p) {
	
	this.pi = p;
	this.color = c;
	this.radio = r;
}
public double area() {
	return this.pi*this.radio*this.radio;
}

public void printPerimeter() {
	System.out.println("El perimetro es: "+ 2*this.pi*this.radio);
}

public boolean isBig() {
	return false;
}
public boolean esigual() {
	return false;
	
}         


}



