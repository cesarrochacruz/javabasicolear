package com.main;

import com.calculadora.Suma;
import com.calculadora.Resta;
import com.calculadora.Multipli;
import com.calculadora.Division;

public class Principal {

	public static void main(String[] args) {
		
		
		int valorA = 4;
		int valorB= 2;
		int resultado = 0;
		int ValorC = 0;
		float resultadof = 0;
		
		System.out.println("Parametro 1: " + valorA);
		System.out.println("Parametro 2: " + valorB);
		
		
		Suma suma = new Suma();
		resultado = suma.operacion(valorA, valorB);
		ValorC = resultado;
		System.out.println("Resultado de suma: " + resultado);	
		
		Resta resta = new Resta();
		resultado = resta.operacion(valorA, valorB);
		System.out.println("Resultado de resta: " + resultado);
		
		Multipli multipli = new Multipli();
		resultado = multipli.operacion(valorA, valorB);
		System.out.println("Resultado de multiplicacion: " + resultado);
		
		resultado = multipli.operacion(valorA, valorB, ValorC);
		System.out.println("Resultado de multiplicacion multiplicado por suma: " + resultado);
		
		resultado = multipli.operacionfor(valorA, valorB);
		System.out.println("Resultado de multiplicacion con FOR: " + resultado);
		
		resultado = multipli.operacionwhile(valorA, valorB);
		System.out.println("Resultado de multiplicacion con WHILE: " + resultado);
		
		Division division = new Division();
		resultadof = division.operacion(valorA, valorB);
		System.out.println("Resultado de division: " + resultadof);
	}

}
