package maua_junit_jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	private int n1 = 2;
	private int n2 = 2;
	private int resultadoEsperado = 4;
	
	@Test
	public void teste() {
		Calculadora calculadora =new Calculadora ();
		assertEquals(resultadoEsperado, calculadora.soma(n1, n2));
	}
}
