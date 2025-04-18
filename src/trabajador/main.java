package trabajador;

import java.time.Month;

public class main {

	public static void main(String[] args) {
		
		Trabajador t = new Trabajador();
		
		Ingreso iA = new Ingreso(Month.of(3), 100d);
		//Ingreso iB = new Ingreso(Month.of(3), 100d);
		IngresoHorasExtras iB = new IngresoHorasExtras(Month.of(3), 100d, 3);
		
		t.agregarIngreso(iA);
		t.agregarIngreso(iB);
		
		System.out.println(t.getImpuestoAPagar());

	}

}
