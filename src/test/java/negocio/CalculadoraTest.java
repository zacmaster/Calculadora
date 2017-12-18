package negocio;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import negocio.Calculadora;

public class CalculadoraTest {
	Calculadora calculadora;
	@Before
	public void constructor() {
		calculadora = new Calculadora(); 
	}
	
	@Test
	public void sumar() {
		Double d = 7.19;
		assertEquals(d, calculadora.sumar(3, 4.19));
		
		d = 4.0;
		assertEquals(d, calculadora.sumar(3, 1));
	}
	
	@Test
	public void resta() {
		Double d = 3.8;
		assertEquals(d, calculadora.resta(4, 0.2));
		
		d = 4.0;
		assertEquals(d, calculadora.resta(6, 2));
	}
	
	
	@Test
	public void producto() {
		Double d = 16.0;
		assertEquals(d, calculadora.producto(4, 4));
	}
	
	@Test
	public void division() {
		Double d = 0.125;
		assertEquals(d, calculadora.division(1,8));
	}
	@Test
	public void potenciaCuadrada() {
		Double d = 25.0;
		assertEquals(d, calculadora.potenciaCuadrada(5));
	}
}
