package com.calculadora;

public class Multuplicacion {
	
		public Multuplicacion() {
					
		}
		
		public int operacion(int a,int b) {
				int resultado = 0;
				resultado = a * b;
				return resultado;
			
		
	}
	public double operaction (double a, double b) {
				double resultado = 0;
				resultado = a * b;
				return resultado;
				
			}
			
	public float operaction (float a, float b) {
				float resultado = 0;
				resultado = a * b;
				return resultado;
				}
	public int nuevamultiplicacion(int a,int b) {	
		int resultado = 0;
		for (int i=1 ; i<=b ; i++) {
			resultado = resultado + a;	
		}
		return resultado;
	}
	
	public int multiplicaionwhile(int a,int b) {
		int resultado = 0;
		int i=1;	
		while (i<=b) {	
			resultado = resultado + a;
			++i;
		}
		return resultado;
	}
}

	