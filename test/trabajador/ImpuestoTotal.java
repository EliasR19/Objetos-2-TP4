package trabajador;

import static org.junit.Assert.assertEquals;

import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ImpuestoTotal {
	Trabajador t = new Trabajador();
	
	
	Ingreso iA;
	Ingreso iB;
	IngresoHorasExtras iEC;
	
	@BeforeEach
	public void setUp() {
		iA = new Ingreso(Month.of(6), 100d);
		iB = new Ingreso(Month.of(9), 100d);
		iEC = new IngresoHorasExtras(Month.of(3), 100d, 3);
		
		t.agregarIngreso(iA);
		t.agregarIngreso(iB);
		t.agregarIngreso(iEC);
	}
	
	@Test
	public void getMontoImponibleTest() {
		assertEquals(4d, t.getImpuestoAPagar(), 0.1);
	}
}
