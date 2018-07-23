package com.main;

import com.calculadora.*;

public class Principal {

	public static void main(String[] args) {
				
		int valorA = 5;
		int valorB = 10;
		double resultado = 0;		
				
		System.out.println("Resultado de");
		
		Suma suma = new Suma();
		resultado = suma.operacion(valorA, valorB);
		System.out.println("Suma: " + resultado);

		Resta resta = new Resta();
		resultado = resta.operacion(valorA, valorB);		
		System.out.println("Resta: " + resultado);
		
		Multiplicacion multi = new Multiplicacion();
		resultado = multi.operacion(valorA, valorB);
		System.out.println("Multiplicacion: " + resultado);

		Division div = new Division();
		resultado = div.operacion(valorA, valorB);
		System.out.println("Divicion: " + resultado);
		
	}

}
