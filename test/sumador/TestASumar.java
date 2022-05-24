package sumador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestASumar {

	@Test
	public void testUnaCifra() {
		ASumar sum = new ASumar();
		String resultado = sum.sumativo("5");
		assertEquals("5 = 5", resultado);
	}

}
