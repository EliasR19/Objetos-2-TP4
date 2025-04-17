package supermercado;

public class ProductoPrimeraNecesidad extends Producto{
	
	public ProductoPrimeraNecesidad(String name, double price, boolean esPreciosCuidados) {
		super(name, price, esPreciosCuidados);
	}
	
	public double calcularPrecio() {
		return this.getPrice() * 0.9;
	}
}
