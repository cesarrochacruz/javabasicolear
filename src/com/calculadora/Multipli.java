package com.calculadora;

public class Multipli {
	public Multipli() {
		
	}
	
	public int operacion(int a,int b) {
			int resultado = 0;
			resultado = a * b;
			return resultado;
		
	}
	
	public int operacion(int a,int b,int c) {
			int resultado = 0;
			resultado = (a * b) * c;
			return resultado;
		
	}
	
	public int operacionfor(int a,int b) {	
		int resultado = 0;
		for (int i=1 ; i<=b ; i++) {
			resultado = resultado + a;	
		}
		return resultado;
	}
	
	public int operacionwhile(int a,int b) {
		int resultado = 0;
		int i=1;	
		while (i<=b) {	
			resultado = resultado + a;
			++i;
		}
		return resultado;
	}
}
