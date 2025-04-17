package supermercado;

public class Producto {
	private String name;
	private double price;
	private boolean esPreciosCuidados = false;
	
	public Producto(String name, double price, boolean esPreciosCuidados) {
		this.name = name;
		this.price = price;
		this.esPreciosCuidados = esPreciosCuidados;
	}
	public Producto(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	
	public void aumentarPrecio(double aumento) {
		this.setPrice(this.getPrice() + aumento);
	}
	
	
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public boolean esPreciosCuidados() {
		return esPreciosCuidados;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setEsPreciosCuidados(boolean esPreciosCuidados) {
		this.esPreciosCuidados = esPreciosCuidados;
	}

	public void setPrice(double price) {
		this.price = price;
	}


}
