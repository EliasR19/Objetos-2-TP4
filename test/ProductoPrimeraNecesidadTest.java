import org.junit.jupiter.api.*;
import supermercado.*;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false,11);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(7.1, leche.calcularPrecio(), 0.1);
	}
}
