package com.main;

import com.calculadora.Suma;

public class Principal {

	public static void main(String[] args) {
		
		
		int valorA = 5;
		int valorB= 10;
		int resultado = 0;
		
		
		Suma suma = new Suma();
		resultado = suma.operacion(valorA, valorB);

		System.out.println("Resultado de suma: " + resultado);
		System.out.println("Hola mundo");
	}

}
