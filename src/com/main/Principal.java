package com.main;

import com.calculadora.Suma;
import com.calculadora.Resta;
import com.calculadora.Multipli;
import com.calculadora.Division;

public class Principal {

	public static void main(String[] args) {
		
		
		int valorA = 10;
		int valorB= 5;
		int resultado = 0;
		int ValorC = 0;
		float resultadof = 0;
		
		
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
		
		Division division = new Division();
		resultadof = division.operacion(valorA, valorB);
		System.out.println("Resultado de division: " + resultadof);
	}

}
