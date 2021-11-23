package POO;

public class Producto {

	private double precio;
	private String nombre;
	private int cantidad;
	
	



	

	public Producto(String nombre, double precio, int cantidad) {
		this.precio=precio;
		this.nombre=nombre;
		this.cantidad=cantidad;
	}

	public void escribirprodcuto() {
		
		
		
		//imprimir el producot en forma nombre, precio, cantidad
		System.out.print(nombre +" "+ precio + " "+ cantidad);
	
		

	}

	

}
