package com.calculadora;

/*
 * Clase aritmetica para acumulacion incremental
 */
public class Suma implements Acumula{

	public Suma(){		
	}
	
	public int operacion(int a,int b) {
			return a + b;		
	}

	public float operacion(float a, float b){
		return a + b;
	}
	
	public long operacion(long a, long b){
		return a + b;
	}
	
	public double operacion(double a, double b){
		return a + b;
	}
	
}
