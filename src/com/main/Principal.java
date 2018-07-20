package com.main;

import com.calculadora.*;


public class Principal {

	public static void main(String[] args) {
		
		
		int valorA = 5;
		int valorB= 10;
		int resultado = 0;
		
//		double resultado = 0;
		
		Suma suma = new Suma();
		resultado= suma.operacion(valorA, valorB);
		
		System.out.println("Resultado de suma: " + resultado );
	
		
		Multuplicacion multiplicar = new Multuplicacion ();
		resultado= multiplicar.operacion(5, 2);
				
		System.out.println("Resultado de multiplicacion: " + resultado );
		
		Resta resta = new Resta();
		resultado = resta.operacion(16, 18);
	
		System.out.println("Resultado de resta: " + resultado );
	}

}
