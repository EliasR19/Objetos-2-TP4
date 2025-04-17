package supermercado;

public class ProductoPrimeraNecesidad extends Producto{
	
	private double descuento;
	
	public ProductoPrimeraNecesidad(String name, double price, boolean esPreciosCuidados, double descuento) {
		super(name, price, esPreciosCuidados);
		this.descuento = descuento;
	}
	
	public double calcularPrecio() {
		return this.getPrice() - (this.getPrice() * (descuento  /100));
	}
}
