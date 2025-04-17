import supermercado.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {
	
	private Producto arroz;
	private Producto vino;
	
	@BeforeEach
	public void setUp() {
		arroz = new Producto("Arroz", 18.9d, true);
		vino = new Producto("Vino", 55d);
	}
	
	@Test
	public void testConstructor() {
		assertEquals("Arroz", arroz.getName());
		assertEquals(18.9, arroz.getPrice());
		assertTrue(arroz.esPreciosCuidados());
		
		assertEquals("Vino", vino.getName());
		assertEquals(55, vino.getPrice());
		assertFalse(vino.esPreciosCuidados());
	}
	
	@Test
	public void testAumentarPrecio() {
		arroz.aumentarPrecio(1.5);
		assertEquals(20.4, arroz.getPrice());
	}
}
