package com.calculadora;

/*
 * Clase aritmetica para productos directo
 */
public class Multiplicacion implements Producto{

	public Multiplicacion(){		
	}
	
	public double operacion(int a, int b) {
		return  a * b;
	}

	public double operacion(float a, float b) {
		return a * b;
	}

	public double operacion(long a, long b) {
		return a * b;
	}

	public double operacion(double a, double b) {
		return a * b;
	}
	
}
