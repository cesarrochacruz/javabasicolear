package com.calculadora;

/*
 * Clase aritmetica para productos directo
 */
public class Multiplicacion implements IProducto{

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
	
	public double MultiplicacionPorCiclos(int a, int b) {
		double resultado = 0;
		Integer[] vec = new Integer[a];
		for(int i=0; i < a ; i++){
			vec[i] = b;
		}
		
		Suma suma = new Suma();
		int i = 0;
		while (i < vec.length) {
			resultado = suma.operacion(resultado , vec[i]);			
			i++;			
		}
		return resultado;
	}
	
}
