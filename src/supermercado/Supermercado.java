package supermercado;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Supermercado {
	private String name;
	private String address;
	
	public Supermercado(String name, String address){
		this.name = name;
		this.address = address;
	}
	
	private List<Producto> catalogo = new ArrayList<Producto>();
	
	
	public int getCantidadDeProductos() {
		return catalogo.size();
	}
	
	public void agregarProducto(Producto p) {
		catalogo.add(p);
	}
	
	
	public double getPrecioTotal() {
		return catalogo.stream().mapToDouble(Producto::getPrice).reduce(0.0, (p1,p2) -> p1 + p2);
	}
}
