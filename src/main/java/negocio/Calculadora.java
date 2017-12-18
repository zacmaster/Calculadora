package negocio;

import java.math.BigDecimal;

public class Calculadora {
//	private double resultado = 0.0;

	
	public Double sumar(double i, double j) {
		BigDecimal a = new BigDecimal(i);
		BigDecimal b = new BigDecimal(j);
		Double suma = a.add(b).doubleValue();
		return suma;
	}

	public Double resta(double i, double j) {
		BigDecimal a = new BigDecimal(i);
		BigDecimal b = new BigDecimal(j);
		Double resta = a.subtract(b).doubleValue();
		return resta;
	}
	
	public Double producto(double i, double j) {
		BigDecimal a = new BigDecimal(i);
		BigDecimal b = new BigDecimal(j);
		Double producto = a.multiply(b).doubleValue();
		return producto;
	}

	public Double division(double i, double j) {
		BigDecimal a = new BigDecimal(i);
		BigDecimal b = new BigDecimal(j);
		Double division = a.divide(b).doubleValue();
		return division;
	}

	public Double potenciaCuadrada(double i) {
		BigDecimal a = new BigDecimal(i);
		Double potencia = a.pow(2).doubleValue();
		return potencia;
	}
	
	
}
