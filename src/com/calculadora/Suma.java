package com.calculadora;

import java.util.List;

public class Suma {
	public Suma() {
		
	}
	
	public int operacion(int a,int b) {
			int resultado = 0;
			resultado = a + b;
			return resultado;
		
	}
	public double operacion(double a,double b) {
		double resultado = 0;
		resultado = a + b;
		return resultado;
	}
	
	public int sumarArreglo(int sumar[]) {
		int resultado = 0;
		
		for(int i=0; i<sumar.length; i++){
			resultado=resultado + sumar[i];
		} 
		return resultado;
	}
	public int sumaColeccion(List<Integer> lista) {
		int suma = 0;
		for(int i=0; i<lista.size();i++) {
			suma= suma + lista.get(i);
		}
		return suma;
	}
}
