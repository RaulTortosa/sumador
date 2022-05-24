package sumador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestASumar {
	
	@Test
	public void testUnaCifra() {
		ASumar sum = new ASumar();
		String resultado = sum.sumativo("7");
		assertEquals("7 = 7", resultado);
	}

	@Test
	public void testNegativo() {
		ASumar sum = new ASumar();
		String resultado = sum.sumativo("-589");
		assertEquals("Negativo. Siempre negativo", resultado);
	}
	
	@Test
	public void testSuma() {
		ASumar sum = new ASumar();
		String resultado = sum.sumativo("123");
		assertEquals("1 + 2 + 3 = 6", resultado);
	}

}
