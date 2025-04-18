package trabajador;

import static org.junit.Assert.assertEquals;

import java.time.Month;

import org.junit.jupiter.api.*;

public class MontoPercibidoTest {
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
	public void getMontoPercibidoTest() {
		assertEquals(300d, t.getTotalPercibido() , 0.1);
	}
	
	
}
