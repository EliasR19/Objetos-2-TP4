package trabajador;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	private List<Ingreso> ingresos = new ArrayList<Ingreso>();

	
	public double getTotalPercibido() {
		return ingresos.stream().mapToDouble(Ingreso::getMontoPercibido).reduce(0.0, (ingA, ingB) -> ingA + ingB);

	
	}
	public double getMontoImponible() {
		return ingresos.stream().mapToDouble(Ingreso::getMontoImponible).reduce(0.0, (ingA, ingB) -> ingA + ingB);
	}
	public double getImpuestoAPagar() {
		return (this.getMontoImponible() * 2) / 100;
	}
	
	
	
	
	public void agregarIngreso(Ingreso i) {
		ingresos.add(i);
	}
	
	public List<Ingreso> getIngresos() {
		return ingresos;
	}

}
